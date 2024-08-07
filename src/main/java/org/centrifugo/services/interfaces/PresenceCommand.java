package org.centrifugo.services.interfaces;

import org.centrifugo.models.requests.presence.PresenceRequest;
import org.centrifugo.models.requests.presence.PresenceStatsRequest;

public interface PresenceCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Get presence information for a channel
     */
    void presence(final PresenceRequest request);

    /**
     * Get presence information for a channel
     */
    void presence(final String channel);

    /**
     * Get presence stats information for a channel
     */
    void presenceStats(final PresenceStatsRequest request);

    /**
     * Get presence stats information for a channel
     */
    void presenceStats(final String channel);

}
