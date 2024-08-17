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

package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Push Rate Limit Strategy
 */
public class PushRateLimitStrategy {

    /**
     * Optional key for rate limit policy, supports variables (devide.id and device.user)
     */
    @JsonProperty("key")
    private String key;

    /**
     * Set time limit policy
     */
    @JsonProperty("policies")
    private List<RateLimitPolicy> policies;

    /**
     * Drop push if rate limited, otherwise queue for later
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
