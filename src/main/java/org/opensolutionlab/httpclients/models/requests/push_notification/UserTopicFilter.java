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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * User Topic Filter
 */
public class UserTopicFilter {

    /**
     * List of users to filter results
     */
    @JsonProperty("users")
    private List<String> users;

    /**
     * List of topics to filter results
     */
    @JsonProperty("topics")
    private List<String> topics;

    /**
     * Channel prefix to filter results
     */
    @JsonProperty("topic_prefix")
    private String topicPrefix;

    public UserTopicFilter(List<String> users, List<String> topics, String topicPrefix) {
        this.users = users;
        this.topics = topics;
        this.topicPrefix = topicPrefix;
    }

    public UserTopicFilter() {
    }

    public static UserTopicFilterBuilder builder() {
        return new UserTopicFilterBuilder();
    }

    public UserTopicFilter addUsersItem(String usersItem) {

        if (this.users == null) {
            this.users = new ArrayList<String>();
        }

        this.users.add(usersItem);
        return this;
    }

    public UserTopicFilter addTopicsItem(String topicsItem) {

        if (this.topics == null) {
            this.topics = new ArrayList<String>();
        }

        this.topics.add(topicsItem);
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
        UserTopicFilter userTopicFilter = (UserTopicFilter) o;
        return Objects.equals(this.users, userTopicFilter.users) &&
               Objects.equals(this.topics, userTopicFilter.topics) &&
               Objects.equals(this.topicPrefix, userTopicFilter.topicPrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, topics, topicPrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserTopicFilter {\n");

        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    topicPrefix: ").append(toIndentedString(topicPrefix)).append("\n");
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

    public List<String> getTopics() {
        return this.topics;
    }

    public String getTopicPrefix() {
        return this.topicPrefix;
    }

    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @JsonProperty("topic_prefix")
    public void setTopicPrefix(String topicPrefix) {
        this.topicPrefix = topicPrefix;
    }

    public static class UserTopicFilterBuilder {
        private List<String> users;
        private List<String> topics;
        private String topicPrefix;

        UserTopicFilterBuilder() {
        }

        @JsonProperty("users")
        public UserTopicFilterBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        @JsonProperty("topics")
        public UserTopicFilterBuilder topics(List<String> topics) {
            this.topics = topics;
            return this;
        }

        @JsonProperty("topic_prefix")
        public UserTopicFilterBuilder topicPrefix(String topicPrefix) {
            this.topicPrefix = topicPrefix;
            return this;
        }

        public UserTopicFilter build() {
            return new UserTopicFilter(this.users, this.topics, this.topicPrefix);
        }

        public String toString() {
            return "UserTopicFilter.UserTopicFilterBuilder(users=" +
                   this.users +
                   ", topics=" +
                   this.topics +
                   ", topicPrefix=" +
                   this.topicPrefix +
                   ")";
        }
    }
}
