package org.opensolutionlab.httpclients.clients.interfaces;

import org.opensolutionlab.httpclients.exceptions.CentrifugoException;
import org.opensolutionlab.httpclients.models.requests.publication.BroadcastRequest;
import org.opensolutionlab.httpclients.models.requests.publication.PublishRequest;
import org.opensolutionlab.httpclients.models.responses.BroadcastResponse;
import org.opensolutionlab.httpclients.models.responses.PublishResponse;

import java.util.List;

public interface PublicationCommand {

    /**
     * Publish data (publication) into a channel
     *
     * @param request publish request {@link PublishRequest}
     *
     * @return publish response (it may be an empty object) {@link PublishResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    PublishResponse publish(final PublishRequest<?> request);

    /**
     * Publish a simple data (publication) into a channel
     *
     * @param data string to publish
     * @param channel name of channel
     *
     * @return publish response (it may be an empty object) {@link PublishResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    PublishResponse publish(final String data, final String channel);

    /**
     * Publish the same data into many channels
     *
     * @param request broadcast request {@link BroadcastRequest}
     *
     * @return broadcast response (contains list of publish response) {@link PublishResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    BroadcastResponse broadcast(final BroadcastRequest<?> request);

    /**
     * Publish the same simple data into many channels
     *
     * @param data string to publish
     * @param channels name of channels
     *
     * @return broadcast response (contains list of publish response) {@link PublishResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    BroadcastResponse broadcast(final String data, final List<String> channels);
}
