package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeviceRemoveRequest
 */
public class DeviceRemoveRequest implements RequestModel {

  
  @JsonProperty("ids")
  private List<String> ids = null;
  
  
  @JsonProperty("users")
  private List<String> users = null;
  
  public DeviceRemoveRequest ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public DeviceRemoveRequest addIdsItem(String idsItem) {
    
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    
    this.ids.add(idsItem);
    return this;
  }
  
  /**
  * Get ids
  * @return ids
  **/
  public List<String> getIds() {
    return ids;
  }
  public void setIds(List<String> ids) {
    this.ids = ids;
  }
  
  public DeviceRemoveRequest users(List<String> users) {
    this.users = users;
    return this;
  }

  public DeviceRemoveRequest addUsersItem(String usersItem) {
    
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
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRemoveRequest deviceRemoveRequest = (DeviceRemoveRequest) o;
    return Objects.equals(this.ids, deviceRemoveRequest.ids) &&
        Objects.equals(this.users, deviceRemoveRequest.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, users);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRemoveRequest {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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



