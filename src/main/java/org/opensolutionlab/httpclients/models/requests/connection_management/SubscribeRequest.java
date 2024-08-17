package org.opensolutionlab.httpclients.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;
import org.opensolutionlab.httpclients.models.requests.history.StreamPosition;

import java.util.Objects;

/**
 * Subscribe Request
 */
public class SubscribeRequest implements RequestModel {

    /**
     * <b>Required.</b> Name of channel to subscribe user to
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * <b>Required.</b> User ID to subscribe
     */
    @JsonProperty("user")
    private String user;

    /**
     * Subscribe expiration time
     */
    @JsonProperty("expire_at")
    private Integer expireAt;

    /**
     * Attach custom data to subscription (will be used in presence and join/leave messages)
     */
    @JsonProperty("info")
    private Object info;

    /**
     * Same as data but in base64 format (will be decoded by Centrifugo)
     */
    @JsonProperty("b64info")
    private String b64info;

    /**
     * Specific client ID to subscribe (user still required to be set, will ignore other user connections with different client IDs)
     */
    @JsonProperty("client")
    private String client;

    /**
     * Custom subscription data (will be sent to client in Subscribe push)
     */
    @JsonProperty("data")
    private Object data;

    /**
     * Same as data but in base64 format (will be decoded by Centrifugo)
     */
    @JsonProperty("b64data")
    private String b64data;

    /**
     * Stream position to recover from
     */
    @JsonProperty("recover_since")
    private StreamPosition recoverSince;

    /**
     * Allows dynamically override some channel options defined in Centrifugo configuration
     */
    @JsonProperty("override")
    private SubscribeOptionOverride override;

    /**
     * 
     */
    @JsonProperty("session")
    private String session;

    public SubscribeRequest(
            String channel,
            String user,
            Integer expireAt,
            Object info,
            String b64info,
            String client,
            Object data,
            String b64data,
            StreamPosition recoverSince,
            SubscribeOptionOverride override,
            String session
    ) {
        this.channel = channel;
        this.user = user;
        this.expireAt = expireAt;
        this.info = info;
        this.b64info = b64info;
        this.client = client;
        this.data = data;
        this.b64data = b64data;
        this.recoverSince = recoverSince;
        this.override = override;
        this.session = session;
    }

    public SubscribeRequest() {
    }

    public static SubscribeRequestBuilder builder() {
        return new SubscribeRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscribeRequest subscribeRequest = (SubscribeRequest) o;
        return Objects.equals(this.channel, subscribeRequest.channel) &&
               Objects.equals(this.user, subscribeRequest.user) &&
               Objects.equals(this.expireAt, subscribeRequest.expireAt) &&
               Objects.equals(this.info, subscribeRequest.info) &&
               Objects.equals(this.b64info, subscribeRequest.b64info) &&
               Objects.equals(this.client, subscribeRequest.client) &&
               Objects.equals(this.data, subscribeRequest.data) &&
               Objects.equals(this.b64data, subscribeRequest.b64data) &&
               Objects.equals(this.recoverSince, subscribeRequest.recoverSince) &&
               Objects.equals(this.override, subscribeRequest.override) &&
               Objects.equals(this.session, subscribeRequest.session);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                channel,
                user,
                expireAt,
                info,
                b64info,
                client,
                data,
                b64data,
                recoverSince,
                override,
                session
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeRequest {\n");

        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    b64info: ").append(toIndentedString(b64info)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    b64data: ").append(toIndentedString(b64data)).append("\n");
        sb.append("    recoverSince: ").append(toIndentedString(recoverSince)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

    public String getUser() {
        return this.user;
    }

    public Integer getExpireAt() {
        return this.expireAt;
    }

    public Object getInfo() {
        return this.info;
    }

    public String getB64info() {
        return this.b64info;
    }

    public String getClient() {
        return this.client;
    }

    public Object getData() {
        return this.data;
    }

    public String getB64data() {
        return this.b64data;
    }

    public StreamPosition getRecoverSince() {
        return this.recoverSince;
    }

    public SubscribeOptionOverride getOverride() {
        return this.override;
    }

    public String getSession() {
        return this.session;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("expire_at")
    public void setExpireAt(Integer expireAt) {
        this.expireAt = expireAt;
    }

    @JsonProperty("info")
    public void setInfo(Object info) {
        this.info = info;
    }

    @JsonProperty("b64info")
    public void setB64info(String b64info) {
        this.b64info = b64info;
    }

    @JsonProperty("client")
    public void setClient(String client) {
        this.client = client;
    }

    @JsonProperty("data")
    public void setData(Object data) {
        this.data = data;
    }

    @JsonProperty("b64data")
    public void setB64data(String b64data) {
        this.b64data = b64data;
    }

    @JsonProperty("recover_since")
    public void setRecoverSince(StreamPosition recoverSince) {
        this.recoverSince = recoverSince;
    }

    @JsonProperty("override")
    public void setOverride(SubscribeOptionOverride override) {
        this.override = override;
    }

    @JsonProperty("session")
    public void setSession(String session) {
        this.session = session;
    }

    public static class SubscribeRequestBuilder {
        private String channel;
        private String user;
        private Integer expireAt;
        private Object info;
        private String b64info;
        private String client;
        private Object data;
        private String b64data;
        private StreamPosition recoverSince;
        private SubscribeOptionOverride override;
        private String session;

        SubscribeRequestBuilder() {
        }

        @JsonProperty("channel")
        public SubscribeRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        @JsonProperty("user")
        public SubscribeRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        @JsonProperty("expire_at")
        public SubscribeRequestBuilder expireAt(Integer expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        @JsonProperty("info")
        public SubscribeRequestBuilder info(Object info) {
            this.info = info;
            return this;
        }

        @JsonProperty("b64info")
        public SubscribeRequestBuilder b64info(String b64info) {
            this.b64info = b64info;
            return this;
        }

        @JsonProperty("client")
        public SubscribeRequestBuilder client(String client) {
            this.client = client;
            return this;
        }

        @JsonProperty("data")
        public SubscribeRequestBuilder data(Object data) {
            this.data = data;
            return this;
        }

        @JsonProperty("b64data")
        public SubscribeRequestBuilder b64data(String b64data) {
            this.b64data = b64data;
            return this;
        }

        @JsonProperty("recover_since")
        public SubscribeRequestBuilder recoverSince(StreamPosition recoverSince) {
            this.recoverSince = recoverSince;
            return this;
        }

        @JsonProperty("override")
        public SubscribeRequestBuilder override(SubscribeOptionOverride override) {
            this.override = override;
            return this;
        }

        @JsonProperty("session")
        public SubscribeRequestBuilder session(String session) {
            this.session = session;
            return this;
        }

        public SubscribeRequest build() {
            return new SubscribeRequest(
                    this.channel,
                    this.user,
                    this.expireAt,
                    this.info,
                    this.b64info,
                    this.client,
                    this.data,
                    this.b64data,
                    this.recoverSince,
                    this.override,
                    this.session
            );
        }

        public String toString() {
            return "SubscribeRequest.SubscribeRequestBuilder(channel=" +
                   this.channel +
                   ", user=" +
                   this.user +
                   ", expireAt=" +
                   this.expireAt +
                   ", info=" +
                   this.info +
                   ", b64info=" +
                   this.b64info +
                   ", client=" +
                   this.client +
                   ", data=" +
                   this.data +
                   ", b64data=" +
                   this.b64data +
                   ", recoverSince=" +
                   this.recoverSince +
                   ", override=" +
                   this.override +
                   ", session=" +
                   this.session +
                   ")";
        }
    }
}
