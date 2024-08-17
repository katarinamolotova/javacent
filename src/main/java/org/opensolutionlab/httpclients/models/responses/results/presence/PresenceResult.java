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

package org.opensolutionlab.httpclients.models.responses.results.presence;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.responses.results.history.ClientInfo;

import java.util.Map;

/**
 * Presence result
 */
public class PresenceResult {

  /**
   * Offset of publication in history stream
   */
  @JsonProperty("presence")
  private Map<String, ClientInfo> presence;

  public PresenceResult(Map<String, ClientInfo> presence) {
    this.presence = presence;
  }

  public PresenceResult() {
  }

  public Map<String, ClientInfo> getPresence() {
    return this.presence;
  }

  @JsonProperty("presence")
  public void setPresence(Map<String, ClientInfo> presence) {
    this.presence = presence;
  }
}