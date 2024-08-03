package org.centrifugo.models.responses.results.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetUserStatusResult
 */
public class GetUserStatusResult {

  
  @JsonProperty("statuses")
  private List<UserStatus> statuses = null;
  
  public GetUserStatusResult statuses(List<UserStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public GetUserStatusResult addStatusesItem(UserStatus statusesItem) {
    
    if (this.statuses == null) {
      this.statuses = new ArrayList<UserStatus>();
    }
    
    this.statuses.add(statusesItem);
    return this;
  }
  
  /**
  * Get statuses
  * @return statuses
  **/
  public List<UserStatus> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<UserStatus> statuses) {
    this.statuses = statuses;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserStatusResult getUserStatusResult = (GetUserStatusResult) o;
    return Objects.equals(this.statuses, getUserStatusResult.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserStatusResult {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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



