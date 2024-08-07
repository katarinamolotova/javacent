package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.batch.BatchRequest;
import org.centrifugo.models.responses.BatchResponse;


public interface BatchNotificationCommand {

    /**
     * Batch request (send many commands in one request)
     */
    BatchResponse batch(final BatchRequest request);

}
