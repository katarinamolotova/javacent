package org.opensolutionlab.httpclients.models.responses.results.history;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Publication in the channels
 */
public class Publication {

  /**
   * Custom data of publication
   */
  @JsonProperty("data")
  private Object data;

  /**
   * Client info
   */
  @JsonProperty("info")
  private ClientInfo info;

  /**
   * Offset in a stream
   */
  @JsonProperty("offset")
  private Integer offset;

  /**
   * Custom tags
   */
  @JsonProperty("tags")
  private Map<String, String> tags;

  public Publication(Object data, ClientInfo info, Integer offset, Map<String, String> tags) {
    this.data = data;
    this.info = info;
    this.offset = offset;
    this.tags = tags;
  }

  public Publication() {
  }

  public Object getData() {
    return this.data;
  }

  public ClientInfo getInfo() {
    return this.info;
  }

  public Integer getOffset() {
    return this.offset;
  }

  public Map<String, String> getTags() {
    return this.tags;
  }

  @JsonProperty("data")
  public void setData(Object data) {
    this.data = data;
  }

  @JsonProperty("info")
  public void setInfo(ClientInfo info) {
    this.info = info;
  }

  @JsonProperty("offset")
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  @JsonProperty("tags")
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }
}