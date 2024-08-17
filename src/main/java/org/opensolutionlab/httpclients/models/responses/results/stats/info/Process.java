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
 * Node process
 */
public class Process {

  /**
   * CPU value
   */
  @JsonProperty("cpu")
  private Double cpu;

  /**
   * Resident set size (RSS) is the portion of memory occupied by a process
   */
  @JsonProperty("rss")
  private Integer rss;

  public Process(Double cpu, Integer rss) {
    this.cpu = cpu;
    this.rss = rss;
  }

  public Process() {
  }

  public Double getCpu() {
    return this.cpu;
  }

  public Integer getRss() {
    return this.rss;
  }

  @JsonProperty("cpu")
  public void setCpu(Double cpu) {
    this.cpu = cpu;
  }

  @JsonProperty("rss")
  public void setRss(Integer rss) {
    this.rss = rss;
  }
}