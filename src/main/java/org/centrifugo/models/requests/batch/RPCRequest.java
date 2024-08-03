package org.centrifugo.models.requests.batch;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RPCRequest
 */
public class RPCRequest {

  
  @JsonProperty("method")
  private String method = null;
  
  
  @JsonProperty("params")
  private Object params = null;
  
  public RPCRequest method(String method) {
    this.method = method;
    return this;
  }

  
  /**
  * Get method
  * @return method
  **/
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }
  
  public RPCRequest params(Object params) {
    this.params = params;
    return this;
  }

  
  /**
  * Get params
  * @return params
  **/
  public Object getParams() {
    return params;
  }
  public void setParams(Object params) {
    this.params = params;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RPCRequest rpCRequest = (RPCRequest) o;
    return Objects.equals(this.method, rpCRequest.method) &&
        Objects.equals(this.params, rpCRequest.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, params);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RPCRequest {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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



