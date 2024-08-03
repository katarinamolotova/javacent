package org.centrifugo.models.requests.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UpdateUserStatusRequest
 */
public class UpdateUserStatusRequest implements RequestModel {

  
  @JsonProperty("users")
  private List<String> users = null;
  
  
  @JsonProperty("state")
  private String state = null;
  
  public UpdateUserStatusRequest users(List<String> users) {
    this.users = users;
    return this;
  }

  public UpdateUserStatusRequest addUsersItem(String usersItem) {
    
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    
    this.users.add(usersItem);
    return this;
  }
  
  /**
  * Get users
  * @return users
  **/
  public List<String> getUsers() {
    return users;
  }
  public void setUsers(List<String> users) {
    this.users = users;
  }
  
  public UpdateUserStatusRequest state(String state) {
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
    UpdateUserStatusRequest updateUserStatusRequest = (UpdateUserStatusRequest) o;
    return Objects.equals(this.users, updateUserStatusRequest.users) &&
        Objects.equals(this.state, updateUserStatusRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, state);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserStatusRequest {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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



