package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeviceFilter
 */
public class DeviceFilter {

  
  @JsonProperty("ids")
  private List<String> ids = null;
  
  
  @JsonProperty("users")
  private List<String> users = null;
  
  
  @JsonProperty("topics")
  private List<String> topics = null;
  
  
  @JsonProperty("providers")
  private List<String> providers = null;
  
  
  @JsonProperty("platforms")
  private List<String> platforms = null;
  
  public DeviceFilter ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public DeviceFilter addIdsItem(String idsItem) {
    
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    
    this.ids.add(idsItem);
    return this;
  }
  
  /**
  * Get ids
  * @return ids
  **/
  public List<String> getIds() {
    return ids;
  }
  public void setIds(List<String> ids) {
    this.ids = ids;
  }
  
  public DeviceFilter users(List<String> users) {
    this.users = users;
    return this;
  }

  public DeviceFilter addUsersItem(String usersItem) {
    
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
  
  public DeviceFilter topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public DeviceFilter addTopicsItem(String topicsItem) {
    
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
  
  public DeviceFilter providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  public DeviceFilter addProvidersItem(String providersItem) {
    
    if (this.providers == null) {
      this.providers = new ArrayList<String>();
    }
    
    this.providers.add(providersItem);
    return this;
  }
  
  /**
  * Get providers
  * @return providers
  **/
  public List<String> getProviders() {
    return providers;
  }
  public void setProviders(List<String> providers) {
    this.providers = providers;
  }
  
  public DeviceFilter platforms(List<String> platforms) {
    this.platforms = platforms;
    return this;
  }

  public DeviceFilter addPlatformsItem(String platformsItem) {
    
    if (this.platforms == null) {
      this.platforms = new ArrayList<String>();
    }
    
    this.platforms.add(platformsItem);
    return this;
  }
  
  /**
  * Get platforms
  * @return platforms
  **/
  public List<String> getPlatforms() {
    return platforms;
  }
  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceFilter deviceFilter = (DeviceFilter) o;
    return Objects.equals(this.ids, deviceFilter.ids) &&
        Objects.equals(this.users, deviceFilter.users) &&
        Objects.equals(this.topics, deviceFilter.topics) &&
        Objects.equals(this.providers, deviceFilter.providers) &&
        Objects.equals(this.platforms, deviceFilter.platforms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, users, topics, providers, platforms);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceFilter {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
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



