package org.centrifugo.models.responses.results.stats.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Info result
 */
public class InfoResult {

  /**
   * Information about all nodes in a cluster
   */
  @JsonProperty("nodes")
  private List<NodeResult> nodes;

  public InfoResult(List<NodeResult> nodes) {
    this.nodes = nodes;
  }

  public InfoResult() {
  }

  public List<NodeResult> getNodes() {
    return this.nodes;
  }

  @JsonProperty("nodes")
  public void setNodes(List<NodeResult> nodes) {
    this.nodes = nodes;
  }
}