package org.centrifugo.clients.interfaces;

import org.centrifugo.models.requests.history.HistoryRemoveRequest;
import org.centrifugo.models.requests.history.HistoryRequest;
import org.centrifugo.models.responses.EmptyResponse;
import org.centrifugo.models.responses.HistoryResponse;

public interface HistoryCommand {

    /**
     * Get channel history information (list of last messages published into the channel). <br>
     * By default if no <b>limit</b> parameter set in request history call will only return current stream position
     * information - i.e. <b>offset</b> and <b>epoch</b> fields.
     *
     * @param request history request {@link HistoryRequest}
     *
     * @return channel history information {@link HistoryResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    HistoryResponse history(final HistoryRequest request);

    /**
     * Get channel history information without list of last messages published into the channel
     *
     * @param channel channel name
     *
     * @return current stream position information (<b>offset</b> and <b>epoch</b> fields) {@link HistoryResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    HistoryResponse history(final String channel);

    /**
     * Remove publications in channel history <br>
     * Current top stream position meta data kept untouched to avoid client disconnects due to insufficient state.
     *
     * @param request history remove request {@link HistoryRemoveRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse historyRemove(final HistoryRemoveRequest request);

    /**
     * Remove publications in channel history <br>
     * Current top stream position meta data kept untouched to avoid client disconnects due to insufficient state.
     *
     * @param channel channel name
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse historyRemove(final String channel);
}
