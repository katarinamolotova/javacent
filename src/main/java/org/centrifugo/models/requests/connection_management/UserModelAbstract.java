package org.centrifugo.models.requests.connection_management;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.centrifugo.models.requests.RequestModel;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class UserModelAbstract implements RequestModel {
    private String user;
}
