package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Update Push Status Request
 */
public class UpdatePushStatusRequest implements RequestModel {

    /**
     * <b>Required.</b> analytics_uid from send_push_notification
     */
    @JsonProperty("analytics_uid")
    private String analyticsUid;

    /**
     * <b>Required.</b> Status of push notification - delivered or interacted
     */
    @JsonProperty("status")
    private String status;

    /**
     * <b>Required.</b> Device ID
     */
    @JsonProperty("device_id")
    private String deviceId;

    /**
     * Optional Message ID of push notification issued by used provider
     */
    @JsonProperty("msg_id")
    private String msgId;

    public UpdatePushStatusRequest(String analyticsUid, String status, String deviceId, String msgId) {
        this.analyticsUid = analyticsUid;
        this.status = status;
        this.deviceId = deviceId;
        this.msgId = msgId;
    }

    public UpdatePushStatusRequest() {
    }

    public static UpdatePushStatusRequestBuilder builder() {
        return new UpdatePushStatusRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePushStatusRequest updatePushStatusRequest = (UpdatePushStatusRequest) o;
        return Objects.equals(this.analyticsUid, updatePushStatusRequest.analyticsUid) &&
               Objects.equals(this.status, updatePushStatusRequest.status) &&
               Objects.equals(this.deviceId, updatePushStatusRequest.deviceId) &&
               Objects.equals(this.msgId, updatePushStatusRequest.msgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analyticsUid, status, deviceId, msgId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePushStatusRequest {\n");

        sb.append("    analyticsUid: ").append(toIndentedString(analyticsUid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getAnalyticsUid() {
        return this.analyticsUid;
    }

    public String getStatus() {
        return this.status;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getMsgId() {
        return this.msgId;
    }

    @JsonProperty("analytics_uid")
    public void setAnalyticsUid(String analyticsUid) {
        this.analyticsUid = analyticsUid;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("device_id")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("msg_id")
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public static class UpdatePushStatusRequestBuilder {
        private String analyticsUid;
        private String status;
        private String deviceId;
        private String msgId;

        UpdatePushStatusRequestBuilder() {
        }

        @JsonProperty("analytics_uid")
        public UpdatePushStatusRequestBuilder analyticsUid(String analyticsUid) {
            this.analyticsUid = analyticsUid;
            return this;
        }

        @JsonProperty("status")
        public UpdatePushStatusRequestBuilder status(String status) {
            this.status = status;
            return this;
        }

        @JsonProperty("device_id")
        public UpdatePushStatusRequestBuilder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @JsonProperty("msg_id")
        public UpdatePushStatusRequestBuilder msgId(String msgId) {
            this.msgId = msgId;
            return this;
        }

        public UpdatePushStatusRequest build() {
            return new UpdatePushStatusRequest(this.analyticsUid, this.status, this.deviceId, this.msgId);
        }

        public String toString() {
            return "UpdatePushStatusRequest.UpdatePushStatusRequestBuilder(analyticsUid=" +
                   this.analyticsUid +
                   ", status=" +
                   this.status +
                   ", deviceId=" +
                   this.deviceId +
                   ", msgId=" +
                   this.msgId +
                   ")";
        }
    }
}
