package org.centrifugo.models.requests.publication;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class BroadcastModel<T> extends DataModelAbstract<T> {
    private List<String> channels;

    public BroadcastModel(
            final T data,
            final List<String> channels
    ) {
        super(data);
        this.channels = channels;
    }
}
