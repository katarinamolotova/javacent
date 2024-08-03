package org.centrifugo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.centrifugo.constants.CentrifugoApiUrl;
import org.centrifugo.models.requests.RequestModel;
import org.centrifugo.models.requests.connection_management.DisconnectModel;
import org.centrifugo.models.requests.connection_management.RefreshModel;
import org.centrifugo.models.requests.connection_management.SubscribeModel;
import org.centrifugo.models.requests.connection_management.UnsubscribeModel;
import org.centrifugo.models.requests.publication.BroadcastModel;
import org.centrifugo.models.requests.publication.PublishModel;

import java.io.IOException;
import java.util.List;

public class CentrifugoService implements CentrifugoCommand {

    private static final String CENTRIFUGO_API_KEY = "centrifugo"; // todo:
    private final String CENTRIFUGO_URL = "localhost"; // todo: config?

    @Override
    public void publish(final PublishModel<?> model) {
        final HttpPost httpPost = getHttpPost(model, CentrifugoApiUrl.PUBLISH);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void publish(final String data, final String channel) {
        final PublishModel<String> dataModel = new PublishModel<>(data, channel);
        publish(dataModel);
    }

    @Override
    public void broadcast(final BroadcastModel<?> model) {
        final HttpPost httpPost = getHttpPost(model, CentrifugoApiUrl.BROADCAST);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void broadcast(final String data, final List<String> channels) {
        final BroadcastModel<String> dataModel = new BroadcastModel<>(data, channels);
        broadcast(dataModel);
    }

    @Override
    public void disconnect(final DisconnectModel model) {
        final HttpPost httpPost = getHttpPost(model, CentrifugoApiUrl.DISCONNECT);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void refresh(final RefreshModel model) {
        final HttpPost httpPost = getHttpPost(model, CentrifugoApiUrl.REFRESH);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void subscribe(final SubscribeModel model) {
        final HttpPost httpPost = getHttpPost(model, CentrifugoApiUrl.SUBSCRIBE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void unsubscribe(final UnsubscribeModel model) {
        final HttpPost httpPost = getHttpPost(model, CentrifugoApiUrl.UNSUBSCRIBE);
        sendToCentrifugo(httpPost);
    }

    private HttpPost getHttpPost(final RequestModel model, final String url)  {
        final HttpPost httpPost = new HttpPost(CENTRIFUGO_URL + url);

        try {
            final ObjectMapper objectMapper = new ObjectMapper();
            final String json = objectMapper.writeValueAsString(model);
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
