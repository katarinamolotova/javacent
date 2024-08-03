package org.centrifugo.models.responses.results.stats.channels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ChannelsResult
 */
public class ChannelsResult {

  
  @JsonProperty("channels")
  private Map<String, ChannelInfo> channels = null;
  
  public ChannelsResult channels(Map<String, ChannelInfo> channels) {
    this.channels = channels;
    return this;
  }

  public ChannelsResult putChannelsItem(String key, ChannelInfo channelsItem) {
    
    if (this.channels == null) {
      this.channels = new HashMap<String, ChannelInfo>();
    }
    
    this.channels.put(key, channelsItem);
    return this;
  }
  /**
  * Get channels
  * @return channels
  **/
  public Map<String, ChannelInfo> getChannels() {
    return channels;
  }
  public void setChannels(Map<String, ChannelInfo> channels) {
    this.channels = channels;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelsResult channelsResult = (ChannelsResult) o;
    return Objects.equals(this.channels, channelsResult.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelsResult {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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



