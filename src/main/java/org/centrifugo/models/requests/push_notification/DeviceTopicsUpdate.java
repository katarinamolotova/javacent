package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeviceTopicsUpdate
 */
public class DeviceTopicsUpdate {

  
  @JsonProperty("op")
  private String op = null;
  
  
  @JsonProperty("topics")
  private List<String> topics = null;
  
  public DeviceTopicsUpdate op(String op) {
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
  
  public DeviceTopicsUpdate topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public DeviceTopicsUpdate addTopicsItem(String topicsItem) {
    
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
    DeviceTopicsUpdate deviceTopicsUpdate = (DeviceTopicsUpdate) o;
    return Objects.equals(this.op, deviceTopicsUpdate.op) &&
        Objects.equals(this.topics, deviceTopicsUpdate.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, topics);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTopicsUpdate {\n");
    
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



