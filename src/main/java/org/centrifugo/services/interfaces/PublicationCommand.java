package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.connection_management.DisconnectRequest;
import org.centrifugo.models.requests.connection_management.RefreshRequest;
import org.centrifugo.models.requests.connection_management.SubscribeRequest;
import org.centrifugo.models.requests.connection_management.UnsubscribeRequest;
import org.centrifugo.models.requests.publication.BroadcastRequest;
import org.centrifugo.models.requests.publication.PublishRequest;
import org.centrifugo.models.responses.ResponseModel;

import java.util.List;

public interface PublicationCommand {

    // TODO:
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Publish data into channel
     */
    ResponseModel publish(final PublishRequest<?> request);

    /**
     * Publish simple data into channel
     */
    ResponseModel publish(final String data, final String channel);

    /**
     * Publish same data into many channels
     */
    ResponseModel broadcast(final BroadcastRequest<?> request);

    /**
     * Publish same simple data into many channels
     */
    ResponseModel broadcast(final String data, final List<String> channels);
}
