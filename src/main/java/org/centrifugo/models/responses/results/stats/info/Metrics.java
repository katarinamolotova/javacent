package org.centrifugo.models.responses.results.stats.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Metrics
 */
public class Metrics {

  
  @JsonProperty("interval")
  private Double interval = null;
  
  
  @JsonProperty("items")
  private Map<String, Double> items = null;
  
  public Metrics interval(Double interval) {
    this.interval = interval;
    return this;
  }

  
  /**
  * Get interval
  * @return interval
  **/
  public Double getInterval() {
    return interval;
  }
  public void setInterval(Double interval) {
    this.interval = interval;
  }
  
  public Metrics items(Map<String, Double> items) {
    this.items = items;
    return this;
  }

  public Metrics putItemsItem(String key, Double itemsItem) {
    
    if (this.items == null) {
      this.items = new HashMap<String, Double>();
    }
    
    this.items.put(key, itemsItem);
    return this;
  }
  /**
  * Get items
  * @return items
  **/
  public Map<String, Double> getItems() {
    return items;
  }
  public void setItems(Map<String, Double> items) {
    this.items = items;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metrics metrics = (Metrics) o;
    return Objects.equals(this.interval, metrics.interval) &&
        Objects.equals(this.items, metrics.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, items);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metrics {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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



