package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * UserTopicListRequest
 */
public class UserTopicListRequest implements RequestModel {

  
  @JsonProperty("filter")
  private UserTopicFilter filter = null;
  
  
  @JsonProperty("include_total_count")
  private Boolean includeTotalCount = null;
  
  
  @JsonProperty("cursor")
  private String cursor = null;
  
  
  @JsonProperty("limit")
  private Integer limit = null;
  
  public UserTopicListRequest filter(UserTopicFilter filter) {
    this.filter = filter;
    return this;
  }

  
  /**
  * Get filter
  * @return filter
  **/
  public UserTopicFilter getFilter() {
    return filter;
  }
  public void setFilter(UserTopicFilter filter) {
    this.filter = filter;
  }
  
  public UserTopicListRequest includeTotalCount(Boolean includeTotalCount) {
    this.includeTotalCount = includeTotalCount;
    return this;
  }

  
  /**
  * Get includeTotalCount
  * @return includeTotalCount
  **/
  public Boolean isIncludeTotalCount() {
    return includeTotalCount;
  }
  public void setIncludeTotalCount(Boolean includeTotalCount) {
    this.includeTotalCount = includeTotalCount;
  }
  
  public UserTopicListRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  
  /**
  * Get cursor
  * @return cursor
  **/
  public String getCursor() {
    return cursor;
  }
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
  
  public UserTopicListRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  /**
  * Get limit
  * @return limit
  **/
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTopicListRequest userTopicListRequest = (UserTopicListRequest) o;
    return Objects.equals(this.filter, userTopicListRequest.filter) &&
        Objects.equals(this.includeTotalCount, userTopicListRequest.includeTotalCount) &&
        Objects.equals(this.cursor, userTopicListRequest.cursor) &&
        Objects.equals(this.limit, userTopicListRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, includeTotalCount, cursor, limit);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTopicListRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeTotalCount: ").append(toIndentedString(includeTotalCount)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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



