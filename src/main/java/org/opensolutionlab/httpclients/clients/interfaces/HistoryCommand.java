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
import org.opensolutionlab.httpclients.models.requests.history.HistoryRemoveRequest;
import org.opensolutionlab.httpclients.models.requests.history.HistoryRequest;
import org.opensolutionlab.httpclients.models.responses.EmptyResponse;
import org.opensolutionlab.httpclients.models.responses.HistoryResponse;

public interface HistoryCommand {

    /**
     * Get channel history information (list of last messages published into the channel). <br>
     * By default if no <b>limit</b> parameter set in request history call will only return current stream position
     * information - i.e. <b>offset</b> and <b>epoch</b> fields.
     *
     * @param request history request {@link HistoryRequest}
     *
     * @return channel history information {@link HistoryResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    HistoryResponse history(final HistoryRequest request);

    /**
     * Get channel history information without list of last messages published into the channel
     *
     * @param channel channel name
     *
     * @return current stream position information (<b>offset</b> and <b>epoch</b> fields) {@link HistoryResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    HistoryResponse history(final String channel);

    /**
     * Remove publications in channel history <br>
     * Current top stream position meta data kept untouched to avoid client disconnects due to insufficient state.
     *
     * @param request history remove request {@link HistoryRemoveRequest}
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse historyRemove(final HistoryRemoveRequest request);

    /**
     * Remove publications in channel history <br>
     * Current top stream position meta data kept untouched to avoid client disconnects due to insufficient state.
     *
     * @param channel channel name
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse historyRemove(final String channel);
}
