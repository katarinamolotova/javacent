package org.centrifugo.models.requests.connection_management;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class DisconnectModel extends UserModelAbstract {

    DisconnectModel(final String user) {
        super(user);
    }
}
