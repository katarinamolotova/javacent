package org.opensolutionlab.httpclients.clients.interfaces;

import org.opensolutionlab.httpclients.exceptions.CentrifugoException;
import org.opensolutionlab.httpclients.models.requests.user_status.DeleteUserStatusRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.GetUserStatusRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.UpdateUserStatusRequest;
import org.opensolutionlab.httpclients.models.responses.EmptyResponse;
import org.opensolutionlab.httpclients.models.responses.GetUserStatusResponse;

import java.util.List;

public interface UserStatusCommand {

    /**
     * Centrifugo PRO. Delete users status information by IDs
     *
     * @param request delete user status request {@link DeleteUserStatusRequest}
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse deleteUserStatus(final DeleteUserStatusRequest request);

    /**
     * Centrifugo PRO. Delete users status information by IDs
     *
     * @param users list of user IDs
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse deleteUserStatus(final List<String> users);

    /**
     * Centrifugo PRO. Get status of particular users by IDs
     *
     * @param request get user status request {@link GetUserStatusRequest}
     *
     * @return user statuses {@link GetUserStatusResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    GetUserStatusResponse getUserStatus(final GetUserStatusRequest request);

    /**
     * Centrifugo PRO. Get status of particular users by IDs
     *
     * @param users list of user IDs
     *
     * @return user statuses {@link GetUserStatusResponse}
     * @throws CentrifugoException base Centrifugo exception
     */
    GetUserStatusResponse getUserStatus(final List<String> users);

    /**
     * Centrifugo PRO. Update user statuses by IDs
     *
     * @param request update user status request {@link UpdateUserStatusRequest}
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse updateUserStatus(final UpdateUserStatusRequest request);

    /**
     * Centrifugo PRO. Update user statuses by IDs
     *
     * @param users list of user IDs
     * @param state new user status
     *
     * @return empty object
     * @throws CentrifugoException base Centrifugo exception
     */
    EmptyResponse updateUserStatus(final List<String> users, final String state);
}
