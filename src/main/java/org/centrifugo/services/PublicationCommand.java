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

    // Connection management commands

    ResponseModel disconnect(final DisconnectRequest request);
    ResponseModel disconnect(final String user);

    void refresh(final RefreshRequest request);
    void refresh(final String user);

    ResponseModel subscribe(final SubscribeRequest request);
    ResponseModel subscribe(final String user, final String channel);

    ResponseModel unsubscribe(final UnsubscribeRequest request);
    ResponseModel unsubscribe(final String user, final String channel);
}
