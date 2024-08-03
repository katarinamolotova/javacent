package org.centrifugo.models.responses.results.push_notification.user_topic_list;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserTopic
 */
public class UserTopic {

  
  @JsonProperty("id")
  private String id = null;
  
  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("topic")
  private String topic = null;
  
  public UserTopic id(String id) {
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
  
  public UserTopic user(String user) {
    this.user = user;
    return this;
  }

  
  /**
  * Get user
  * @return user
  **/
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  
  public UserTopic topic(String topic) {
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
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTopic userTopic = (UserTopic) o;
    return Objects.equals(this.id, userTopic.id) &&
        Objects.equals(this.user, userTopic.user) &&
        Objects.equals(this.topic, userTopic.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, topic);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTopic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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



