package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Channel context
 */
public class ChannelContext {

  /**
   * The source of channel subscription
   */
  @JsonProperty("source")
  private Long source;

  public ChannelContext(Long source) {
    this.source = source;
  }

  public ChannelContext() {
  }

  public Long getSource() {
    return this.source;
  }

  @JsonProperty("source")
  public void setSource(Long source) {
    this.source = source;
  }
}