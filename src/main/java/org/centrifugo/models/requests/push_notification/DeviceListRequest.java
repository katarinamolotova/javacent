package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * DeviceListRequest
 */
public class DeviceListRequest implements RequestModel {

  
  @JsonProperty("filter")
  private DeviceFilter filter = null;
  
  
  @JsonProperty("include_total_count")
  private Boolean includeTotalCount = null;
  
  
  @JsonProperty("include_meta")
  private Boolean includeMeta = null;
  
  
  @JsonProperty("include_topics")
  private Boolean includeTopics = null;
  
  
  @JsonProperty("cursor")
  private String cursor = null;
  
  
  @JsonProperty("limit")
  private Integer limit = null;
  
  public DeviceListRequest filter(DeviceFilter filter) {
    this.filter = filter;
    return this;
  }

  
  /**
  * Get filter
  * @return filter
  **/
  public DeviceFilter getFilter() {
    return filter;
  }
  public void setFilter(DeviceFilter filter) {
    this.filter = filter;
  }
  
  public DeviceListRequest includeTotalCount(Boolean includeTotalCount) {
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
  
  public DeviceListRequest includeMeta(Boolean includeMeta) {
    this.includeMeta = includeMeta;
    return this;
  }

  
  /**
  * Get includeMeta
  * @return includeMeta
  **/
  public Boolean isIncludeMeta() {
    return includeMeta;
  }
  public void setIncludeMeta(Boolean includeMeta) {
    this.includeMeta = includeMeta;
  }
  
  public DeviceListRequest includeTopics(Boolean includeTopics) {
    this.includeTopics = includeTopics;
    return this;
  }

  
  /**
  * Get includeTopics
  * @return includeTopics
  **/
  public Boolean isIncludeTopics() {
    return includeTopics;
  }
  public void setIncludeTopics(Boolean includeTopics) {
    this.includeTopics = includeTopics;
  }
  
  public DeviceListRequest cursor(String cursor) {
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
  
  public DeviceListRequest limit(Integer limit) {
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
    DeviceListRequest deviceListRequest = (DeviceListRequest) o;
    return Objects.equals(this.filter, deviceListRequest.filter) &&
        Objects.equals(this.includeTotalCount, deviceListRequest.includeTotalCount) &&
        Objects.equals(this.includeMeta, deviceListRequest.includeMeta) &&
        Objects.equals(this.includeTopics, deviceListRequest.includeTopics) &&
        Objects.equals(this.cursor, deviceListRequest.cursor) &&
        Objects.equals(this.limit, deviceListRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, includeTotalCount, includeMeta, includeTopics, cursor, limit);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceListRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeTotalCount: ").append(toIndentedString(includeTotalCount)).append("\n");
    sb.append("    includeMeta: ").append(toIndentedString(includeMeta)).append("\n");
    sb.append("    includeTopics: ").append(toIndentedString(includeTopics)).append("\n");
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



