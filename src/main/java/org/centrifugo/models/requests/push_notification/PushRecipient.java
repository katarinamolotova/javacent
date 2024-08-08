package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PushRecipient
 */
public class PushRecipient {

    @JsonProperty("filter")
    private DeviceFilter filter;

    /**
     * 
     */
    @JsonProperty("fcm_tokens")
    private List<String> fcmTokens;

    /**
     * 
     */
    @JsonProperty("fcm_topic")
    private String fcmTopic;

    /**
     * 
     */
    @JsonProperty("fcm_condition")
    private String fcmCondition;

    /**
     * 
     */
    @JsonProperty("hms_tokens")
    private List<String> hmsTokens;

    /**
     * 
     */
    @JsonProperty("hms_topic")
    private String hmsTopic;

    /**
     * 
     */
    @JsonProperty("hms_condition")
    private String hmsCondition;

    /**
     * 
     */
    @JsonProperty("apns_tokens")
    private List<String> apnsTokens;

    public PushRecipient(
            DeviceFilter filter,
            List<String> fcmTokens,
            String fcmTopic,
            String fcmCondition,
            List<String> hmsTokens,
            String hmsTopic,
            String hmsCondition,
            List<String> apnsTokens
    ) {
        this.filter = filter;
        this.fcmTokens = fcmTokens;
        this.fcmTopic = fcmTopic;
        this.fcmCondition = fcmCondition;
        this.hmsTokens = hmsTokens;
        this.hmsTopic = hmsTopic;
        this.hmsCondition = hmsCondition;
        this.apnsTokens = apnsTokens;
    }

    public PushRecipient() {
    }

    public static PushRecipientBuilder builder() {
        return new PushRecipientBuilder();
    }

    public PushRecipient addFcmTokensItem(String fcmTokensItem) {

        if (this.fcmTokens == null) {
            this.fcmTokens = new ArrayList<String>();
        }

        this.fcmTokens.add(fcmTokensItem);
        return this;
    }

    public PushRecipient addHmsTokensItem(String hmsTokensItem) {

        if (this.hmsTokens == null) {
            this.hmsTokens = new ArrayList<String>();
        }

        this.hmsTokens.add(hmsTokensItem);
        return this;
    }

    public PushRecipient addApnsTokensItem(String apnsTokensItem) {

        if (this.apnsTokens == null) {
            this.apnsTokens = new ArrayList<String>();
        }

        this.apnsTokens.add(apnsTokensItem);
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
        PushRecipient pushRecipient = (PushRecipient) o;
        return Objects.equals(this.filter, pushRecipient.filter) &&
               Objects.equals(this.fcmTokens, pushRecipient.fcmTokens) &&
               Objects.equals(this.fcmTopic, pushRecipient.fcmTopic) &&
               Objects.equals(this.fcmCondition, pushRecipient.fcmCondition) &&
               Objects.equals(this.hmsTokens, pushRecipient.hmsTokens) &&
               Objects.equals(this.hmsTopic, pushRecipient.hmsTopic) &&
               Objects.equals(this.hmsCondition, pushRecipient.hmsCondition) &&
               Objects.equals(this.apnsTokens, pushRecipient.apnsTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, fcmTokens, fcmTopic, fcmCondition, hmsTokens, hmsTopic, hmsCondition, apnsTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushRecipient {\n");

        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    fcmTokens: ").append(toIndentedString(fcmTokens)).append("\n");
        sb.append("    fcmTopic: ").append(toIndentedString(fcmTopic)).append("\n");
        sb.append("    fcmCondition: ").append(toIndentedString(fcmCondition)).append("\n");
        sb.append("    hmsTokens: ").append(toIndentedString(hmsTokens)).append("\n");
        sb.append("    hmsTopic: ").append(toIndentedString(hmsTopic)).append("\n");
        sb.append("    hmsCondition: ").append(toIndentedString(hmsCondition)).append("\n");
        sb.append("    apnsTokens: ").append(toIndentedString(apnsTokens)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public DeviceFilter getFilter() {
        return this.filter;
    }

    public List<String> getFcmTokens() {
        return this.fcmTokens;
    }

    public String getFcmTopic() {
        return this.fcmTopic;
    }

    public String getFcmCondition() {
        return this.fcmCondition;
    }

    public List<String> getHmsTokens() {
        return this.hmsTokens;
    }

    public String getHmsTopic() {
        return this.hmsTopic;
    }

    public String getHmsCondition() {
        return this.hmsCondition;
    }

    public List<String> getApnsTokens() {
        return this.apnsTokens;
    }

    @JsonProperty("filter")
    public void setFilter(DeviceFilter filter) {
        this.filter = filter;
    }

    @JsonProperty("fcm_tokens")
    public void setFcmTokens(List<String> fcmTokens) {
        this.fcmTokens = fcmTokens;
    }

    @JsonProperty("fcm_topic")
    public void setFcmTopic(String fcmTopic) {
        this.fcmTopic = fcmTopic;
    }

    @JsonProperty("fcm_condition")
    public void setFcmCondition(String fcmCondition) {
        this.fcmCondition = fcmCondition;
    }

    @JsonProperty("hms_tokens")
    public void setHmsTokens(List<String> hmsTokens) {
        this.hmsTokens = hmsTokens;
    }

    @JsonProperty("hms_topic")
    public void setHmsTopic(String hmsTopic) {
        this.hmsTopic = hmsTopic;
    }

    @JsonProperty("hms_condition")
    public void setHmsCondition(String hmsCondition) {
        this.hmsCondition = hmsCondition;
    }

    @JsonProperty("apns_tokens")
    public void setApnsTokens(List<String> apnsTokens) {
        this.apnsTokens = apnsTokens;
    }

    public static class PushRecipientBuilder {
        private DeviceFilter filter;
        private List<String> fcmTokens;
        private String fcmTopic;
        private String fcmCondition;
        private List<String> hmsTokens;
        private String hmsTopic;
        private String hmsCondition;
        private List<String> apnsTokens;

        PushRecipientBuilder() {
        }

        @JsonProperty("filter")
        public PushRecipientBuilder filter(DeviceFilter filter) {
            this.filter = filter;
            return this;
        }

        @JsonProperty("fcm_tokens")
        public PushRecipientBuilder fcmTokens(List<String> fcmTokens) {
            this.fcmTokens = fcmTokens;
            return this;
        }

        @JsonProperty("fcm_topic")
        public PushRecipientBuilder fcmTopic(String fcmTopic) {
            this.fcmTopic = fcmTopic;
            return this;
        }

        @JsonProperty("fcm_condition")
        public PushRecipientBuilder fcmCondition(String fcmCondition) {
            this.fcmCondition = fcmCondition;
            return this;
        }

        @JsonProperty("hms_tokens")
        public PushRecipientBuilder hmsTokens(List<String> hmsTokens) {
            this.hmsTokens = hmsTokens;
            return this;
        }

        @JsonProperty("hms_topic")
        public PushRecipientBuilder hmsTopic(String hmsTopic) {
            this.hmsTopic = hmsTopic;
            return this;
        }

        @JsonProperty("hms_condition")
        public PushRecipientBuilder hmsCondition(String hmsCondition) {
            this.hmsCondition = hmsCondition;
            return this;
        }

        @JsonProperty("apns_tokens")
        public PushRecipientBuilder apnsTokens(List<String> apnsTokens) {
            this.apnsTokens = apnsTokens;
            return this;
        }

        public PushRecipient build() {
            return new PushRecipient(
                    this.filter,
                    this.fcmTokens,
                    this.fcmTopic,
                    this.fcmCondition,
                    this.hmsTokens,
                    this.hmsTopic,
                    this.hmsCondition,
                    this.apnsTokens
            );
        }

        public String toString() {
            return "PushRecipient.PushRecipientBuilder(filter=" +
                   this.filter +
                   ", fcmTokens=" +
                   this.fcmTokens +
                   ", fcmTopic=" +
                   this.fcmTopic +
                   ", fcmCondition=" +
                   this.fcmCondition +
                   ", hmsTokens=" +
                   this.hmsTokens +
                   ", hmsTopic=" +
                   this.hmsTopic +
                   ", hmsCondition=" +
                   this.hmsCondition +
                   ", apnsTokens=" +
                   this.apnsTokens +
                   ")";
        }
    }
}
