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
import org.opensolutionlab.httpclients.models.requests.presence.PresenceRequest;
import org.opensolutionlab.httpclients.models.requests.presence.PresenceStatsRequest;
import org.opensolutionlab.httpclients.models.responses.PresenceResponse;
import org.opensolutionlab.httpclients.models.responses.PresenceStatsResponse;

public interface PresenceCommand {

    /**
     * Get channel online presence information
     *
     * @param request presence request {@link PresenceRequest}
     *
     * @return all clients currently subscribed on this channel {@link PresenceResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    PresenceResponse presence(final PresenceRequest request);

    /**
     * Get channel online presence information
     *
     * @param channel channel name
     *
     * @return all clients currently subscribed on this channel {@link PresenceResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    PresenceResponse presence(final String channel);

    /**
     * Get short channel presence information (based on user ID)
     *
     * @param request presence statistics request {@link PresenceStatsRequest}
     *
     * @return number of clients and number of unique users {@link PresenceStatsResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    PresenceStatsResponse presenceStats(final PresenceStatsRequest request);

    /**
     * Get short channel presence information (based on user ID)
     *
     * @param channel channel name
     *
     * @return number of clients and number of unique users {@link PresenceStatsResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    PresenceStatsResponse presenceStats(final String channel);

}
