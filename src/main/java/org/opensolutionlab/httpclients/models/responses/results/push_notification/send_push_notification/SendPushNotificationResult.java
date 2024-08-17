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

package org.opensolutionlab.httpclients.models.responses.results.push_notification.send_push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Send push notification result
 */
public class SendPushNotificationResult {

  /**
   * uid of push notification to cancel
   */
  @JsonProperty("uid")
  private String uid;

  public SendPushNotificationResult(String uid) {
    this.uid = uid;
  }

  public SendPushNotificationResult() {
  }

  public String getUid() {
    return this.uid;
  }

  @JsonProperty("uid")
  public void setUid(String uid) {
    this.uid = uid;
  }
}