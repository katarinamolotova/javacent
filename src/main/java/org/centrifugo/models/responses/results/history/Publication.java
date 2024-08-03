package org.centrifugo.models.responses.results.history;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Publication
 */
public class Publication {

  
  @JsonProperty("data")
  private Object data = null;
  
  
  @JsonProperty("info")
  private ClientInfo info = null;
  
  
  @JsonProperty("offset")
  private Integer offset = null;
  
  
  @JsonProperty("tags")
  private Map<String, String> tags = null;
  
  public Publication data(Object data) {
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
  
  public Publication info(ClientInfo info) {
    this.info = info;
    return this;
  }

  
  /**
  * Get info
  * @return info
  **/
  public ClientInfo getInfo() {
    return info;
  }
  public void setInfo(ClientInfo info) {
    this.info = info;
  }
  
  public Publication offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  
  /**
  * Get offset
  * @return offset
  **/
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }
  
  public Publication tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Publication putTagsItem(String key, String tagsItem) {
    
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
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Publication publication = (Publication) o;
    return Objects.equals(this.data, publication.data) &&
        Objects.equals(this.info, publication.info) &&
        Objects.equals(this.offset, publication.offset) &&
        Objects.equals(this.tags, publication.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info, offset, tags);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Publication {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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



