package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Device Locale Update
 */
public class DeviceLocaleUpdate {

    /**
     * Locale to set
     */
    @JsonProperty("locale")
    private String locale;

    public DeviceLocaleUpdate(String locale) {
        this.locale = locale;
    }

    public DeviceLocaleUpdate() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceLocaleUpdate deviceLocaleUpdate = (DeviceLocaleUpdate) o;
        return Objects.equals(this.locale, deviceLocaleUpdate.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceLocaleUpdate {\n");

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

    public String getLocale() {
        return this.locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }
}
