package org.centrifugo.services;

import org.centrifugo.models.requests.user_block.BlockUserRequest;
import org.centrifugo.models.requests.user_block.UnblockUserRequest;

public interface UserBlockCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    void blockUser(final BlockUserRequest request);

    void unblockUser(final UnblockUserRequest request);
}
