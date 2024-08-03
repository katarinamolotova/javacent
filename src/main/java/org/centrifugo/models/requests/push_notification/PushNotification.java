package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PushNotification
 */
public class PushNotification {

  
  @JsonProperty("fcm")
  private FcmPushNotification fcm = null;
  
  
  @JsonProperty("hms")
  private HmsPushNotification hms = null;
  
  
  @JsonProperty("apns")
  private ApnsPushNotification apns = null;
  
  
  @JsonProperty("expire_at")
  private Integer expireAt = null;
  
  public PushNotification fcm(FcmPushNotification fcm) {
    this.fcm = fcm;
    return this;
  }

  
  /**
  * Get fcm
  * @return fcm
  **/
  public FcmPushNotification getFcm() {
    return fcm;
  }
  public void setFcm(FcmPushNotification fcm) {
    this.fcm = fcm;
  }
  
  public PushNotification hms(HmsPushNotification hms) {
    this.hms = hms;
    return this;
  }

  
  /**
  * Get hms
  * @return hms
  **/
  public HmsPushNotification getHms() {
    return hms;
  }
  public void setHms(HmsPushNotification hms) {
    this.hms = hms;
  }
  
  public PushNotification apns(ApnsPushNotification apns) {
    this.apns = apns;
    return this;
  }

  
  /**
  * Get apns
  * @return apns
  **/
  public ApnsPushNotification getApns() {
    return apns;
  }
  public void setApns(ApnsPushNotification apns) {
    this.apns = apns;
  }
  
  public PushNotification expireAt(Integer expireAt) {
    this.expireAt = expireAt;
    return this;
  }

  
  /**
  * timestamp in the future when Centrifugo should stop trying to send push notification.
  * @return expireAt
  **/
  public Integer getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Integer expireAt) {
    this.expireAt = expireAt;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushNotification pushNotification = (PushNotification) o;
    return Objects.equals(this.fcm, pushNotification.fcm) &&
        Objects.equals(this.hms, pushNotification.hms) &&
        Objects.equals(this.apns, pushNotification.apns) &&
        Objects.equals(this.expireAt, pushNotification.expireAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fcm, hms, apns, expireAt);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushNotification {\n");
    
    sb.append("    fcm: ").append(toIndentedString(fcm)).append("\n");
    sb.append("    hms: ").append(toIndentedString(hms)).append("\n");
    sb.append("    apns: ").append(toIndentedString(apns)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
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



