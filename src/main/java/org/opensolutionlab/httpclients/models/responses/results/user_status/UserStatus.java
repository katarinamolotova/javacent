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

package org.opensolutionlab.httpclients.models.responses.results.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User status
 */
public class UserStatus {

  /**
   * User ID
   */
  @JsonProperty("user")
  private String user;

  /**
   * Last active time (Unix seconds)
   */
  @JsonProperty("active")
  private Integer active;

  /**
   * Last online time (Unix seconds)
   */
  @JsonProperty("online")
  private Integer online;

  /**
   * User state
   */
  @JsonProperty("state")
  private String state;

  public UserStatus(String user, Integer active, Integer online, String state) {
    this.user = user;
    this.active = active;
    this.online = online;
    this.state = state;
  }

  public UserStatus() {
  }

  public String getUser() {
    return this.user;
  }

  public Integer getActive() {
    return this.active;
  }

  public Integer getOnline() {
    return this.online;
  }

  public String getState() {
    return this.state;
  }

  @JsonProperty("user")
  public void setUser(String user) {
    this.user = user;
  }

  @JsonProperty("active")
  public void setActive(Integer active) {
    this.active = active;
  }

  @JsonProperty("online")
  public void setOnline(Integer online) {
    this.online = online;
  }

  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
  }
}