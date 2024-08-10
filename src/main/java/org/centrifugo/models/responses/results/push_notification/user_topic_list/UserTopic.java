package org.centrifugo.models.responses.results.push_notification.user_topic_list;

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