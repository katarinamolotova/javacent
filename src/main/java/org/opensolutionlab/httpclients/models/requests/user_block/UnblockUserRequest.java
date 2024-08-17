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
 * Unblock User Request
 */
public class UnblockUserRequest implements RequestModel {

    /**
     * <b>Required.</b> User ID to unblock
     */
    @JsonProperty("user")
    private String user;

    public UnblockUserRequest(String user) {
        this.user = user;
    }

    public UnblockUserRequest() {
    }

    public UnblockUserRequest user(String user) {
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
        UnblockUserRequest unblockUserRequest = (UnblockUserRequest) o;
        return Objects.equals(this.user, unblockUserRequest.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnblockUserRequest {\n");

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

    public String getUser() {
        return this.user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }
}
