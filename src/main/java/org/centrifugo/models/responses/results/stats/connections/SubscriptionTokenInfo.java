package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubscriptionTokenInfo {

  @JsonProperty("uid")
  private String uid;

  @JsonProperty("issued_at")
  private Integer issuedAt;

  public SubscriptionTokenInfo(String uid, Integer issuedAt) {
    this.uid = uid;
    this.issuedAt = issuedAt;
  }

  public SubscriptionTokenInfo() {
  }

  public String getUid() {
    return this.uid;
  }

  public Integer getIssuedAt() {
    return this.issuedAt;
  }

  @JsonProperty("uid")
  public void setUid(String uid) {
    this.uid = uid;
  }

  @JsonProperty("issued_at")
  public void setIssuedAt(Integer issuedAt) {
    this.issuedAt = issuedAt;
  }
}