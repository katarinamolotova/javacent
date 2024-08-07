package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeviceTopicUpdateRequest
 */
public class DeviceTopicUpdateRequest implements RequestModel {

    @JsonProperty("device_id")
    private String deviceId = null;

    @JsonProperty("op")
    private String op = null;

    @JsonProperty("topics")
    private List<String> topics = null;

    public DeviceTopicUpdateRequest(String deviceId, String op, List<String> topics) {
        this.deviceId = deviceId;
        this.op = op;
        this.topics = topics;
    }

    public DeviceTopicUpdateRequest() {
    }

    public static DeviceTopicUpdateRequestBuilder builder() {
        return new DeviceTopicUpdateRequestBuilder();
    }

    public DeviceTopicUpdateRequest addTopicsItem(String topicsItem) {

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
        DeviceTopicUpdateRequest deviceTopicUpdateRequest = (DeviceTopicUpdateRequest) o;
        return Objects.equals(this.deviceId, deviceTopicUpdateRequest.deviceId) &&
               Objects.equals(this.op, deviceTopicUpdateRequest.op) &&
               Objects.equals(this.topics, deviceTopicUpdateRequest.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, op, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceTopicUpdateRequest {\n");

        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getOp() {
        return this.op;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    @JsonProperty("device_id")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("op")
    public void setOp(String op) {
        this.op = op;
    }

    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public static class DeviceTopicUpdateRequestBuilder {
        private String deviceId;
        private String op;
        private List<String> topics;

        DeviceTopicUpdateRequestBuilder() {
        }

        @JsonProperty("device_id")
        public DeviceTopicUpdateRequestBuilder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @JsonProperty("op")
        public DeviceTopicUpdateRequestBuilder op(String op) {
            this.op = op;
            return this;
        }

        @JsonProperty("topics")
        public DeviceTopicUpdateRequestBuilder topics(List<String> topics) {
            this.topics = topics;
            return this;
        }

        public DeviceTopicUpdateRequest build() {
            return new DeviceTopicUpdateRequest(this.deviceId, this.op, this.topics);
        }

        public String toString() {
            return "DeviceTopicUpdateRequest.DeviceTopicUpdateRequestBuilder(deviceId=" +
                   this.deviceId +
                   ", op=" +
                   this.op +
                   ", topics=" +
                   this.topics +
                   ")";
        }
    }
}
