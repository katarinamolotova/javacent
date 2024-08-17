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

package org.opensolutionlab.httpclients.models.requests.token;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Revoke Token Request
 */
public class RevokeTokenRequest implements RequestModel {

    /**
     * Unix time in the future when revocation information should expire (Unix seconds)
     */
    @JsonProperty("expire_at")
    private Integer expireAt;

    /**
     * <b>Required.</b> Token unique ID (JTI claim in case of JWT)
     */
    @JsonProperty("uid")
    private String uid;

    public RevokeTokenRequest(Integer expireAt, String uid) {
        this.expireAt = expireAt;
        this.uid = uid;
    }

    public RevokeTokenRequest() {
    }

    public static RevokeTokenRequestBuilder builder() {
        return new RevokeTokenRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RevokeTokenRequest revokeTokenRequest = (RevokeTokenRequest) o;
        return Objects.equals(this.expireAt, revokeTokenRequest.expireAt) &&
               Objects.equals(this.uid, revokeTokenRequest.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expireAt, uid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeTokenRequest {\n");

        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

    public String getUid() {
        return this.uid;
    }

    @JsonProperty("expire_at")
    public void setExpireAt(Integer expireAt) {
        this.expireAt = expireAt;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    public static class RevokeTokenRequestBuilder {
        private Integer expireAt;
        private String uid;

        RevokeTokenRequestBuilder() {
        }

        @JsonProperty("expire_at")
        public RevokeTokenRequestBuilder expireAt(Integer expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        @JsonProperty("uid")
        public RevokeTokenRequestBuilder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public RevokeTokenRequest build() {
            return new RevokeTokenRequest(this.expireAt, this.uid);
        }

        public String toString() {
            return "RevokeTokenRequest.RevokeTokenRequestBuilder(expireAt=" + this.expireAt + ", uid=" + this.uid + ")";
        }
    }
}
