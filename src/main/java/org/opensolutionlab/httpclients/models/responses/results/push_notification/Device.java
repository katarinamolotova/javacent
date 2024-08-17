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

package org.opensolutionlab.httpclients.models.responses.results.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Device
 */
public class Device {

  /**
   * The device's ID
   */
  @JsonProperty("id")
  private String id;

  /**
   * The device's platform
   */
  @JsonProperty("platform")
  private String platform;

  /**
   * The device's token provider
   */
  @JsonProperty("provider")
  private String provider;

  /**
   * The device's token
   */
  @JsonProperty("token")
  private String token;

  /**
   * The user associated with the device
   */
  @JsonProperty("user")
  private String user;

  /**
   * The device creation time
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  /**
   * Device update time
   */
  @JsonProperty("updated_at")
  private Integer updatedAt;

  /**
   * Only included if include_meta was true
   */
  @JsonProperty("meta")
  private Map<String, String> meta;

  /**
   * Only included if include_topics was true
   */
  @JsonProperty("topics")
  private List<String> topics;

  /**
   * The device's timezone
   */
  @JsonProperty("timezone")
  private String timezone;

  /**
   * The device's locale
   */
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