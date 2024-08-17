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

package org.opensolutionlab.httpclients.models.responses.results.push_notification.device_topic_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.responses.results.push_notification.Device;

/**
 * Device topic
 */
public class DeviceTopic {

  /**
   * ID of DeviceTopic object
   */
  @JsonProperty("id")
  private String id;

  /**
   * Topic
   */
  @JsonProperty("topic")
  private String topic;

  /**
   * Device object
   */
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