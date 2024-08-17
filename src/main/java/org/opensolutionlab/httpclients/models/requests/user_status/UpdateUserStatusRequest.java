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

package org.opensolutionlab.httpclients.models.requests.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Update User Status Request
 */
public class UpdateUserStatusRequest implements RequestModel {

    /**
     * <b>Required.</b> List of users to update status for
     */
    @JsonProperty("users")
    private List<String> users;

    /**
     * New state value
     */
    @JsonProperty("state")
    private String state;

    public UpdateUserStatusRequest(List<String> users, String state) {
        this.users = users;
        this.state = state;
    }

    public UpdateUserStatusRequest() {
    }

    public static UpdateUserStatusRequestBuilder builder() {
        return new UpdateUserStatusRequestBuilder();
    }

    public UpdateUserStatusRequest addUsersItem(String usersItem) {

        if (this.users == null) {
            this.users = new ArrayList<String>();
        }

        this.users.add(usersItem);
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
        UpdateUserStatusRequest updateUserStatusRequest = (UpdateUserStatusRequest) o;
        return Objects.equals(this.users, updateUserStatusRequest.users) &&
               Objects.equals(this.state, updateUserStatusRequest.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserStatusRequest {\n");

        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public List<String> getUsers() {
        return this.users;
    }

    public String getState() {
        return this.state;
    }

    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public static class UpdateUserStatusRequestBuilder {
        private List<String> users;
        private String state;

        UpdateUserStatusRequestBuilder() {
        }

        @JsonProperty("users")
        public UpdateUserStatusRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        @JsonProperty("state")
        public UpdateUserStatusRequestBuilder state(String state) {
            this.state = state;
            return this;
        }

        public UpdateUserStatusRequest build() {
            return new UpdateUserStatusRequest(this.users, this.state);
        }

        public String toString() {
            return "UpdateUserStatusRequest.UpdateUserStatusRequestBuilder(users=" +
                   this.users +
                   ", state=" +
                   this.state +
                   ")";
        }
    }
}
