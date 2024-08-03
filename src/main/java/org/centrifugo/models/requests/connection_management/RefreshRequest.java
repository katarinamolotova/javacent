package org.centrifugo.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * RefreshRequest
 */
public class RefreshRequest implements RequestModel {

  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("client")
  private String client = null;
  
  
  @JsonProperty("expired")
  private Boolean expired = null;
  
  
  @JsonProperty("expire_at")
  private Integer expireAt = null;
  
  
  @JsonProperty("info")
  private Object info = null;
  
  
  @JsonProperty("session")
  private String session = null;
  
  public RefreshRequest user(String user) {
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
  
  public RefreshRequest client(String client) {
    this.client = client;
    return this;
  }

  
  /**
  * Get client
  * @return client
  **/
  public String getClient() {
    return client;
  }
  public void setClient(String client) {
    this.client = client;
  }
  
  public RefreshRequest expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

  
  /**
  * Get expired
  * @return expired
  **/
  public Boolean isExpired() {
    return expired;
  }
  public void setExpired(Boolean expired) {
    this.expired = expired;
  }
  
  public RefreshRequest expireAt(Integer expireAt) {
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
  
  public RefreshRequest info(Object info) {
    this.info = info;
    return this;
  }

  
  /**
  * Get info
  * @return info
  **/
  public Object getInfo() {
    return info;
  }
  public void setInfo(Object info) {
    this.info = info;
  }
  
  public RefreshRequest session(String session) {
    this.session = session;
    return this;
  }

  
  /**
  * Get session
  * @return session
  **/
  public String getSession() {
    return session;
  }
  public void setSession(String session) {
    this.session = session;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshRequest refreshRequest = (RefreshRequest) o;
    return Objects.equals(this.user, refreshRequest.user) &&
        Objects.equals(this.client, refreshRequest.client) &&
        Objects.equals(this.expired, refreshRequest.expired) &&
        Objects.equals(this.expireAt, refreshRequest.expireAt) &&
        Objects.equals(this.info, refreshRequest.info) &&
        Objects.equals(this.session, refreshRequest.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, client, expired, expireAt, info, session);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshRequest {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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



