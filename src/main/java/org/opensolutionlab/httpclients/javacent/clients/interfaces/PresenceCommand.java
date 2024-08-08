package org.opensolutionlab.httpclients.javacent.clients.interfaces;

import org.opensolutionlab.httpclients.javacent.models.requests.presence.PresenceRequest;
import org.opensolutionlab.httpclients.javacent.models.requests.presence.PresenceStatsRequest;
import org.opensolutionlab.httpclients.javacent.models.responses.PresenceResponse;
import org.opensolutionlab.httpclients.javacent.models.responses.PresenceStatsResponse;

public interface PresenceCommand {

    /**
     * Get channel online presence information
     *
     * @param request presence request {@link PresenceRequest}
     *
     * @return all clients currently subscribed on this channel {@link PresenceResponse}
     * @throws org.opensolutionlab.httpclients.javacent.exceptions.CentrifugoException base Centrifugo exception
     */
    PresenceResponse presence(final PresenceRequest request);

    /**
     * Get channel online presence information
     *
     * @param channel channel name
     *
     * @return all clients currently subscribed on this channel {@link PresenceResponse}
     * @throws org.opensolutionlab.httpclients.javacent.exceptions.CentrifugoException base Centrifugo exception
     */
    PresenceResponse presence(final String channel);

    /**
     * Get short channel presence information (based on user ID)
     *
     * @param request presence statistics request {@link PresenceStatsRequest}
     *
     * @return number of clients and number of unique users {@link PresenceStatsResponse}
     * @throws org.opensolutionlab.httpclients.javacent.exceptions.CentrifugoException base Centrifugo exception
     */
    PresenceStatsResponse presenceStats(final PresenceStatsRequest request);

    /**
     * Get short channel presence information (based on user ID)
     *
     * @param channel channel name
     *
     * @return number of clients and number of unique users {@link PresenceStatsResponse}
     * @throws org.opensolutionlab.httpclients.javacent.exceptions.CentrifugoException base Centrifugo exception
     */
    PresenceStatsResponse presenceStats(final String channel);

}
