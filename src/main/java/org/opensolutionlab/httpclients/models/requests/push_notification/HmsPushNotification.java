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
 * Hms Push Notification
 */
public class HmsPushNotification {

    /**
     * HMS Message described in HMS Push Kit docs
     */
    @JsonProperty("message")
    private Object message;

    public HmsPushNotification(Object message) {
        this.message = message;
    }

    public HmsPushNotification() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HmsPushNotification hmsPushNotification = (HmsPushNotification) o;
        return Objects.equals(this.message, hmsPushNotification.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HmsPushNotification {\n");

        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public Object getMessage() {
        return this.message;
    }

    @JsonProperty("message")
    public void setMessage(Object message) {
        this.message = message;
    }
}
