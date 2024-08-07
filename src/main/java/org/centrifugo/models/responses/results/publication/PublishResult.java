package org.centrifugo.models.responses.results.publication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublishResult {

  @JsonProperty("offset")
  private Integer offset;

  @JsonProperty("epoch")
  private String epoch;

  public PublishResult(Integer offset, String epoch) {
    this.offset = offset;
    this.epoch = epoch;
  }

  public PublishResult() {
  }

  public Integer getOffset() {
    return this.offset;
  }

  public String getEpoch() {
    return this.epoch;
  }

  @JsonProperty("offset")
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  @JsonProperty("epoch")
  public void setEpoch(String epoch) {
    this.epoch = epoch;
  }
}