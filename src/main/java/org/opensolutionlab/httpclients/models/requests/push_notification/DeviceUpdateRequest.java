package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Device Update Request
 */
public class DeviceUpdateRequest implements RequestModel {

    /**
     * Device ids to filter
     */
    @JsonProperty("ids")
    private List<String> ids;

    /**
     * Device users filter
     */
    @JsonProperty("users")
    private List<String> users;

    /**
     * Optional user update object
     */
    @JsonProperty("user_update")
    private DeviceUserUpdate userUpdate;

    /**
     * Optional device meta update object
     */
    @JsonProperty("meta_update")
    private DeviceMetaUpdate metaUpdate;

    /**
     * Optional topics update object
     */
    @JsonProperty("topics_update")
    private DeviceTopicsUpdate topicsUpdate;

    /**
     * Optional timezone update object
     */
    @JsonProperty("timezone_update")
    private DeviceTimezoneUpdate timezoneUpdate;

    /**
     * Optional locale update object
     */
    @JsonProperty("locale_update")
    private DeviceLocaleUpdate localeUpdate;

    public DeviceUpdateRequest(
            List<String> ids,
            List<String> users,
            DeviceUserUpdate userUpdate,
            DeviceMetaUpdate metaUpdate,
            DeviceTopicsUpdate topicsUpdate,
            DeviceTimezoneUpdate timezoneUpdate,
            DeviceLocaleUpdate localeUpdate
    ) {
        this.ids = ids;
        this.users = users;
        this.userUpdate = userUpdate;
        this.metaUpdate = metaUpdate;
        this.topicsUpdate = topicsUpdate;
        this.timezoneUpdate = timezoneUpdate;
        this.localeUpdate = localeUpdate;
    }

    public DeviceUpdateRequest() {
    }

    public static DeviceUpdateRequestBuilder builder() {
        return new DeviceUpdateRequestBuilder();
    }

    public DeviceUpdateRequest addIdsItem(String idsItem) {

        if (this.ids == null) {
            this.ids = new ArrayList<String>();
        }

        this.ids.add(idsItem);
        return this;
    }

    public DeviceUpdateRequest addUsersItem(String usersItem) {

        if (this.users == null) {
            this.users = new ArrayList<String>();
        }

        this.users.add(usersItem);
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
        DeviceUpdateRequest deviceUpdateRequest = (DeviceUpdateRequest) o;
        return Objects.equals(this.ids, deviceUpdateRequest.ids) &&
               Objects.equals(this.users, deviceUpdateRequest.users) &&
               Objects.equals(this.userUpdate, deviceUpdateRequest.userUpdate) &&
               Objects.equals(this.metaUpdate, deviceUpdateRequest.metaUpdate) &&
               Objects.equals(this.topicsUpdate, deviceUpdateRequest.topicsUpdate) &&
               Objects.equals(this.timezoneUpdate, deviceUpdateRequest.timezoneUpdate) &&
               Objects.equals(this.localeUpdate, deviceUpdateRequest.localeUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, users, userUpdate, metaUpdate, topicsUpdate, timezoneUpdate, localeUpdate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceUpdateRequest {\n");

        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    userUpdate: ").append(toIndentedString(userUpdate)).append("\n");
        sb.append("    metaUpdate: ").append(toIndentedString(metaUpdate)).append("\n");
        sb.append("    topicsUpdate: ").append(toIndentedString(topicsUpdate)).append("\n");
        sb.append("    timezoneUpdate: ").append(toIndentedString(timezoneUpdate)).append("\n");
        sb.append("    localeUpdate: ").append(toIndentedString(localeUpdate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public List<String> getIds() {
        return this.ids;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public DeviceUserUpdate getUserUpdate() {
        return this.userUpdate;
    }

    public DeviceMetaUpdate getMetaUpdate() {
        return this.metaUpdate;
    }

    public DeviceTopicsUpdate getTopicsUpdate() {
        return this.topicsUpdate;
    }

    public DeviceTimezoneUpdate getTimezoneUpdate() {
        return this.timezoneUpdate;
    }

    public DeviceLocaleUpdate getLocaleUpdate() {
        return this.localeUpdate;
    }

    @JsonProperty("ids")
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    @JsonProperty("user_update")
    public void setUserUpdate(DeviceUserUpdate userUpdate) {
        this.userUpdate = userUpdate;
    }

    @JsonProperty("meta_update")
    public void setMetaUpdate(DeviceMetaUpdate metaUpdate) {
        this.metaUpdate = metaUpdate;
    }

    @JsonProperty("topics_update")
    public void setTopicsUpdate(DeviceTopicsUpdate topicsUpdate) {
        this.topicsUpdate = topicsUpdate;
    }

    @JsonProperty("timezone_update")
    public void setTimezoneUpdate(DeviceTimezoneUpdate timezoneUpdate) {
        this.timezoneUpdate = timezoneUpdate;
    }

    @JsonProperty("locale_update")
    public void setLocaleUpdate(DeviceLocaleUpdate localeUpdate) {
        this.localeUpdate = localeUpdate;
    }

    public static class DeviceUpdateRequestBuilder {
        private List<String> ids;
        private List<String> users;
        private DeviceUserUpdate userUpdate;
        private DeviceMetaUpdate metaUpdate;
        private DeviceTopicsUpdate topicsUpdate;
        private DeviceTimezoneUpdate timezoneUpdate;
        private DeviceLocaleUpdate localeUpdate;

        DeviceUpdateRequestBuilder() {
        }

        @JsonProperty("ids")
        public DeviceUpdateRequestBuilder ids(List<String> ids) {
            this.ids = ids;
            return this;
        }

        @JsonProperty("users")
        public DeviceUpdateRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        @JsonProperty("user_update")
        public DeviceUpdateRequestBuilder userUpdate(DeviceUserUpdate userUpdate) {
            this.userUpdate = userUpdate;
            return this;
        }

        @JsonProperty("meta_update")
        public DeviceUpdateRequestBuilder metaUpdate(DeviceMetaUpdate metaUpdate) {
            this.metaUpdate = metaUpdate;
            return this;
        }

        @JsonProperty("topics_update")
        public DeviceUpdateRequestBuilder topicsUpdate(DeviceTopicsUpdate topicsUpdate) {
            this.topicsUpdate = topicsUpdate;
            return this;
        }

        @JsonProperty("timezone_update")
        public DeviceUpdateRequestBuilder timezoneUpdate(DeviceTimezoneUpdate timezoneUpdate) {
            this.timezoneUpdate = timezoneUpdate;
            return this;
        }

        @JsonProperty("locale_update")
        public DeviceUpdateRequestBuilder localeUpdate(DeviceLocaleUpdate localeUpdate) {
            this.localeUpdate = localeUpdate;
            return this;
        }

        public DeviceUpdateRequest build() {
            return new DeviceUpdateRequest(
                    this.ids,
                    this.users,
                    this.userUpdate,
                    this.metaUpdate,
                    this.topicsUpdate,
                    this.timezoneUpdate,
                    this.localeUpdate
            );
        }

        public String toString() {
            return "DeviceUpdateRequest.DeviceUpdateRequestBuilder(ids=" +
                   this.ids +
                   ", users=" +
                   this.users +
                   ", userUpdate=" +
                   this.userUpdate +
                   ", metaUpdate=" +
                   this.metaUpdate +
                   ", topicsUpdate=" +
                   this.topicsUpdate +
                   ", timezoneUpdate=" +
                   this.timezoneUpdate +
                   ", localeUpdate=" +
                   this.localeUpdate +
                   ")";
        }
    }
}
