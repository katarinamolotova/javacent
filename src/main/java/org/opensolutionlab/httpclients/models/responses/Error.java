/*
 * Copyright 2024 Molotova Katerina, Kukhtachev Mikhail.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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



