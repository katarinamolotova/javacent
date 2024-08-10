package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Connection state
 */
public class ConnectionState {

  /**
   * Channels client subscribed to
   */
  @JsonProperty("channels")
  private Map<String, ChannelContext> channels;

  /**
   * Information about connection token
   */
  @JsonProperty("connection_token")
  private ConnectionTokenInfo connectionToken;

  /**
   * Information about channel tokens used to subscribe
   */
  @JsonProperty("subscription_tokens")
  private Map<String, SubscriptionTokenInfo> subscriptionTokens;

  /**
   * Meta information attached to a connection
   */
  @JsonProperty("meta")
  private Object meta;

  public ConnectionState(
          Map<String, ChannelContext> channels,
          ConnectionTokenInfo connectionToken,
          Map<String, SubscriptionTokenInfo> subscriptionTokens,
          Object meta
  ) {
    this.channels = channels;
    this.connectionToken = connectionToken;
    this.subscriptionTokens = subscriptionTokens;
    this.meta = meta;
  }

  public ConnectionState() {
  }

  public Map<String, ChannelContext> getChannels() {
    return this.channels;
  }

  public ConnectionTokenInfo getConnectionToken() {
    return this.connectionToken;
  }

  public Map<String, SubscriptionTokenInfo> getSubscriptionTokens() {
    return this.subscriptionTokens;
  }

  public Object getMeta() {
    return this.meta;
  }

  @JsonProperty("channels")
  public void setChannels(Map<String, ChannelContext> channels) {
    this.channels = channels;
  }

  @JsonProperty("connection_token")
  public void setConnectionToken(ConnectionTokenInfo connectionToken) {
    this.connectionToken = connectionToken;
  }

  @JsonProperty("subscription_tokens")
  public void setSubscriptionTokens(Map<String, SubscriptionTokenInfo> subscriptionTokens) {
    this.subscriptionTokens = subscriptionTokens;
  }

  @JsonProperty("meta")
  public void setMeta(Object meta) {
    this.meta = meta;
  }
}