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
import org.opensolutionlab.httpclients.models.requests.token.InvalidateUserTokensRequest;
import org.opensolutionlab.httpclients.models.requests.token.RevokeTokenRequest;

public interface TokenCommand {

    /**
     * Centrifugo PRO. Invalidate all tokens for a user which were issued before a certain time. <br>
     * For example, this may be useful after user changed a password in an application.
     *
     * @param request invalidate user token request {@link InvalidateUserTokensRequest}
     * @throws CentrifugoException base Centrifugo exception
     */
    void invalidateUserTokens(final InvalidateUserTokensRequest request);

    /**
     * Centrifugo PRO. Revoke individual tokens. <br>
     * For example, this may be useful when token leakage has been detected, and you want to revoke access for a particular tokens.
     *
     * @param request revoke token request {@link RevokeTokenRequest}
     * @throws CentrifugoException base Centrifugo exception
     */
    void revokeToken(final RevokeTokenRequest request);
}
