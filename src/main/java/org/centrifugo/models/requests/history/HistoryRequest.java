package org.centrifugo.models.requests.history;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * HistoryRequest
 */
public class HistoryRequest implements RequestModel {

  
  @JsonProperty("channel")
  private String channel;
  
  
  @JsonProperty("limit")
  private Integer limit;
  
  
  @JsonProperty("since")
  private StreamPosition since;
  
  
  @JsonProperty("reverse")
  private Boolean reverse;
  
  public HistoryRequest channel(String channel) {
    this.channel = channel;
    return this;
  }

  
  /**
  * Get channel
  * @return channel
  **/
  public String getChannel() {
    return channel;
  }
  public HistoryRequest setChannel(String channel) {
    this.channel = channel;
    return this;
  }
  
  public HistoryRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  /**
  * Get limit
  * @return limit
  **/
  public Integer getLimit() {
    return limit;
  }
  public HistoryRequest setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
  
  public HistoryRequest since(StreamPosition since) {
    this.since = since;
    return this;
  }

  
  /**
  * Get since
  * @return since
  **/
  public StreamPosition getSince() {
    return since;
  }
  public HistoryRequest setSince(StreamPosition since) {
    this.since = since;
    return this;
  }
  
  public HistoryRequest reverse(Boolean reverse) {
    this.reverse = reverse;
    return this;
  }

  
  /**
  * Get reverse
  * @return reverse
  **/
  public Boolean isReverse() {
    return reverse;
  }
  public HistoryRequest setReverse(Boolean reverse) {
    this.reverse = reverse;
    return this;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryRequest historyRequest = (HistoryRequest) o;
    return Objects.equals(this.channel, historyRequest.channel) &&
        Objects.equals(this.limit, historyRequest.limit) &&
        Objects.equals(this.since, historyRequest.since) &&
        Objects.equals(this.reverse, historyRequest.reverse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, limit, since, reverse);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryRequest {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    reverse: ").append(toIndentedString(reverse)).append("\n");
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