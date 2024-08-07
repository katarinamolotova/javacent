package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.user_status.DeleteUserStatusRequest;
import org.centrifugo.models.requests.user_status.GetUserStatusRequest;
import org.centrifugo.models.requests.user_status.UpdateUserStatusRequest;

import java.util.List;

public interface UserStatusCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Centrifugo PRO. Delete user status 
     */
    void deleteUserStatus(final DeleteUserStatusRequest request);

    /**
     * Centrifugo PRO. Delete user status 
     */
    void deleteUserStatus(final List<String> user);

    /**
     * Centrifugo PRO. Get user status 
     */
    void getUserStatus(final GetUserStatusRequest request);

    /**
     * Centrifugo PRO. Get user status 
     */
    void getUserStatus(final List<String> user);

    /**
     * Centrifugo PRO. Update user status 
     */
    void updateUserStatus(final UpdateUserStatusRequest request);

    /**
     * Centrifugo PRO. Update user status 
     */
    void updateUserStatus(final List<String> user, final String state);
}
