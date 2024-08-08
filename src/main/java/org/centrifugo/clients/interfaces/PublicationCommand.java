package org.centrifugo.clients.interfaces;

import org.centrifugo.models.requests.publication.BroadcastRequest;
import org.centrifugo.models.requests.publication.PublishRequest;
import org.centrifugo.models.responses.BroadcastResponse;
import org.centrifugo.models.responses.PublishResponse;

import java.util.List;

public interface PublicationCommand {

    /**
     * Publish data (publication) into a channel
     *
     * @param request publish request {@link PublishRequest}
     *
     * @return publish response (it may be an empty object) {@link PublishResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    PublishResponse publish(final PublishRequest<?> request);

    /**
     * Publish a simple data (publication) into a channel
     *
     * @param data string to publish
     * @param channel name of channel
     *
     * @return publish response (it may be an empty object) {@link PublishResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    PublishResponse publish(final String data, final String channel);

    /**
     * Publish the same data into many channels
     *
     * @param request broadcast request {@link BroadcastRequest}
     *
     * @return broadcast response (contains list of publish response) {@link PublishResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    BroadcastResponse broadcast(final BroadcastRequest<?> request);

    /**
     * Publish the same simple data into many channels
     *
     * @param data string to publish
     * @param channels name of channels
     *
     * @return broadcast response (contains list of publish response) {@link PublishResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    BroadcastResponse broadcast(final String data, final List<String> channels);
}
