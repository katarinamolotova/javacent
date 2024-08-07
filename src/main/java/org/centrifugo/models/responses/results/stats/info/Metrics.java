package org.centrifugo.models.responses.results.stats.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Metrics {

  @JsonProperty("interval")
  private Double interval;

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