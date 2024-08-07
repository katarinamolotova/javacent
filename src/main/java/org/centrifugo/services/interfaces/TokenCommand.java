package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.token.InvalidateUserTokensRequest;
import org.centrifugo.models.requests.token.RevokeTokenRequest;
import org.centrifugo.models.responses.EmptyResponse;

public interface TokenCommand {

    /**
     * Centrifugo PRO. Invalidate user tokens
     */
    EmptyResponse invalidateUserTokens(final InvalidateUserTokensRequest request);

    /**
     * Centrifugo PRO. Revoke token
     */
    EmptyResponse revokeToken(final RevokeTokenRequest request);
}
