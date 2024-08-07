package org.centrifugo.models.responses.results.push_notification.device_topic_list;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DeviceTopicListResult {

  @JsonProperty("items")
  private List<DeviceTopic> items;

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("total_count")
  private Integer totalCount;

  public DeviceTopicListResult(List<DeviceTopic> items, String nextCursor, Integer totalCount) {
    this.items = items;
    this.nextCursor = nextCursor;
    this.totalCount = totalCount;
  }

  public DeviceTopicListResult() {
  }

  public List<DeviceTopic> getItems() {
    return this.items;
  }

  public String getNextCursor() {
    return this.nextCursor;
  }

  public Integer getTotalCount() {
    return this.totalCount;
  }

  @JsonProperty("items")
  public void setItems(List<DeviceTopic> items) {
    this.items = items;
  }

  @JsonProperty("next_cursor")
  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }

  @JsonProperty("total_count")
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }
}