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

package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Device Remove Request
 */
public class DeviceRemoveRequest implements RequestModel {

    /**
     * A list of device IDs to be removed
     */
    @JsonProperty("ids")
    private List<String> ids;

    /**
     * A list of device user IDs to filter devices to remove
     */
    @JsonProperty("users")
    private List<String> users;

    public DeviceRemoveRequest(List<String> ids, List<String> users) {
        this.ids = ids;
        this.users = users;
    }

    public DeviceRemoveRequest() {
    }

    public static DeviceRemoveRequestBuilder builder() {
        return new DeviceRemoveRequestBuilder();
    }

    public DeviceRemoveRequest addIdsItem(String idsItem) {

        if (this.ids == null) {
            this.ids = new ArrayList<String>();
        }

        this.ids.add(idsItem);
        return this;
    }

    public DeviceRemoveRequest addUsersItem(String usersItem) {

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
        DeviceRemoveRequest deviceRemoveRequest = (DeviceRemoveRequest) o;
        return Objects.equals(this.ids, deviceRemoveRequest.ids) &&
               Objects.equals(this.users, deviceRemoveRequest.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceRemoveRequest {\n");

        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public List<String> getIds() {
        return this.ids;
    }

    public List<String> getUsers() {
        return this.users;
    }

    @JsonProperty("ids")
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    public static class DeviceRemoveRequestBuilder {
        private List<String> ids;
        private List<String> users;

        DeviceRemoveRequestBuilder() {
        }

        @JsonProperty("ids")
        public DeviceRemoveRequestBuilder ids(List<String> ids) {
            this.ids = ids;
            return this;
        }

        @JsonProperty("users")
        public DeviceRemoveRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public DeviceRemoveRequest build() {
            return new DeviceRemoveRequest(this.ids, this.users);
        }

        public String toString() {
            return "DeviceRemoveRequest.DeviceRemoveRequestBuilder(ids=" + this.ids + ", users=" + this.users + ")";
        }
    }
}
