package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubscriptionTokenInfo
 */
public class SubscriptionTokenInfo {

  
  @JsonProperty("uid")
  private String uid = null;
  
  
  @JsonProperty("issued_at")
  private Integer issuedAt = null;
  
  public SubscriptionTokenInfo uid(String uid) {
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
  
  public SubscriptionTokenInfo issuedAt(Integer issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  
  /**
  * Get issuedAt
  * @return issuedAt
  **/
  public Integer getIssuedAt() {
    return issuedAt;
  }
  public void setIssuedAt(Integer issuedAt) {
    this.issuedAt = issuedAt;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionTokenInfo subscriptionTokenInfo = (SubscriptionTokenInfo) o;
    return Objects.equals(this.uid, subscriptionTokenInfo.uid) &&
        Objects.equals(this.issuedAt, subscriptionTokenInfo.issuedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, issuedAt);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionTokenInfo {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
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



