package org.centrifugo.models.requests.connection_management;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UnsubscribeModel extends UserModelAbstract {
    private String channel;

    public UnsubscribeModel(final String user, final String channel) {
        super(user);
        this.channel = channel;
    }

    public UnsubscribeModel() {}
}
