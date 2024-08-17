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
 * Push Notification
 */
public class PushNotification {

    /**
     * Notification for FCM
     */
    @JsonProperty("fcm")
    private FcmPushNotification fcm;

    /**
     * Notification for HMS
     */
    @JsonProperty("hms")
    private HmsPushNotification hms;

    /**
     * Notification for APNs
     */
    @JsonProperty("apns")
    private ApnsPushNotification apns;

    /**
     * Unix timestamp when Centrifugo stops attempting to send this notification
     */
    @JsonProperty("expire_at")
    private Integer expireAt;

    public PushNotification(
            FcmPushNotification fcm,
            HmsPushNotification hms,
            ApnsPushNotification apns,
            Integer expireAt
    ) {
        this.fcm = fcm;
        this.hms = hms;
        this.apns = apns;
        this.expireAt = expireAt;
    }

    public PushNotification() {
    }

    public static PushNotificationBuilder builder() {
        return new PushNotificationBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PushNotification pushNotification = (PushNotification) o;
        return Objects.equals(this.fcm, pushNotification.fcm) &&
               Objects.equals(this.hms, pushNotification.hms) &&
               Objects.equals(this.apns, pushNotification.apns) &&
               Objects.equals(this.expireAt, pushNotification.expireAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fcm, hms, apns, expireAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushNotification {\n");

        sb.append("    fcm: ").append(toIndentedString(fcm)).append("\n");
        sb.append("    hms: ").append(toIndentedString(hms)).append("\n");
        sb.append("    apns: ").append(toIndentedString(apns)).append("\n");
        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public FcmPushNotification getFcm() {
        return this.fcm;
    }

    public HmsPushNotification getHms() {
        return this.hms;
    }

    public ApnsPushNotification getApns() {
        return this.apns;
    }

    public Integer getExpireAt() {
        return this.expireAt;
    }

    @JsonProperty("fcm")
    public void setFcm(FcmPushNotification fcm) {
        this.fcm = fcm;
    }

    @JsonProperty("hms")
    public void setHms(HmsPushNotification hms) {
        this.hms = hms;
    }

    @JsonProperty("apns")
    public void setApns(ApnsPushNotification apns) {
        this.apns = apns;
    }

    @JsonProperty("expire_at")
    public void setExpireAt(Integer expireAt) {
        this.expireAt = expireAt;
    }

    public static class PushNotificationBuilder {
        private FcmPushNotification fcm;
        private HmsPushNotification hms;
        private ApnsPushNotification apns;
        private Integer expireAt;

        PushNotificationBuilder() {
        }

        @JsonProperty("fcm")
        public PushNotificationBuilder fcm(FcmPushNotification fcm) {
            this.fcm = fcm;
            return this;
        }

        @JsonProperty("hms")
        public PushNotificationBuilder hms(HmsPushNotification hms) {
            this.hms = hms;
            return this;
        }

        @JsonProperty("apns")
        public PushNotificationBuilder apns(ApnsPushNotification apns) {
            this.apns = apns;
            return this;
        }

        @JsonProperty("expire_at")
        public PushNotificationBuilder expireAt(Integer expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        public PushNotification build() {
            return new PushNotification(this.fcm, this.hms, this.apns, this.expireAt);
        }

        public String toString() {
            return "PushNotification.PushNotificationBuilder(fcm=" +
                   this.fcm +
                   ", hms=" +
                   this.hms +
                   ", apns=" +
                   this.apns +
                   ", expireAt=" +
                   this.expireAt +
                   ")";
        }
    }
}
