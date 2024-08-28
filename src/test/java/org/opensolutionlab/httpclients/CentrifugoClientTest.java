package org.opensolutionlab.httpclients;

import org.opensolutionlab.httpclients.clients.CentrifugoClient;
import org.opensolutionlab.httpclients.configurations.CentrifugoConfigurations;
import org.opensolutionlab.httpclients.exceptions.CentrifugoApiResponseException;
import org.opensolutionlab.httpclients.exceptions.CentrifugoTransportException;
import org.opensolutionlab.httpclients.models.requests.EmptyRequest;
import org.opensolutionlab.httpclients.models.requests.batch.BatchRequest;
import org.opensolutionlab.httpclients.models.requests.batch.Command;
import org.opensolutionlab.httpclients.models.requests.history.HistoryRequest;
import org.opensolutionlab.httpclients.models.requests.publication.PublishRequest;
import org.opensolutionlab.httpclients.models.responses.BatchResponse;
import org.opensolutionlab.httpclients.models.responses.results.history.HistoryResult;
import org.opensolutionlab.httpclients.models.responses.results.history.Publication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.opensolutionlab.httpclients.models.responses.results.presence.PresenceResult;
import org.opensolutionlab.httpclients.models.responses.results.presence.PresenceStatsResult;
import org.opensolutionlab.httpclients.models.responses.results.publication.BroadcastResult;
import org.opensolutionlab.httpclients.models.responses.results.publication.PublishResult;
import org.opensolutionlab.httpclients.models.responses.results.stats.channels.ChannelsResult;
import org.opensolutionlab.httpclients.models.responses.results.stats.info.InfoResult;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Testcontainers
public class CentrifugoClientTest {

    private static final int PORT = 8000;
    private static final int LIMIT = 10;
    private static final String CHANNEL_1 = "1";
    private static final String CHANNEL_2 = "2";
    private static final String CHANNEL_3 = "3";
    private static final String CHANNEL_PATTERN = "";
    private static final String DATA = "Hello World!";
    private static final String USER_ID = "1";

    private static CentrifugoClient client;

   @Container
   static GenericContainer<?> container = CentrifugoTestContainer.getTestContainer(PORT);

    @BeforeAll
    public static void init(){
        final CentrifugoConfigurations configurations = CentrifugoConfigurations
                .builder()
                .apiKey("centrifugo")
                .build();
        client = new CentrifugoClient(configurations);
    }

   @BeforeAll
   public static void startContainer() {
       container.start();
   }

   @AfterAll
   public static void stopContainer() {
       container.stop();
   }

    @Test
    public void publishSuccessTest() {
        final PublishResult result = client.publish(CHANNEL_1, DATA);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(1, result.getOffset());
    }

    @Test
    public void broadcastSuccessTest() {
        final BroadcastResult result = client.broadcast(Arrays.asList(CHANNEL_1, CHANNEL_2), DATA);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.getResponses().size());
    }

    @Test
    public void historySuccessTest() {
        client.publish(CHANNEL_3, DATA);

        final HistoryRequest request = HistoryRequest.builder().limit(LIMIT).channel(CHANNEL_3).build();
        final HistoryResult result = client.history(request);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(1, result.getOffset());

        final List<Publication> publications = result.getPublications();
        Assertions.assertEquals(1, publications.size());
        Assertions.assertEquals(DATA, publications.get(0).getData());
    }

    @Test
    public void historyRemoveSuccessTest() {
        client.publish(CHANNEL_3, DATA);
        client.historyRemove(CHANNEL_3);
        final HistoryResult result = client.history(CHANNEL_3);

        final List<Publication> publications = result.getPublications();
        Assertions.assertEquals(0, publications.size());
    }

    @Test
    public void channelsSuccessTest() {
        final ChannelsResult result = client.channels(CHANNEL_PATTERN);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(0, result.getChannels().size());
    }

    @Test
    public void presenceSuccessTest() {
        final PresenceResult result = client.presence(CHANNEL_1);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(0, result.getPresence().size());
    }

    @Test
    public void presenceStatsSuccessTest() {
        final PresenceStatsResult result = client.presenceStats(CHANNEL_1);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(0, result.getNumClients());
        Assertions.assertEquals(0, result.getNumUsers());
    }

    @Test
    public void refreshStatsSuccessTest() {
        client.refresh(USER_ID);
    }

    @Test
    public void subscribeStatsSuccessTest() {
        client.subscribe(USER_ID, CHANNEL_1);
    }

    @Test
    public void unsubscribeStatsSuccessTest() {
        client.unsubscribe(USER_ID, CHANNEL_1);
    }

    @Test
    public void disconnectStatsSuccessTest() {
        client.disconnect(USER_ID);
    }

    @Test
    public void infoStatsSuccessTest() {
        final InfoResult result = client.info();

        Assertions.assertNotNull(result);
    }

    @Test
    public void batchStatsSuccessTest() {
        final Command command = Command
                .builder()
                .info(new EmptyRequest())
                .build();

        final BatchRequest request = BatchRequest
                .builder()
                .commands(Collections.singletonList(command))
                .build();

        final BatchResponse response = client.batch(request);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(1, response.getReplies().size());
    }

    @Test
    public void publishFailTest() {
        Assertions.assertThrows(
                CentrifugoApiResponseException.class,
                () -> client.publish(PublishRequest.builder().build())
        );
    }

    @Test
    public void notFoundTest() {
        Assertions.assertThrows(
                CentrifugoTransportException.class,
                () -> client.connections(USER_ID, "")
        );
    }
}
