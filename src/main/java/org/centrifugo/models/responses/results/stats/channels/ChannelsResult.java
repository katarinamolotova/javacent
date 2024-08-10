package org.centrifugo.models.responses.results.stats.channels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Channels result
 */
public class ChannelsResult {

  /**
   * Map where key is channel and value is ChannelInfo
   */
  @JsonProperty("channels")
  private Map<String, ChannelInfo> channels;

  public ChannelsResult(Map<String, ChannelInfo> channels) {
    this.channels = channels;
  }

  public ChannelsResult() {
  }

  public Map<String, ChannelInfo> getChannels() {
    return this.channels;
  }

  @JsonProperty("channels")
  public void setChannels(Map<String, ChannelInfo> channels) {
    this.channels = channels;
  }
}