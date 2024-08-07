package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.stats.ChannelsRequest;
import org.centrifugo.models.requests.stats.ConnectionsRequest;

public interface StatisticsCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Centrifugo PRO. Get channel statistics by pattern
     */
    void channels(final ChannelsRequest request);

    /**
     * Centrifugo PRO. Get channel statistics by pattern
     */
    void channels(final String pattern);

    /**
     * Centrifugo PRO. Get connection statistics
     */
    void connections(final ConnectionsRequest request);

    /**
     * Centrifugo PRO. Get connection statistics
     */
    void connections(final String user, final String expression);

    /**
     * Centrifugo PRO. Get information about server nodes
     */
    void info();
}
