package org.centrifugo.models.responses.results.push_notification.user_topic_list;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserTopicListResult {

  @JsonProperty("items")
  private List<UserTopic> items;

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("total_count")
  private Integer totalCount;

  public UserTopicListResult(List<UserTopic> items, String nextCursor, Integer totalCount) {
    this.items = items;
    this.nextCursor = nextCursor;
    this.totalCount = totalCount;
  }

  public UserTopicListResult() {
  }

  public List<UserTopic> getItems() {
    return this.items;
  }

  public String getNextCursor() {
    return this.nextCursor;
  }

  public Integer getTotalCount() {
    return this.totalCount;
  }

  @JsonProperty("items")
  public void setItems(List<UserTopic> items) {
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