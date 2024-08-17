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
import org.opensolutionlab.httpclients.models.responses.BroadcastResponse;
import org.opensolutionlab.httpclients.models.responses.PublishResponse;

import java.util.List;

public interface PublicationCommand {

    /**
     * Publish data (publication) into a channel
     *
     * @param request publish request {@link PublishRequest}
     *
     * @return publish response (it may be an empty object) {@link PublishResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    PublishResponse publish(final PublishRequest<?> request);

    /**
     * Publish a simple data (publication) into a channel
     *
     * @param data string to publish
     * @param channel name of channel
     *
     * @return publish response (it may be an empty object) {@link PublishResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    PublishResponse publish(final String data, final String channel);

    /**
     * Publish the same data into many channels
     *
     * @param request broadcast request {@link BroadcastRequest}
     *
     * @return broadcast response (contains list of publish response) {@link PublishResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    BroadcastResponse broadcast(final BroadcastRequest<?> request);

    /**
     * Publish the same simple data into many channels
     *
     * @param data string to publish
     * @param channels name of channels
     *
     * @return broadcast response (contains list of publish response) {@link PublishResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    BroadcastResponse broadcast(final String data, final List<String> channels);
}
