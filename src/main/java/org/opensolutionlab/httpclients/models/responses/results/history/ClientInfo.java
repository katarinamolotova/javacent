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