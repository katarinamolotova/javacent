package org.centrifugo.models.requests.publication;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

/**
 * BroadcastRequest
 */
public class BroadcastRequest<T> extends DataRequestAbstract<T> {

  
  @JsonProperty("channels")
  private List<String> channels = null;
  
  
  @JsonProperty("data")
  private T data = null;
  
  
  @JsonProperty("b64data")
  private String b64data = null;
  
  
  @JsonProperty("skip_history")
  private Boolean skipHistory = null;
  
  
  @JsonProperty("tags")
  private Map<String, String> tags = null;
  
  
  @JsonProperty("idempotency_key")
  private String idempotencyKey = null;
  
  
  @JsonProperty("delta")
  private Boolean delta = null;
  
  public BroadcastRequest<T> channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public BroadcastRequest<T> addChannelsItem(String channelsItem) {
    
    if (this.channels == null) {
      this.channels = new ArrayList<String>();
    }
    
    this.channels.add(channelsItem);
    return this;
  }
  
  /**
  * Get channels
  * @return channels
  **/
  public List<String> getChannels() {
    return channels;
  }
  public void setChannels(List<String> channels) {
    this.channels = channels;
  }
  
  public BroadcastRequest<T> data(T data) {
    this.data = data;
    return this;
  }

  
  /**
  * Get data
  * @return data
  **/
  
  public T getData() {
    return data;
  }
  public void setData(T data) {
    this.data = data;
  }
  
  public BroadcastRequest<T> b64data(String b64data) {
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
  
  public BroadcastRequest<T> skipHistory(Boolean skipHistory) {
    this.skipHistory = skipHistory;
    return this;
  }

  
  /**
  * Get skipHistory
  * @return skipHistory
  **/
  
  public Boolean isSkipHistory() {
    return skipHistory;
  }
  public void setSkipHistory(Boolean skipHistory) {
    this.skipHistory = skipHistory;
  }
  
  public BroadcastRequest<T> tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public BroadcastRequest<T> putTagsItem(String key, String tagsItem) {
    
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    
    this.tags.put(key, tagsItem);
    return this;
  }
  /**
  * Get tags
  * @return tags
  **/
  
  public Map<String, String> getTags() {
    return tags;
  }
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }
  
  public BroadcastRequest<T> idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

  
  /**
  * Get idempotencyKey
  * @return idempotencyKey
  **/
  
  public String getIdempotencyKey() {
    return idempotencyKey;
  }
  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }
  
  public BroadcastRequest<T> delta(Boolean delta) {
    this.delta = delta;
    return this;
  }

  
  /**
  * Get delta
  * @return delta
  **/
  
  public Boolean isDelta() {
    return delta;
  }
  public void setDelta(Boolean delta) {
    this.delta = delta;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastRequest<T> broadcastRequest = (BroadcastRequest<T>) o;
    return Objects.equals(this.channels, broadcastRequest.channels) &&
        Objects.equals(this.data, broadcastRequest.data) &&
        Objects.equals(this.b64data, broadcastRequest.b64data) &&
        Objects.equals(this.skipHistory, broadcastRequest.skipHistory) &&
        Objects.equals(this.tags, broadcastRequest.tags) &&
        Objects.equals(this.idempotencyKey, broadcastRequest.idempotencyKey) &&
        Objects.equals(this.delta, broadcastRequest.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, data, b64data, skipHistory, tags, idempotencyKey, delta);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastRequest {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    b64data: ").append(toIndentedString(b64data)).append("\n");
    sb.append("    skipHistory: ").append(toIndentedString(skipHistory)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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



