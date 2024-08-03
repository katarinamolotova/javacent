package org.centrifugo.models.responses.results.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.responses.ResponseModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BatchResponse
 */
public class BatchResponse implements ResponseModel {

  
  @JsonProperty("replies")
  private List<Reply> replies = null;
  
  public BatchResponse replies(List<Reply> replies) {
    this.replies = replies;
    return this;
  }

  public BatchResponse addRepliesItem(Reply repliesItem) {
    
    if (this.replies == null) {
      this.replies = new ArrayList<Reply>();
    }
    
    this.replies.add(repliesItem);
    return this;
  }
  
  /**
  * Get replies
  * @return replies
  **/
  public List<Reply> getReplies() {
    return replies;
  }
  public void setReplies(List<Reply> replies) {
    this.replies = replies;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponse batchResponse = (BatchResponse) o;
    return Objects.equals(this.replies, batchResponse.replies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replies);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponse {\n");
    
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
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



