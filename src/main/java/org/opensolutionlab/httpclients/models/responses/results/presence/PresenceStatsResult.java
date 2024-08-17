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

package org.opensolutionlab.httpclients.models.responses.results.presence;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Presence stats result
 */
public class PresenceStatsResult {

  /**
   * Total number of clients in channel
   */
  @JsonProperty("num_clients")
  private Long numClients;

  /**
   * Total number of unique users in channel
   */
  @JsonProperty("num_users")
  private Long numUsers;

  public PresenceStatsResult(Long numClients, Long numUsers) {
    this.numClients = numClients;
    this.numUsers = numUsers;
  }

  public PresenceStatsResult() {
  }

  public Long getNumClients() {
    return this.numClients;
  }

  public Long getNumUsers() {
    return this.numUsers;
  }

  @JsonProperty("num_clients")
  public void setNumClients(Long numClients) {
    this.numClients = numClients;
  }

  @JsonProperty("num_users")
  public void setNumUsers(Long numUsers) {
    this.numUsers = numUsers;
  }
}