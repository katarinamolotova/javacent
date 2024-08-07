package org.centrifugo.services;

import org.centrifugo.models.requests.token.InvalidateUserTokensRequest;
import org.centrifugo.models.requests.token.RevokeTokenRequest;

public interface TokenCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    void invalidateUserTokens(final InvalidateUserTokensRequest request);

    void revokeToken(final RevokeTokenRequest request);
}
