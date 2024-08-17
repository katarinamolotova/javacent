package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Send Push Notification Request
 */
public class SendPushNotificationRequest implements RequestModel {

    /**
     * <b>Required.</b> Recipient of push notification
     */
    @JsonProperty("recipient")
    private PushRecipient recipient;

    /**
     * <b>Required.</b> Push notification to send
     */
    @JsonProperty("notification")
    private PushNotification notification;

    /**
     * Unique identifier for each push notification request, can be used to cancel push
     */
    @JsonProperty("uid")
    private String uid;

    /**
     * Optional Unix time in the future (in seconds) when to send push notification, push will be queued until that time
     */
    @JsonProperty("send_at")
    private Integer sendAt;

    /**
     * Makes processing heavier, but tolerates edge cases, like not loosing inflight pushes due to temporary queue unavailability
     */
    @JsonProperty("optimize_for_reliability")
    private Boolean optimizeForReliability;

    /**
     * Can be used to set push time constraints (based on device timezone) adnd rate limits
     */
    @JsonProperty("limit_strategy")
    private PushLimitStrategy limitStrategy;

    /**
     * Identifier for push notification analytics, if not set - Centrifugo will use uid field
     */
    @JsonProperty("analytics_uid")
    private String analyticsUid;

    /**
     * Optional per language localizations for push notification
     */
    @JsonProperty("localizations")
    private Map<String, PushLocalization> localizations;

    /**
     * If set - Centrifugo will use templating for push notification. 
     * Note that setting localizations enables templating automatically
     */
    @JsonProperty("use_templating")
    private Boolean useTemplating;

    /**
     * If set - Centrifugo will additionally load device meta during push sending, this meta becomes available in templating.
     */
    @JsonProperty("use_meta")
    private Boolean useMeta;

    public SendPushNotificationRequest(
            PushRecipient recipient,
            PushNotification notification,
            String uid,
            Integer sendAt,
            Boolean optimizeForReliability,
            PushLimitStrategy limitStrategy,
            String analyticsUid,
            Map<String, PushLocalization> localizations,
            Boolean useTemplating,
            Boolean useMeta
    ) {
        this.recipient = recipient;
        this.notification = notification;
        this.uid = uid;
        this.sendAt = sendAt;
        this.optimizeForReliability = optimizeForReliability;
        this.limitStrategy = limitStrategy;
        this.analyticsUid = analyticsUid;
        this.localizations = localizations;
        this.useTemplating = useTemplating;
        this.useMeta = useMeta;
    }

    public SendPushNotificationRequest() {
    }

    public static SendPushNotificationRequestBuilder builder() {
        return new SendPushNotificationRequestBuilder();
    }

    public SendPushNotificationRequest putLocalizationsItem(String key, PushLocalization localizationsItem) {

        if (this.localizations == null) {
            this.localizations = new HashMap<String, PushLocalization>();
        }

        this.localizations.put(key, localizationsItem);
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
        SendPushNotificationRequest sendPushNotificationRequest = (SendPushNotificationRequest) o;
        return Objects.equals(this.recipient, sendPushNotificationRequest.recipient) &&
               Objects.equals(this.notification, sendPushNotificationRequest.notification) &&
               Objects.equals(this.uid, sendPushNotificationRequest.uid) &&
               Objects.equals(this.sendAt, sendPushNotificationRequest.sendAt) &&
               Objects.equals(this.optimizeForReliability, sendPushNotificationRequest.optimizeForReliability) &&
               Objects.equals(this.limitStrategy, sendPushNotificationRequest.limitStrategy) &&
               Objects.equals(this.analyticsUid, sendPushNotificationRequest.analyticsUid) &&
               Objects.equals(this.localizations, sendPushNotificationRequest.localizations) &&
               Objects.equals(this.useTemplating, sendPushNotificationRequest.useTemplating) &&
               Objects.equals(this.useMeta, sendPushNotificationRequest.useMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                recipient,
                notification,
                uid,
                sendAt,
                optimizeForReliability,
                limitStrategy,
                analyticsUid,
                localizations,
                useTemplating,
                useMeta
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendPushNotificationRequest {\n");

        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    sendAt: ").append(toIndentedString(sendAt)).append("\n");
        sb.append("    optimizeForReliability: ").append(toIndentedString(optimizeForReliability)).append("\n");
        sb.append("    limitStrategy: ").append(toIndentedString(limitStrategy)).append("\n");
        sb.append("    analyticsUid: ").append(toIndentedString(analyticsUid)).append("\n");
        sb.append("    localizations: ").append(toIndentedString(localizations)).append("\n");
        sb.append("    useTemplating: ").append(toIndentedString(useTemplating)).append("\n");
        sb.append("    useMeta: ").append(toIndentedString(useMeta)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public PushRecipient getRecipient() {
        return this.recipient;
    }

    public PushNotification getNotification() {
        return this.notification;
    }

    public String getUid() {
        return this.uid;
    }

    public Integer getSendAt() {
        return this.sendAt;
    }

    public Boolean getOptimizeForReliability() {
        return this.optimizeForReliability;
    }

    public PushLimitStrategy getLimitStrategy() {
        return this.limitStrategy;
    }

    public String getAnalyticsUid() {
        return this.analyticsUid;
    }

    public Map<String, PushLocalization> getLocalizations() {
        return this.localizations;
    }

    public Boolean getUseTemplating() {
        return this.useTemplating;
    }

    public Boolean getUseMeta() {
        return this.useMeta;
    }

    @JsonProperty("recipient")
    public void setRecipient(PushRecipient recipient) {
        this.recipient = recipient;
    }

    @JsonProperty("notification")
    public void setNotification(PushNotification notification) {
        this.notification = notification;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("send_at")
    public void setSendAt(Integer sendAt) {
        this.sendAt = sendAt;
    }

    @JsonProperty("optimize_for_reliability")
    public void setOptimizeForReliability(Boolean optimizeForReliability) {
        this.optimizeForReliability = optimizeForReliability;
    }

    @JsonProperty("limit_strategy")
    public void setLimitStrategy(PushLimitStrategy limitStrategy) {
        this.limitStrategy = limitStrategy;
    }

    @JsonProperty("analytics_uid")
    public void setAnalyticsUid(String analyticsUid) {
        this.analyticsUid = analyticsUid;
    }

    @JsonProperty("localizations")
    public void setLocalizations(Map<String, PushLocalization> localizations) {
        this.localizations = localizations;
    }

    @JsonProperty("use_templating")
    public void setUseTemplating(Boolean useTemplating) {
        this.useTemplating = useTemplating;
    }

    @JsonProperty("use_meta")
    public void setUseMeta(Boolean useMeta) {
        this.useMeta = useMeta;
    }

    public static class SendPushNotificationRequestBuilder {
        private PushRecipient recipient;
        private PushNotification notification;
        private String uid;
        private Integer sendAt;
        private Boolean optimizeForReliability;
        private PushLimitStrategy limitStrategy;
        private String analyticsUid;
        private Map<String, PushLocalization> localizations;
        private Boolean useTemplating;
        private Boolean useMeta;

        SendPushNotificationRequestBuilder() {
        }

        @JsonProperty("recipient")
        public SendPushNotificationRequestBuilder recipient(PushRecipient recipient) {
            this.recipient = recipient;
            return this;
        }

        @JsonProperty("notification")
        public SendPushNotificationRequestBuilder notification(PushNotification notification) {
            this.notification = notification;
            return this;
        }

        @JsonProperty("uid")
        public SendPushNotificationRequestBuilder uid(String uid) {
            this.uid = uid;
            return this;
        }

        @JsonProperty("send_at")
        public SendPushNotificationRequestBuilder sendAt(Integer sendAt) {
            this.sendAt = sendAt;
            return this;
        }

        @JsonProperty("optimize_for_reliability")
        public SendPushNotificationRequestBuilder optimizeForReliability(Boolean optimizeForReliability) {
            this.optimizeForReliability = optimizeForReliability;
            return this;
        }

        @JsonProperty("limit_strategy")
        public SendPushNotificationRequestBuilder limitStrategy(PushLimitStrategy limitStrategy) {
            this.limitStrategy = limitStrategy;
            return this;
        }

        @JsonProperty("analytics_uid")
        public SendPushNotificationRequestBuilder analyticsUid(String analyticsUid) {
            this.analyticsUid = analyticsUid;
            return this;
        }

        @JsonProperty("localizations")
        public SendPushNotificationRequestBuilder localizations(Map<String, PushLocalization> localizations) {
            this.localizations = localizations;
            return this;
        }

        @JsonProperty("use_templating")
        public SendPushNotificationRequestBuilder useTemplating(Boolean useTemplating) {
            this.useTemplating = useTemplating;
            return this;
        }

        @JsonProperty("use_meta")
        public SendPushNotificationRequestBuilder useMeta(Boolean useMeta) {
            this.useMeta = useMeta;
            return this;
        }

        public SendPushNotificationRequest build() {
            return new SendPushNotificationRequest(
                    this.recipient,
                    this.notification,
                    this.uid,
                    this.sendAt,
                    this.optimizeForReliability,
                    this.limitStrategy,
                    this.analyticsUid,
                    this.localizations,
                    this.useTemplating,
                    this.useMeta
            );
        }

        public String toString() {
            return "SendPushNotificationRequest.SendPushNotificationRequestBuilder(recipient=" +
                   this.recipient +
                   ", notification=" +
                   this.notification +
                   ", uid=" +
                   this.uid +
                   ", sendAt=" +
                   this.sendAt +
                   ", optimizeForReliability=" +
                   this.optimizeForReliability +
                   ", limitStrategy=" +
                   this.limitStrategy +
                   ", analyticsUid=" +
                   this.analyticsUid +
                   ", localizations=" +
                   this.localizations +
                   ", useTemplating=" +
                   this.useTemplating +
                   ", useMeta=" +
                   this.useMeta +
                   ")";
        }
    }
}
