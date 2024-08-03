package org.centrifugo.models.broadcast;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.centrifugo.models.DataModelAbstract;

import javax.annotation.Nonnull;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class BroadcastDataModel<T> extends DataModelAbstract<T> {
    private List<String> channels;

    public BroadcastDataModel(
            @Nonnull final T data,
            @Nonnull final List<String> channels
    ) {
        super(data);
        this.channels = channels;
    }
}
