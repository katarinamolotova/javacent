package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.user_status.DeleteUserStatusRequest;
import org.centrifugo.models.requests.user_status.GetUserStatusRequest;
import org.centrifugo.models.requests.user_status.UpdateUserStatusRequest;
import org.centrifugo.models.responses.EmptyResponse;
import org.centrifugo.models.responses.GetUserStatusResponse;

import java.util.List;

public interface UserStatusCommand {

    /**
     * Centrifugo PRO. Delete user status
     */
    EmptyResponse deleteUserStatus(final DeleteUserStatusRequest request);

    /**
     * Centrifugo PRO. Delete user status
     */
    EmptyResponse deleteUserStatus(final List<String> user);

    /**
     * Centrifugo PRO. Get user status
     */
    GetUserStatusResponse getUserStatus(final GetUserStatusRequest request);

    /**
     * Centrifugo PRO. Get user status
     */
    GetUserStatusResponse getUserStatus(final List<String> user);

    /**
     * Centrifugo PRO. Update user status
     */
    EmptyResponse updateUserStatus(final UpdateUserStatusRequest request);

    /**
     * Centrifugo PRO. Update user status
     */
    EmptyResponse updateUserStatus(final List<String> user, final String state);
}
