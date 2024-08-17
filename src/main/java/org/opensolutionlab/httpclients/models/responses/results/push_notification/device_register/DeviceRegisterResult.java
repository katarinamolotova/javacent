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

package org.opensolutionlab.httpclients.models.responses.results.push_notification.device_register;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Device register result
 */
public class DeviceRegisterResult {

  /**
   * The device ID that was registered/updated
   */
  @JsonProperty("id")
  private String id;

  public DeviceRegisterResult(String id) {
    this.id = id;
  }

  public DeviceRegisterResult() {
  }

  public String getId() {
    return this.id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }
}