package org.centrifugo.models.requests.history;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * HistoryRequest
 */
public class HistoryRequest implements RequestModel {

  
  @JsonProperty("channel")
  private String channel = null;
  
  
  @JsonProperty("limit")
  private Integer limit = null;
  
  
  @JsonProperty("since")
  private StreamPosition since = null;
  
  
  @JsonProperty("reverse")
  private Boolean reverse = null;
  
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
  public void setChannel(String channel) {
    this.channel = channel;
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
  public void setLimit(Integer limit) {
    this.limit = limit;
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
  public void setSince(StreamPosition since) {
    this.since = since;
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
  public void setReverse(Boolean reverse) {
    this.reverse = reverse;
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



