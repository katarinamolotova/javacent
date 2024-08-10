package org.centrifugo.models.requests.history;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * History Request
 */
public class HistoryRequest implements RequestModel {

    /**
     * <b>Required.</b> Name of channel to call history from
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Limit number of returned publications,
     * if not set in request then only current stream position information will present in result
     * (without any publications)
     */
    @JsonProperty("limit")
    private Integer limit;

    /**
     * To return publications after this position
     */
    @JsonProperty("since")
    private StreamPosition since;

    /**
     * Iterate in reversed order (from latest to earliest)
     */
    @JsonProperty("reverse")
    private Boolean reverse;

    public HistoryRequest(String channel, Integer limit, StreamPosition since, Boolean reverse) {
        this.channel = channel;
        this.limit = limit;
        this.since = since;
        this.reverse = reverse;
    }

    public HistoryRequest() {
    }

    public static HistoryRequestBuilder builder() {
        return new HistoryRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryRequest historyRequest = (HistoryRequest) o;
        return Objects.equals(this.channel, historyRequest.channel) &&
               Objects.equals(this.limit, historyRequest.limit) &&
               Objects.equals(this.since, historyRequest.since) &&
               Objects.equals(this.reverse, historyRequest.reverse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, limit, since, reverse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryRequest {\n");

        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    since: ").append(toIndentedString(since)).append("\n");
        sb.append("    reverse: ").append(toIndentedString(reverse)).append("\n");
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

    public Integer getLimit() {
        return this.limit;
    }

    public StreamPosition getSince() {
        return this.since;
    }

    public Boolean getReverse() {
        return this.reverse;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("since")
    public void setSince(StreamPosition since) {
        this.since = since;
    }

    @JsonProperty("reverse")
    public void setReverse(Boolean reverse) {
        this.reverse = reverse;
    }

    public static class HistoryRequestBuilder {
        private String channel;
        private Integer limit;
        private StreamPosition since;
        private Boolean reverse;

        HistoryRequestBuilder() {
        }

        @JsonProperty("channel")
        public HistoryRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        @JsonProperty("limit")
        public HistoryRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        @JsonProperty("since")
        public HistoryRequestBuilder since(StreamPosition since) {
            this.since = since;
            return this;
        }

        @JsonProperty("reverse")
        public HistoryRequestBuilder reverse(Boolean reverse) {
            this.reverse = reverse;
            return this;
        }

        public HistoryRequest build() {
            return new HistoryRequest(this.channel, this.limit, this.since, this.reverse);
        }

        public String toString() {
            return "HistoryRequest.HistoryRequestBuilder(channel=" +
                   this.channel +
                   ", limit=" +
                   this.limit +
                   ", since=" +
                   this.since +
                   ", reverse=" +
                   this.reverse +
                   ")";
        }
    }
}
