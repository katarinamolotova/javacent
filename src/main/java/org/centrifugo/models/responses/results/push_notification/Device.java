package org.centrifugo.models.responses.results.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

/**
 * Device
 */
public class Device {

  
  @JsonProperty("id")
  private String id = null;
  
  
  @JsonProperty("platform")
  private String platform = null;
  
  
  @JsonProperty("provider")
  private String provider = null;
  
  
  @JsonProperty("token")
  private String token = null;
  
  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("created_at")
  private Integer createdAt = null;
  
  
  @JsonProperty("updated_at")
  private Integer updatedAt = null;
  
  
  @JsonProperty("meta")
  private Map<String, String> meta = null;
  
  
  @JsonProperty("topics")
  private List<String> topics = null;
  
  
  @JsonProperty("timezone")
  private String timezone = null;
  
  
  @JsonProperty("locale")
  private String locale = null;
  
  public Device id(String id) {
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
  
  public Device platform(String platform) {
    this.platform = platform;
    return this;
  }

  
  /**
  * Get platform
  * @return platform
  **/
  public String getPlatform() {
    return platform;
  }
  public void setPlatform(String platform) {
    this.platform = platform;
  }
  
  public Device provider(String provider) {
    this.provider = provider;
    return this;
  }

  
  /**
  * Get provider
  * @return provider
  **/
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }
  
  public Device token(String token) {
    this.token = token;
    return this;
  }

  
  /**
  * Get token
  * @return token
  **/
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }
  
  public Device user(String user) {
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
  
  public Device createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  /**
  * Get createdAt
  * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }
  
  public Device updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  /**
  * Get updatedAt
  * @return updatedAt
  **/
  public Integer getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }
  
  public Device meta(Map<String, String> meta) {
    this.meta = meta;
    return this;
  }

  public Device putMetaItem(String key, String metaItem) {
    
    if (this.meta == null) {
      this.meta = new HashMap<String, String>();
    }
    
    this.meta.put(key, metaItem);
    return this;
  }
  /**
  * Get meta
  * @return meta
  **/
  public Map<String, String> getMeta() {
    return meta;
  }
  public void setMeta(Map<String, String> meta) {
    this.meta = meta;
  }
  
  public Device topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public Device addTopicsItem(String topicsItem) {
    
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
  
  public Device timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  
  /**
  * Get timezone
  * @return timezone
  **/
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }
  
  public Device locale(String locale) {
    this.locale = locale;
    return this;
  }

  
  /**
  * Get locale
  * @return locale
  **/
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.id, device.id) &&
        Objects.equals(this.platform, device.platform) &&
        Objects.equals(this.provider, device.provider) &&
        Objects.equals(this.token, device.token) &&
        Objects.equals(this.user, device.user) &&
        Objects.equals(this.createdAt, device.createdAt) &&
        Objects.equals(this.updatedAt, device.updatedAt) &&
        Objects.equals(this.meta, device.meta) &&
        Objects.equals(this.topics, device.topics) &&
        Objects.equals(this.timezone, device.timezone) &&
        Objects.equals(this.locale, device.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, platform, provider, token, user, createdAt, updatedAt, meta, topics, timezone, locale);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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



