package org.opensolutionlab.httpclients.clients.interfaces;

import org.opensolutionlab.httpclients.exceptions.CentrifugoException;
import org.opensolutionlab.httpclients.models.requests.token.InvalidateUserTokensRequest;
import org.opensolutionlab.httpclients.models.requests.token.RevokeTokenRequest;
import org.opensolutionlab.httpclients.models.responses.EmptyResponse;

public interface TokenCommand {

    /**
     * Centrifugo PRO. Invalidate all tokens for a user which were issued before a certain time. <br>
     * For example, this may be useful after user changed a password in an application.
     *
     * @param request invalidate user token request {@link InvalidateUserTokensRequest}
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse invalidateUserTokens(final InvalidateUserTokensRequest request);

    /**
     * Centrifugo PRO. Revoke individual tokens. <br>
     * For example, this may be useful when token leakage has been detected, and you want to revoke access for a particular tokens.
     *
     * @param request revoke token request {@link RevokeTokenRequest}
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse revokeToken(final RevokeTokenRequest request);
}
