package org.centrifugo.models.requests.connection_management;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RefreshModel extends UserModelAbstract {

    RefreshModel(final String user) {
        super(user);
    }
}
