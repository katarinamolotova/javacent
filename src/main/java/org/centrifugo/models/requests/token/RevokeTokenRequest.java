package org.centrifugo.models.requests.token;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * RevokeTokenRequest
 */
public class RevokeTokenRequest implements RequestModel {

  
  @JsonProperty("expire_at")
  private Integer expireAt = null;
  
  
  @JsonProperty("uid")
  private String uid = null;
  
  public RevokeTokenRequest expireAt(Integer expireAt) {
    this.expireAt = expireAt;
    return this;
  }

  
  /**
  * Get expireAt
  * @return expireAt
  **/
  public Integer getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Integer expireAt) {
    this.expireAt = expireAt;
  }
  
  public RevokeTokenRequest uid(String uid) {
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
    RevokeTokenRequest revokeTokenRequest = (RevokeTokenRequest) o;
    return Objects.equals(this.expireAt, revokeTokenRequest.expireAt) &&
        Objects.equals(this.uid, revokeTokenRequest.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireAt, uid);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeTokenRequest {\n");
    
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
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



