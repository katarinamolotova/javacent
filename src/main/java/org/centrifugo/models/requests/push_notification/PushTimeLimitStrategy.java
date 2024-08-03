package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PushTimeLimitStrategy
 */
public class PushTimeLimitStrategy {

  
  @JsonProperty("send_after_time")
  private String sendAfterTime = null;
  
  
  @JsonProperty("send_before_time")
  private String sendBeforeTime = null;
  
  
  @JsonProperty("no_tz_send_now")
  private Boolean noTzSendNow = null;
  
  public PushTimeLimitStrategy sendAfterTime(String sendAfterTime) {
    this.sendAfterTime = sendAfterTime;
    return this;
  }

  
  /**
  * Get sendAfterTime
  * @return sendAfterTime
  **/
  public String getSendAfterTime() {
    return sendAfterTime;
  }
  public void setSendAfterTime(String sendAfterTime) {
    this.sendAfterTime = sendAfterTime;
  }
  
  public PushTimeLimitStrategy sendBeforeTime(String sendBeforeTime) {
    this.sendBeforeTime = sendBeforeTime;
    return this;
  }

  
  /**
  * Get sendBeforeTime
  * @return sendBeforeTime
  **/
  public String getSendBeforeTime() {
    return sendBeforeTime;
  }
  public void setSendBeforeTime(String sendBeforeTime) {
    this.sendBeforeTime = sendBeforeTime;
  }
  
  public PushTimeLimitStrategy noTzSendNow(Boolean noTzSendNow) {
    this.noTzSendNow = noTzSendNow;
    return this;
  }

  
  /**
  * If device timezone is not set - send push now, by default will be dropped.
  * @return noTzSendNow
  **/
  public Boolean isNoTzSendNow() {
    return noTzSendNow;
  }
  public void setNoTzSendNow(Boolean noTzSendNow) {
    this.noTzSendNow = noTzSendNow;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushTimeLimitStrategy pushTimeLimitStrategy = (PushTimeLimitStrategy) o;
    return Objects.equals(this.sendAfterTime, pushTimeLimitStrategy.sendAfterTime) &&
        Objects.equals(this.sendBeforeTime, pushTimeLimitStrategy.sendBeforeTime) &&
        Objects.equals(this.noTzSendNow, pushTimeLimitStrategy.noTzSendNow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendAfterTime, sendBeforeTime, noTzSendNow);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushTimeLimitStrategy {\n");
    
    sb.append("    sendAfterTime: ").append(toIndentedString(sendAfterTime)).append("\n");
    sb.append("    sendBeforeTime: ").append(toIndentedString(sendBeforeTime)).append("\n");
    sb.append("    noTzSendNow: ").append(toIndentedString(noTzSendNow)).append("\n");
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



