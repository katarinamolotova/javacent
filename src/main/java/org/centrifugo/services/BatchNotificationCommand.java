package org.centrifugo.services;

import org.centrifugo.models.requests.batch.BatchRequest;

public interface BatchNotificationCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    void batch(final BatchRequest request);

}
