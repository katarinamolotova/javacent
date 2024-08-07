package org.centrifugo.models.responses.results.push_notification.device_topic_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.responses.results.push_notification.Device;

public class DeviceTopic {

  @JsonProperty("id")
  private String id;

  @JsonProperty("topic")
  private String topic;

  @JsonProperty("device")
  private Device device;

  public DeviceTopic(String id, String topic, Device device) {
    this.id = id;
    this.topic = topic;
    this.device = device;
  }

  public DeviceTopic() {
  }

  public String getId() {
    return this.id;
  }

  public String getTopic() {
    return this.topic;
  }

  public Device getDevice() {
    return this.device;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("topic")
  public void setTopic(String topic) {
    this.topic = topic;
  }

  @JsonProperty("device")
  public void setDevice(Device device) {
    this.device = device;
  }
}