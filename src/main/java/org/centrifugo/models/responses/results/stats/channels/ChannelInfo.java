package org.centrifugo.models.responses.results.stats.channels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChannelInfo {

  @JsonProperty("num_clients")
  private Long numClients;

  public ChannelInfo(Long numClients) {
    this.numClients = numClients;
  }

  public ChannelInfo() {
  }

  public Long getNumClients() {
    return this.numClients;
  }

  @JsonProperty("num_clients")
  public void setNumClients(Long numClients) {
    this.numClients = numClients;
  }
}