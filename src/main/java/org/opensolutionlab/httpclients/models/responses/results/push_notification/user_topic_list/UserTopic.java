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

package org.opensolutionlab.httpclients.models.responses.results.push_notification.user_topic_list;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User topic
 */
public class UserTopic {

  /**
   * ID of UserTopic
   */
  @JsonProperty("id")
  private String id;

  /**
   * User ID
   */
  @JsonProperty("user")
  private String user;

  /**
   * Topic
   */
  @JsonProperty("topic")
  private String topic;

  public UserTopic(String id, String user, String topic) {
    this.id = id;
    this.user = user;
    this.topic = topic;
  }

  public UserTopic() {
  }

  public String getId() {
    return this.id;
  }

  public String getUser() {
    return this.user;
  }

  public String getTopic() {
    return this.topic;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("user")
  public void setUser(String user) {
    this.user = user;
  }

  @JsonProperty("topic")
  public void setTopic(String topic) {
    this.topic = topic;
  }
}