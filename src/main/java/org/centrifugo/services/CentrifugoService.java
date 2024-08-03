package org.centrifugo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.centrifugo.models.DataModelAbstract;
import org.centrifugo.models.broadcast.BroadcastDataModel;
import org.centrifugo.models.publish.PublishDataModel;

import javax.annotation.Nonnull;
import java.io.IOException;

//@Slf4j
public class CentrifugoService {

    private static final String CENTRIFUGO_API_KEY = "centrifugo"; // todo:
    private static final String API_PUBLISH_URL = "/api/publish";
    private static final String API_BROADCAST_URL = "/api/broadcast";

    private final String centrifugoUrl = "localhost"; // todo: config?

    /**
     * Публикация данных в Centrifugo в <b>один<b/> канал
     * @param dataModel модель данных для публикации
     */
    public void publish(@Nonnull final PublishDataModel<?> dataModel) {
        final HttpPost httpPost = getHttpPost(dataModel, API_PUBLISH_URL);
        sendToCentrifugo(httpPost);
    }

    /**
     * Публикация данных в Centrifugo в <b>несколько<b/> каналов
     * @param dataModel модель данных для публикации
     */
    public void broadcast(@Nonnull final BroadcastDataModel<?> dataModel) {
        final HttpPost httpPost = getHttpPost(dataModel, API_BROADCAST_URL);
        sendToCentrifugo(httpPost);
    }

    @Nonnull
    private HttpPost getHttpPost(@Nonnull final DataModelAbstract<?> dataModel, @Nonnull final String url)  {
        final HttpPost httpPost = new HttpPost(centrifugoUrl + url);

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

    private void sendToCentrifugo(@Nonnull final HttpPost httpPost) {
        try (
                final CloseableHttpClient client = HttpClients.createDefault();
                final CloseableHttpResponse response = client.execute(httpPost)
        ) {
            final int status = response.getStatusLine().getStatusCode();
            final String text = IOUtils.toString(response.getEntity().getContent(), Charsets.UTF_8.toString());
//            log.info("CentrifugoService. Response '{}'. Status: '{}'", text, status);
        } catch (final IOException e) {
//            log.error("CentrifugoService. Can't send publications", e);
        }
    }
}
