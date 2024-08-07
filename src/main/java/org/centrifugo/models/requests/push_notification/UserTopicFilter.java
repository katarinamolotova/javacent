package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UserTopicFilter
 */
public class UserTopicFilter {

    @JsonProperty("users")
    private List<String> users = null;

    @JsonProperty("topics")
    private List<String> topics = null;

    @JsonProperty("topic_prefix")
    private String topicPrefix = null;

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
