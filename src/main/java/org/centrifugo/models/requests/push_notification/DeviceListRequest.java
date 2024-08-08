package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * DeviceListRequest
 */
public class DeviceListRequest implements RequestModel {

    @JsonProperty("filter")
    private DeviceFilter filter;

    /**
     * 
     */
    @JsonProperty("include_total_count")
    private Boolean includeTotalCount;

    /**
     * 
     */
    @JsonProperty("include_meta")
    private Boolean includeMeta;

    /**
     * 
     */
    @JsonProperty("include_topics")
    private Boolean includeTopics;

    /**
     * 
     */
    @JsonProperty("cursor")
    private String cursor;

    /**
     * 
     */
    @JsonProperty("limit")
    private Integer limit;

    public DeviceListRequest(
            DeviceFilter filter,
            Boolean includeTotalCount,
            Boolean includeMeta,
            Boolean includeTopics,
            String cursor,
            Integer limit
    ) {
        this.filter = filter;
        this.includeTotalCount = includeTotalCount;
        this.includeMeta = includeMeta;
        this.includeTopics = includeTopics;
        this.cursor = cursor;
        this.limit = limit;
    }

    public DeviceListRequest() {
    }

    public static DeviceListRequestBuilder builder() {
        return new DeviceListRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceListRequest deviceListRequest = (DeviceListRequest) o;
        return Objects.equals(this.filter, deviceListRequest.filter) &&
               Objects.equals(this.includeTotalCount, deviceListRequest.includeTotalCount) &&
               Objects.equals(this.includeMeta, deviceListRequest.includeMeta) &&
               Objects.equals(this.includeTopics, deviceListRequest.includeTopics) &&
               Objects.equals(this.cursor, deviceListRequest.cursor) &&
               Objects.equals(this.limit, deviceListRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, includeTotalCount, includeMeta, includeTopics, cursor, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceListRequest {\n");

        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    includeTotalCount: ").append(toIndentedString(includeTotalCount)).append("\n");
        sb.append("    includeMeta: ").append(toIndentedString(includeMeta)).append("\n");
        sb.append("    includeTopics: ").append(toIndentedString(includeTopics)).append("\n");
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

    public DeviceFilter getFilter() {
        return this.filter;
    }

    public Boolean getIncludeTotalCount() {
        return this.includeTotalCount;
    }

    public Boolean getIncludeMeta() {
        return this.includeMeta;
    }

    public Boolean getIncludeTopics() {
        return this.includeTopics;
    }

    public String getCursor() {
        return this.cursor;
    }

    public Integer getLimit() {
        return this.limit;
    }

    @JsonProperty("filter")
    public void setFilter(DeviceFilter filter) {
        this.filter = filter;
    }

    @JsonProperty("include_total_count")
    public void setIncludeTotalCount(Boolean includeTotalCount) {
        this.includeTotalCount = includeTotalCount;
    }

    @JsonProperty("include_meta")
    public void setIncludeMeta(Boolean includeMeta) {
        this.includeMeta = includeMeta;
    }

    @JsonProperty("include_topics")
    public void setIncludeTopics(Boolean includeTopics) {
        this.includeTopics = includeTopics;
    }

    @JsonProperty("cursor")
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public static class DeviceListRequestBuilder {
        private DeviceFilter filter;
        private Boolean includeTotalCount;
        private Boolean includeMeta;
        private Boolean includeTopics;
        private String cursor;
        private Integer limit;

        DeviceListRequestBuilder() {
        }

        @JsonProperty("filter")
        public DeviceListRequestBuilder filter(DeviceFilter filter) {
            this.filter = filter;
            return this;
        }

        @JsonProperty("include_total_count")
        public DeviceListRequestBuilder includeTotalCount(Boolean includeTotalCount) {
            this.includeTotalCount = includeTotalCount;
            return this;
        }

        @JsonProperty("include_meta")
        public DeviceListRequestBuilder includeMeta(Boolean includeMeta) {
            this.includeMeta = includeMeta;
            return this;
        }

        @JsonProperty("include_topics")
        public DeviceListRequestBuilder includeTopics(Boolean includeTopics) {
            this.includeTopics = includeTopics;
            return this;
        }

        @JsonProperty("cursor")
        public DeviceListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        @JsonProperty("limit")
        public DeviceListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public DeviceListRequest build() {
            return new DeviceListRequest(
                    this.filter,
                    this.includeTotalCount,
                    this.includeMeta,
                    this.includeTopics,
                    this.cursor,
                    this.limit
            );
        }

        public String toString() {
            return "DeviceListRequest.DeviceListRequestBuilder(filter=" +
                   this.filter +
                   ", includeTotalCount=" +
                   this.includeTotalCount +
                   ", includeMeta=" +
                   this.includeMeta +
                   ", includeTopics=" +
                   this.includeTopics +
                   ", cursor=" +
                   this.cursor +
                   ", limit=" +
                   this.limit +
                   ")";
        }
    }
}
