package org.centrifugo.services;

import org.centrifugo.models.requests.token.InvalidateUserTokensRequest;
import org.centrifugo.models.requests.token.RevokeTokenRequest;

public interface TokenCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Centrifugo PRO. Invalidate user tokens 
     */
    void invalidateUserTokens(final InvalidateUserTokensRequest request);

    /**
     * Centrifugo PRO. Revoke token
     */
    void revokeToken(final RevokeTokenRequest request);
}
