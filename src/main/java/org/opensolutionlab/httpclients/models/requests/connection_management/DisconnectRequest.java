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

import java.util.List;
import java.util.Objects;

/**
 * Disconnect Request
 */
public class DisconnectRequest implements RequestModel {

    /**
     * <b>Required.</b> User ID to disconnect
     */
    @JsonProperty("user")
    private String user;

    /**
     * Provide custom disconnect object
     */
    @JsonProperty("disconnect")
    private Disconnect disconnect;

    /**
     * Specific client ID to disconnect
     */
    @JsonProperty("client")
    private String client;

    /**
     * 	Array of client IDs to keep
     */
    @JsonProperty("whitelist")
    private List<String> whitelist;

    /**
     * Specific client session to disconnect
     */
    @JsonProperty("session")
    private String session;

    public DisconnectRequest(
            String user,
            Disconnect disconnect,
            String client,
            List<String> whitelist,
            String session
    ) {
        this.user = user;
        this.disconnect = disconnect;
        this.client = client;
        this.whitelist = whitelist;
        this.session = session;
    }

    public DisconnectRequest() {
    }

    public static DisconnectRequestBuilder builder() {
        return new DisconnectRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisconnectRequest disconnectRequest = (DisconnectRequest) o;
        return Objects.equals(this.user, disconnectRequest.user) &&
               Objects.equals(this.disconnect, disconnectRequest.disconnect) &&
               Objects.equals(this.client, disconnectRequest.client) &&
               Objects.equals(this.whitelist, disconnectRequest.whitelist) &&
               Objects.equals(this.session, disconnectRequest.session);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, disconnect, client, whitelist, session);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisconnectRequest {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    disconnect: ").append(toIndentedString(disconnect)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

    public Disconnect getDisconnect() {
        return this.disconnect;
    }

    public String getClient() {
        return this.client;
    }

    public List<String> getWhitelist() {
        return this.whitelist;
    }

    public String getSession() {
        return this.session;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("disconnect")
    public void setDisconnect(Disconnect disconnect) {
        this.disconnect = disconnect;
    }

    @JsonProperty("client")
    public void setClient(String client) {
        this.client = client;
    }

    @JsonProperty("whitelist")
    public void setWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
    }

    @JsonProperty("session")
    public void setSession(String session) {
        this.session = session;
    }

    public static class DisconnectRequestBuilder {
        private String user;
        private Disconnect disconnect;
        private String client;
        private List<String> whitelist;
        private String session;

        DisconnectRequestBuilder() {
        }

        @JsonProperty("user")
        public DisconnectRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        @JsonProperty("disconnect")
        public DisconnectRequestBuilder disconnect(Disconnect disconnect) {
            this.disconnect = disconnect;
            return this;
        }

        @JsonProperty("client")
        public DisconnectRequestBuilder client(String client) {
            this.client = client;
            return this;
        }

        @JsonProperty("whitelist")
        public DisconnectRequestBuilder whitelist(List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }

        @JsonProperty("session")
        public DisconnectRequestBuilder session(String session) {
            this.session = session;
            return this;
        }

        public DisconnectRequest build() {
            return new DisconnectRequest(this.user, this.disconnect, this.client, this.whitelist, this.session);
        }

        public String toString() {
            return "DisconnectRequest.DisconnectRequestBuilder(user=" +
                   this.user +
                   ", disconnect=" +
                   this.disconnect +
                   ", client=" +
                   this.client +
                   ", whitelist=" +
                   this.whitelist +
                   ", session=" +
                   this.session +
                   ")";
        }
    }
}
