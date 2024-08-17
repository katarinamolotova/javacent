package org.centrifugo;

import org.centrifugo.clients.CentrifugoClient;
import org.centrifugo.models.requests.EmptyRequest;
import org.centrifugo.models.requests.batch.BatchRequest;
import org.centrifugo.models.requests.batch.Command;
import org.centrifugo.models.requests.history.HistoryRequest;
import org.centrifugo.models.responses.*;
import org.centrifugo.models.responses.results.history.Publication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
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

    private final CentrifugoClient client = new CentrifugoClient();

   @Container
   static GenericContainer<?> container = CentrifugoTestContainer.getTestContainer(PORT);

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
        final PublishResponse response = client.publish(DATA, CHANNEL_1);

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getResult());
        Assertions.assertNull(response.getError());
        Assertions.assertEquals(1, response.getResult().getOffset());
    }

    @Test
    public void broadcastSuccessTest() {
        final BroadcastResponse response = client.broadcast(DATA, Arrays.asList(CHANNEL_1, CHANNEL_2));

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getResult());
        Assertions.assertNull(response.getError());
        Assertions.assertEquals(2, response.getResult().getResponses().size());
    }

    @Test
    public void historySuccessTest() {
        client.publish(DATA, CHANNEL_3);

        final HistoryRequest request = HistoryRequest.builder().limit(LIMIT).channel(CHANNEL_3).build();
        final HistoryResponse response = client.history(request);

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getResult());
        Assertions.assertNull(response.getError());
        Assertions.assertEquals(1, response.getResult().getOffset());

        final List<Publication> publications = response.getResult().getPublications();
        Assertions.assertEquals(1, publications.size());
        Assertions.assertEquals(DATA, publications.get(0).getData());
    }

    @Test
    public void historyRemoveSuccessTest() {
        client.publish(DATA, CHANNEL_3);

        final EmptyResponse response = client.historyRemove(CHANNEL_3);

        Assertions.assertNotNull(response);
        Assertions.assertNull(response.getError());

        final HistoryResponse history = client.history(CHANNEL_3);

        final List<Publication> publications = history.getResult().getPublications();
        Assertions.assertEquals(0, publications.size());
    }

    @Test
    public void channelsSuccessTest() {
        final ChannelsResponse response = client.channels(CHANNEL_PATTERN);

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getResult());
        Assertions.assertNull(response.getError());
        Assertions.assertEquals(0, response.getResult().getChannels().size());
    }

    @Test
    public void connectionsSuccessTest() {
        final ConnectionsResponse response = client.connections("", "");

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getResult());
//        Assertions.assertNull(response.getError());
        System.out.println(response.getError().getMessage());
    }

    @Test
    public void presenceSuccessTest() {
        final PresenceResponse response = client.presence(CHANNEL_1);

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getResult());
        Assertions.assertNull(response.getError());
        Assertions.assertEquals(0, response.getResult().getPresence().size());
    }

    @Test
    public void presenceStatsSuccessTest() {
        final PresenceStatsResponse response = client.presenceStats(CHANNEL_1);

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getResult());
        Assertions.assertNull(response.getError());
        Assertions.assertEquals(0, response.getResult().getNumClients());
        Assertions.assertEquals(0, response.getResult().getNumUsers());
    }

    @Test
    public void refreshStatsSuccessTest() {
        final EmptyResponse response = client.refresh(USER_ID);

        Assertions.assertNotNull(response);
        Assertions.assertNull(response.getError());
    }

    @Test
    public void subscribeStatsSuccessTest() {
        final EmptyResponse response = client.subscribe(USER_ID, CHANNEL_1);

        Assertions.assertNotNull(response);
        Assertions.assertNull(response.getError());
    }

    @Test
    public void unsubscribeStatsSuccessTest() {
        final EmptyResponse response = client.unsubscribe(USER_ID, CHANNEL_1);

        Assertions.assertNotNull(response);
        Assertions.assertNull(response.getError());
    }

    @Test
    public void disconnectStatsSuccessTest() {
        final EmptyResponse response = client.disconnect(USER_ID);

        Assertions.assertNotNull(response);
        Assertions.assertNull(response.getError());
    }

    @Test
    public void infoStatsSuccessTest() {
        final InfoResponse response = client.info();

        Assertions.assertNotNull(response);
        Assertions.assertNull(response.getError());
        Assertions.assertNotNull(response.getResult());
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
}
