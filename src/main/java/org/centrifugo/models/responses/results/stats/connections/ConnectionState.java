package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ConnectionState
 */
public class ConnectionState {

  
  @JsonProperty("channels")
  private Map<String, ChannelContext> channels = null;
  
  
  @JsonProperty("connection_token")
  private ConnectionTokenInfo connectionToken = null;
  
  
  @JsonProperty("subscription_tokens")
  private Map<String, SubscriptionTokenInfo> subscriptionTokens = null;
  
  
  @JsonProperty("meta")
  private Object meta = null;
  
  public ConnectionState channels(Map<String, ChannelContext> channels) {
    this.channels = channels;
    return this;
  }

  public ConnectionState putChannelsItem(String key, ChannelContext channelsItem) {
    
    if (this.channels == null) {
      this.channels = new HashMap<String, ChannelContext>();
    }
    
    this.channels.put(key, channelsItem);
    return this;
  }
  /**
  * Get channels
  * @return channels
  **/
  public Map<String, ChannelContext> getChannels() {
    return channels;
  }
  public void setChannels(Map<String, ChannelContext> channels) {
    this.channels = channels;
  }
  
  public ConnectionState connectionToken(ConnectionTokenInfo connectionToken) {
    this.connectionToken = connectionToken;
    return this;
  }

  
  /**
  * Get connectionToken
  * @return connectionToken
  **/
  public ConnectionTokenInfo getConnectionToken() {
    return connectionToken;
  }
  public void setConnectionToken(ConnectionTokenInfo connectionToken) {
    this.connectionToken = connectionToken;
  }
  
  public ConnectionState subscriptionTokens(Map<String, SubscriptionTokenInfo> subscriptionTokens) {
    this.subscriptionTokens = subscriptionTokens;
    return this;
  }

  public ConnectionState putSubscriptionTokensItem(String key, SubscriptionTokenInfo subscriptionTokensItem) {
    
    if (this.subscriptionTokens == null) {
      this.subscriptionTokens = new HashMap<String, SubscriptionTokenInfo>();
    }
    
    this.subscriptionTokens.put(key, subscriptionTokensItem);
    return this;
  }
  /**
  * Get subscriptionTokens
  * @return subscriptionTokens
  **/
  public Map<String, SubscriptionTokenInfo> getSubscriptionTokens() {
    return subscriptionTokens;
  }
  public void setSubscriptionTokens(Map<String, SubscriptionTokenInfo> subscriptionTokens) {
    this.subscriptionTokens = subscriptionTokens;
  }
  
  public ConnectionState meta(Object meta) {
    this.meta = meta;
    return this;
  }

  
  /**
  * Get meta
  * @return meta
  **/
  public Object getMeta() {
    return meta;
  }
  public void setMeta(Object meta) {
    this.meta = meta;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionState connectionState = (ConnectionState) o;
    return Objects.equals(this.channels, connectionState.channels) &&
        Objects.equals(this.connectionToken, connectionState.connectionToken) &&
        Objects.equals(this.subscriptionTokens, connectionState.subscriptionTokens) &&
        Objects.equals(this.meta, connectionState.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, connectionToken, subscriptionTokens, meta);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionState {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    connectionToken: ").append(toIndentedString(connectionToken)).append("\n");
    sb.append("    subscriptionTokens: ").append(toIndentedString(subscriptionTokens)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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



