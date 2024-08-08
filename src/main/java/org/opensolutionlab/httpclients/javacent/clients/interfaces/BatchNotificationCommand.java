package org.opensolutionlab.httpclients.javacent.clients.interfaces;

import org.opensolutionlab.httpclients.javacent.models.requests.batch.BatchRequest;
import org.opensolutionlab.httpclients.javacent.models.responses.BatchResponse;


public interface BatchNotificationCommand {

    /**
     * Sending many commands in one request. <br>
     * Commands processed sequentially by Centrifugo, you should check individual error in each returned reply.
     *
     * @param request batch request {@link BatchRequest}. It may contain all other requests in <b>command</b> field
     * @return list of replies with standard response that contains the result and error
     * @throws org.opensolutionlab.httpclients.javacent.exceptions.CentrifugoException base Centrifugo exception
     */
    BatchResponse batch(final BatchRequest request);

}
