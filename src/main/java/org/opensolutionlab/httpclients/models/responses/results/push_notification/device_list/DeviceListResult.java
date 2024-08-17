/*
 * Copyright 2024 Molotova Katerina, Kukhtachev Mikhail.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensolutionlab.httpclients.models.responses.results.push_notification.device_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.responses.results.push_notification.Device;

import java.util.List;

/**
 * Device list result
 */
public class DeviceListResult {

  /**
   * A list of devices
   */
  @JsonProperty("items")
  private List<Device> items;

  /**
   * Cursor string for retreiving the next page, if not set - then no next page exists
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  /**
   * Total count value (if include_total_count used)
   */
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