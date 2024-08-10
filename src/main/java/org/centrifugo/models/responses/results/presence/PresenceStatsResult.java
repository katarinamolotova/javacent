package org.centrifugo.models.responses.results.presence;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Presence stats result
 */
public class PresenceStatsResult {

  /**
   * Total number of clients in channel
   */
  @JsonProperty("num_clients")
  private Long numClients;

  /**
   * Total number of unique users in channel
   */
  @JsonProperty("num_users")
  private Long numUsers;

  public PresenceStatsResult(Long numClients, Long numUsers) {
    this.numClients = numClients;
    this.numUsers = numUsers;
  }

  public PresenceStatsResult() {
  }

  public Long getNumClients() {
    return this.numClients;
  }

  public Long getNumUsers() {
    return this.numUsers;
  }

  @JsonProperty("num_clients")
  public void setNumClients(Long numClients) {
    this.numClients = numClients;
  }

  @JsonProperty("num_users")
  public void setNumUsers(Long numUsers) {
    this.numUsers = numUsers;
  }
}