package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Push Limit Strategy
 */
public class PushLimitStrategy {

    /**
     * Set rate limit policies
     */
    @JsonProperty("rate_limit")
    private PushRateLimitStrategy rateLimit;

    /**
     * Set time limit policy
     */
    @JsonProperty("time_limit")
    private PushTimeLimitStrategy timeLimit;

    public PushLimitStrategy(PushRateLimitStrategy rateLimit, PushTimeLimitStrategy timeLimit) {
        this.rateLimit = rateLimit;
        this.timeLimit = timeLimit;
    }

    public PushLimitStrategy() {
    }

    public static PushLimitStrategyBuilder builder() {
        return new PushLimitStrategyBuilder();
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

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public PushRateLimitStrategy getRateLimit() {
        return this.rateLimit;
    }

    public PushTimeLimitStrategy getTimeLimit() {
        return this.timeLimit;
    }

    @JsonProperty("rate_limit")
    public void setRateLimit(PushRateLimitStrategy rateLimit) {
        this.rateLimit = rateLimit;
    }

    @JsonProperty("time_limit")
    public void setTimeLimit(PushTimeLimitStrategy timeLimit) {
        this.timeLimit = timeLimit;
    }

    public static class PushLimitStrategyBuilder {
        private PushRateLimitStrategy rateLimit;
        private PushTimeLimitStrategy timeLimit;

        PushLimitStrategyBuilder() {
        }

        @JsonProperty("rate_limit")
        public PushLimitStrategyBuilder rateLimit(PushRateLimitStrategy rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }

        @JsonProperty("time_limit")
        public PushLimitStrategyBuilder timeLimit(PushTimeLimitStrategy timeLimit) {
            this.timeLimit = timeLimit;
            return this;
        }

        public PushLimitStrategy build() {
            return new PushLimitStrategy(this.rateLimit, this.timeLimit);
        }

        public String toString() {
            return "PushLimitStrategy.PushLimitStrategyBuilder(rateLimit=" +
                   this.rateLimit +
                   ", timeLimit=" +
                   this.timeLimit +
                   ")";
        }
    }
}
