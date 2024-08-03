package org.centrifugo.models.responses.results.push_notification.device_topic_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.responses.results.push_notification.Device;

import java.util.Objects;

/**
 * DeviceTopic
 */
public class DeviceTopic {

  
  @JsonProperty("id")
  private String id = null;
  
  
  @JsonProperty("topic")
  private String topic = null;
  
  
  @JsonProperty("device")
  private Device device = null;
  
  public DeviceTopic id(String id) {
    this.id = id;
    return this;
  }

  
  /**
  * Get id
  * @return id
  **/
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  public DeviceTopic topic(String topic) {
    this.topic = topic;
    return this;
  }

  
  /**
  * Get topic
  * @return topic
  **/
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }
  
  public DeviceTopic device(Device device) {
    this.device = device;
    return this;
  }

  
  /**
  * Get device
  * @return device
  **/
  public Device getDevice() {
    return device;
  }
  public void setDevice(Device device) {
    this.device = device;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTopic deviceTopic = (DeviceTopic) o;
    return Objects.equals(this.id, deviceTopic.id) &&
        Objects.equals(this.topic, deviceTopic.topic) &&
        Objects.equals(this.device, deviceTopic.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, topic, device);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTopic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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



