package org.centrifugo.models.responses.results.presence;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PresenceStatsResult
 */
public class PresenceStatsResult {

  
  @JsonProperty("num_clients")
  private Long numClients = null;
  
  
  @JsonProperty("num_users")
  private Long numUsers = null;
  
  public PresenceStatsResult numClients(Long numClients) {
    this.numClients = numClients;
    return this;
  }

  
  /**
  * Get numClients
  * @return numClients
  **/
  public Long getNumClients() {
    return numClients;
  }
  public void setNumClients(Long numClients) {
    this.numClients = numClients;
  }
  
  public PresenceStatsResult numUsers(Long numUsers) {
    this.numUsers = numUsers;
    return this;
  }

  
  /**
  * Get numUsers
  * @return numUsers
  **/
  public Long getNumUsers() {
    return numUsers;
  }
  public void setNumUsers(Long numUsers) {
    this.numUsers = numUsers;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresenceStatsResult presenceStatsResult = (PresenceStatsResult) o;
    return Objects.equals(this.numClients, presenceStatsResult.numClients) &&
        Objects.equals(this.numUsers, presenceStatsResult.numUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numClients, numUsers);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceStatsResult {\n");
    
    sb.append("    numClients: ").append(toIndentedString(numClients)).append("\n");
    sb.append("    numUsers: ").append(toIndentedString(numUsers)).append("\n");
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



