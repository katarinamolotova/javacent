package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RateLimitPolicy
 */
public class RateLimitPolicy {

  
  @JsonProperty("rate")
  private Integer rate = null;
  
  
  @JsonProperty("interval_ms")
  private Integer intervalMs = null;
  
  public RateLimitPolicy rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  
  /**
  * Get rate
  * @return rate
  **/
  public Integer getRate() {
    return rate;
  }
  public void setRate(Integer rate) {
    this.rate = rate;
  }
  
  public RateLimitPolicy intervalMs(Integer intervalMs) {
    this.intervalMs = intervalMs;
    return this;
  }

  
  /**
  * Get intervalMs
  * @return intervalMs
  **/
  public Integer getIntervalMs() {
    return intervalMs;
  }
  public void setIntervalMs(Integer intervalMs) {
    this.intervalMs = intervalMs;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimitPolicy rateLimitPolicy = (RateLimitPolicy) o;
    return Objects.equals(this.rate, rateLimitPolicy.rate) &&
        Objects.equals(this.intervalMs, rateLimitPolicy.intervalMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, intervalMs);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimitPolicy {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    intervalMs: ").append(toIndentedString(intervalMs)).append("\n");
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



