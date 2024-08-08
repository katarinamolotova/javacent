package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PushTimeLimitStrategy
 */
public class PushTimeLimitStrategy {

    @JsonProperty("send_after_time")
    private String sendAfterTime;

    /**
     * 
     */
    @JsonProperty("send_before_time")
    private String sendBeforeTime;

    /**
     * 
     */
    @JsonProperty("no_tz_send_now")
    private Boolean noTzSendNow;

    public PushTimeLimitStrategy(String sendAfterTime, String sendBeforeTime, Boolean noTzSendNow) {
        this.sendAfterTime = sendAfterTime;
        this.sendBeforeTime = sendBeforeTime;
        this.noTzSendNow = noTzSendNow;
    }

    public PushTimeLimitStrategy() {
    }

    public static PushTimeLimitStrategyBuilder builder() {
        return new PushTimeLimitStrategyBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PushTimeLimitStrategy pushTimeLimitStrategy = (PushTimeLimitStrategy) o;
        return Objects.equals(this.sendAfterTime, pushTimeLimitStrategy.sendAfterTime) &&
               Objects.equals(this.sendBeforeTime, pushTimeLimitStrategy.sendBeforeTime) &&
               Objects.equals(this.noTzSendNow, pushTimeLimitStrategy.noTzSendNow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendAfterTime, sendBeforeTime, noTzSendNow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushTimeLimitStrategy {\n");

        sb.append("    sendAfterTime: ").append(toIndentedString(sendAfterTime)).append("\n");
        sb.append("    sendBeforeTime: ").append(toIndentedString(sendBeforeTime)).append("\n");
        sb.append("    noTzSendNow: ").append(toIndentedString(noTzSendNow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getSendAfterTime() {
        return this.sendAfterTime;
    }

    public String getSendBeforeTime() {
        return this.sendBeforeTime;
    }

    public Boolean getNoTzSendNow() {
        return this.noTzSendNow;
    }

    @JsonProperty("send_after_time")
    public void setSendAfterTime(String sendAfterTime) {
        this.sendAfterTime = sendAfterTime;
    }

    @JsonProperty("send_before_time")
    public void setSendBeforeTime(String sendBeforeTime) {
        this.sendBeforeTime = sendBeforeTime;
    }

    @JsonProperty("no_tz_send_now")
    public void setNoTzSendNow(Boolean noTzSendNow) {
        this.noTzSendNow = noTzSendNow;
    }

    public static class PushTimeLimitStrategyBuilder {
        private String sendAfterTime;
        private String sendBeforeTime;
        private Boolean noTzSendNow;

        PushTimeLimitStrategyBuilder() {
        }

        @JsonProperty("send_after_time")
        public PushTimeLimitStrategyBuilder sendAfterTime(String sendAfterTime) {
            this.sendAfterTime = sendAfterTime;
            return this;
        }

        @JsonProperty("send_before_time")
        public PushTimeLimitStrategyBuilder sendBeforeTime(String sendBeforeTime) {
            this.sendBeforeTime = sendBeforeTime;
            return this;
        }

        @JsonProperty("no_tz_send_now")
        public PushTimeLimitStrategyBuilder noTzSendNow(Boolean noTzSendNow) {
            this.noTzSendNow = noTzSendNow;
            return this;
        }

        public PushTimeLimitStrategy build() {
            return new PushTimeLimitStrategy(this.sendAfterTime, this.sendBeforeTime, this.noTzSendNow);
        }

        public String toString() {
            return "PushTimeLimitStrategy.PushTimeLimitStrategyBuilder(sendAfterTime=" +
                   this.sendAfterTime +
                   ", sendBeforeTime=" +
                   this.sendBeforeTime +
                   ", noTzSendNow=" +
                   this.noTzSendNow +
                   ")";
        }
    }
}
