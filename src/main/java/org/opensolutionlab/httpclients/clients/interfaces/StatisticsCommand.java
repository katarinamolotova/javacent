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
import org.opensolutionlab.httpclients.models.requests.stats.ChannelsRequest;
import org.opensolutionlab.httpclients.models.requests.stats.ConnectionsRequest;
import org.opensolutionlab.httpclients.models.responses.ChannelsResponse;
import org.opensolutionlab.httpclients.models.responses.ConnectionsResponse;
import org.opensolutionlab.httpclients.models.responses.InfoResponse;

public interface StatisticsCommand {

    /**
     * Get channel statistics by pattern
     *
     * @param request channel request {@link ChannelsRequest}
     *
     * @return active channels (with one or more active subscribers in it) {@link ChannelsResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    ChannelsResponse channels(final ChannelsRequest request);

    /**
     * Get channel statistics by pattern
     *
     * @param pattern pattern to filter channels
     *
     * @return active channels (with one or more active subscribers in it) {@link ChannelsResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    ChannelsResponse channels(final String pattern);

    /**
     * Centrifugo PRO. Get connection statistics
     *
     * @param request connection request {@link ConnectionsRequest}
     *
     * @return information about active connections according to the request. {@link ConnectionsResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    ConnectionsResponse connections(final ConnectionsRequest request);

    /**
     * Centrifugo PRO. Get connection statistics
     *
     * @param user filter by user ID
     * @param expression CEL expression to filter users
     *
     * @return information about active connections according to the request. {@link ConnectionsResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    ConnectionsResponse connections(final String user, final String expression);

    /**
     * Get information about running Centrifugo nodes.
     *
     * @return information about all nodes in a cluster. {@link InfoResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    InfoResponse info();
}
