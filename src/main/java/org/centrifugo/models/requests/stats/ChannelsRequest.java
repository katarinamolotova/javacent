package org.centrifugo.models.requests.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * ChannelsRequest
 */
public class ChannelsRequest implements RequestModel {

    @JsonProperty("pattern")
    private String pattern = null;

    public ChannelsRequest(String pattern) {
        this.pattern = pattern;
    }

    public ChannelsRequest() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelsRequest channelsRequest = (ChannelsRequest) o;
        return Objects.equals(this.pattern, channelsRequest.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelsRequest {\n");

        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getPattern() {
        return this.pattern;
    }

    @JsonProperty("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}



