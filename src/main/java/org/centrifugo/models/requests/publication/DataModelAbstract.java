package org.centrifugo.models.requests.publication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.centrifugo.models.requests.RequestModel;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class DataModelAbstract<T> implements RequestModel {
    private T data;
}
