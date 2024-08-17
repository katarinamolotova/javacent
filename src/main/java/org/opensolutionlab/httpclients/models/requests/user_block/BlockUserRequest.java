/*
 * Copyright 2024 Molotova Katerina, Kukhtachev Mikhail.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensolutionlab.httpclients.models.requests.user_block;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Block User Request
 */
public class BlockUserRequest implements RequestModel {

    /**
     * Unix time in the future when user blocking information should expire (Unix seconds)
     */
    @JsonProperty("expire_at")
    private Integer expireAt;

    /**
     * <b>Required.</b> User ID to block
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
