package org.centrifugo.models.responses.results.stats.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Process {

  @JsonProperty("cpu")
  private Double cpu;

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