package org.centrifugo.services;

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
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    ResponseModel publish(final PublishRequest<?> request);
    ResponseModel publish(final String data, final String channel);

    ResponseModel broadcast(final BroadcastRequest<?> request);
    ResponseModel broadcast(final String data, final List<String> channels);
}
