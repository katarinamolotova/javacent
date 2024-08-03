package org.centrifugo.models.requests.user_block;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * BlockUserRequest
 */
public class BlockUserRequest implements RequestModel {

  
  @JsonProperty("expire_at")
  private Integer expireAt = null;
  
  
  @JsonProperty("user")
  private String user = null;
  
  public BlockUserRequest expireAt(Integer expireAt) {
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
  
  public BlockUserRequest user(String user) {
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
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockUserRequest blockUserRequest = (BlockUserRequest) o;
    return Objects.equals(this.expireAt, blockUserRequest.expireAt) &&
        Objects.equals(this.user, blockUserRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireAt, user);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockUserRequest {\n");
    
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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



