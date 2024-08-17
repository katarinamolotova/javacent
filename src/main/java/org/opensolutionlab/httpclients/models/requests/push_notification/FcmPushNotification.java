package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Fcm Push Notification
 */
public class FcmPushNotification {

    /**
     * FCM Message described in FCM docs
     */
    @JsonProperty("message")
    private Object message;

    public FcmPushNotification(Object message) {
        this.message = message;
    }

    public FcmPushNotification() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FcmPushNotification fcmPushNotification = (FcmPushNotification) o;
        return Objects.equals(this.message, fcmPushNotification.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FcmPushNotification {\n");

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
