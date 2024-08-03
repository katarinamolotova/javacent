package org.centrifugo.models.requests.presence;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * PresenceStatsRequest
 */
public class PresenceStatsRequest implements RequestModel {

  
  @JsonProperty("channel")
  private String channel = null;
  
  public PresenceStatsRequest channel(String channel) {
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
  public PresenceStatsRequest setChannel(String channel) {
    this.channel = channel;
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
    PresenceStatsRequest presenceStatsRequest = (PresenceStatsRequest) o;
    return Objects.equals(this.channel, presenceStatsRequest.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceStatsRequest {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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



