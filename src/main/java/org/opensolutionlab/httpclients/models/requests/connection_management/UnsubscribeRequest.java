package org.opensolutionlab.httpclients.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Unsubscribe Request
 */
public class UnsubscribeRequest implements RequestModel {

    /**
     * <b>Required.</b> User ID to unsubscribe
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * <b>Required.</b> Name of channel to unsubscribe user to
     */
    @JsonProperty("user")
    private String user;

    /**
     * Specific client ID to unsubscribe (user still required to be set)
     */
    @JsonProperty("client")
    private String client;

    /**
     * Specific client session to disconnect (user still required to be set).
     */
    @JsonProperty("session")
    private String session;

    public UnsubscribeRequest(String channel, String user, String client, String session) {
        this.channel = channel;
        this.user = user;
        this.client = client;
        this.session = session;
    }

    public UnsubscribeRequest() {
    }

    public static UnsubscribeRequestBuilder builder() {
        return new UnsubscribeRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnsubscribeRequest unsubscribeRequest = (UnsubscribeRequest) o;
        return Objects.equals(this.channel, unsubscribeRequest.channel) &&
               Objects.equals(this.user, unsubscribeRequest.user) &&
               Objects.equals(this.client, unsubscribeRequest.client) &&
               Objects.equals(this.session, unsubscribeRequest.session);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, user, client, session);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnsubscribeRequest {\n");

        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
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

    public String getClient() {
        return this.client;
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

    @JsonProperty("client")
    public void setClient(String client) {
        this.client = client;
    }

    @JsonProperty("session")
    public void setSession(String session) {
        this.session = session;
    }

    public static class UnsubscribeRequestBuilder {
        private String channel;
        private String user;
        private String client;
        private String session;

        UnsubscribeRequestBuilder() {
        }

        @JsonProperty("channel")
        public UnsubscribeRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        @JsonProperty("user")
        public UnsubscribeRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        @JsonProperty("client")
        public UnsubscribeRequestBuilder client(String client) {
            this.client = client;
            return this;
        }

        @JsonProperty("session")
        public UnsubscribeRequestBuilder session(String session) {
            this.session = session;
            return this;
        }

        public UnsubscribeRequest build() {
            return new UnsubscribeRequest(this.channel, this.user, this.client, this.session);
        }

        public String toString() {
            return "UnsubscribeRequest.UnsubscribeRequestBuilder(channel=" +
                   this.channel +
                   ", user=" +
                   this.user +
                   ", client=" +
                   this.client +
                   ", session=" +
                   this.session +
                   ")";
        }
    }
}
