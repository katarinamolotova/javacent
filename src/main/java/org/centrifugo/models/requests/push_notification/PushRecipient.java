package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PushRecipient
 */
public class PushRecipient {

  
  @JsonProperty("filter")
  private DeviceFilter filter = null;
  
  
  @JsonProperty("fcm_tokens")
  private List<String> fcmTokens = null;
  
  
  @JsonProperty("fcm_topic")
  private String fcmTopic = null;
  
  
  @JsonProperty("fcm_condition")
  private String fcmCondition = null;
  
  
  @JsonProperty("hms_tokens")
  private List<String> hmsTokens = null;
  
  
  @JsonProperty("hms_topic")
  private String hmsTopic = null;
  
  
  @JsonProperty("hms_condition")
  private String hmsCondition = null;
  
  
  @JsonProperty("apns_tokens")
  private List<String> apnsTokens = null;
  
  public PushRecipient filter(DeviceFilter filter) {
    this.filter = filter;
    return this;
  }

  
  /**
  * Get filter
  * @return filter
  **/
  public DeviceFilter getFilter() {
    return filter;
  }
  public void setFilter(DeviceFilter filter) {
    this.filter = filter;
  }
  
  public PushRecipient fcmTokens(List<String> fcmTokens) {
    this.fcmTokens = fcmTokens;
    return this;
  }

  public PushRecipient addFcmTokensItem(String fcmTokensItem) {
    
    if (this.fcmTokens == null) {
      this.fcmTokens = new ArrayList<String>();
    }
    
    this.fcmTokens.add(fcmTokensItem);
    return this;
  }
  
  /**
  * Get fcmTokens
  * @return fcmTokens
  **/
  public List<String> getFcmTokens() {
    return fcmTokens;
  }
  public void setFcmTokens(List<String> fcmTokens) {
    this.fcmTokens = fcmTokens;
  }
  
  public PushRecipient fcmTopic(String fcmTopic) {
    this.fcmTopic = fcmTopic;
    return this;
  }

  
  /**
  * Get fcmTopic
  * @return fcmTopic
  **/
  public String getFcmTopic() {
    return fcmTopic;
  }
  public void setFcmTopic(String fcmTopic) {
    this.fcmTopic = fcmTopic;
  }
  
  public PushRecipient fcmCondition(String fcmCondition) {
    this.fcmCondition = fcmCondition;
    return this;
  }

  
  /**
  * Get fcmCondition
  * @return fcmCondition
  **/
  public String getFcmCondition() {
    return fcmCondition;
  }
  public void setFcmCondition(String fcmCondition) {
    this.fcmCondition = fcmCondition;
  }
  
  public PushRecipient hmsTokens(List<String> hmsTokens) {
    this.hmsTokens = hmsTokens;
    return this;
  }

  public PushRecipient addHmsTokensItem(String hmsTokensItem) {
    
    if (this.hmsTokens == null) {
      this.hmsTokens = new ArrayList<String>();
    }
    
    this.hmsTokens.add(hmsTokensItem);
    return this;
  }
  
  /**
  * Get hmsTokens
  * @return hmsTokens
  **/
  public List<String> getHmsTokens() {
    return hmsTokens;
  }
  public void setHmsTokens(List<String> hmsTokens) {
    this.hmsTokens = hmsTokens;
  }
  
  public PushRecipient hmsTopic(String hmsTopic) {
    this.hmsTopic = hmsTopic;
    return this;
  }

  
  /**
  * Get hmsTopic
  * @return hmsTopic
  **/
  public String getHmsTopic() {
    return hmsTopic;
  }
  public void setHmsTopic(String hmsTopic) {
    this.hmsTopic = hmsTopic;
  }
  
  public PushRecipient hmsCondition(String hmsCondition) {
    this.hmsCondition = hmsCondition;
    return this;
  }

  
  /**
  * Get hmsCondition
  * @return hmsCondition
  **/
  public String getHmsCondition() {
    return hmsCondition;
  }
  public void setHmsCondition(String hmsCondition) {
    this.hmsCondition = hmsCondition;
  }
  
  public PushRecipient apnsTokens(List<String> apnsTokens) {
    this.apnsTokens = apnsTokens;
    return this;
  }

  public PushRecipient addApnsTokensItem(String apnsTokensItem) {
    
    if (this.apnsTokens == null) {
      this.apnsTokens = new ArrayList<String>();
    }
    
    this.apnsTokens.add(apnsTokensItem);
    return this;
  }
  
  /**
  * Get apnsTokens
  * @return apnsTokens
  **/
  public List<String> getApnsTokens() {
    return apnsTokens;
  }
  public void setApnsTokens(List<String> apnsTokens) {
    this.apnsTokens = apnsTokens;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushRecipient pushRecipient = (PushRecipient) o;
    return Objects.equals(this.filter, pushRecipient.filter) &&
        Objects.equals(this.fcmTokens, pushRecipient.fcmTokens) &&
        Objects.equals(this.fcmTopic, pushRecipient.fcmTopic) &&
        Objects.equals(this.fcmCondition, pushRecipient.fcmCondition) &&
        Objects.equals(this.hmsTokens, pushRecipient.hmsTokens) &&
        Objects.equals(this.hmsTopic, pushRecipient.hmsTopic) &&
        Objects.equals(this.hmsCondition, pushRecipient.hmsCondition) &&
        Objects.equals(this.apnsTokens, pushRecipient.apnsTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, fcmTokens, fcmTopic, fcmCondition, hmsTokens, hmsTopic, hmsCondition, apnsTokens);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushRecipient {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    fcmTokens: ").append(toIndentedString(fcmTokens)).append("\n");
    sb.append("    fcmTopic: ").append(toIndentedString(fcmTopic)).append("\n");
    sb.append("    fcmCondition: ").append(toIndentedString(fcmCondition)).append("\n");
    sb.append("    hmsTokens: ").append(toIndentedString(hmsTokens)).append("\n");
    sb.append("    hmsTopic: ").append(toIndentedString(hmsTopic)).append("\n");
    sb.append("    hmsCondition: ").append(toIndentedString(hmsCondition)).append("\n");
    sb.append("    apnsTokens: ").append(toIndentedString(apnsTokens)).append("\n");
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



