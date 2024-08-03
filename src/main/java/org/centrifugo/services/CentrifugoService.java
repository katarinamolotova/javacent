package org.centrifugo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.centrifugo.constants.CentrifugoApiUrl;
import org.centrifugo.models.requests.RequestModel;
import org.centrifugo.models.requests.connection_management.DisconnectRequest;
import org.centrifugo.models.requests.connection_management.RefreshRequest;
import org.centrifugo.models.requests.connection_management.SubscribeRequest;
import org.centrifugo.models.requests.connection_management.UnsubscribeRequest;
import org.centrifugo.models.requests.publication.BroadcastRequest;
import org.centrifugo.models.requests.publication.PublishRequest;

import java.io.IOException;
import java.util.List;

public class CentrifugoService implements CentrifugoCommand {

    private static final String CENTRIFUGO_API_KEY = "centrifugo"; // todo:
    private final String CENTRIFUGO_URL = "localhost"; // todo: config?

    @Override
    public void publish(final PublishRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PUBLISH);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void publish(final String data, final String channel) {
        final PublishRequest<String> request = new PublishRequest<>();
        publish(request.channel(channel).data(data));
    }

    @Override
    public void broadcast(final BroadcastRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BROADCAST);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void broadcast(final String data, final List<String> channels) {
        final BroadcastRequest<String> request = new BroadcastRequest<>();
        broadcast(request.data(data).channels(channels));
    }

    @Override
    public void disconnect(final DisconnectRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DISCONNECT);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void disconnect(final String user) {
        final DisconnectRequest request = new DisconnectRequest();
        disconnect(request.user(user));
    }

    @Override
    public void refresh(final RefreshRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REFRESH);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void refresh(final String user) {
        final RefreshRequest request = new RefreshRequest();
        refresh(request.user(user));
    }

    @Override
    public void subscribe(final SubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SUBSCRIBE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void subscribe(final String user, final String channel) {
        final SubscribeRequest request = new SubscribeRequest();
        subscribe(request.user(user).channel(channel));
    }

    @Override
    public void unsubscribe(final UnsubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNSUBSCRIBE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void unsubscribe(final String user, final String channel) {
        final UnsubscribeRequest request = new UnsubscribeRequest();
        unsubscribe(request.user(user).channel(channel));
    }

    private HttpPost getHttpPost(final RequestModel request, final String url)  {
        final HttpPost httpPost = new HttpPost(CENTRIFUGO_URL + url);

        try {
            final ObjectMapper objectMapper = new ObjectMapper();
            final String json = objectMapper.writeValueAsString(request);
            final StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("X-API-Key", CENTRIFUGO_API_KEY);
        } catch (final IOException e) {
//            log.error("CentrifugoService. Can't serialize model: {}", model);
        }

        return httpPost;
    }

    private void sendToCentrifugo(final HttpPost httpPost) {
        try (
                final CloseableHttpClient client = HttpClients.createDefault();
                final CloseableHttpResponse response = client.execute(httpPost)
        ) {
            // todo what do we have to return?
//            final int status = response.getStatusLine().getStatusCode();
//            final String text = IOUtils.toString(response.getEntity().getContent(), Charsets.UTF_8.toString());
//            log.info("CentrifugoService. Response '{}'. Status: '{}'", text, status);
        } catch (final IOException e) {
//            log.error("CentrifugoService. Can't send publications", e);
        }
    }
}
