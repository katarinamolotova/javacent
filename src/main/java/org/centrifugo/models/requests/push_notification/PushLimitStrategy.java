package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PushLimitStrategy
 */
public class PushLimitStrategy {

  
  @JsonProperty("rate_limit")
  private PushRateLimitStrategy rateLimit = null;
  
  
  @JsonProperty("time_limit")
  private PushTimeLimitStrategy timeLimit = null;
  
  public PushLimitStrategy rateLimit(PushRateLimitStrategy rateLimit) {
    this.rateLimit = rateLimit;
    return this;
  }

  
  /**
  * Get rateLimit
  * @return rateLimit
  **/
  public PushRateLimitStrategy getRateLimit() {
    return rateLimit;
  }
  public void setRateLimit(PushRateLimitStrategy rateLimit) {
    this.rateLimit = rateLimit;
  }
  
  public PushLimitStrategy timeLimit(PushTimeLimitStrategy timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

  
  /**
  * Get timeLimit
  * @return timeLimit
  **/
  public PushTimeLimitStrategy getTimeLimit() {
    return timeLimit;
  }
  public void setTimeLimit(PushTimeLimitStrategy timeLimit) {
    this.timeLimit = timeLimit;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushLimitStrategy pushLimitStrategy = (PushLimitStrategy) o;
    return Objects.equals(this.rateLimit, pushLimitStrategy.rateLimit) &&
        Objects.equals(this.timeLimit, pushLimitStrategy.timeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateLimit, timeLimit);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushLimitStrategy {\n");
    
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
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



