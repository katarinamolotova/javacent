package org.centrifugo.models.requests.user_block;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * BlockUserRequest
 */
public class BlockUserRequest implements RequestModel {

    @JsonProperty("expire_at")
    private Integer expireAt;

    /**
     * 
     */
    @JsonProperty("user")
    private String user;

    public BlockUserRequest(Integer expireAt, String user) {
        this.expireAt = expireAt;
        this.user = user;
    }

    public BlockUserRequest() {
    }

    public static BlockUserRequestBuilder builder() {
        return new BlockUserRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlockUserRequest blockUserRequest = (BlockUserRequest) o;
        return Objects.equals(this.expireAt, blockUserRequest.expireAt) &&
               Objects.equals(this.user, blockUserRequest.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expireAt, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlockUserRequest {\n");

        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("}");
        return sb.toString();
    }

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

    @JsonProperty("expire_at")
    public void setExpireAt(Integer expireAt) {
        this.expireAt = expireAt;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public static class BlockUserRequestBuilder {
        private Integer expireAt;
        private String user;

        BlockUserRequestBuilder() {
        }

        @JsonProperty("expire_at")
        public BlockUserRequestBuilder expireAt(Integer expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        @JsonProperty("user")
        public BlockUserRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public BlockUserRequest build() {
            return new BlockUserRequest(this.expireAt, this.user);
        }

        public String toString() {
            return "BlockUserRequest.BlockUserRequestBuilder(expireAt=" + this.expireAt + ", user=" + this.user + ")";
        }
    }
}
