package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeviceTimezoneUpdate
 */
public class DeviceTimezoneUpdate {

    @JsonProperty("timezone")
    private String timezone;

    public DeviceTimezoneUpdate(String timezone) {
        this.timezone = timezone;
    }

    public DeviceTimezoneUpdate() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceTimezoneUpdate deviceTimezoneUpdate = (DeviceTimezoneUpdate) o;
        return Objects.equals(this.timezone, deviceTimezoneUpdate.timezone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timezone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceTimezoneUpdate {\n");

        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getTimezone() {
        return this.timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}



