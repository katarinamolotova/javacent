package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * CancelPushRequest
 */
public class CancelPushRequest implements RequestModel {

  
  @JsonProperty("uid")
  private String uid = null;
  
  public CancelPushRequest uid(String uid) {
    this.uid = uid;
    return this;
  }

  
  /**
  * Get uid
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
    CancelPushRequest cancelPushRequest = (CancelPushRequest) o;
    return Objects.equals(this.uid, cancelPushRequest.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPushRequest {\n");
    
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


