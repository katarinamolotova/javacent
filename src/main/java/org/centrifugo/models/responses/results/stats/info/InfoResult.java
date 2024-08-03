package org.centrifugo.models.responses.results.stats.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InfoResult
 */
public class InfoResult {

  
  @JsonProperty("nodes")
  private List<NodeResult> nodes = null;
  
  public InfoResult nodes(List<NodeResult> nodes) {
    this.nodes = nodes;
    return this;
  }

  public InfoResult addNodesItem(NodeResult nodesItem) {
    
    if (this.nodes == null) {
      this.nodes = new ArrayList<NodeResult>();
    }
    
    this.nodes.add(nodesItem);
    return this;
  }
  
  /**
  * Get nodes
  * @return nodes
  **/
  public List<NodeResult> getNodes() {
    return nodes;
  }
  public void setNodes(List<NodeResult> nodes) {
    this.nodes = nodes;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoResult infoResult = (InfoResult) o;
    return Objects.equals(this.nodes, infoResult.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoResult {\n");
    
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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



