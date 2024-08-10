package org.centrifugo.models.responses.results.history;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * History result
 */
public class HistoryResult {

  /**
   * List of publications in channel
   */
  @JsonProperty("publications")
  private List<Publication> publications;

  /**
   * Epoch of current stream
   */
  @JsonProperty("epoch")
  private String epoch;
  
  /**
   * Top offset in history stream
   */
  @JsonProperty("offset")
  private Integer offset;

  public HistoryResult(List<Publication> publications, String epoch, Integer offset) {
    this.publications = publications;
    this.epoch = epoch;
    this.offset = offset;
  }

  public HistoryResult() {
  }

  public List<Publication> getPublications() {
    return this.publications;
  }

  public String getEpoch() {
    return this.epoch;
  }

  public Integer getOffset() {
    return this.offset;
  }

  @JsonProperty("publications")
  public void setPublications(List<Publication> publications) {
    this.publications = publications;
  }

  @JsonProperty("epoch")
  public void setEpoch(String epoch) {
    this.epoch = epoch;
  }

  @JsonProperty("offset")
  public void setOffset(Integer offset) {
    this.offset = offset;
  }
}