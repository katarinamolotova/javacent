package org.centrifugo.models.requests.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeleteUserStatusRequest
 */
public class DeleteUserStatusRequest implements RequestModel {

  
  @JsonProperty("users")
  private List<String> users = null;
  
  public DeleteUserStatusRequest users(List<String> users) {
    this.users = users;
    return this;
  }

  public DeleteUserStatusRequest addUsersItem(String usersItem) {
    
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
  public DeleteUserStatusRequest setUsers(List<String> users) {
    this.users = users;
    return this;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteUserStatusRequest deleteUserStatusRequest = (DeleteUserStatusRequest) o;
    return Objects.equals(this.users, deleteUserStatusRequest.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteUserStatusRequest {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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



