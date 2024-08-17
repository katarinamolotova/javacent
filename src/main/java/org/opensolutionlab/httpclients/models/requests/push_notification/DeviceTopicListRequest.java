package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Device Topic List Request
 */
public class DeviceTopicListRequest implements RequestModel {

    /**
     * List of device IDs to filter results
     */
    @JsonProperty("filter")
    private DeviceTopicFilter filter;

    /**
     * Flag indicating whether to include total count info to response
     */
    @JsonProperty("include_total_count")
    private Boolean includeTotalCount;

    /**
     * Flag indicating whether to include Device information for each object
     */
    @JsonProperty("include_device")
    private Boolean includeDevice;

    /**
     * Cursor for pagination (last device id in previous batch, empty for first page)
     */
    @JsonProperty("cursor")
    private String cursor;

    /**
     * Maximum number of devices to retrieve
     */
    @JsonProperty("limit")
    private Integer limit;

    public DeviceTopicListRequest(
            DeviceTopicFilter filter,
            Boolean includeTotalCount,
            Boolean includeDevice,
            String cursor,
            Integer limit
    ) {
        this.filter = filter;
        this.includeTotalCount = includeTotalCount;
        this.includeDevice = includeDevice;
        this.cursor = cursor;
        this.limit = limit;
    }

    public DeviceTopicListRequest() {
    }

    public static DeviceTopicListRequestBuilder builder() {
        return new DeviceTopicListRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceTopicListRequest deviceTopicListRequest = (DeviceTopicListRequest) o;
        return Objects.equals(this.filter, deviceTopicListRequest.filter) &&
               Objects.equals(this.includeTotalCount, deviceTopicListRequest.includeTotalCount) &&
               Objects.equals(this.includeDevice, deviceTopicListRequest.includeDevice) &&
               Objects.equals(this.cursor, deviceTopicListRequest.cursor) &&
               Objects.equals(this.limit, deviceTopicListRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, includeTotalCount, includeDevice, cursor, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceTopicListRequest {\n");

        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    includeTotalCount: ").append(toIndentedString(includeTotalCount)).append("\n");
        sb.append("    includeDevice: ").append(toIndentedString(includeDevice)).append("\n");
        sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public DeviceTopicFilter getFilter() {
        return this.filter;
    }

    public Boolean getIncludeTotalCount() {
        return this.includeTotalCount;
    }

    public Boolean getIncludeDevice() {
        return this.includeDevice;
    }

    public String getCursor() {
        return this.cursor;
    }

    public Integer getLimit() {
        return this.limit;
    }

    @JsonProperty("filter")
    public void setFilter(DeviceTopicFilter filter) {
        this.filter = filter;
    }

    @JsonProperty("include_total_count")
    public void setIncludeTotalCount(Boolean includeTotalCount) {
        this.includeTotalCount = includeTotalCount;
    }

    @JsonProperty("include_device")
    public void setIncludeDevice(Boolean includeDevice) {
        this.includeDevice = includeDevice;
    }

    @JsonProperty("cursor")
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public static class DeviceTopicListRequestBuilder {
        private DeviceTopicFilter filter;
        private Boolean includeTotalCount;
        private Boolean includeDevice;
        private String cursor;
        private Integer limit;

        DeviceTopicListRequestBuilder() {
        }

        @JsonProperty("filter")
        public DeviceTopicListRequestBuilder filter(DeviceTopicFilter filter) {
            this.filter = filter;
            return this;
        }

        @JsonProperty("include_total_count")
        public DeviceTopicListRequestBuilder includeTotalCount(Boolean includeTotalCount) {
            this.includeTotalCount = includeTotalCount;
            return this;
        }

        @JsonProperty("include_device")
        public DeviceTopicListRequestBuilder includeDevice(Boolean includeDevice) {
            this.includeDevice = includeDevice;
            return this;
        }

        @JsonProperty("cursor")
        public DeviceTopicListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        @JsonProperty("limit")
        public DeviceTopicListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public DeviceTopicListRequest build() {
            return new DeviceTopicListRequest(
                    this.filter,
                    this.includeTotalCount,
                    this.includeDevice,
                    this.cursor,
                    this.limit
            );
        }

        public String toString() {
            return "DeviceTopicListRequest.DeviceTopicListRequestBuilder(filter=" +
                   this.filter +
                   ", includeTotalCount=" +
                   this.includeTotalCount +
                   ", includeDevice=" +
                   this.includeDevice +
                   ", cursor=" +
                   this.cursor +
                   ", limit=" +
                   this.limit +
                   ")";
        }
    }
}
