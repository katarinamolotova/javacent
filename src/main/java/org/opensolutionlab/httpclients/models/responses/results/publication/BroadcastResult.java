package org.opensolutionlab.httpclients.models.responses.results.publication;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.responses.PublishResponse;

import java.util.List;

/**
 * Broadcast result
 */
public class BroadcastResult {

  /**
   * Responses for each individual publish (with possible error and publish result)
   */
  @JsonProperty("responses")
  private List<PublishResponse> responses;

  public BroadcastResult(List<PublishResponse> responses) {
    this.responses = responses;
  }

  public BroadcastResult() {
  }

  public List<PublishResponse> getResponses() {
    return this.responses;
  }

  @JsonProperty("responses")
  public void setResponses(List<PublishResponse> responses) {
    this.responses = responses;
  }
}