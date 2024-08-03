package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApnsPushNotification
 */
public class ApnsPushNotification {

  
  @JsonProperty("headers")
  private Map<String, String> headers = null;
  
  
  @JsonProperty("payload")
  private Object payload = null;
  
  public ApnsPushNotification headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public ApnsPushNotification putHeadersItem(String key, String headersItem) {
    
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    
    this.headers.put(key, headersItem);
    return this;
  }
  /**
  * Get headers
  * @return headers
  **/
  public Map<String, String> getHeaders() {
    return headers;
  }
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }
  
  public ApnsPushNotification payload(Object payload) {
    this.payload = payload;
    return this;
  }

  
  /**
  * Get payload
  * @return payload
  **/
  public Object getPayload() {
    return payload;
  }
  public void setPayload(Object payload) {
    this.payload = payload;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApnsPushNotification apnsPushNotification = (ApnsPushNotification) o;
    return Objects.equals(this.headers, apnsPushNotification.headers) &&
        Objects.equals(this.payload, apnsPushNotification.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, payload);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApnsPushNotification {\n");
    
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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



