package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UserTopicFilter
 */
public class UserTopicFilter {

  
  @JsonProperty("users")
  private List<String> users = null;
  
  
  @JsonProperty("topics")
  private List<String> topics = null;
  
  
  @JsonProperty("topic_prefix")
  private String topicPrefix = null;
  
  public UserTopicFilter users(List<String> users) {
    this.users = users;
    return this;
  }

  public UserTopicFilter addUsersItem(String usersItem) {
    
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    
    this.users.add(usersItem);
    return this;
  }
  
  /**
  * Get users
  * @return users
  **/
  public List<String> getUsers() {
    return users;
  }
  public void setUsers(List<String> users) {
    this.users = users;
  }
  
  public UserTopicFilter topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public UserTopicFilter addTopicsItem(String topicsItem) {
    
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
  
  public UserTopicFilter topicPrefix(String topicPrefix) {
    this.topicPrefix = topicPrefix;
    return this;
  }

  
  /**
  * Get topicPrefix
  * @return topicPrefix
  **/
  public String getTopicPrefix() {
    return topicPrefix;
  }
  public void setTopicPrefix(String topicPrefix) {
    this.topicPrefix = topicPrefix;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTopicFilter userTopicFilter = (UserTopicFilter) o;
    return Objects.equals(this.users, userTopicFilter.users) &&
        Objects.equals(this.topics, userTopicFilter.topics) &&
        Objects.equals(this.topicPrefix, userTopicFilter.topicPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, topics, topicPrefix);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTopicFilter {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    topicPrefix: ").append(toIndentedString(topicPrefix)).append("\n");
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



