package org.centrifugo.models.responses.results.push_notification.device_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.responses.results.push_notification.Device;

import java.util.List;

public class DeviceListResult {

  @JsonProperty("items")
  private List<Device> items;

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("total_count")
  private Integer totalCount;

  public DeviceListResult(List<Device> items, String nextCursor, Integer totalCount) {
    this.items = items;
    this.nextCursor = nextCursor;
    this.totalCount = totalCount;
  }

  public DeviceListResult() {
  }

  public List<Device> getItems() {
    return this.items;
  }

  public String getNextCursor() {
    return this.nextCursor;
  }

  public Integer getTotalCount() {
    return this.totalCount;
  }

  @JsonProperty("items")
  public void setItems(List<Device> items) {
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