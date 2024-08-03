package org.centrifugo.services;

import org.centrifugo.models.requests.connection_management.DisconnectRequest;
import org.centrifugo.models.requests.connection_management.RefreshRequest;
import org.centrifugo.models.requests.connection_management.SubscribeRequest;
import org.centrifugo.models.requests.connection_management.UnsubscribeRequest;
import org.centrifugo.models.requests.publication.BroadcastRequest;
import org.centrifugo.models.requests.publication.PublishRequest;

import java.util.List;

public interface CentrifugoCommand {

     // Publication commands

    void publish(final PublishRequest<?> request);
    void publish(final String data, final String channel);

    void broadcast(final BroadcastRequest<?> request);
    void broadcast(final String data, final List<String> channels);

    // Connection management commands

    void disconnect(final DisconnectRequest request);
    void disconnect(final String user);

    void refresh(final RefreshRequest request);
    void refresh(final String user);

    void subscribe(final SubscribeRequest request);
    void subscribe(final String user, final String channel);

    void unsubscribe(final UnsubscribeRequest request);
    void unsubscribe(final String user, final String channel);
}
