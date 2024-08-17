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

package org.opensolutionlab.httpclients.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Connection info
 */
public class ConnectionInfo {

  /**
   * Client app name (if provided by client)
   */
  @JsonProperty("app_name")
  private String appName;

  /**
   * Client app version (if provided by client)
   */
  @JsonProperty("app_version")
  private String appVersion;

  /**
   * Client connection transport
   */
  @JsonProperty("transport")
  private String transport;

  /**
   * Client connection protocol (json or protobuf)
   */
  @JsonProperty("protocol")
  private String protocol;

  /**
   * Client user ID
   */
  @JsonProperty("user")
  private String user;

  /**
   * Connection state object
   */
  @JsonProperty("state")
  private ConnectionState state;

  public ConnectionInfo(
          String appName,
          String appVersion,
          String transport,
          String protocol,
          String user,
          ConnectionState state
  ) {
    this.appName = appName;
    this.appVersion = appVersion;
    this.transport = transport;
    this.protocol = protocol;
    this.user = user;
    this.state = state;
  }

  public ConnectionInfo() {
  }

  public String getAppName() {
    return this.appName;
  }

  public String getAppVersion() {
    return this.appVersion;
  }

  public String getTransport() {
    return this.transport;
  }

  public String getProtocol() {
    return this.protocol;
  }

  public String getUser() {
    return this.user;
  }

  public ConnectionState getState() {
    return this.state;
  }

  @JsonProperty("app_name")
  public void setAppName(String appName) {
    this.appName = appName;
  }

  @JsonProperty("app_version")
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  @JsonProperty("transport")
  public void setTransport(String transport) {
    this.transport = transport;
  }

  @JsonProperty("protocol")
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  @JsonProperty("user")
  public void setUser(String user) {
    this.user = user;
  }

  @JsonProperty("state")
  public void setState(ConnectionState state) {
    this.state = state;
  }
}