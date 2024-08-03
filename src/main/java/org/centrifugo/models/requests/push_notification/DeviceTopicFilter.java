package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeviceTopicFilter
 */
public class DeviceTopicFilter {

  
  @JsonProperty("device_ids")
  private List<String> deviceIds = null;
  
  
  @JsonProperty("device_providers")
  private List<String> deviceProviders = null;
  
  
  @JsonProperty("device_platforms")
  private List<String> devicePlatforms = null;
  
  
  @JsonProperty("device_users")
  private List<String> deviceUsers = null;
  
  
  @JsonProperty("topics")
  private List<String> topics = null;
  
  
  @JsonProperty("topic_prefix")
  private String topicPrefix = null;
  
  public DeviceTopicFilter deviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public DeviceTopicFilter addDeviceIdsItem(String deviceIdsItem) {
    
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<String>();
    }
    
    this.deviceIds.add(deviceIdsItem);
    return this;
  }
  
  /**
  * Get deviceIds
  * @return deviceIds
  **/
  public List<String> getDeviceIds() {
    return deviceIds;
  }
  public void setDeviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
  }
  
  public DeviceTopicFilter deviceProviders(List<String> deviceProviders) {
    this.deviceProviders = deviceProviders;
    return this;
  }

  public DeviceTopicFilter addDeviceProvidersItem(String deviceProvidersItem) {
    
    if (this.deviceProviders == null) {
      this.deviceProviders = new ArrayList<String>();
    }
    
    this.deviceProviders.add(deviceProvidersItem);
    return this;
  }
  
  /**
  * Get deviceProviders
  * @return deviceProviders
  **/
  public List<String> getDeviceProviders() {
    return deviceProviders;
  }
  public void setDeviceProviders(List<String> deviceProviders) {
    this.deviceProviders = deviceProviders;
  }
  
  public DeviceTopicFilter devicePlatforms(List<String> devicePlatforms) {
    this.devicePlatforms = devicePlatforms;
    return this;
  }

  public DeviceTopicFilter addDevicePlatformsItem(String devicePlatformsItem) {
    
    if (this.devicePlatforms == null) {
      this.devicePlatforms = new ArrayList<String>();
    }
    
    this.devicePlatforms.add(devicePlatformsItem);
    return this;
  }
  
  /**
  * Get devicePlatforms
  * @return devicePlatforms
  **/
  public List<String> getDevicePlatforms() {
    return devicePlatforms;
  }
  public void setDevicePlatforms(List<String> devicePlatforms) {
    this.devicePlatforms = devicePlatforms;
  }
  
  public DeviceTopicFilter deviceUsers(List<String> deviceUsers) {
    this.deviceUsers = deviceUsers;
    return this;
  }

  public DeviceTopicFilter addDeviceUsersItem(String deviceUsersItem) {
    
    if (this.deviceUsers == null) {
      this.deviceUsers = new ArrayList<String>();
    }
    
    this.deviceUsers.add(deviceUsersItem);
    return this;
  }
  
  /**
  * Get deviceUsers
  * @return deviceUsers
  **/
  public List<String> getDeviceUsers() {
    return deviceUsers;
  }
  public void setDeviceUsers(List<String> deviceUsers) {
    this.deviceUsers = deviceUsers;
  }
  
  public DeviceTopicFilter topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public DeviceTopicFilter addTopicsItem(String topicsItem) {
    
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
  
  public DeviceTopicFilter topicPrefix(String topicPrefix) {
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
    DeviceTopicFilter deviceTopicFilter = (DeviceTopicFilter) o;
    return Objects.equals(this.deviceIds, deviceTopicFilter.deviceIds) &&
        Objects.equals(this.deviceProviders, deviceTopicFilter.deviceProviders) &&
        Objects.equals(this.devicePlatforms, deviceTopicFilter.devicePlatforms) &&
        Objects.equals(this.deviceUsers, deviceTopicFilter.deviceUsers) &&
        Objects.equals(this.topics, deviceTopicFilter.topics) &&
        Objects.equals(this.topicPrefix, deviceTopicFilter.topicPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceIds, deviceProviders, devicePlatforms, deviceUsers, topics, topicPrefix);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTopicFilter {\n");
    
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    deviceProviders: ").append(toIndentedString(deviceProviders)).append("\n");
    sb.append("    devicePlatforms: ").append(toIndentedString(devicePlatforms)).append("\n");
    sb.append("    deviceUsers: ").append(toIndentedString(deviceUsers)).append("\n");
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



