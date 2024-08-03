package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConnectionInfo
 */
public class ConnectionInfo {

  
  @JsonProperty("app_name")
  private String appName = null;
  
  
  @JsonProperty("app_version")
  private String appVersion = null;
  
  
  @JsonProperty("transport")
  private String transport = null;
  
  
  @JsonProperty("protocol")
  private String protocol = null;
  
  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("state")
  private ConnectionState state = null;
  
  public ConnectionInfo appName(String appName) {
    this.appName = appName;
    return this;
  }

  
  /**
  * Get appName
  * @return appName
  **/
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }
  
  public ConnectionInfo appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  
  /**
  * Get appVersion
  * @return appVersion
  **/
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }
  
  public ConnectionInfo transport(String transport) {
    this.transport = transport;
    return this;
  }

  
  /**
  * Get transport
  * @return transport
  **/
  public String getTransport() {
    return transport;
  }
  public void setTransport(String transport) {
    this.transport = transport;
  }
  
  public ConnectionInfo protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  
  /**
  * Get protocol
  * @return protocol
  **/
  public String getProtocol() {
    return protocol;
  }
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }
  
  public ConnectionInfo user(String user) {
    this.user = user;
    return this;
  }

  
  /**
  * 5-7 dropped for backwards compatibility.
  * @return user
  **/
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  
  public ConnectionInfo state(ConnectionState state) {
    this.state = state;
    return this;
  }

  
  /**
  * Get state
  * @return state
  **/
  public ConnectionState getState() {
    return state;
  }
  public void setState(ConnectionState state) {
    this.state = state;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionInfo connectionInfo = (ConnectionInfo) o;
    return Objects.equals(this.appName, connectionInfo.appName) &&
        Objects.equals(this.appVersion, connectionInfo.appVersion) &&
        Objects.equals(this.transport, connectionInfo.transport) &&
        Objects.equals(this.protocol, connectionInfo.protocol) &&
        Objects.equals(this.user, connectionInfo.user) &&
        Objects.equals(this.state, connectionInfo.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appVersion, transport, protocol, user, state);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInfo {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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



