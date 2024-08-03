package org.centrifugo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.centrifugo.constants.CentrifugoApiUrl;
import org.centrifugo.models.DataModelAbstract;
import org.centrifugo.models.broadcast.BroadcastDataModel;
import org.centrifugo.models.publish.PublishDataModel;

import java.io.IOException;
import java.util.List;

public class CentrifugoService implements CentrifugoCommand {

    private static final String CENTRIFUGO_API_KEY = "centrifugo"; // todo:
    private final String CENTRIFUGO_URL = "localhost"; // todo: config?

    @Override
    public void publish(final PublishDataModel<?> dataModel) {
        final HttpPost httpPost = getHttpPost(dataModel, CentrifugoApiUrl.PUBLISH);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void publish(final String data, final String channel) {
        final PublishDataModel<String> dataModel = new PublishDataModel<>(data, channel);
        publish(dataModel);
    }

    @Override
    public void broadcast(final BroadcastDataModel<?> dataModel) {
        final HttpPost httpPost = getHttpPost(dataModel, CentrifugoApiUrl.BROADCAST);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void broadcast(String data, List<String> channels) {
        final BroadcastDataModel<String> dataModel = new BroadcastDataModel<>(data, channels);
        broadcast(dataModel);
    }

    private HttpPost getHttpPost(final DataModelAbstract<?> dataModel, final String url)  {
        final HttpPost httpPost = new HttpPost(CENTRIFUGO_URL + url);

        try {
            final ObjectMapper objectMapper = new ObjectMapper();
            final String json = objectMapper.writeValueAsString(dataModel);
            final StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("X-API-Key", CENTRIFUGO_API_KEY);
        } catch (final IOException e) {
//            log.error("CentrifugoService. Can't serialize model: {}", dataModel);
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
