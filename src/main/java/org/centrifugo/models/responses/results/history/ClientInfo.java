package org.centrifugo.models.responses.results.history;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClientInfo
 */
public class ClientInfo {

  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("client")
  private String client = null;
  
  
  @JsonProperty("conn_info")
  private Object connInfo = null;
  
  
  @JsonProperty("chan_info")
  private Object chanInfo = null;
  
  public ClientInfo user(String user) {
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
  
  public ClientInfo client(String client) {
    this.client = client;
    return this;
  }

  
  /**
  * Get client
  * @return client
  **/
  public String getClient() {
    return client;
  }
  public void setClient(String client) {
    this.client = client;
  }
  
  public ClientInfo connInfo(Object connInfo) {
    this.connInfo = connInfo;
    return this;
  }

  
  /**
  * Get connInfo
  * @return connInfo
  **/
  public Object getConnInfo() {
    return connInfo;
  }
  public void setConnInfo(Object connInfo) {
    this.connInfo = connInfo;
  }
  
  public ClientInfo chanInfo(Object chanInfo) {
    this.chanInfo = chanInfo;
    return this;
  }

  
  /**
  * Get chanInfo
  * @return chanInfo
  **/
  public Object getChanInfo() {
    return chanInfo;
  }
  public void setChanInfo(Object chanInfo) {
    this.chanInfo = chanInfo;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInfo clientInfo = (ClientInfo) o;
    return Objects.equals(this.user, clientInfo.user) &&
        Objects.equals(this.client, clientInfo.client) &&
        Objects.equals(this.connInfo, clientInfo.connInfo) &&
        Objects.equals(this.chanInfo, clientInfo.chanInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, client, connInfo, chanInfo);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInfo {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    connInfo: ").append(toIndentedString(connInfo)).append("\n");
    sb.append("    chanInfo: ").append(toIndentedString(chanInfo)).append("\n");
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



