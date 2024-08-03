package org.centrifugo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.centrifugo.constants.CentrifugoApiUrl;
import org.centrifugo.exceptions.CentrifugoException;
import org.centrifugo.models.requests.RequestModel;
import org.centrifugo.models.requests.connection_management.DisconnectRequest;
import org.centrifugo.models.requests.connection_management.RefreshRequest;
import org.centrifugo.models.requests.connection_management.SubscribeRequest;
import org.centrifugo.models.requests.connection_management.UnsubscribeRequest;
import org.centrifugo.models.requests.publication.BroadcastRequest;
import org.centrifugo.models.requests.publication.PublishRequest;
import org.centrifugo.models.responses.ResponseModel;
import org.centrifugo.models.responses.StandardResponse;
import org.centrifugo.models.responses.results.publication.BroadcastResult;
import org.centrifugo.models.responses.results.publication.PublishResult;

import java.io.IOException;
import java.util.List;

public class CentrifugoService implements CentrifugoCommand {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final String CENTRIFUGO_API_KEY = "centrifugo"; // todo:
    private final String CENTRIFUGO_URL = "http://localhost:8000"; // todo: config?

    @Override
    public ResponseModel publish(final PublishRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PUBLISH);
        final StandardResponse<PublishResult> response = new StandardResponse<>();
        return sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public ResponseModel publish(final String data, final String channel) {
        final PublishRequest<String> request = new PublishRequest<>();
        return publish(request.channel(channel).data(data));
    }

    @Override
    public ResponseModel broadcast(final BroadcastRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BROADCAST);
        final StandardResponse<BroadcastResult> response = new StandardResponse<>();
        return sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public ResponseModel broadcast(final String data, final List<String> channels) {
        final BroadcastRequest<String> request = new BroadcastRequest<>();
        return broadcast(request.data(data).channels(channels));
    }

    @Override
    public ResponseModel disconnect(final DisconnectRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DISCONNECT);
        return sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public ResponseModel disconnect(final String user) {
        final DisconnectRequest request = new DisconnectRequest();
        return disconnect(request.user(user));
    }

    @Override
    public void refresh(final RefreshRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REFRESH);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void refresh(final String user) {
        final RefreshRequest request = new RefreshRequest();
        refresh(request.user(user));
    }

    @Override
    public ResponseModel subscribe(final SubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SUBSCRIBE);
        return sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public ResponseModel subscribe(final String user, final String channel) {
        final SubscribeRequest request = new SubscribeRequest();
        return subscribe(request.user(user).channel(channel));
    }

    @Override
    public ResponseModel unsubscribe(final UnsubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNSUBSCRIBE);
        return sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public ResponseModel unsubscribe(final String user, final String channel) {
        final UnsubscribeRequest request = new UnsubscribeRequest();
        return unsubscribe(request.user(user).channel(channel));
    }

    private HttpPost getHttpPost(final RequestModel request, final String url)  {
        final HttpPost httpPost = new HttpPost(CENTRIFUGO_URL + url);

        try {
            final String json = MAPPER.writeValueAsString(request);
            final StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("X-API-Key", CENTRIFUGO_API_KEY);
            return httpPost;
        } catch (final IOException e) {
            throw new CentrifugoException(e.getMessage());
        }
    }

    private ResponseModel sendToCentrifugo(final HttpPost httpPost, final Class<? extends ResponseModel> responseClass) {
        try (
                final CloseableHttpClient client = HttpClients.createDefault();
                final CloseableHttpResponse response = client.execute(httpPost)
        ) {
            final HttpEntity entity = response.getEntity();
            if (entity == null) {
                return new StandardResponse<>();
            }

            final String json = IOUtils.toString(entity.getContent(), "UTF-8");
            return MAPPER.readValue(json, responseClass);
        } catch (final IOException e) {
            throw new CentrifugoException("Error sending the request");
        }
    }


}
