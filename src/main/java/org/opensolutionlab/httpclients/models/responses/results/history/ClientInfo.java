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

package org.opensolutionlab.httpclients.models.responses.results.history;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Client info
 */
public class ClientInfo {

  /**
   * User ID
   */
  @JsonProperty("user")
  private String user;

  /**
   * Client ID
   */
  @JsonProperty("client")
  private String client;

  /**
   * Optional connection info
   */
  @JsonProperty("conn_info")
  private Object connInfo;

  /**
   * Optional channel info
   */
  @JsonProperty("chan_info")
  private Object chanInfo;

  public ClientInfo(String user, String client, Object connInfo, Object chanInfo) {
    this.user = user;
    this.client = client;
    this.connInfo = connInfo;
    this.chanInfo = chanInfo;
  }

  public ClientInfo() {
  }

  public String getUser() {
    return this.user;
  }

  public String getClient() {
    return this.client;
  }

  public Object getConnInfo() {
    return this.connInfo;
  }

  public Object getChanInfo() {
    return this.chanInfo;
  }

  @JsonProperty("user")
  public void setUser(String user) {
    this.user = user;
  }

  @JsonProperty("client")
  public void setClient(String client) {
    this.client = client;
  }

  @JsonProperty("conn_info")
  public void setConnInfo(Object connInfo) {
    this.connInfo = connInfo;
  }

  @JsonProperty("chan_info")
  public void setChanInfo(Object chanInfo) {
    this.chanInfo = chanInfo;
  }
}