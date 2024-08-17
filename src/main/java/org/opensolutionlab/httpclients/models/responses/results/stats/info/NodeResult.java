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

package org.opensolutionlab.httpclients.models.responses.results.stats.info;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Node result
 */
public class NodeResult {

  /**
   * Node uid
   */
  @JsonProperty("uid")
  private String uid;

  /**
   * Node name
   */
  @JsonProperty("name")
  private String name;

  /**
   * Node version
   */
  @JsonProperty("version")
  private String version;

  /**
   * Total number of clients
   */
  @JsonProperty("num_clients")
  private Long numClients;

  /**
   * Total number of unique users
   */
  @JsonProperty("num_users")
  private Long numUsers;

  /**
   * Total number of channels
   */
  @JsonProperty("num_channels")
  private Long numChannels;

  /**
   * Working time
   */
  @JsonProperty("uptime")
  private Long uptime;

  /**
   * Metrics object
   */
  @JsonProperty("metrics")
  private Metrics metrics;

  /**
   * Process object
   */
  @JsonProperty("process")
  private Process process;

  /**
   * Total number of subs
   */
  @JsonProperty("num_subs")
  private Long numSubs;

  public NodeResult(
          String uid,
          String name,
          String version,
          Long numClients,
          Long numUsers,
          Long numChannels,
          Long uptime,
          Metrics metrics,
          Process process,
          Long numSubs
  ) {
    this.uid = uid;
    this.name = name;
    this.version = version;
    this.numClients = numClients;
    this.numUsers = numUsers;
    this.numChannels = numChannels;
    this.uptime = uptime;
    this.metrics = metrics;
    this.process = process;
    this.numSubs = numSubs;
  }

  public NodeResult() {
  }

  public String getUid() {
    return this.uid;
  }

  public String getName() {
    return this.name;
  }

  public String getVersion() {
    return this.version;
  }

  public Long getNumClients() {
    return this.numClients;
  }

  public Long getNumUsers() {
    return this.numUsers;
  }

  public Long getNumChannels() {
    return this.numChannels;
  }

  public Long getUptime() {
    return this.uptime;
  }

  public Metrics getMetrics() {
    return this.metrics;
  }

  public Process getProcess() {
    return this.process;
  }

  public Long getNumSubs() {
    return this.numSubs;
  }

  @JsonProperty("uid")
  public void setUid(String uid) {
    this.uid = uid;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  @JsonProperty("num_clients")
  public void setNumClients(Long numClients) {
    this.numClients = numClients;
  }

  @JsonProperty("num_users")
  public void setNumUsers(Long numUsers) {
    this.numUsers = numUsers;
  }

  @JsonProperty("num_channels")
  public void setNumChannels(Long numChannels) {
    this.numChannels = numChannels;
  }

  @JsonProperty("uptime")
  public void setUptime(Long uptime) {
    this.uptime = uptime;
  }

  @JsonProperty("metrics")
  public void setMetrics(Metrics metrics) {
    this.metrics = metrics;
  }

  @JsonProperty("process")
  public void setProcess(Process process) {
    this.process = process;
  }

  @JsonProperty("num_subs")
  public void setNumSubs(Long numSubs) {
    this.numSubs = numSubs;
  }
}