package org.centrifugo.models.responses.results.publication;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.responses.StandardResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BroadcastResult
 */
public class BroadcastResult {

  
  @JsonProperty("responses")
  private List<StandardResponse<PublishResult>> responses = null;
  
  public BroadcastResult responses(List<StandardResponse<PublishResult>> responses) {
    this.responses = responses;
    return this;
  }

  public BroadcastResult addResponsesItem(StandardResponse<PublishResult> responsesItem) {
    
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    
    this.responses.add(responsesItem);
    return this;
  }
  
  /**
  * Get responses
  * @return responses
  **/
  public List<StandardResponse<PublishResult>> getResponses() {
    return responses;
  }
  public void setResponses(List<StandardResponse<PublishResult>> responses) {
    this.responses = responses;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastResult broadcastResult = (BroadcastResult) o;
    return Objects.equals(this.responses, broadcastResult.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastResult {\n");
    
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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



