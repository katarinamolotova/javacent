package org.centrifugo.services;

import org.centrifugo.models.requests.presence.PresenceRequest;
import org.centrifugo.models.requests.presence.PresenceStatsRequest;

public interface PresenceCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    void presence(final PresenceRequest request);

    void presence(final String channel);

    void presenceStats(final PresenceStatsRequest request);

    void presenceStats(final String channel);

}
