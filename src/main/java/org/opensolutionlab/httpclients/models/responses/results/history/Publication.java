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