package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Device Topics Update
 */
public class DeviceTopicsUpdate {

    /**
     * Operation to make: add, remove or set
     */
    @JsonProperty("op")
    private String op;

    /**
     * Topics for the operation
     */
    @JsonProperty("topics")
    private List<String> topics;

    public DeviceTopicsUpdate(String op, List<String> topics) {
        this.op = op;
        this.topics = topics;
    }

    public DeviceTopicsUpdate() {
    }

    public static DeviceTopicsUpdateBuilder builder() {
        return new DeviceTopicsUpdateBuilder();
    }

    public DeviceTopicsUpdate addTopicsItem(String topicsItem) {

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
        DeviceTopicsUpdate deviceTopicsUpdate = (DeviceTopicsUpdate) o;
        return Objects.equals(this.op, deviceTopicsUpdate.op) &&
               Objects.equals(this.topics, deviceTopicsUpdate.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(op, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceTopicsUpdate {\n");

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

    public String getOp() {
        return this.op;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    @JsonProperty("op")
    public void setOp(String op) {
        this.op = op;
    }

    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public static class DeviceTopicsUpdateBuilder {
        private String op;
        private List<String> topics;

        DeviceTopicsUpdateBuilder() {
        }

        @JsonProperty("op")
        public DeviceTopicsUpdateBuilder op(String op) {
            this.op = op;
            return this;
        }

        @JsonProperty("topics")
        public DeviceTopicsUpdateBuilder topics(List<String> topics) {
            this.topics = topics;
            return this;
        }

        public DeviceTopicsUpdate build() {
            return new DeviceTopicsUpdate(this.op, this.topics);
        }

        public String toString() {
            return "DeviceTopicsUpdate.DeviceTopicsUpdateBuilder(op=" + this.op + ", topics=" + this.topics + ")";
        }
    }
}
