package org.centrifugo.services;

import org.centrifugo.models.requests.connection_management.DisconnectModel;
import org.centrifugo.models.requests.connection_management.RefreshModel;
import org.centrifugo.models.requests.connection_management.SubscribeModel;
import org.centrifugo.models.requests.connection_management.UnsubscribeModel;
import org.centrifugo.models.requests.publication.BroadcastModel;
import org.centrifugo.models.requests.publication.PublishModel;

import java.util.List;

public interface CentrifugoCommand {

     // Publication commands

    void publish(final PublishModel<?> model);
    void publish(final String data, final String channel);

    void broadcast(final BroadcastModel<?> model);
    void broadcast(final String data, final List<String> channels);

    // Connection management commands

    void disconnect(final DisconnectModel model);
    void refresh(final RefreshModel model);
    void subscribe(final SubscribeModel model);
    void unsubscribe(final UnsubscribeModel model);
}
