package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UserTopicUpdateRequest
 */
public class UserTopicUpdateRequest implements RequestModel {

    @JsonProperty("user")
    private String user;

    /**
     * 
     */
    @JsonProperty("op")
    private String op;

    /**
     * 
     */
    @JsonProperty("topics")
    private List<String> topics;

    public UserTopicUpdateRequest(String user, String op, List<String> topics) {
        this.user = user;
        this.op = op;
        this.topics = topics;
    }

    public UserTopicUpdateRequest() {
    }

    public static UserTopicUpdateRequestBuilder builder() {
        return new UserTopicUpdateRequestBuilder();
    }

    public UserTopicUpdateRequest addTopicsItem(String topicsItem) {

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
        UserTopicUpdateRequest userTopicUpdateRequest = (UserTopicUpdateRequest) o;
        return Objects.equals(this.user, userTopicUpdateRequest.user) &&
               Objects.equals(this.op, userTopicUpdateRequest.op) &&
               Objects.equals(this.topics, userTopicUpdateRequest.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, op, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserTopicUpdateRequest {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    op: ").append(toIndentedString(op)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

    public String getOp() {
        return this.op;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("op")
    public void setOp(String op) {
        this.op = op;
    }

    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public static class UserTopicUpdateRequestBuilder {
        private String user;
        private String op;
        private List<String> topics;

        UserTopicUpdateRequestBuilder() {
        }

        @JsonProperty("user")
        public UserTopicUpdateRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        @JsonProperty("op")
        public UserTopicUpdateRequestBuilder op(String op) {
            this.op = op;
            return this;
        }

        @JsonProperty("topics")
        public UserTopicUpdateRequestBuilder topics(List<String> topics) {
            this.topics = topics;
            return this;
        }

        public UserTopicUpdateRequest build() {
            return new UserTopicUpdateRequest(this.user, this.op, this.topics);
        }

        public String toString() {
            return "UserTopicUpdateRequest.UserTopicUpdateRequestBuilder(user=" +
                   this.user +
                   ", op=" +
                   this.op +
                   ", topics=" +
                   this.topics +
                   ")";
        }
    }
}
