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
  
  public DeviceTopicUpdateRequest deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  
  /**
  * Get deviceId
  * @return deviceId
  **/
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }
  
  public DeviceTopicUpdateRequest op(String op) {
    this.op = op;
    return this;
  }

  
  /**
  * Get op
  * @return op
  **/
  public String getOp() {
    return op;
  }
  public void setOp(String op) {
    this.op = op;
  }
  
  public DeviceTopicUpdateRequest topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public DeviceTopicUpdateRequest addTopicsItem(String topicsItem) {
    
    if (this.topics == null) {
      this.topics = new ArrayList<String>();
    }
    
    this.topics.add(topicsItem);
    return this;
  }
  
  /**
  * Get topics
  * @return topics
  **/
  public List<String> getTopics() {
    return topics;
  }
  public void setTopics(List<String> topics) {
    this.topics = topics;
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



