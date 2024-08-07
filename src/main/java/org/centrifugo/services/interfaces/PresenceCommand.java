package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.presence.PresenceRequest;
import org.centrifugo.models.requests.presence.PresenceStatsRequest;
import org.centrifugo.models.responses.PresenceResponse;
import org.centrifugo.models.responses.PresenceStatsResponse;

public interface PresenceCommand {

    /**
     * Get presence information for a channel
     */
    PresenceResponse presence(final PresenceRequest request);

    /**
     * Get presence information for a channel
     */
    PresenceResponse presence(final String channel);

    /**
     * Get presence stats information for a channel
     */
    PresenceStatsResponse presenceStats(final PresenceStatsRequest request);

    /**
     * Get presence stats information for a channel
     */
    PresenceStatsResponse presenceStats(final String channel);

}
