package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DeviceMetaUpdate
 */
public class DeviceMetaUpdate {

    @JsonProperty("meta")
    private Map<String, String> meta = null;

    public DeviceMetaUpdate(Map<String, String> meta) {
        this.meta = meta;
    }

    public DeviceMetaUpdate() {
    }

    public DeviceMetaUpdate putMetaItem(String key, String metaItem) {

        if (this.meta == null) {
            this.meta = new HashMap<String, String>();
        }

        this.meta.put(key, metaItem);
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
        DeviceMetaUpdate deviceMetaUpdate = (DeviceMetaUpdate) o;
        return Objects.equals(this.meta, deviceMetaUpdate.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceMetaUpdate {\n");

        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public Map<String, String> getMeta() {
        return this.meta;
    }

    @JsonProperty("meta")
    public void setMeta(Map<String, String> meta) {
        this.meta = meta;
    }
}
