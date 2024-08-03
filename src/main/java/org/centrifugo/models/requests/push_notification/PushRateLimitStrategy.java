package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PushRateLimitStrategy
 */
public class PushRateLimitStrategy {

  
  @JsonProperty("key")
  private String key = null;
  
  
  @JsonProperty("policies")
  private List<RateLimitPolicy> policies = null;
  
  
  @JsonProperty("drop_if_rate_limited")
  private Boolean dropIfRateLimited = null;
  
  public PushRateLimitStrategy key(String key) {
    this.key = key;
    return this;
  }

  
  /**
  * optional key for rate limit policy, supports variables.
  * @return key
  **/
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
  
  public PushRateLimitStrategy policies(List<RateLimitPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public PushRateLimitStrategy addPoliciesItem(RateLimitPolicy policiesItem) {
    
    if (this.policies == null) {
      this.policies = new ArrayList<RateLimitPolicy>();
    }
    
    this.policies.add(policiesItem);
    return this;
  }
  
  /**
  * Get policies
  * @return policies
  **/
  public List<RateLimitPolicy> getPolicies() {
    return policies;
  }
  public void setPolicies(List<RateLimitPolicy> policies) {
    this.policies = policies;
  }
  
  public PushRateLimitStrategy dropIfRateLimited(Boolean dropIfRateLimited) {
    this.dropIfRateLimited = dropIfRateLimited;
    return this;
  }

  
  /**
  * Get dropIfRateLimited
  * @return dropIfRateLimited
  **/
  public Boolean isDropIfRateLimited() {
    return dropIfRateLimited;
  }
  public void setDropIfRateLimited(Boolean dropIfRateLimited) {
    this.dropIfRateLimited = dropIfRateLimited;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushRateLimitStrategy pushRateLimitStrategy = (PushRateLimitStrategy) o;
    return Objects.equals(this.key, pushRateLimitStrategy.key) &&
        Objects.equals(this.policies, pushRateLimitStrategy.policies) &&
        Objects.equals(this.dropIfRateLimited, pushRateLimitStrategy.dropIfRateLimited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, policies, dropIfRateLimited);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushRateLimitStrategy {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    dropIfRateLimited: ").append(toIndentedString(dropIfRateLimited)).append("\n");
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



