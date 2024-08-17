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

package org.opensolutionlab.httpclients.models.responses.results.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Get user status result
 */
public class GetUserStatusResult {

  /**
   * Statuses for each user in params (same order)
   */
  @JsonProperty("statuses")
  private List<UserStatus> statuses;

  public GetUserStatusResult(List<UserStatus> statuses) {
    this.statuses = statuses;
  }

  public GetUserStatusResult() {
  }

  public List<UserStatus> getStatuses() {
    return this.statuses;
  }

  @JsonProperty("statuses")
  public void setStatuses(List<UserStatus> statuses) {
    this.statuses = statuses;
  }
}