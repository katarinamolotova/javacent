package org.centrifugo.services;

import org.centrifugo.models.requests.stats.ChannelsRequest;
import org.centrifugo.models.requests.stats.ConnectionsRequest;

public interface StatStatusCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    void channels(final ChannelsRequest request);

    void channels(final String patter);

    void connections(final ConnectionsRequest request);

    void connections(final String user, final String expression);

    void info();
}
