package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.connection_management.DisconnectRequest;
import org.centrifugo.models.requests.connection_management.RefreshRequest;
import org.centrifugo.models.requests.connection_management.SubscribeRequest;
import org.centrifugo.models.requests.connection_management.UnsubscribeRequest;
import org.centrifugo.models.responses.EmptyResponse;

public interface ConnectionManagementCommand {

    /**
     * Disconnect client(s) from server
     */
    EmptyResponse disconnect(final DisconnectRequest request);

    /**
     * Disconnect client from server
     */
    EmptyResponse disconnect(final String user);

    /**
     * Refresh connection(s) by server-side call
     */
    EmptyResponse refresh(final RefreshRequest request);

    /**
     * Refresh connection by server-side call
     */
    EmptyResponse refresh(final String user);

    /**
     * Subscribe connection(s) to a channel
     */
    EmptyResponse subscribe(final SubscribeRequest request);

    /**
     * Subscribe connection to a channel
     */
    EmptyResponse subscribe(final String user, final String channel);

    /**
     * Unsubscribe connection(s) from channel
     */
    EmptyResponse unsubscribe(final UnsubscribeRequest request);

    /**
     * Unsubscribe connection from channel
     */
    EmptyResponse unsubscribe(final String user, final String channel);
}
