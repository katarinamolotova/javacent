package org.centrifugo.models.responses.results.publication;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.responses.StandardResponse;

import java.util.List;

public class BroadcastResult {

  @JsonProperty("responses")
  private List<StandardResponse<PublishResult>> responses;

  public BroadcastResult(List<StandardResponse<PublishResult>> responses) {
    this.responses = responses;
  }

  public BroadcastResult() {
  }

  public List<StandardResponse<PublishResult>> getResponses() {
    return this.responses;
  }

  @JsonProperty("responses")
  public void setResponses(List<StandardResponse<PublishResult>> responses) {
    this.responses = responses;
  }
}