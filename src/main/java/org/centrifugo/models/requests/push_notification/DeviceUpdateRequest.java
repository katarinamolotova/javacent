package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeviceUpdateRequest
 */
public class DeviceUpdateRequest implements RequestModel {

  
  @JsonProperty("ids")
  private List<String> ids = null;
  
  
  @JsonProperty("users")
  private List<String> users = null;
  
  
  @JsonProperty("user_update")
  private DeviceUserUpdate userUpdate = null;
  
  
  @JsonProperty("meta_update")
  private DeviceMetaUpdate metaUpdate = null;
  
  
  @JsonProperty("topics_update")
  private DeviceTopicsUpdate topicsUpdate = null;
  
  
  @JsonProperty("timezone_update")
  private DeviceTimezoneUpdate timezoneUpdate = null;
  
  
  @JsonProperty("locale_update")
  private DeviceLocaleUpdate localeUpdate = null;
  
  public DeviceUpdateRequest ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public DeviceUpdateRequest addIdsItem(String idsItem) {
    
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
  
  public DeviceUpdateRequest users(List<String> users) {
    this.users = users;
    return this;
  }

  public DeviceUpdateRequest addUsersItem(String usersItem) {
    
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
  
  public DeviceUpdateRequest userUpdate(DeviceUserUpdate userUpdate) {
    this.userUpdate = userUpdate;
    return this;
  }

  
  /**
  * Get userUpdate
  * @return userUpdate
  **/
  public DeviceUserUpdate getUserUpdate() {
    return userUpdate;
  }
  public void setUserUpdate(DeviceUserUpdate userUpdate) {
    this.userUpdate = userUpdate;
  }
  
  public DeviceUpdateRequest metaUpdate(DeviceMetaUpdate metaUpdate) {
    this.metaUpdate = metaUpdate;
    return this;
  }

  
  /**
  * Get metaUpdate
  * @return metaUpdate
  **/
  public DeviceMetaUpdate getMetaUpdate() {
    return metaUpdate;
  }
  public void setMetaUpdate(DeviceMetaUpdate metaUpdate) {
    this.metaUpdate = metaUpdate;
  }
  
  public DeviceUpdateRequest topicsUpdate(DeviceTopicsUpdate topicsUpdate) {
    this.topicsUpdate = topicsUpdate;
    return this;
  }

  
  /**
  * Get topicsUpdate
  * @return topicsUpdate
  **/
  public DeviceTopicsUpdate getTopicsUpdate() {
    return topicsUpdate;
  }
  public void setTopicsUpdate(DeviceTopicsUpdate topicsUpdate) {
    this.topicsUpdate = topicsUpdate;
  }
  
  public DeviceUpdateRequest timezoneUpdate(DeviceTimezoneUpdate timezoneUpdate) {
    this.timezoneUpdate = timezoneUpdate;
    return this;
  }

  
  /**
  * Get timezoneUpdate
  * @return timezoneUpdate
  **/
  public DeviceTimezoneUpdate getTimezoneUpdate() {
    return timezoneUpdate;
  }
  public void setTimezoneUpdate(DeviceTimezoneUpdate timezoneUpdate) {
    this.timezoneUpdate = timezoneUpdate;
  }
  
  public DeviceUpdateRequest localeUpdate(DeviceLocaleUpdate localeUpdate) {
    this.localeUpdate = localeUpdate;
    return this;
  }

  
  /**
  * Get localeUpdate
  * @return localeUpdate
  **/
  public DeviceLocaleUpdate getLocaleUpdate() {
    return localeUpdate;
  }
  public void setLocaleUpdate(DeviceLocaleUpdate localeUpdate) {
    this.localeUpdate = localeUpdate;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceUpdateRequest deviceUpdateRequest = (DeviceUpdateRequest) o;
    return Objects.equals(this.ids, deviceUpdateRequest.ids) &&
        Objects.equals(this.users, deviceUpdateRequest.users) &&
        Objects.equals(this.userUpdate, deviceUpdateRequest.userUpdate) &&
        Objects.equals(this.metaUpdate, deviceUpdateRequest.metaUpdate) &&
        Objects.equals(this.topicsUpdate, deviceUpdateRequest.topicsUpdate) &&
        Objects.equals(this.timezoneUpdate, deviceUpdateRequest.timezoneUpdate) &&
        Objects.equals(this.localeUpdate, deviceUpdateRequest.localeUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, users, userUpdate, metaUpdate, topicsUpdate, timezoneUpdate, localeUpdate);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceUpdateRequest {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    userUpdate: ").append(toIndentedString(userUpdate)).append("\n");
    sb.append("    metaUpdate: ").append(toIndentedString(metaUpdate)).append("\n");
    sb.append("    topicsUpdate: ").append(toIndentedString(topicsUpdate)).append("\n");
    sb.append("    timezoneUpdate: ").append(toIndentedString(timezoneUpdate)).append("\n");
    sb.append("    localeUpdate: ").append(toIndentedString(localeUpdate)).append("\n");
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



