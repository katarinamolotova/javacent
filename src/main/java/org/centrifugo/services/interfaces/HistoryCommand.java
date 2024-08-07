package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.history.HistoryRemoveRequest;
import org.centrifugo.models.requests.history.HistoryRequest;
import org.centrifugo.models.responses.EmptyResponse;
import org.centrifugo.models.responses.HistoryResponse;

public interface HistoryCommand {

    /**
     * Get history for a channel
     */
    HistoryResponse history(final HistoryRequest request);

    /**
     * Get history for a channel
     */
    HistoryResponse history(final String channel);

    /**
     * Remove history for a channel
     */
    EmptyResponse historyRemove(final HistoryRemoveRequest request);

    /**
     * Remove history for a channel
     */
    EmptyResponse historyRemove(final String channel);
}
