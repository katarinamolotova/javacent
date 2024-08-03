package org.centrifugo.models.requests.publication;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PublishModel<T> extends DataModelAbstract<T> {
    private String channel;

    public PublishModel(
            final T data,
            final String channel
    ) {
        super(data);
        this.channel = channel;
    }
}
