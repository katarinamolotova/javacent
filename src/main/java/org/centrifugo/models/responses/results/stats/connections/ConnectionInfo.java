package org.centrifugo.models.responses.results.stats.connections;

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