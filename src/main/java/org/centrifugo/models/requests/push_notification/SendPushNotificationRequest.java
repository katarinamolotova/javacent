package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SendPushNotificationRequest
 */
public class SendPushNotificationRequest implements RequestModel {

  
  @JsonProperty("recipient")
  private PushRecipient recipient = null;
  
  
  @JsonProperty("notification")
  private PushNotification notification = null;
  
  
  @JsonProperty("uid")
  private String uid = null;
  
  
  @JsonProperty("send_at")
  private Integer sendAt = null;
  
  
  @JsonProperty("optimize_for_reliability")
  private Boolean optimizeForReliability = null;
  
  
  @JsonProperty("limit_strategy")
  private PushLimitStrategy limitStrategy = null;
  
  
  @JsonProperty("analytics_uid")
  private String analyticsUid = null;
  
  
  @JsonProperty("localizations")
  private Map<String, PushLocalization> localizations = null;
  
  
  @JsonProperty("use_templating")
  private Boolean useTemplating = null;
  
  
  @JsonProperty("use_meta")
  private Boolean useMeta = null;
  
  public SendPushNotificationRequest recipient(PushRecipient recipient) {
    this.recipient = recipient;
    return this;
  }

  
  /**
  * Get recipient
  * @return recipient
  **/
  public PushRecipient getRecipient() {
    return recipient;
  }
  public void setRecipient(PushRecipient recipient) {
    this.recipient = recipient;
  }
  
  public SendPushNotificationRequest notification(PushNotification notification) {
    this.notification = notification;
    return this;
  }

  
  /**
  * Get notification
  * @return notification
  **/
  public PushNotification getNotification() {
    return notification;
  }
  public void setNotification(PushNotification notification) {
    this.notification = notification;
  }
  
  public SendPushNotificationRequest uid(String uid) {
    this.uid = uid;
    return this;
  }

  
  /**
  * unique identifier for each push notification request, can be used to cancel push.
  * @return uid
  **/
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }
  
  public SendPushNotificationRequest sendAt(Integer sendAt) {
    this.sendAt = sendAt;
    return this;
  }

  
  /**
  * Unix seconds, if set - push will be sent at this time, if not set - immediately.
  * @return sendAt
  **/
  public Integer getSendAt() {
    return sendAt;
  }
  public void setSendAt(Integer sendAt) {
    this.sendAt = sendAt;
  }
  
  public SendPushNotificationRequest optimizeForReliability(Boolean optimizeForReliability) {
    this.optimizeForReliability = optimizeForReliability;
    return this;
  }

  
  /**
  * makes processing heavier, but tolerates edge cases, like not loosing inflight pushes due to temporary queue unavailability.
  * @return optimizeForReliability
  **/
  public Boolean isOptimizeForReliability() {
    return optimizeForReliability;
  }
  public void setOptimizeForReliability(Boolean optimizeForReliability) {
    this.optimizeForReliability = optimizeForReliability;
  }
  
  public SendPushNotificationRequest limitStrategy(PushLimitStrategy limitStrategy) {
    this.limitStrategy = limitStrategy;
    return this;
  }

  
  /**
  * Get limitStrategy
  * @return limitStrategy
  **/
  public PushLimitStrategy getLimitStrategy() {
    return limitStrategy;
  }
  public void setLimitStrategy(PushLimitStrategy limitStrategy) {
    this.limitStrategy = limitStrategy;
  }
  
  public SendPushNotificationRequest analyticsUid(String analyticsUid) {
    this.analyticsUid = analyticsUid;
    return this;
  }

  
  /**
  * uid for push notification analytics, if not set - Centrifugo will use uid field.
  * @return analyticsUid
  **/
  public String getAnalyticsUid() {
    return analyticsUid;
  }
  public void setAnalyticsUid(String analyticsUid) {
    this.analyticsUid = analyticsUid;
  }
  
  public SendPushNotificationRequest localizations(Map<String, PushLocalization> localizations) {
    this.localizations = localizations;
    return this;
  }

  public SendPushNotificationRequest putLocalizationsItem(String key, PushLocalization localizationsItem) {
    
    if (this.localizations == null) {
      this.localizations = new HashMap<String, PushLocalization>();
    }
    
    this.localizations.put(key, localizationsItem);
    return this;
  }
  /**
  * optional per language/locale localizations for push notification.
  * @return localizations
  **/
  public Map<String, PushLocalization> getLocalizations() {
    return localizations;
  }
  public void setLocalizations(Map<String, PushLocalization> localizations) {
    this.localizations = localizations;
  }
  
  public SendPushNotificationRequest useTemplating(Boolean useTemplating) {
    this.useTemplating = useTemplating;
    return this;
  }

  
  /**
  * if set - Centrifugo will use templating for push notification. Note that setting localizations enables templating automatically.
  * @return useTemplating
  **/
  public Boolean isUseTemplating() {
    return useTemplating;
  }
  public void setUseTemplating(Boolean useTemplating) {
    this.useTemplating = useTemplating;
  }
  
  public SendPushNotificationRequest useMeta(Boolean useMeta) {
    this.useMeta = useMeta;
    return this;
  }

  
  /**
  * if set - Centrifugo will additionally load device meta during push sending, this meta becomes available in templating.
  * @return useMeta
  **/
  public Boolean isUseMeta() {
    return useMeta;
  }
  public void setUseMeta(Boolean useMeta) {
    this.useMeta = useMeta;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendPushNotificationRequest sendPushNotificationRequest = (SendPushNotificationRequest) o;
    return Objects.equals(this.recipient, sendPushNotificationRequest.recipient) &&
        Objects.equals(this.notification, sendPushNotificationRequest.notification) &&
        Objects.equals(this.uid, sendPushNotificationRequest.uid) &&
        Objects.equals(this.sendAt, sendPushNotificationRequest.sendAt) &&
        Objects.equals(this.optimizeForReliability, sendPushNotificationRequest.optimizeForReliability) &&
        Objects.equals(this.limitStrategy, sendPushNotificationRequest.limitStrategy) &&
        Objects.equals(this.analyticsUid, sendPushNotificationRequest.analyticsUid) &&
        Objects.equals(this.localizations, sendPushNotificationRequest.localizations) &&
        Objects.equals(this.useTemplating, sendPushNotificationRequest.useTemplating) &&
        Objects.equals(this.useMeta, sendPushNotificationRequest.useMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, notification, uid, sendAt, optimizeForReliability, limitStrategy, analyticsUid, localizations, useTemplating, useMeta);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendPushNotificationRequest {\n");
    
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    sendAt: ").append(toIndentedString(sendAt)).append("\n");
    sb.append("    optimizeForReliability: ").append(toIndentedString(optimizeForReliability)).append("\n");
    sb.append("    limitStrategy: ").append(toIndentedString(limitStrategy)).append("\n");
    sb.append("    analyticsUid: ").append(toIndentedString(analyticsUid)).append("\n");
    sb.append("    localizations: ").append(toIndentedString(localizations)).append("\n");
    sb.append("    useTemplating: ").append(toIndentedString(useTemplating)).append("\n");
    sb.append("    useMeta: ").append(toIndentedString(useMeta)).append("\n");
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



