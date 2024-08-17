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
import org.opensolutionlab.httpclients.models.requests.user_block.BlockUserRequest;
import org.opensolutionlab.httpclients.models.requests.user_block.UnblockUserRequest;
import org.opensolutionlab.httpclients.models.responses.EmptyResponse;

public interface UserBlockCommand {

    /**
     * Centrifugo PRO. Block user <br>
     * When user is blocked it will be disconnected from Centrifugo immediately.
     *
     * @param request block user request {@link BlockUserRequest}
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse blockUser(final BlockUserRequest request);

    /**
     * Centrifugo PRO. Unblock user
     *
     * @param request unblock user request {@link UnblockUserRequest}
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse unblockUser(final UnblockUserRequest request);
}
