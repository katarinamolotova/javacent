package org.centrifugo.models.requests.presence;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * PresenceStatsRequest
 */
public class PresenceStatsRequest implements RequestModel {

    @JsonProperty("channel")
    private String channel = null;

    public PresenceStatsRequest(String channel) {
        this.channel = channel;
    }

    public PresenceStatsRequest() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresenceStatsRequest presenceStatsRequest = (PresenceStatsRequest) o;
        return Objects.equals(this.channel, presenceStatsRequest.channel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresenceStatsRequest {\n");

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
