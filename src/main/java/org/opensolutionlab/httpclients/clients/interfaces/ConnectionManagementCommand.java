/*
 * Copyright 2024 Molotova Katerina, Kukhtachev Mikhail.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensolutionlab.httpclients.clients.interfaces;

import org.opensolutionlab.httpclients.exceptions.CentrifugoException;
import org.opensolutionlab.httpclients.models.requests.connection_management.DisconnectRequest;
import org.opensolutionlab.httpclients.models.requests.connection_management.RefreshRequest;
import org.opensolutionlab.httpclients.models.requests.connection_management.SubscribeRequest;
import org.opensolutionlab.httpclients.models.requests.connection_management.UnsubscribeRequest;

public interface ConnectionManagementCommand {

    /**
     * Disconnect client(s) from server by ID.
     *
     * @param request disconnect request {@link DisconnectRequest}
     * @throws CentrifugoException base Centrifugo exception
     */
    void disconnect(final DisconnectRequest request);

    /**
     * Disconnect client from server by ID
     *
     * @param user user ID
     * @throws CentrifugoException base Centrifugo exception
     */
    void disconnect(final String user);

    /**
     * Refresh connection(s) by user ID (mostly useful when unidirectional transports are used)
     *
     * @param request refresh request {@link RefreshRequest}
     * @throws CentrifugoException base Centrifugo exception
     */
    void refresh(final RefreshRequest request);

    /**
     * Refresh connection by user ID (mostly useful when unidirectional transports are used)
     *
     * @param user user ID
     * @throws CentrifugoException base Centrifugo exception
     */
    void refresh(final String user);

    /**
     * Subscribe active connection(s) to a channel by user ID (mostly useful for dynamic server-side subscription)
     *
     * @param request subscribe request {@link SubscribeRequest}
     * @throws CentrifugoException base Centrifugo exception
     */
    void subscribe(final SubscribeRequest request);

    /**
     * Subscribe active connection to a channel by user ID (mostly useful for dynamic server-side subscription)
     *
     * @param user    user ID
     * @param channel channel name
     * @throws CentrifugoException base Centrifugo exception
     */
    void subscribe(final String user, final String channel);

    /**
     * Unsubscribe connection(s) from channel
     *
     * @param request unsubscribe request {@link UnsubscribeRequest}
     * @throws CentrifugoException base Centrifugo exception
     */
    void unsubscribe(final UnsubscribeRequest request);

    /**
     * Unsubscribe connection from channel
     *
     * @param user    user ID
     * @param channel channel name
     * @throws CentrifugoException base Centrifugo exception
     */
    void unsubscribe(final String user, final String channel);
}
