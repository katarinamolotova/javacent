package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * DeviceTopicListRequest
 */
public class DeviceTopicListRequest implements RequestModel {

  
  @JsonProperty("filter")
  private DeviceTopicFilter filter = null;
  
  
  @JsonProperty("include_total_count")
  private Boolean includeTotalCount = null;
  
  
  @JsonProperty("include_device")
  private Boolean includeDevice = null;
  
  
  @JsonProperty("cursor")
  private String cursor = null;
  
  
  @JsonProperty("limit")
  private Integer limit = null;
  
  public DeviceTopicListRequest filter(DeviceTopicFilter filter) {
    this.filter = filter;
    return this;
  }

  
  /**
  * Get filter
  * @return filter
  **/
  public DeviceTopicFilter getFilter() {
    return filter;
  }
  public void setFilter(DeviceTopicFilter filter) {
    this.filter = filter;
  }
  
  public DeviceTopicListRequest includeTotalCount(Boolean includeTotalCount) {
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
  
  public DeviceTopicListRequest includeDevice(Boolean includeDevice) {
    this.includeDevice = includeDevice;
    return this;
  }

  
  /**
  * Get includeDevice
  * @return includeDevice
  **/
  public Boolean isIncludeDevice() {
    return includeDevice;
  }
  public void setIncludeDevice(Boolean includeDevice) {
    this.includeDevice = includeDevice;
  }
  
  public DeviceTopicListRequest cursor(String cursor) {
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
  
  public DeviceTopicListRequest limit(Integer limit) {
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
    DeviceTopicListRequest deviceTopicListRequest = (DeviceTopicListRequest) o;
    return Objects.equals(this.filter, deviceTopicListRequest.filter) &&
        Objects.equals(this.includeTotalCount, deviceTopicListRequest.includeTotalCount) &&
        Objects.equals(this.includeDevice, deviceTopicListRequest.includeDevice) &&
        Objects.equals(this.cursor, deviceTopicListRequest.cursor) &&
        Objects.equals(this.limit, deviceTopicListRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, includeTotalCount, includeDevice, cursor, limit);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTopicListRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeTotalCount: ").append(toIndentedString(includeTotalCount)).append("\n");
    sb.append("    includeDevice: ").append(toIndentedString(includeDevice)).append("\n");
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



