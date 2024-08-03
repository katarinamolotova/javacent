package org.centrifugo.models.requests.token;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * InvalidateUserTokensRequest
 */
public class InvalidateUserTokensRequest implements RequestModel {

  
  @JsonProperty("expire_at")
  private Integer expireAt = null;
  
  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("issued_before")
  private Integer issuedBefore = null;
  
  
  @JsonProperty("channel")
  private String channel = null;
  
  public InvalidateUserTokensRequest expireAt(Integer expireAt) {
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
  
  public InvalidateUserTokensRequest user(String user) {
    this.user = user;
    return this;
  }

  
  /**
  * Get user
  * @return user
  **/
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  
  public InvalidateUserTokensRequest issuedBefore(Integer issuedBefore) {
    this.issuedBefore = issuedBefore;
    return this;
  }

  
  /**
  * Get issuedBefore
  * @return issuedBefore
  **/
  public Integer getIssuedBefore() {
    return issuedBefore;
  }
  public void setIssuedBefore(Integer issuedBefore) {
    this.issuedBefore = issuedBefore;
  }
  
  public InvalidateUserTokensRequest channel(String channel) {
    this.channel = channel;
    return this;
  }

  
  /**
  * Get channel
  * @return channel
  **/
  public String getChannel() {
    return channel;
  }
  public void setChannel(String channel) {
    this.channel = channel;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidateUserTokensRequest invalidateUserTokensRequest = (InvalidateUserTokensRequest) o;
    return Objects.equals(this.expireAt, invalidateUserTokensRequest.expireAt) &&
        Objects.equals(this.user, invalidateUserTokensRequest.user) &&
        Objects.equals(this.issuedBefore, invalidateUserTokensRequest.issuedBefore) &&
        Objects.equals(this.channel, invalidateUserTokensRequest.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireAt, user, issuedBefore, channel);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidateUserTokensRequest {\n");
    
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    issuedBefore: ").append(toIndentedString(issuedBefore)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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



