package org.centrifugo.services;

import org.centrifugo.models.requests.user_status.DeleteUserStatusRequest;
import org.centrifugo.models.requests.user_status.GetUserStatusRequest;
import org.centrifugo.models.requests.user_status.UpdateUserStatusRequest;

import java.util.List;

public interface UserStatusCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    void deleteUserStatus(final DeleteUserStatusRequest request);

    void deleteUserStatus(final List<String> user);

    void getUserStatus(final GetUserStatusRequest request);

    void getUserStatus(final List<String> user);

    void updateUserStatus(final UpdateUserStatusRequest request);

    void updateUserStatus(final List<String> user, final String state);
}
