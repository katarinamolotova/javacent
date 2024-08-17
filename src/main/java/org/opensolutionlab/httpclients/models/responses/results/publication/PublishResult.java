package org.opensolutionlab.httpclients.models.responses.results.publication;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Publish result
 */
public class PublishResult {

  /**
   * Offset of publication in history stream
   */
  @JsonProperty("offset")
  private Integer offset;

  /**
   * Epoch of current stream
   */
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