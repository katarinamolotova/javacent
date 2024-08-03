package org.centrifugo.models.responses.results.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserStatus
 */
public class UserStatus {

  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("active")
  private Integer active = null;
  
  
  @JsonProperty("online")
  private Integer online = null;
  
  
  @JsonProperty("state")
  private String state = null;
  
  public UserStatus user(String user) {
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
  
  public UserStatus active(Integer active) {
    this.active = active;
    return this;
  }

  
  /**
  * Get active
  * @return active
  **/
  public Integer getActive() {
    return active;
  }
  public void setActive(Integer active) {
    this.active = active;
  }
  
  public UserStatus online(Integer online) {
    this.online = online;
    return this;
  }

  
  /**
  * Get online
  * @return online
  **/
  public Integer getOnline() {
    return online;
  }
  public void setOnline(Integer online) {
    this.online = online;
  }
  
  public UserStatus state(String state) {
    this.state = state;
    return this;
  }

  
  /**
  * Get state
  * @return state
  **/
  public String getState() {
    return state;
  }
  public void setState(String state) {
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
    UserStatus userStatus = (UserStatus) o;
    return Objects.equals(this.user, userStatus.user) &&
        Objects.equals(this.active, userStatus.active) &&
        Objects.equals(this.online, userStatus.online) &&
        Objects.equals(this.state, userStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, active, online, state);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStatus {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
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



