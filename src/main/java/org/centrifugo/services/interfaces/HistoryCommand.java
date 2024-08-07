package org.centrifugo.services;

import org.centrifugo.models.requests.history.HistoryRemoveRequest;
import org.centrifugo.models.requests.history.HistoryRequest;

public interface HistoryCommand {

    // TODO:
    //  - describe response in java doc
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Get history for a channel
     */
    void history(final HistoryRequest request);

    /**
     * Get history for a channel
     */
    void history(final String channel);

    /**
     * Remove history for a channel
     */
    void historyRemove(final HistoryRemoveRequest request);

    /**
     * Remove history for a channel
     */
    void historyRemove(final String channel);
}
