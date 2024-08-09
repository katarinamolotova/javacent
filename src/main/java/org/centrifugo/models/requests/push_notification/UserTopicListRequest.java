package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * User Topic List Request
 */
public class UserTopicListRequest implements RequestModel {

    /**
     * Filter object
     */
    @JsonProperty("filter")
    private UserTopicFilter filter;

    /**
     * Flag indicating whether to include total count info to response
     */
    @JsonProperty("include_total_count")
    private Boolean includeTotalCount;

    /**
     * Cursor for pagination (last id in previous batch, empty for first page)
     */
    @JsonProperty("cursor")
    private String cursor;

    /**
     * Maximum number of UserTopic objects to retrieve
     */
    @JsonProperty("limit")
    private Integer limit;

    public UserTopicListRequest(UserTopicFilter filter, Boolean includeTotalCount, String cursor, Integer limit) {
        this.filter = filter;
        this.includeTotalCount = includeTotalCount;
        this.cursor = cursor;
        this.limit = limit;
    }

    public UserTopicListRequest() {
    }

    public static UserTopicListRequestBuilder builder() {
        return new UserTopicListRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserTopicListRequest userTopicListRequest = (UserTopicListRequest) o;
        return Objects.equals(this.filter, userTopicListRequest.filter) &&
               Objects.equals(this.includeTotalCount, userTopicListRequest.includeTotalCount) &&
               Objects.equals(this.cursor, userTopicListRequest.cursor) &&
               Objects.equals(this.limit, userTopicListRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, includeTotalCount, cursor, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserTopicListRequest {\n");

        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    includeTotalCount: ").append(toIndentedString(includeTotalCount)).append("\n");
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

    public UserTopicFilter getFilter() {
        return this.filter;
    }

    public Boolean getIncludeTotalCount() {
        return this.includeTotalCount;
    }

    public String getCursor() {
        return this.cursor;
    }

    public Integer getLimit() {
        return this.limit;
    }

    @JsonProperty("filter")
    public void setFilter(UserTopicFilter filter) {
        this.filter = filter;
    }

    @JsonProperty("include_total_count")
    public void setIncludeTotalCount(Boolean includeTotalCount) {
        this.includeTotalCount = includeTotalCount;
    }

    @JsonProperty("cursor")
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public static class UserTopicListRequestBuilder {
        private UserTopicFilter filter;
        private Boolean includeTotalCount;
        private String cursor;
        private Integer limit;

        UserTopicListRequestBuilder() {
        }

        @JsonProperty("filter")
        public UserTopicListRequestBuilder filter(UserTopicFilter filter) {
            this.filter = filter;
            return this;
        }

        @JsonProperty("include_total_count")
        public UserTopicListRequestBuilder includeTotalCount(Boolean includeTotalCount) {
            this.includeTotalCount = includeTotalCount;
            return this;
        }

        @JsonProperty("cursor")
        public UserTopicListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        @JsonProperty("limit")
        public UserTopicListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public UserTopicListRequest build() {
            return new UserTopicListRequest(this.filter, this.includeTotalCount, this.cursor, this.limit);
        }

        public String toString() {
            return "UserTopicListRequest.UserTopicListRequestBuilder(filter=" +
                   this.filter +
                   ", includeTotalCount=" +
                   this.includeTotalCount +
                   ", cursor=" +
                   this.cursor +
                   ", limit=" +
                   this.limit +
                   ")";
        }
    }
}
