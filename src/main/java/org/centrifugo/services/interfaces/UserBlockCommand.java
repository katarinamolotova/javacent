package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.user_block.BlockUserRequest;
import org.centrifugo.models.requests.user_block.UnblockUserRequest;
import org.centrifugo.models.responses.EmptyResponse;

public interface UserBlockCommand {

    /**
     * Centrifugo PRO. Block user
     */
    EmptyResponse blockUser(final BlockUserRequest request);

    /**
     * Centrifugo PRO. Unblock user
     */
    EmptyResponse unblockUser(final UnblockUserRequest request);
}
