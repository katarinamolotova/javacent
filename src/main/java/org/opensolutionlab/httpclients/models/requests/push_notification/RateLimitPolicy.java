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

import java.util.Objects;

/**
 * Rate Limit Policy
 */
public class RateLimitPolicy {

    /**
     * Allowed rate
     */
    @JsonProperty("rate")
    private Integer rate;

    /**
     * Interval over which rate is allowed
     */
    @JsonProperty("interval_ms")
    private Integer intervalMs;

    public RateLimitPolicy(Integer rate, Integer intervalMs) {
        this.rate = rate;
        this.intervalMs = intervalMs;
    }

    public RateLimitPolicy() {
    }

    public static RateLimitPolicyBuilder builder() {
        return new RateLimitPolicyBuilder();
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

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public Integer getRate() {
        return this.rate;
    }

    public Integer getIntervalMs() {
        return this.intervalMs;
    }

    @JsonProperty("rate")
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @JsonProperty("interval_ms")
    public void setIntervalMs(Integer intervalMs) {
        this.intervalMs = intervalMs;
    }

    public static class RateLimitPolicyBuilder {
        private Integer rate;
        private Integer intervalMs;

        RateLimitPolicyBuilder() {
        }

        @JsonProperty("rate")
        public RateLimitPolicyBuilder rate(Integer rate) {
            this.rate = rate;
            return this;
        }

        @JsonProperty("interval_ms")
        public RateLimitPolicyBuilder intervalMs(Integer intervalMs) {
            this.intervalMs = intervalMs;
            return this;
        }

        public RateLimitPolicy build() {
            return new RateLimitPolicy(this.rate, this.intervalMs);
        }

        public String toString() {
            return "RateLimitPolicy.RateLimitPolicyBuilder(rate=" + this.rate + ", intervalMs=" + this.intervalMs + ")";
        }
    }
}
