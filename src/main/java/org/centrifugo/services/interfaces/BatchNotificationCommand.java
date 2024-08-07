package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.batch.BatchRequest;

public interface BatchNotificationCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Batch request (send many commands in one request)
     */
    void batch(final BatchRequest request);

}
