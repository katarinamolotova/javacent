/*
 * Copyright 2024 Molotova Katerina, Kukhtachev Mikhail.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensolutionlab.httpclients.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Connections result
 */
public class ConnectionsResult {

  /**
   * Active user connections map where key is client ID and value is ConnectionInfo
   */
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