package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeviceUserUpdate
 */
public class DeviceUserUpdate {

    @JsonProperty("user")
    private String user;

    public DeviceUserUpdate(String user) {
        this.user = user;
    }

    public DeviceUserUpdate() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceUserUpdate deviceUserUpdate = (DeviceUserUpdate) o;
        return Objects.equals(this.user, deviceUserUpdate.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceUserUpdate {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getUser() {
        return this.user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }
}
