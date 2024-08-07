package org.centrifugo.models.requests.history;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * HistoryRemoveRequest
 */
public class HistoryRemoveRequest implements RequestModel {

    @JsonProperty("channel")
    private String channel = null;

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
