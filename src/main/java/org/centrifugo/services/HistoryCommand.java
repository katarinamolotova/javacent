package org.centrifugo.services;

import org.centrifugo.models.requests.history.HistoryRemoveRequest;
import org.centrifugo.models.requests.history.HistoryRequest;

public interface HistoryCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    void history(final HistoryRequest request);

    void history(final String channel);

    void historyRemove(final HistoryRemoveRequest request);

    void historyRemove(final String channel);
}
