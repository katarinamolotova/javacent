package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.stats.ChannelsRequest;
import org.centrifugo.models.requests.stats.ConnectionsRequest;
import org.centrifugo.models.responses.ChannelsResponse;
import org.centrifugo.models.responses.ConnectionsResponse;
import org.centrifugo.models.responses.InfoResponse;

public interface StatisticsCommand {

    /**
     * Centrifugo PRO. Get channel statistics by pattern
     */
    ChannelsResponse channels(final ChannelsRequest request);

    /**
     * Centrifugo PRO. Get channel statistics by pattern
     */
    ChannelsResponse channels(final String pattern);

    /**
     * Centrifugo PRO. Get connection statistics
     */
    ConnectionsResponse connections(final ConnectionsRequest request);

    /**
     * Centrifugo PRO. Get connection statistics
     */
    ConnectionsResponse connections(final String user, final String expression);

    /**
     * Centrifugo PRO. Get information about server nodes
     */
    InfoResponse info();
}
