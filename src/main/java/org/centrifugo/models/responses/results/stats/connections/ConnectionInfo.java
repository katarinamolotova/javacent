package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectionInfo {

  @JsonProperty("app_name")
  private String appName;

  @JsonProperty("app_version")
  private String appVersion;

  @JsonProperty("transport")
  private String transport;

  @JsonProperty("protocol")
  private String protocol;

  @JsonProperty("user")
  private String user;

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