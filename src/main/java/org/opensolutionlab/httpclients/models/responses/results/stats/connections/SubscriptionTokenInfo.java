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

package org.opensolutionlab.httpclients.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscribe token info
 */
public class SubscriptionTokenInfo {

  /**
   * Unique token ID (jti)
   */
  @JsonProperty("uid")
  private String uid;

  /**
   * Time (Unix seconds) when token was issued
   */
  @JsonProperty("issued_at")
  private Integer issuedAt;

  public SubscriptionTokenInfo(String uid, Integer issuedAt) {
    this.uid = uid;
    this.issuedAt = issuedAt;
  }

  public SubscriptionTokenInfo() {
  }

  public String getUid() {
    return this.uid;
  }

  public Integer getIssuedAt() {
    return this.issuedAt;
  }

  @JsonProperty("uid")
  public void setUid(String uid) {
    this.uid = uid;
  }

  @JsonProperty("issued_at")
  public void setIssuedAt(Integer issuedAt) {
    this.issuedAt = issuedAt;
  }
}