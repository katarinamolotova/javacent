/*
 * Copyright 2024 Molotova Katerina, Kukhtachev Mikhail.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensolutionlab.httpclients.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.responses.results.batch.Reply;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Batch response
 */
public class BatchResponse implements ResponseModel {

  /**
   * List of replies
   */
  @JsonProperty("replies")
  private List<Reply> replies;
  
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



