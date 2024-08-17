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
import org.opensolutionlab.httpclients.models.requests.batch.BatchRequest;
import org.opensolutionlab.httpclients.models.responses.BatchResponse;


public interface BatchNotificationCommand {

    /**
     * Sending many commands in one request. <br>
     * Commands processed sequentially by Centrifugo, you should check individual error in each returned reply.
     *
     * @param request batch request {@link BatchRequest}. It may contain all other requests in <b>command</b> field
     *
     * @return list of replies with standard response that contains the result and error
     * @throws CentrifugoException base Centrifugo exception
     */
    BatchResponse batch(final BatchRequest request);

}
