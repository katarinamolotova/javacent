package org.centrifugo.models.responses.results.push_notification.send_push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SendPushNotificationResult
 */
public class SendPushNotificationResult {

  
  @JsonProperty("uid")
  private String uid = null;
  
  public SendPushNotificationResult uid(String uid) {
    this.uid = uid;
    return this;
  }

  
  /**
  * Unique identifier of notification send request (it&#x27;s not a FCM message id).
  * @return uid
  **/
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendPushNotificationResult sendPushNotificationResult = (SendPushNotificationResult) o;
    return Objects.equals(this.uid, sendPushNotificationResult.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendPushNotificationResult {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}



