package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * UpdatePushStatusRequest
 */
public class UpdatePushStatusRequest implements RequestModel {

  
  @JsonProperty("analytics_uid")
  private String analyticsUid = null;
  
  
  @JsonProperty("status")
  private String status = null;
  
  
  @JsonProperty("device_id")
  private String deviceId = null;
  
  
  @JsonProperty("msg_id")
  private String msgId = null;
  
  public UpdatePushStatusRequest analyticsUid(String analyticsUid) {
    this.analyticsUid = analyticsUid;
    return this;
  }

  
  /**
  * Get analyticsUid
  * @return analyticsUid
  **/
  public String getAnalyticsUid() {
    return analyticsUid;
  }
  public void setAnalyticsUid(String analyticsUid) {
    this.analyticsUid = analyticsUid;
  }
  
  public UpdatePushStatusRequest status(String status) {
    this.status = status;
    return this;
  }

  
  /**
  * Get status
  * @return status
  **/
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  
  public UpdatePushStatusRequest deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  
  /**
  * Centrifugo device id.
  * @return deviceId
  **/
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }
  
  public UpdatePushStatusRequest msgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

  
  /**
  * Provider issued message id.
  * @return msgId
  **/
  public String getMsgId() {
    return msgId;
  }
  public void setMsgId(String msgId) {
    this.msgId = msgId;
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

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}



