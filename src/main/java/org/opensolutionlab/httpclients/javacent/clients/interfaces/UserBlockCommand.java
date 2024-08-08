package org.opensolutionlab.httpclients.javacent.clients.interfaces;

import org.opensolutionlab.httpclients.javacent.models.requests.user_block.BlockUserRequest;
import org.opensolutionlab.httpclients.javacent.models.requests.user_block.UnblockUserRequest;
import org.opensolutionlab.httpclients.javacent.models.responses.EmptyResponse;

public interface UserBlockCommand {

    /**
     * Centrifugo PRO. Block user <br>
     * When user is blocked it will be disconnected from Centrifugo immediately.
     *
     * @param request block user request {@link BlockUserRequest}
     *
     * @return empty object
     * @throws org.opensolutionlab.httpclients.javacent.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse blockUser(final BlockUserRequest request);

    /**
     * Centrifugo PRO. Unblock user
     *
     * @param request unblock user request {@link UnblockUserRequest}
     *
     * @return empty object
     * @throws org.opensolutionlab.httpclients.javacent.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse unblockUser(final UnblockUserRequest request);
}
