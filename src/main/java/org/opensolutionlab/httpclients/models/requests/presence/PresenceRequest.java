package org.opensolutionlab.httpclients.models.requests.presence;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Presence Request
 */
public class PresenceRequest implements RequestModel {

    /**
     * <b>Required.</b> Name of channel to call presence from
     */
    @JsonProperty("channel")
    private String channel;

    public PresenceRequest(String channel) {
        this.channel = channel;
    }

    public PresenceRequest() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresenceRequest presenceRequest = (PresenceRequest) o;
        return Objects.equals(this.channel, presenceRequest.channel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresenceRequest {\n");

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