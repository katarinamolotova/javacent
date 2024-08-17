package org.opensolutionlab.httpclients.models.requests.token;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Invalidate User Tokens Request
 */
public class InvalidateUserTokensRequest implements RequestModel {

    /**
     * Unix time in the future when revocation information should expire (Unix seconds)
     */
    @JsonProperty("expire_at")
    private Integer expireAt;

    /**
     * <b>Required.</b> User ID to invalidate tokens for
     */
    @JsonProperty("user")
    private String user;

    /**
     * All tokens issued at before this Unix time will be considered revoked (in case of JWT this requires iat to be properly set in JWT), 
     * if not provided server uses current time
     */
    @JsonProperty("issued_before")
    private Integer issuedBefore;

    /**
     * The channel name
     */
    @JsonProperty("channel")
    private String channel;

    public InvalidateUserTokensRequest(Integer expireAt, String user, Integer issuedBefore, String channel) {
        this.expireAt = expireAt;
        this.user = user;
        this.issuedBefore = issuedBefore;
        this.channel = channel;
    }

    public InvalidateUserTokensRequest() {
    }

    public static InvalidateUserTokensRequestBuilder builder() {
        return new InvalidateUserTokensRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvalidateUserTokensRequest invalidateUserTokensRequest = (InvalidateUserTokensRequest) o;
        return Objects.equals(this.expireAt, invalidateUserTokensRequest.expireAt) &&
               Objects.equals(this.user, invalidateUserTokensRequest.user) &&
               Objects.equals(this.issuedBefore, invalidateUserTokensRequest.issuedBefore) &&
               Objects.equals(this.channel, invalidateUserTokensRequest.channel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expireAt, user, issuedBefore, channel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvalidateUserTokensRequest {\n");

        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    issuedBefore: ").append(toIndentedString(issuedBefore)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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


    public Integer getExpireAt() {
        return this.expireAt;
    }

    public String getUser() {
        return this.user;
    }

    public Integer getIssuedBefore() {
        return this.issuedBefore;
    }

    public String getChannel() {
        return this.channel;
    }

    @JsonProperty("expire_at")
    public void setExpireAt(Integer expireAt) {
        this.expireAt = expireAt;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("issued_before")
    public void setIssuedBefore(Integer issuedBefore) {
        this.issuedBefore = issuedBefore;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public static class InvalidateUserTokensRequestBuilder {
        private Integer expireAt;
        private String user;
        private Integer issuedBefore;
        private String channel;

        InvalidateUserTokensRequestBuilder() {
        }

        @JsonProperty("expire_at")
        public InvalidateUserTokensRequestBuilder expireAt(Integer expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        @JsonProperty("user")
        public InvalidateUserTokensRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        @JsonProperty("issued_before")
        public InvalidateUserTokensRequestBuilder issuedBefore(Integer issuedBefore) {
            this.issuedBefore = issuedBefore;
            return this;
        }

        @JsonProperty("channel")
        public InvalidateUserTokensRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public InvalidateUserTokensRequest build() {
            return new InvalidateUserTokensRequest(this.expireAt, this.user, this.issuedBefore, this.channel);
        }

        public String toString() {
            return "InvalidateUserTokensRequest.InvalidateUserTokensRequestBuilder(expireAt=" +
                   this.expireAt +
                   ", user=" +
                   this.user +
                   ", issuedBefore=" +
                   this.issuedBefore +
                   ", channel=" +
                   this.channel +
                   ")";
        }
    }
}
