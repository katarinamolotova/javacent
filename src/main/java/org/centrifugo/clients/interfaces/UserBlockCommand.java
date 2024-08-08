package org.centrifugo.clients.interfaces;

import org.centrifugo.models.requests.user_block.BlockUserRequest;
import org.centrifugo.models.requests.user_block.UnblockUserRequest;
import org.centrifugo.models.responses.EmptyResponse;

public interface UserBlockCommand {

    /**
     * Centrifugo PRO. Block user <br>
     * When user is blocked it will be disconnected from Centrifugo immediately.
     *
     * @param request block user request {@link BlockUserRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse blockUser(final BlockUserRequest request);

    /**
     * Centrifugo PRO. Unblock user
     *
     * @param request unblock user request {@link UnblockUserRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse unblockUser(final UnblockUserRequest request);
}
