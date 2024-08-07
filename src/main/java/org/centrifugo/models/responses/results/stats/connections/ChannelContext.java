package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChannelContext {

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