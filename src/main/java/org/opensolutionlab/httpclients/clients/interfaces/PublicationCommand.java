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
import org.opensolutionlab.httpclients.models.requests.publication.BroadcastRequest;
import org.opensolutionlab.httpclients.models.requests.publication.PublishRequest;
import org.opensolutionlab.httpclients.models.responses.results.publication.BroadcastResult;
import org.opensolutionlab.httpclients.models.responses.results.publication.PublishResult;

import java.util.List;

public interface PublicationCommand {

    /**
     * Publish data (publication) into a channel
     *
     * @param request publish request {@link PublishRequest}
     * @return publish response (it may be an empty object) {@link PublishResult}
     * @throws CentrifugoException base Centrifugo exception
     */
    PublishResult publish(final PublishRequest<?> request);

    /**
     * Publish a simple data (publication) into a channel
     *
     * @param channel name of channel
     * @param data    data to publish
     * @return publish response (it may be an empty object) {@link PublishResult}
     * @throws CentrifugoException base Centrifugo exception
     */
    PublishResult publish(final String channel, final Object data);

    /**
     * Publish the same data into many channels
     *
     * @param request broadcast request {@link BroadcastRequest}
     * @return broadcast response (contains list of publish response) {@link BroadcastResult}
     * @throws CentrifugoException base Centrifugo exception
     */
    BroadcastResult broadcast(final BroadcastRequest<?> request);

    /**
     * Publish the same simple data into many channels
     *
     * @param channels name of channels
     * @param data     data to publish
     * @return broadcast response (contains list of publish response) {@link BroadcastResult}
     * @throws CentrifugoException base Centrifugo exception
     */
    BroadcastResult broadcast(final List<String> channels, final Object data);
}
