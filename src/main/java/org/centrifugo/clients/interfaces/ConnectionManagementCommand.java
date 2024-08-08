package org.centrifugo.clients.interfaces;

import org.centrifugo.models.requests.connection_management.DisconnectRequest;
import org.centrifugo.models.requests.connection_management.RefreshRequest;
import org.centrifugo.models.requests.connection_management.SubscribeRequest;
import org.centrifugo.models.requests.connection_management.UnsubscribeRequest;
import org.centrifugo.models.responses.EmptyResponse;

public interface ConnectionManagementCommand {

    /**
     * Disconnect client(s) from server by ID.
     *
     * @param request disconnect request {@link DisconnectRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse disconnect(final DisconnectRequest request);

    /**
     * Disconnect client from server by ID
     *
     * @param user user ID
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse disconnect(final String user);

    /**
     * Refresh connection(s) by user ID (mostly useful when unidirectional transports are used)
     *
     * @param request refresh request {@link RefreshRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse refresh(final RefreshRequest request);

    /**
     * Refresh connection by user ID (mostly useful when unidirectional transports are used)
     *
     * @param user user ID
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse refresh(final String user);

    /**
     * Subscribe active connection(s) to a channel by user ID (mostly useful for dynamic server-side subscription)
     *
     * @param request subscribe request {@link SubscribeRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse subscribe(final SubscribeRequest request);

    /**
     * Subscribe active connection to a channel by user ID (mostly useful for dynamic server-side subscription)
     *
     * @param user user ID
     * @param channel channel name
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse subscribe(final String user, final String channel);

    /**
     * Unsubscribe connection(s) from channel
     *
     * @param request unsubscribe request {@link UnsubscribeRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse unsubscribe(final UnsubscribeRequest request);

    /**
     * Unsubscribe connection from channel
     *
     * @param user user ID
     * @param channel channel name
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse unsubscribe(final String user, final String channel);
}
