package org.centrifugo.models.responses.results.push_notification.device_topic_list;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeviceTopicListResult
 */
public class DeviceTopicListResult {

  
  @JsonProperty("items")
  private List<DeviceTopic> items = null;
  
  
  @JsonProperty("next_cursor")
  private String nextCursor = null;
  
  
  @JsonProperty("total_count")
  private Integer totalCount = null;
  
  public DeviceTopicListResult items(List<DeviceTopic> items) {
    this.items = items;
    return this;
  }

  public DeviceTopicListResult addItemsItem(DeviceTopic itemsItem) {
    
    if (this.items == null) {
      this.items = new ArrayList<DeviceTopic>();
    }
    
    this.items.add(itemsItem);
    return this;
  }
  
  /**
  * Get items
  * @return items
  **/
  public List<DeviceTopic> getItems() {
    return items;
  }
  public void setItems(List<DeviceTopic> items) {
    this.items = items;
  }
  
  public DeviceTopicListResult nextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  
  /**
  * Get nextCursor
  * @return nextCursor
  **/
  public String getNextCursor() {
    return nextCursor;
  }
  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }
  
  public DeviceTopicListResult totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  
  /**
  * Get totalCount
  * @return totalCount
  **/
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTopicListResult deviceTopicListResult = (DeviceTopicListResult) o;
    return Objects.equals(this.items, deviceTopicListResult.items) &&
        Objects.equals(this.nextCursor, deviceTopicListResult.nextCursor) &&
        Objects.equals(this.totalCount, deviceTopicListResult.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextCursor, totalCount);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTopicListResult {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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



