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
import org.opensolutionlab.httpclients.models.requests.user_status.DeleteUserStatusRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.GetUserStatusRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.UpdateUserStatusRequest;
import org.opensolutionlab.httpclients.models.responses.results.user_status.GetUserStatusResult;

import java.util.List;

public interface UserStatusCommand {

    /**
     * Centrifugo PRO. Delete users status information by IDs
     *
     * @param request delete user status request {@link DeleteUserStatusRequest}
     * @throws CentrifugoException base Centrifugo exception
     */
    void deleteUserStatus(final DeleteUserStatusRequest request);

    /**
     * Centrifugo PRO. Delete users status information by IDs
     *
     * @param users list of user IDs
     * @throws CentrifugoException base Centrifugo exception
     */
    void deleteUserStatus(final List<String> users);

    /**
     * Centrifugo PRO. Get status of particular users by IDs
     *
     * @param request get user status request {@link GetUserStatusRequest}
     * @return user statuses {@link GetUserStatusResult}
     * @throws CentrifugoException base Centrifugo exception
     */
    GetUserStatusResult getUserStatus(final GetUserStatusRequest request);

    /**
     * Centrifugo PRO. Get status of particular users by IDs
     *
     * @param users list of user IDs
     * @return user statuses {@link GetUserStatusResult}
     * @throws CentrifugoException base Centrifugo exception
     */
    GetUserStatusResult getUserStatus(final List<String> users);

    /**
     * Centrifugo PRO. Update user statuses by IDs
     *
     * @param request update user status request {@link UpdateUserStatusRequest}
     * @throws CentrifugoException base Centrifugo exception
     */
    void updateUserStatus(final UpdateUserStatusRequest request);

    /**
     * Centrifugo PRO. Update user statuses by IDs
     *
     * @param users list of user IDs
     * @param state new user status
     * @throws CentrifugoException base Centrifugo exception
     */
    void updateUserStatus(final List<String> users, final String state);
}
