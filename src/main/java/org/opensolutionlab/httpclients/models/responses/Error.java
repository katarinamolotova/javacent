package org.opensolutionlab.httpclients.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Centrifugo error
 */
public class Error {

  /**
   * Error code
   */
  @JsonProperty("code")
  private Long code;

  /**
   * Error message
   */
  @JsonProperty("message")
  private String message;

  public Error(Long code, String message) {
    this.code = code;
    this.message = message;
  }

  public Error() {
  }

  public Long getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }

  @JsonProperty("code")
  public void setCode(Long code) {
    this.code = code;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }
}



