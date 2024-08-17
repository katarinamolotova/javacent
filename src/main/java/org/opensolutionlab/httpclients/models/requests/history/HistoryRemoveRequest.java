package org.opensolutionlab.httpclients.models.requests.history;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * History Remove Request
 */
public class HistoryRemoveRequest implements RequestModel {

    /**
     * <b>Required.</b> Name of channel to remove history
     */
    @JsonProperty("channel")
    private String channel;

    public HistoryRemoveRequest(String channel) {
        this.channel = channel;
    }

    public HistoryRemoveRequest() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryRemoveRequest historyRemoveRequest = (HistoryRemoveRequest) o;
        return Objects.equals(this.channel, historyRemoveRequest.channel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryRemoveRequest {\n");

        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getChannel() {
        return this.channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }
}
