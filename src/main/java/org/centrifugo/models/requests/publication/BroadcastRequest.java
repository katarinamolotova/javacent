package org.centrifugo.models.requests.publication;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * BroadcastRequest
 */
public class BroadcastRequest<T> extends DataRequestAbstract<T> {

    @JsonProperty("channels")
    private List<String> channels = null;

    @JsonProperty("data")
    private T data = null;

    @JsonProperty("b64data")
    private String b64data = null;

    @JsonProperty("skip_history")
    private Boolean skipHistory = null;

    @JsonProperty("tags")
    private Map<String, String> tags = null;

    @JsonProperty("idempotency_key")
    private String idempotencyKey = null;

    @JsonProperty("delta")
    private Boolean delta = null;

    public BroadcastRequest(
            List<String> channels,
            T data,
            String b64data,
            Boolean skipHistory,
            Map<String, String> tags,
            String idempotencyKey,
            Boolean delta
    ) {
        this.channels = channels;
        this.data = data;
        this.b64data = b64data;
        this.skipHistory = skipHistory;
        this.tags = tags;
        this.idempotencyKey = idempotencyKey;
        this.delta = delta;
    }

    public BroadcastRequest() {
    }

    public static <T> BroadcastRequestBuilder<T> builder() {
        return new BroadcastRequestBuilder<T>();
    }

    public BroadcastRequest<T> addChannelsItem(String channelsItem) {

        if (this.channels == null) {
            this.channels = new ArrayList<String>();
        }

        this.channels.add(channelsItem);
        return this;
    }

    public BroadcastRequest<T> putTagsItem(String key, String tagsItem) {

        if (this.tags == null) {
            this.tags = new HashMap<String, String>();
        }

        this.tags.put(key, tagsItem);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BroadcastRequest<T> broadcastRequest = (BroadcastRequest<T>) o;
        return Objects.equals(this.channels, broadcastRequest.channels) &&
               Objects.equals(this.data, broadcastRequest.data) &&
               Objects.equals(this.b64data, broadcastRequest.b64data) &&
               Objects.equals(this.skipHistory, broadcastRequest.skipHistory) &&
               Objects.equals(this.tags, broadcastRequest.tags) &&
               Objects.equals(this.idempotencyKey, broadcastRequest.idempotencyKey) &&
               Objects.equals(this.delta, broadcastRequest.delta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channels, data, b64data, skipHistory, tags, idempotencyKey, delta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BroadcastRequest {\n");

        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    b64data: ").append(toIndentedString(b64data)).append("\n");
        sb.append("    skipHistory: ").append(toIndentedString(skipHistory)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
        sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


    public List<String> getChannels() {
        return this.channels;
    }

    public T getData() {
        return this.data;
    }

    public String getB64data() {
        return this.b64data;
    }

    public Boolean getSkipHistory() {
        return this.skipHistory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public Boolean getDelta() {
        return this.delta;
    }

    @JsonProperty("channels")
    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    @JsonProperty("data")
    public void setData(T data) {
        this.data = data;
    }

    @JsonProperty("b64data")
    public void setB64data(String b64data) {
        this.b64data = b64data;
    }

    @JsonProperty("skip_history")
    public void setSkipHistory(Boolean skipHistory) {
        this.skipHistory = skipHistory;
    }

    @JsonProperty("tags")
    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    @JsonProperty("idempotency_key")
    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    @JsonProperty("delta")
    public void setDelta(Boolean delta) {
        this.delta = delta;
    }

    public static class BroadcastRequestBuilder<T> {
        private List<String> channels;
        private T data;
        private String b64data;
        private Boolean skipHistory;
        private Map<String, String> tags;
        private String idempotencyKey;
        private Boolean delta;

        BroadcastRequestBuilder() {
        }

        @JsonProperty("channels")
        public BroadcastRequestBuilder<T> channels(List<String> channels) {
            this.channels = channels;
            return this;
        }

        @JsonProperty("data")
        public BroadcastRequestBuilder<T> data(T data) {
            this.data = data;
            return this;
        }

        @JsonProperty("b64data")
        public BroadcastRequestBuilder<T> b64data(String b64data) {
            this.b64data = b64data;
            return this;
        }

        @JsonProperty("skip_history")
        public BroadcastRequestBuilder<T> skipHistory(Boolean skipHistory) {
            this.skipHistory = skipHistory;
            return this;
        }

        @JsonProperty("tags")
        public BroadcastRequestBuilder<T> tags(Map<String, String> tags) {
            this.tags = tags;
            return this;
        }

        @JsonProperty("idempotency_key")
        public BroadcastRequestBuilder<T> idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        @JsonProperty("delta")
        public BroadcastRequestBuilder<T> delta(Boolean delta) {
            this.delta = delta;
            return this;
        }

        public BroadcastRequest<T> build() {
            return new BroadcastRequest<T>(
                    this.channels,
                    this.data,
                    this.b64data,
                    this.skipHistory,
                    this.tags,
                    this.idempotencyKey,
                    this.delta
            );
        }

        public String toString() {
            return "BroadcastRequest.BroadcastRequestBuilder(channels=" +
                   this.channels +
                   ", data=" +
                   this.data +
                   ", b64data=" +
                   this.b64data +
                   ", skipHistory=" +
                   this.skipHistory +
                   ", tags=" +
                   this.tags +
                   ", idempotencyKey=" +
                   this.idempotencyKey +
                   ", delta=" +
                   this.delta +
                   ")";
        }
    }
}
