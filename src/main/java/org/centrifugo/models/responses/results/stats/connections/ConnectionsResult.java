package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class ConnectionsResult {

  @JsonProperty("connections")
  private Map<String, ConnectionInfo> connections;

  public ConnectionsResult(Map<String, ConnectionInfo> connections) {
    this.connections = connections;
  }

  public ConnectionsResult() {
  }

  public Map<String, ConnectionInfo> getConnections() {
    return this.connections;
  }

  @JsonProperty("connections")
  public void setConnections(Map<String, ConnectionInfo> connections) {
    this.connections = connections;
  }
}