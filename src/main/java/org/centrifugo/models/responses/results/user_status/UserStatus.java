package org.centrifugo.models.responses.results.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserStatus {

  @JsonProperty("user")
  private String user;

  @JsonProperty("active")
  private Integer active;

  @JsonProperty("online")
  private Integer online;

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