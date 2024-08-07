package org.centrifugo.models.responses.results.batch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RPCResult {

  @JsonProperty("data")
  private Object data;

  public RPCResult(Object data) {
    this.data = data;
  }

  public RPCResult() {
  }

  public Object getData() {
    return this.data;
  }

  @JsonProperty("data")
  public void setData(Object data) {
    this.data = data;
  }
}