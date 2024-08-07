package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.user_block.BlockUserRequest;
import org.centrifugo.models.requests.user_block.UnblockUserRequest;

public interface UserBlockCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Centrifugo PRO. Block user
     */
    void blockUser(final BlockUserRequest request);

    /**
     * Centrifugo PRO. Unblock user
     */
    void unblockUser(final UnblockUserRequest request);
}
