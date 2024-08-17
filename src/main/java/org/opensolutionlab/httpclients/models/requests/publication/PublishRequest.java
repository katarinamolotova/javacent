
package org.opensolutionlab.httpclients.models.requests.publication;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Publish Request
 */
public class PublishRequest<T> implements RequestModel {

    /**
     * <b>Required.</b> Name of channel to publish
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * <b>Required.</b> Custom JSON data to publish into a channel
     */
    @JsonProperty("data")
    private T data;

    /**
     * Custom binary data to publish into a channel encoded to base64 so it's possible to use HTTP API to send binary to clients.
     */
    @JsonProperty("b64data")
    private String b64data;

    /**
     * Skip adding publication to history for this request
     */
    @JsonProperty("skip_history")
    private Boolean skipHistory;

    /**
     * Publication tags - map with arbitrary string keys and values which is attached to publication and will be delivered to clients
     */
    @JsonProperty("tags")
    private Map<String, String> tags;

    /**
     * Optional idempotency key to drop duplicate publications upon retries. It acts per channel. <br>
     * Available since Centrifugo v5.2.0, supported only by Memory and Redis engines
     */
    @JsonProperty("idempotency_key")
    private String idempotencyKey;

    /**
     * When set to true tells Centrifugo to construct delta update if possible when broadcasting message to subscribers. <br>
     * Available since Centrifugo v5.4.0
     */
    @JsonProperty("delta")
    private Boolean delta;

    public PublishRequest(
            String channel,
            T data,
            String b64data,
            Boolean skipHistory,
            Map<String, String> tags,
            String idempotencyKey,
            Boolean delta
    ) {
        this.channel = channel;
        this.data = data;
        this.b64data = b64data;
        this.skipHistory = skipHistory;
        this.tags = tags;
        this.idempotencyKey = idempotencyKey;
        this.delta = delta;
    }

    public PublishRequest() {
    }

    public static <T> PublishRequestBuilder<T> builder() {
        return new PublishRequestBuilder<T>();
    }


    public PublishRequest<T> putTagsItem(String key, String tagsItem) {

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
        PublishRequest<T> publishRequest = (PublishRequest<T>) o;
        return Objects.equals(this.channel, publishRequest.channel) &&
               Objects.equals(this.data, publishRequest.data) &&
               Objects.equals(this.b64data, publishRequest.b64data) &&
               Objects.equals(this.skipHistory, publishRequest.skipHistory) &&
               Objects.equals(this.tags, publishRequest.tags) &&
               Objects.equals(this.idempotencyKey, publishRequest.idempotencyKey) &&
               Objects.equals(this.delta, publishRequest.delta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, data, b64data, skipHistory, tags, idempotencyKey, delta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishRequest {\n");

        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

    public String getChannel() {
        return this.channel;
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

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
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

    public static class PublishRequestBuilder<T> {
        private String channel;
        private T data;
        private String b64data;
        private Boolean skipHistory;
        private Map<String, String> tags;
        private String idempotencyKey;
        private Boolean delta;

        PublishRequestBuilder() {
        }

        @JsonProperty("channel")
        public PublishRequestBuilder<T> channel(String channel) {
            this.channel = channel;
            return this;
        }

        @JsonProperty("data")
        public PublishRequestBuilder<T> data(T data) {
            this.data = data;
            return this;
        }

        @JsonProperty("b64data")
        public PublishRequestBuilder<T> b64data(String b64data) {
            this.b64data = b64data;
            return this;
        }

        @JsonProperty("skip_history")
        public PublishRequestBuilder<T> skipHistory(Boolean skipHistory) {
            this.skipHistory = skipHistory;
            return this;
        }

        @JsonProperty("tags")
        public PublishRequestBuilder<T> tags(Map<String, String> tags) {
            this.tags = tags;
            return this;
        }

        @JsonProperty("idempotency_key")
        public PublishRequestBuilder<T> idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        @JsonProperty("delta")
        public PublishRequestBuilder<T> delta(Boolean delta) {
            this.delta = delta;
            return this;
        }

        public PublishRequest<T> build() {
            return new PublishRequest<T>(
                    this.channel,
                    this.data,
                    this.b64data,
                    this.skipHistory,
                    this.tags,
                    this.idempotencyKey,
                    this.delta
            );
        }

        public String toString() {
            return "PublishRequest.PublishRequestBuilder(channel=" +
                   this.channel +
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
