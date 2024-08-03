package org.centrifugo.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DisconnectRequest
 */
public class DisconnectRequest implements RequestModel {


  @JsonProperty("user")
  private String user = null;


  @JsonProperty("disconnect")
  private Disconnect disconnect = null;


  @JsonProperty("client")
  private String client = null;


  @JsonProperty("whitelist")
  private List<String> whitelist = null;


  @JsonProperty("session")
  private String session = null;

  public DisconnectRequest user(String user) {
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

  public DisconnectRequest disconnect(Disconnect disconnect) {
    this.disconnect = disconnect;
    return this;
  }


  /**
  * Get disconnect
  * @return disconnect
  **/
  public Disconnect getDisconnect() {
    return disconnect;
  }
  public void setDisconnect(Disconnect disconnect) {
    this.disconnect = disconnect;
  }

  public DisconnectRequest client(String client) {
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

  public DisconnectRequest whitelist(List<String> whitelist) {
    this.whitelist = whitelist;
    return this;
  }

  public DisconnectRequest addWhitelistItem(String whitelistItem) {

    if (this.whitelist == null) {
      this.whitelist = new ArrayList<String>();
    }

    this.whitelist.add(whitelistItem);
    return this;
  }

  /**
  * Get whitelist
  * @return whitelist
  **/
  public List<String> getWhitelist() {
    return whitelist;
  }
  public void setWhitelist(List<String> whitelist) {
    this.whitelist = whitelist;
  }

  public DisconnectRequest session(String session) {
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
    DisconnectRequest disconnectRequest = (DisconnectRequest) o;
    return Objects.equals(this.user, disconnectRequest.user) &&
        Objects.equals(this.disconnect, disconnectRequest.disconnect) &&
        Objects.equals(this.client, disconnectRequest.client) &&
        Objects.equals(this.whitelist, disconnectRequest.whitelist) &&
        Objects.equals(this.session, disconnectRequest.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, disconnect, client, whitelist, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisconnectRequest {\n");

    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    disconnect: ").append(toIndentedString(disconnect)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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



