package org.centrifugo.models.responses.results.push_notification.send_push_notification;

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