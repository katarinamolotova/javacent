package org.centrifugo.services;

import org.centrifugo.models.broadcast.BroadcastDataModel;
import org.centrifugo.models.publish.PublishDataModel;

import java.util.List;

public interface CentrifugoCommand {

    /**
     *  Publications command
     */


    void publish(final PublishDataModel<?> dataModel);
    void publish(final String data, final String channel);

    void broadcast(final BroadcastDataModel<?> dataModel);
    void broadcast(final String data, final List<String> channels);


}
