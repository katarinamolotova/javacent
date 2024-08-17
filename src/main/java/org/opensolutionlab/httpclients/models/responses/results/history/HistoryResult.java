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