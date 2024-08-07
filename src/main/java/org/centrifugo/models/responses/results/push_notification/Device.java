package org.centrifugo.models.responses.results.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Device {

  @JsonProperty("id")
  private String id;

  @JsonProperty("platform")
  private String platform;

  @JsonProperty("provider")
  private String provider;

  @JsonProperty("token")
  private String token;

  @JsonProperty("user")
  private String user;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("updated_at")
  private Integer updatedAt;

  @JsonProperty("meta")
  private Map<String, String> meta;

  @JsonProperty("topics")
  private List<String> topics;

  @JsonProperty("timezone")
  private String timezone;

  @JsonProperty("locale")
  private String locale;

  public Device(
          String id,
          String platform,
          String provider,
          String token,
          String user,
          Integer createdAt,
          Integer updatedAt,
          Map<String, String> meta,
          List<String> topics,
          String timezone,
          String locale
  ) {
    this.id = id;
    this.platform = platform;
    this.provider = provider;
    this.token = token;
    this.user = user;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.meta = meta;
    this.topics = topics;
    this.timezone = timezone;
    this.locale = locale;
  }

  public Device() {
  }

  public String getId() {
    return this.id;
  }

  public String getPlatform() {
    return this.platform;
  }

  public String getProvider() {
    return this.provider;
  }

  public String getToken() {
    return this.token;
  }

  public String getUser() {
    return this.user;
  }

  public Integer getCreatedAt() {
    return this.createdAt;
  }

  public Integer getUpdatedAt() {
    return this.updatedAt;
  }

  public Map<String, String> getMeta() {
    return this.meta;
  }

  public List<String> getTopics() {
    return this.topics;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public String getLocale() {
    return this.locale;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("platform")
  public void setPlatform(String platform) {
    this.platform = platform;
  }

  @JsonProperty("provider")
  public void setProvider(String provider) {
    this.provider = provider;
  }

  @JsonProperty("token")
  public void setToken(String token) {
    this.token = token;
  }

  @JsonProperty("user")
  public void setUser(String user) {
    this.user = user;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  @JsonProperty("updated_at")
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  @JsonProperty("meta")
  public void setMeta(Map<String, String> meta) {
    this.meta = meta;
  }

  @JsonProperty("topics")
  public void setTopics(List<String> topics) {
    this.topics = topics;
  }

  @JsonProperty("timezone")
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  @JsonProperty("locale")
  public void setLocale(String locale) {
    this.locale = locale;
  }
}