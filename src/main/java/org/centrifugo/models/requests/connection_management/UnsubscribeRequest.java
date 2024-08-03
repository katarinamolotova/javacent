package org.centrifugo.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * UnsubscribeRequest
 */
public class UnsubscribeRequest implements RequestModel {

  
  @JsonProperty("channel")
  private String channel = null;
  
  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("client")
  private String client = null;
  
  
  @JsonProperty("session")
  private String session = null;
  
  public UnsubscribeRequest channel(String channel) {
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
  
  public UnsubscribeRequest user(String user) {
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
  
  public UnsubscribeRequest client(String client) {
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
  
  public UnsubscribeRequest session(String session) {
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
    UnsubscribeRequest unsubscribeRequest = (UnsubscribeRequest) o;
    return Objects.equals(this.channel, unsubscribeRequest.channel) &&
        Objects.equals(this.user, unsubscribeRequest.user) &&
        Objects.equals(this.client, unsubscribeRequest.client) &&
        Objects.equals(this.session, unsubscribeRequest.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, user, client, session);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsubscribeRequest {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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



