package org.opensolutionlab.httpclients.models.responses.results.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Get user status result
 */
public class GetUserStatusResult {

  /**
   * Statuses for each user in params (same order)
   */
  @JsonProperty("statuses")
  private List<UserStatus> statuses;

  public GetUserStatusResult(List<UserStatus> statuses) {
    this.statuses = statuses;
  }

  public GetUserStatusResult() {
  }

  public List<UserStatus> getStatuses() {
    return this.statuses;
  }

  @JsonProperty("statuses")
  public void setStatuses(List<UserStatus> statuses) {
    this.statuses = statuses;
  }
}