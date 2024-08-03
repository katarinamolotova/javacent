package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ConnectionsResult
 */
public class ConnectionsResult {

  
  @JsonProperty("connections")
  private Map<String, ConnectionInfo> connections = null;
  
  public ConnectionsResult connections(Map<String, ConnectionInfo> connections) {
    this.connections = connections;
    return this;
  }

  public ConnectionsResult putConnectionsItem(String key, ConnectionInfo connectionsItem) {
    
    if (this.connections == null) {
      this.connections = new HashMap<String, ConnectionInfo>();
    }
    
    this.connections.put(key, connectionsItem);
    return this;
  }
  /**
  * Get connections
  * @return connections
  **/
  public Map<String, ConnectionInfo> getConnections() {
    return connections;
  }
  public void setConnections(Map<String, ConnectionInfo> connections) {
    this.connections = connections;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionsResult connectionsResult = (ConnectionsResult) o;
    return Objects.equals(this.connections, connectionsResult.connections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connections);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionsResult {\n");
    
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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



