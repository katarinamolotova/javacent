
package org.centrifugo.models.requests.publication;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PublishRequest
 */
public class PublishRequest<T> extends DataRequestAbstract<T> {

  
  @JsonProperty("channel")
  private String channel = null;
  
  
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

  public PublishRequest<T> channel(String channel) {
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

  public PublishRequest<T> data(T data) {
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

  public PublishRequest<T> b64data(String b64data) {
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

  public PublishRequest<T> skipHistory(Boolean skipHistory) {
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

  public PublishRequest<T> tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public PublishRequest<T> putTagsItem(String key, String tagsItem) {

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

  public PublishRequest<T> idempotencyKey(String idempotencyKey) {
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

  public PublishRequest<T> delta(Boolean delta) {
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
    PublishRequest<T> publishRequest = (PublishRequest<T>) o;
    return Objects.equals(this.channel, publishRequest.channel) &&
        Objects.equals(this.data, publishRequest.data) &&
        Objects.equals(this.b64data, publishRequest.b64data) &&
        Objects.equals(this.skipHistory, publishRequest.skipHistory) &&
        Objects.equals(this.tags, publishRequest.tags) &&
        Objects.equals(this.idempotencyKey, publishRequest.idempotencyKey) &&
        Objects.equals(this.delta, publishRequest.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, data, b64data, skipHistory, tags, idempotencyKey, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishRequest {\n");

    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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



