package org.centrifugo.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Disconnect
 */
public class Disconnect {

  @JsonProperty("code")
  private Long code = null;
  
  
  @JsonProperty("reason")
  private String reason = null;
  
  public Disconnect code(Long code) {
    this.code = code;
    return this;
  }

  
  /**
  * Get code
  * @return code
  **/
  public Long getCode() {
    return code;
  }
  public void setCode(Long code) {
    this.code = code;
  }
  
  public Disconnect reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  /**
  * Get reason
  * @return reason
  **/
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Disconnect disconnect = (Disconnect) o;
    return Objects.equals(this.code, disconnect.code) &&
        Objects.equals(this.reason, disconnect.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disconnect {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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



