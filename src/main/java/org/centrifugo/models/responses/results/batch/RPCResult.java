package org.centrifugo.models.responses.results.batch;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RPCResult
 */
public class RPCResult {

  
  @JsonProperty("data")
  private Object data = null;
  
  public RPCResult data(Object data) {
    this.data = data;
    return this;
  }

  
  /**
  * Get data
  * @return data
  **/
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RPCResult rpCResult = (RPCResult) o;
    return Objects.equals(this.data, rpCResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RPCResult {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}



