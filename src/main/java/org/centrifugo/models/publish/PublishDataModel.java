package org.centrifugo.models.publish;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.centrifugo.models.DataModelAbstract;

import javax.annotation.Nonnull;

@Setter
@Getter
@NoArgsConstructor
public class PublishDataModel<T> extends DataModelAbstract<T> {
    private String channel;

    public PublishDataModel(
            @Nonnull final T data,
            @Nonnull final String channel
    ) {
        super(data);
        this.channel = channel;
    }
}
