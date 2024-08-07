package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.publication.BroadcastRequest;
import org.centrifugo.models.requests.publication.PublishRequest;
import org.centrifugo.models.responses.BroadcastResponse;
import org.centrifugo.models.responses.PublishResponse;

import java.util.List;

public interface PublicationCommand {

    /**
     * Publish data into channel
     */
    PublishResponse publish(final PublishRequest<?> request);

    /**
     * Publish simple data into channel
     */
    PublishResponse publish(final String data, final String channel);

    /**
     * Publish same data into many channels
     */
    BroadcastResponse broadcast(final BroadcastRequest<?> request);

    /**
     * Publish same simple data into many channels
     */
    BroadcastResponse broadcast(final String data, final List<String> channels);
}
