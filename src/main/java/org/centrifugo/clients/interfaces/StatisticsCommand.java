package org.centrifugo.clients.interfaces;

import org.centrifugo.models.requests.stats.ChannelsRequest;
import org.centrifugo.models.requests.stats.ConnectionsRequest;
import org.centrifugo.models.responses.ChannelsResponse;
import org.centrifugo.models.responses.ConnectionsResponse;
import org.centrifugo.models.responses.InfoResponse;

public interface StatisticsCommand {

    /**
     * Get channel statistics by pattern
     *
     * @param request channel request {@link ChannelsRequest}
     *
     * @return active channels (with one or more active subscribers in it) {@link ChannelsResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    ChannelsResponse channels(final ChannelsRequest request);

    /**
     * Get channel statistics by pattern
     *
     * @param pattern pattern to filter channels
     *
     * @return active channels (with one or more active subscribers in it) {@link ChannelsResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    ChannelsResponse channels(final String pattern);

    /**
     * Centrifugo PRO. Get connection statistics
     *
     * @param request connection request {@link ConnectionsRequest}
     *
     * @return information about active connections according to the request. {@link ConnectionsResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    ConnectionsResponse connections(final ConnectionsRequest request);

    /**
     * Centrifugo PRO. Get connection statistics
     *
     * @param user filter by user ID
     * @param expression CEL expression to filter users
     *
     * @return information about active connections according to the request. {@link ConnectionsResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    ConnectionsResponse connections(final String user, final String expression);

    /**
     * Get information about running Centrifugo nodes.
     *
     * @return information about all nodes in a cluster. {@link InfoResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    InfoResponse info();
}
