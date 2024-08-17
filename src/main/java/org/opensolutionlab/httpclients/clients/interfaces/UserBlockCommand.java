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
