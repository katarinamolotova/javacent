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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Apns Push Notification
 */
public class ApnsPushNotification {

    /**
     * APNs headers
     */
    @JsonProperty("headers")
    private Map<String, String> headers;

    /**
     * APNs payload
     */
    @JsonProperty("payload")
    private Object payload;

    public ApnsPushNotification(Map<String, String> headers, Object payload) {
        this.headers = headers;
        this.payload = payload;
    }

    public ApnsPushNotification() {
    }

    public static ApnsPushNotificationBuilder builder() {
        return new ApnsPushNotificationBuilder();
    }

    public ApnsPushNotification putHeadersItem(String key, String headersItem) {

        if (this.headers == null) {
            this.headers = new HashMap<String, String>();
        }

        this.headers.put(key, headersItem);
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
        ApnsPushNotification apnsPushNotification = (ApnsPushNotification) o;
        return Objects.equals(this.headers, apnsPushNotification.headers) &&
               Objects.equals(this.payload, apnsPushNotification.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headers, payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApnsPushNotification {\n");

        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Object getPayload() {
        return this.payload;
    }

    @JsonProperty("headers")
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    @JsonProperty("payload")
    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public static class ApnsPushNotificationBuilder {
        private Map<String, String> headers;
        private Object payload;

        ApnsPushNotificationBuilder() {
        }

        @JsonProperty("headers")
        public ApnsPushNotificationBuilder headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        @JsonProperty("payload")
        public ApnsPushNotificationBuilder payload(Object payload) {
            this.payload = payload;
            return this;
        }

        public ApnsPushNotification build() {
            return new ApnsPushNotification(this.headers, this.payload);
        }

        public String toString() {
            return "ApnsPushNotification.ApnsPushNotificationBuilder(headers=" +
                   this.headers +
                   ", payload=" +
                   this.payload +
                   ")";
        }
    }
}
