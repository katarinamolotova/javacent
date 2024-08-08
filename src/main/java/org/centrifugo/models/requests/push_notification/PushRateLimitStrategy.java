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
    private String key;

    /**
     * 
     */
    @JsonProperty("policies")
    private List<RateLimitPolicy> policies;

    /**
     * 
     */
    @JsonProperty("drop_if_rate_limited")
    private Boolean dropIfRateLimited;

    public PushRateLimitStrategy(String key, List<RateLimitPolicy> policies, Boolean dropIfRateLimited) {
        this.key = key;
        this.policies = policies;
        this.dropIfRateLimited = dropIfRateLimited;
    }

    public PushRateLimitStrategy() {
    }

    public static PushRateLimitStrategyBuilder builder() {
        return new PushRateLimitStrategyBuilder();
    }

    public PushRateLimitStrategy addPoliciesItem(RateLimitPolicy policiesItem) {

        if (this.policies == null) {
            this.policies = new ArrayList<RateLimitPolicy>();
        }

        this.policies.add(policiesItem);
        return this;
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

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getKey() {
        return this.key;
    }

    public List<RateLimitPolicy> getPolicies() {
        return this.policies;
    }

    public Boolean getDropIfRateLimited() {
        return this.dropIfRateLimited;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("policies")
    public void setPolicies(List<RateLimitPolicy> policies) {
        this.policies = policies;
    }

    @JsonProperty("drop_if_rate_limited")
    public void setDropIfRateLimited(Boolean dropIfRateLimited) {
        this.dropIfRateLimited = dropIfRateLimited;
    }

    public static class PushRateLimitStrategyBuilder {
        private String key;
        private List<RateLimitPolicy> policies;
        private Boolean dropIfRateLimited;

        PushRateLimitStrategyBuilder() {
        }

        @JsonProperty("key")
        public PushRateLimitStrategyBuilder key(String key) {
            this.key = key;
            return this;
        }

        @JsonProperty("policies")
        public PushRateLimitStrategyBuilder policies(List<RateLimitPolicy> policies) {
            this.policies = policies;
            return this;
        }

        @JsonProperty("drop_if_rate_limited")
        public PushRateLimitStrategyBuilder dropIfRateLimited(Boolean dropIfRateLimited) {
            this.dropIfRateLimited = dropIfRateLimited;
            return this;
        }

        public PushRateLimitStrategy build() {
            return new PushRateLimitStrategy(this.key, this.policies, this.dropIfRateLimited);
        }

        public String toString() {
            return "PushRateLimitStrategy.PushRateLimitStrategyBuilder(key=" +
                   this.key +
                   ", policies=" +
                   this.policies +
                   ", dropIfRateLimited=" +
                   this.dropIfRateLimited +
                   ")";
        }
    }
}
