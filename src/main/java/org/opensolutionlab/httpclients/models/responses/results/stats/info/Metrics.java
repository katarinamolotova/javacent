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

import java.util.Map;

/**
 * Node metrics
 */
public class Metrics {

  /**
   * Time interval
   */
  @JsonProperty("interval")
  private Double interval;

  /**
   * Map of metric name to value
   */
  @JsonProperty("items")
  private Map<String, Double> items;

  public Metrics(Double interval, Map<String, Double> items) {
    this.interval = interval;
    this.items = items;
  }

  public Metrics() {
  }

  public Double getInterval() {
    return this.interval;
  }

  public Map<String, Double> getItems() {
    return this.items;
  }

  @JsonProperty("interval")
  public void setInterval(Double interval) {
    this.interval = interval;
  }

  @JsonProperty("items")
  public void setItems(Map<String, Double> items) {
    this.items = items;
  }
}