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

package org.opensolutionlab.httpclients.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Refresh Request
 */
public class RefreshRequest implements RequestModel {

    /**
     * <b>Required.</b> User ID to refresh
     */
    @JsonProperty("user")
    private String user;

    /**
     * Client ID to refresh
     */
    @JsonProperty("client")
    private String client;

    /**
     * Mark connection as expired and close with Disconnect Expired reason
     */
    @JsonProperty("expired")
    private Boolean expired;

    /**
     * Unix time (in seconds) in the future when the connection will expire
     */
    @JsonProperty("expire_at")
    private Integer expireAt;

    /**
     * Custom data to refresh
     */
    @JsonProperty("info")
    private Object info;

    /**
     * Specific client session to refresh
     */
    @JsonProperty("session")
    private String session;

    public RefreshRequest(String user, String client, Boolean expired, Integer expireAt, Object info, String session) {
        this.user = user;
        this.client = client;
        this.expired = expired;
        this.expireAt = expireAt;
        this.info = info;
        this.session = session;
    }

    public RefreshRequest() {
    }

    public static RefreshRequestBuilder builder() {
        return new RefreshRequestBuilder();
    }

    public RefreshRequest user(String user) {
        this.user = user;
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
        RefreshRequest refreshRequest = (RefreshRequest) o;
        return Objects.equals(this.user, refreshRequest.user) &&
               Objects.equals(this.client, refreshRequest.client) &&
               Objects.equals(this.expired, refreshRequest.expired) &&
               Objects.equals(this.expireAt, refreshRequest.expireAt) &&
               Objects.equals(this.info, refreshRequest.info) &&
               Objects.equals(this.session, refreshRequest.session);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, client, expired, expireAt, info, session);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefreshRequest {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

    public String getUser() {
        return this.user;
    }

    public String getClient() {
        return this.client;
    }

    public Boolean getExpired() {
        return this.expired;
    }

    public Integer getExpireAt() {
        return this.expireAt;
    }

    public Object getInfo() {
        return this.info;
    }

    public String getSession() {
        return this.session;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("client")
    public void setClient(String client) {
        this.client = client;
    }

    @JsonProperty("expired")
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    @JsonProperty("expire_at")
    public void setExpireAt(Integer expireAt) {
        this.expireAt = expireAt;
    }

    @JsonProperty("info")
    public void setInfo(Object info) {
        this.info = info;
    }

    @JsonProperty("session")
    public void setSession(String session) {
        this.session = session;
    }

    public static class RefreshRequestBuilder {
        private String user;
        private String client;
        private Boolean expired;
        private Integer expireAt;
        private Object info;
        private String session;

        RefreshRequestBuilder() {
        }

        @JsonProperty("user")
        public RefreshRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        @JsonProperty("client")
        public RefreshRequestBuilder client(String client) {
            this.client = client;
            return this;
        }

        @JsonProperty("expired")
        public RefreshRequestBuilder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        @JsonProperty("expire_at")
        public RefreshRequestBuilder expireAt(Integer expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        @JsonProperty("info")
        public RefreshRequestBuilder info(Object info) {
            this.info = info;
            return this;
        }

        @JsonProperty("session")
        public RefreshRequestBuilder session(String session) {
            this.session = session;
            return this;
        }

        public RefreshRequest build() {
            return new RefreshRequest(this.user, this.client, this.expired, this.expireAt, this.info, this.session);
        }

        public String toString() {
            return "RefreshRequest.RefreshRequestBuilder(user=" +
                   this.user +
                   ", client=" +
                   this.client +
                   ", expired=" +
                   this.expired +
                   ", expireAt=" +
                   this.expireAt +
                   ", info=" +
                   this.info +
                   ", session=" +
                   this.session +
                   ")";
        }
    }
}
