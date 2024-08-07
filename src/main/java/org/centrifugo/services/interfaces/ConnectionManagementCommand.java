package org.centrifugo.services;

import org.centrifugo.models.requests.connection_management.DisconnectRequest;
import org.centrifugo.models.requests.connection_management.RefreshRequest;
import org.centrifugo.models.requests.connection_management.SubscribeRequest;
import org.centrifugo.models.requests.connection_management.UnsubscribeRequest;
import org.centrifugo.models.responses.ResponseModel;

public interface ConnectionManagementCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Disconnect client(s) from server
     */
    ResponseModel disconnect(final DisconnectRequest request);

    /**
     * Disconnect client from server
     */
    ResponseModel disconnect(final String user);

    /**
     * Refresh connection(s) by server-side call
     */
    void refresh(final RefreshRequest request);

    /**
     * Refresh connection by server-side call
     */
    void refresh(final String user);

    /**
     * Subscribe connection(s) to a channel
     */
    ResponseModel subscribe(final SubscribeRequest request);

    /**
     * Subscribe connection to a channel
     */
    ResponseModel subscribe(final String user, final String channel);

    /**
     * Unsubscribe connection(s) from channel
     */
    ResponseModel unsubscribe(final UnsubscribeRequest request);

    /**
     * Unsubscribe connection from channel
     */
    ResponseModel unsubscribe(final String user, final String channel);
}
