package org.centrifugo.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;
import org.centrifugo.models.requests.history.StreamPosition;

import java.util.Objects;

/**
 * SubscribeRequest
 */
public class SubscribeRequest implements RequestModel {

  
  @JsonProperty("channel")
  private String channel = null;
  
  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("expire_at")
  private Integer expireAt = null;
  
  
  @JsonProperty("info")
  private Object info = null;
  
  
  @JsonProperty("b64info")
  private String b64info = null;
  
  
  @JsonProperty("client")
  private String client = null;
  
  
  @JsonProperty("data")
  private Object data = null;
  
  
  @JsonProperty("b64data")
  private String b64data = null;
  
  
  @JsonProperty("recover_since")
  private StreamPosition recoverSince = null;
  
  
  @JsonProperty("override")
  private SubscribeOptionOverride override = null;
  
  
  @JsonProperty("session")
  private String session = null;
  
  public SubscribeRequest channel(String channel) {
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
  
  public SubscribeRequest user(String user) {
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
  
  public SubscribeRequest expireAt(Integer expireAt) {
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
  
  public SubscribeRequest info(Object info) {
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
  
  public SubscribeRequest b64info(String b64info) {
    this.b64info = b64info;
    return this;
  }

  
  /**
  * Get b64info
  * @return b64info
  **/
  public String getB64info() {
    return b64info;
  }
  public void setB64info(String b64info) {
    this.b64info = b64info;
  }
  
  public SubscribeRequest client(String client) {
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
  
  public SubscribeRequest data(Object data) {
    this.data = data;
    return this;
  }

  
  /**
  * Get data
  * @return data
  **/
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }
  
  public SubscribeRequest b64data(String b64data) {
    this.b64data = b64data;
    return this;
  }

  
  /**
  * Get b64data
  * @return b64data
  **/
  public String getB64data() {
    return b64data;
  }
  public void setB64data(String b64data) {
    this.b64data = b64data;
  }
  
  public SubscribeRequest recoverSince(StreamPosition recoverSince) {
    this.recoverSince = recoverSince;
    return this;
  }

  
  /**
  * Get recoverSince
  * @return recoverSince
  **/
  public StreamPosition getRecoverSince() {
    return recoverSince;
  }
  public void setRecoverSince(StreamPosition recoverSince) {
    this.recoverSince = recoverSince;
  }
  
  public SubscribeRequest override(SubscribeOptionOverride override) {
    this.override = override;
    return this;
  }

  
  /**
  * Get override
  * @return override
  **/
  public SubscribeOptionOverride getOverride() {
    return override;
  }
  public void setOverride(SubscribeOptionOverride override) {
    this.override = override;
  }
  
  public SubscribeRequest session(String session) {
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
    SubscribeRequest subscribeRequest = (SubscribeRequest) o;
    return Objects.equals(this.channel, subscribeRequest.channel) &&
        Objects.equals(this.user, subscribeRequest.user) &&
        Objects.equals(this.expireAt, subscribeRequest.expireAt) &&
        Objects.equals(this.info, subscribeRequest.info) &&
        Objects.equals(this.b64info, subscribeRequest.b64info) &&
        Objects.equals(this.client, subscribeRequest.client) &&
        Objects.equals(this.data, subscribeRequest.data) &&
        Objects.equals(this.b64data, subscribeRequest.b64data) &&
        Objects.equals(this.recoverSince, subscribeRequest.recoverSince) &&
        Objects.equals(this.override, subscribeRequest.override) &&
        Objects.equals(this.session, subscribeRequest.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, user, expireAt, info, b64info, client, data, b64data, recoverSince, override, session);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeRequest {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    b64info: ").append(toIndentedString(b64info)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    b64data: ").append(toIndentedString(b64data)).append("\n");
    sb.append("    recoverSince: ").append(toIndentedString(recoverSince)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
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



