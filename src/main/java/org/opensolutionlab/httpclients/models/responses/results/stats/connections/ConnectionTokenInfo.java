package org.opensolutionlab.httpclients.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Connection token info
 */
public class ConnectionTokenInfo {

  /**
   * Unique token ID (jti)
   */
  @JsonProperty("uid")
  private String uid;

  /**
   * Time (Unix seconds) when token was issued
   */
  @JsonProperty("issued_at")
  private Integer issuedAt;

  public ConnectionTokenInfo(String uid, Integer issuedAt) {
    this.uid = uid;
    this.issuedAt = issuedAt;
  }

  public ConnectionTokenInfo() {
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