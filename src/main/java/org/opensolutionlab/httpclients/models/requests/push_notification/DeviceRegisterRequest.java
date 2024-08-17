package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Device Register Request
 */
public class DeviceRegisterRequest implements RequestModel {

    /**
     * ID of the device being registered (provide it when updating)
     */
    @JsonProperty("id")
    private String id;

    /**
     * <b>Required.</b> Provider of the device token (valid choices: fcm, hms, apns)
     */
    @JsonProperty("provider")
    private String provider;

    /**
     * <b>Required.</b> Push notification token for the device
     */
    @JsonProperty("token")
    private String token;

    /**
     * <b>Required.</b> Platform of the device (valid choices: ios, android, web)
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * User associated with the device
     */
    @JsonProperty("user")
    private String user;

    /**
     * Additional custom metadata for the device
     */
    @JsonProperty("meta")
    private Map<String, String> meta;

    /**
     * Device topic subscriptions. 
     * This should be a full list which replaces all the topics previously accociated with the device
     */
    @JsonProperty("topics")
    private List<String> topics;

    /**
     * Timezone of device user
     */
    @JsonProperty("timezone")
    private String timezone;

    /**
     * Locale of device user
     */
    @JsonProperty("locale")
    private String locale;

    public DeviceRegisterRequest(
            String id,
            String provider,
            String token,
            String platform,
            String user,
            Map<String, String> meta,
            List<String> topics,
            String timezone,
            String locale
    ) {
        this.id = id;
        this.provider = provider;
        this.token = token;
        this.platform = platform;
        this.user = user;
        this.meta = meta;
        this.topics = topics;
        this.timezone = timezone;
        this.locale = locale;
    }

    public DeviceRegisterRequest() {
    }

    public static DeviceRegisterRequestBuilder builder() {
        return new DeviceRegisterRequestBuilder();
    }

    public DeviceRegisterRequest meta(Map<String, String> meta) {
        this.meta = meta;
        return this;
    }

    public DeviceRegisterRequest putMetaItem(String key, String metaItem) {

        if (this.meta == null) {
            this.meta = new HashMap<String, String>();
        }

        this.meta.put(key, metaItem);
        return this;
    }

    public DeviceRegisterRequest addTopicsItem(String topicsItem) {

        if (this.topics == null) {
            this.topics = new ArrayList<String>();
        }

        this.topics.add(topicsItem);
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
        DeviceRegisterRequest deviceRegisterRequest = (DeviceRegisterRequest) o;
        return Objects.equals(this.id, deviceRegisterRequest.id) &&
               Objects.equals(this.provider, deviceRegisterRequest.provider) &&
               Objects.equals(this.token, deviceRegisterRequest.token) &&
               Objects.equals(this.platform, deviceRegisterRequest.platform) &&
               Objects.equals(this.user, deviceRegisterRequest.user) &&
               Objects.equals(this.meta, deviceRegisterRequest.meta) &&
               Objects.equals(this.topics, deviceRegisterRequest.topics) &&
               Objects.equals(this.timezone, deviceRegisterRequest.timezone) &&
               Objects.equals(this.locale, deviceRegisterRequest.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, provider, token, platform, user, meta, topics, timezone, locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceRegisterRequest {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getId() {
        return this.id;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getToken() {
        return this.token;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getUser() {
        return this.user;
    }

    public Map<String, String> getMeta() {
        return this.meta;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public String getLocale() {
        return this.locale;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("provider")
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("meta")
    public void setMeta(Map<String, String> meta) {
        this.meta = meta;
    }

    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public static class DeviceRegisterRequestBuilder {
        private String id;
        private String provider;
        private String token;
        private String platform;
        private String user;
        private Map<String, String> meta;
        private List<String> topics;
        private String timezone;
        private String locale;

        DeviceRegisterRequestBuilder() {
        }

        @JsonProperty("id")
        public DeviceRegisterRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        @JsonProperty("provider")
        public DeviceRegisterRequestBuilder provider(String provider) {
            this.provider = provider;
            return this;
        }

        @JsonProperty("token")
        public DeviceRegisterRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        @JsonProperty("platform")
        public DeviceRegisterRequestBuilder platform(String platform) {
            this.platform = platform;
            return this;
        }

        @JsonProperty("user")
        public DeviceRegisterRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        @JsonProperty("meta")
        public DeviceRegisterRequestBuilder meta(Map<String, String> meta) {
            this.meta = meta;
            return this;
        }

        @JsonProperty("topics")
        public DeviceRegisterRequestBuilder topics(List<String> topics) {
            this.topics = topics;
            return this;
        }

        @JsonProperty("timezone")
        public DeviceRegisterRequestBuilder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        @JsonProperty("locale")
        public DeviceRegisterRequestBuilder locale(String locale) {
            this.locale = locale;
            return this;
        }

        public DeviceRegisterRequest build() {
            return new DeviceRegisterRequest(
                    this.id,
                    this.provider,
                    this.token,
                    this.platform,
                    this.user,
                    this.meta,
                    this.topics,
                    this.timezone,
                    this.locale
            );
        }

        public String toString() {
            return "DeviceRegisterRequest.DeviceRegisterRequestBuilder(id=" +
                   this.id +
                   ", provider=" +
                   this.provider +
                   ", token=" +
                   this.token +
                   ", platform=" +
                   this.platform +
                   ", user=" +
                   this.user +
                   ", meta=" +
                   this.meta +
                   ", topics=" +
                   this.topics +
                   ", timezone=" +
                   this.timezone +
                   ", locale=" +
                   this.locale +
                   ")";
        }
    }
}
