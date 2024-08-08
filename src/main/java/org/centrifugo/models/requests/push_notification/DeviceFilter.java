package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DeviceFilter
 */
public class DeviceFilter {

    @JsonProperty("ids")
    private List<String> ids;

    /**
     * 
     */
    @JsonProperty("users")
    private List<String> users;

    /**
     * 
     */
    @JsonProperty("topics")
    private List<String> topics;

    /**
     * 
     */
    @JsonProperty("providers")
    private List<String> providers;

    /**
     * 
     */
    @JsonProperty("platforms")
    private List<String> platforms;

    public DeviceFilter(
            List<String> ids,
            List<String> users,
            List<String> topics,
            List<String> providers,
            List<String> platforms
    ) {
        this.ids = ids;
        this.users = users;
        this.topics = topics;
        this.providers = providers;
        this.platforms = platforms;
    }

    public DeviceFilter() {
    }

    public static DeviceFilterBuilder builder() {
        return new DeviceFilterBuilder();
    }

    public DeviceFilter addIdsItem(String idsItem) {

        if (this.ids == null) {
            this.ids = new ArrayList<String>();
        }

        this.ids.add(idsItem);
        return this;
    }

    public DeviceFilter addUsersItem(String usersItem) {

        if (this.users == null) {
            this.users = new ArrayList<String>();
        }

        this.users.add(usersItem);
        return this;
    }

    public DeviceFilter addTopicsItem(String topicsItem) {

        if (this.topics == null) {
            this.topics = new ArrayList<String>();
        }

        this.topics.add(topicsItem);
        return this;
    }

    public DeviceFilter addProvidersItem(String providersItem) {

        if (this.providers == null) {
            this.providers = new ArrayList<String>();
        }

        this.providers.add(providersItem);
        return this;
    }

    public DeviceFilter addPlatformsItem(String platformsItem) {

        if (this.platforms == null) {
            this.platforms = new ArrayList<String>();
        }

        this.platforms.add(platformsItem);
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
        DeviceFilter deviceFilter = (DeviceFilter) o;
        return Objects.equals(this.ids, deviceFilter.ids) &&
               Objects.equals(this.users, deviceFilter.users) &&
               Objects.equals(this.topics, deviceFilter.topics) &&
               Objects.equals(this.providers, deviceFilter.providers) &&
               Objects.equals(this.platforms, deviceFilter.platforms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, users, topics, providers, platforms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceFilter {\n");

        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
        sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
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

    public List<String> getTopics() {
        return this.topics;
    }

    public List<String> getProviders() {
        return this.providers;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    @JsonProperty("ids")
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @JsonProperty("providers")
    public void setProviders(List<String> providers) {
        this.providers = providers;
    }

    @JsonProperty("platforms")
    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }

    public static class DeviceFilterBuilder {
        private List<String> ids;
        private List<String> users;
        private List<String> topics;
        private List<String> providers;
        private List<String> platforms;

        DeviceFilterBuilder() {
        }

        @JsonProperty("ids")
        public DeviceFilterBuilder ids(List<String> ids) {
            this.ids = ids;
            return this;
        }

        @JsonProperty("users")
        public DeviceFilterBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        @JsonProperty("topics")
        public DeviceFilterBuilder topics(List<String> topics) {
            this.topics = topics;
            return this;
        }

        @JsonProperty("providers")
        public DeviceFilterBuilder providers(List<String> providers) {
            this.providers = providers;
            return this;
        }

        @JsonProperty("platforms")
        public DeviceFilterBuilder platforms(List<String> platforms) {
            this.platforms = platforms;
            return this;
        }

        public DeviceFilter build() {
            return new DeviceFilter(this.ids, this.users, this.topics, this.providers, this.platforms);
        }

        public String toString() {
            return "DeviceFilter.DeviceFilterBuilder(ids=" +
                   this.ids +
                   ", users=" +
                   this.users +
                   ", topics=" +
                   this.topics +
                   ", providers=" +
                   this.providers +
                   ", platforms=" +
                   this.platforms +
                   ")";
        }
    }
}
