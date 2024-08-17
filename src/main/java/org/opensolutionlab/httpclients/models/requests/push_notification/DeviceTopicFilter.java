/*
 * Copyright 2024 Molotova Katerina, Kukhtachev Mikhail.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Device Topic Filter
 */
public class DeviceTopicFilter {

    /**
     * List of device IDs to filter results
     */
    @JsonProperty("device_ids")
    private List<String> deviceIds;

    /**
     * List of device token providers to filter results
     */
    @JsonProperty("device_providers")
    private List<String> deviceProviders;

    /**
     * List of device platforms to filter results
     */
    @JsonProperty("device_platforms")
    private List<String> devicePlatforms;

    /**
     * List of device users to filter results
     */
    @JsonProperty("device_users")
    private List<String> deviceUsers;

    /**
     * List of topics to filter results
     */
    @JsonProperty("topics")
    private List<String> topics;

    /**
     * Topic prefix to filter results
     */
    @JsonProperty("topic_prefix")
    private String topicPrefix;

    public DeviceTopicFilter(
            List<String> deviceIds,
            List<String> deviceProviders,
            List<String> devicePlatforms,
            List<String> deviceUsers,
            List<String> topics,
            String topicPrefix
    ) {
        this.deviceIds = deviceIds;
        this.deviceProviders = deviceProviders;
        this.devicePlatforms = devicePlatforms;
        this.deviceUsers = deviceUsers;
        this.topics = topics;
        this.topicPrefix = topicPrefix;
    }

    public DeviceTopicFilter() {
    }

    public static DeviceTopicFilterBuilder builder() {
        return new DeviceTopicFilterBuilder();
    }

    public DeviceTopicFilter addDeviceIdsItem(String deviceIdsItem) {

        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<String>();
        }

        this.deviceIds.add(deviceIdsItem);
        return this;
    }

    public DeviceTopicFilter addDeviceProvidersItem(String deviceProvidersItem) {

        if (this.deviceProviders == null) {
            this.deviceProviders = new ArrayList<String>();
        }

        this.deviceProviders.add(deviceProvidersItem);
        return this;
    }

    public DeviceTopicFilter addDevicePlatformsItem(String devicePlatformsItem) {

        if (this.devicePlatforms == null) {
            this.devicePlatforms = new ArrayList<String>();
        }

        this.devicePlatforms.add(devicePlatformsItem);
        return this;
    }

    public DeviceTopicFilter addDeviceUsersItem(String deviceUsersItem) {

        if (this.deviceUsers == null) {
            this.deviceUsers = new ArrayList<String>();
        }

        this.deviceUsers.add(deviceUsersItem);
        return this;
    }

    public DeviceTopicFilter addTopicsItem(String topicsItem) {

        if (this.topics == null) {
            this.topics = new ArrayList<String>();
        }

        this.topics.add(topicsItem);
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
        DeviceTopicFilter deviceTopicFilter = (DeviceTopicFilter) o;
        return Objects.equals(this.deviceIds, deviceTopicFilter.deviceIds) &&
               Objects.equals(this.deviceProviders, deviceTopicFilter.deviceProviders) &&
               Objects.equals(this.devicePlatforms, deviceTopicFilter.devicePlatforms) &&
               Objects.equals(this.deviceUsers, deviceTopicFilter.deviceUsers) &&
               Objects.equals(this.topics, deviceTopicFilter.topics) &&
               Objects.equals(this.topicPrefix, deviceTopicFilter.topicPrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceIds, deviceProviders, devicePlatforms, deviceUsers, topics, topicPrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceTopicFilter {\n");

        sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
        sb.append("    deviceProviders: ").append(toIndentedString(deviceProviders)).append("\n");
        sb.append("    devicePlatforms: ").append(toIndentedString(devicePlatforms)).append("\n");
        sb.append("    deviceUsers: ").append(toIndentedString(deviceUsers)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    topicPrefix: ").append(toIndentedString(topicPrefix)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public List<String> getDeviceIds() {
        return this.deviceIds;
    }

    public List<String> getDeviceProviders() {
        return this.deviceProviders;
    }

    public List<String> getDevicePlatforms() {
        return this.devicePlatforms;
    }

    public List<String> getDeviceUsers() {
        return this.deviceUsers;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    public String getTopicPrefix() {
        return this.topicPrefix;
    }

    @JsonProperty("device_ids")
    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    @JsonProperty("device_providers")
    public void setDeviceProviders(List<String> deviceProviders) {
        this.deviceProviders = deviceProviders;
    }

    @JsonProperty("device_platforms")
    public void setDevicePlatforms(List<String> devicePlatforms) {
        this.devicePlatforms = devicePlatforms;
    }

    @JsonProperty("device_users")
    public void setDeviceUsers(List<String> deviceUsers) {
        this.deviceUsers = deviceUsers;
    }

    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @JsonProperty("topic_prefix")
    public void setTopicPrefix(String topicPrefix) {
        this.topicPrefix = topicPrefix;
    }

    public static class DeviceTopicFilterBuilder {
        private List<String> deviceIds;
        private List<String> deviceProviders;
        private List<String> devicePlatforms;
        private List<String> deviceUsers;
        private List<String> topics;
        private String topicPrefix;

        DeviceTopicFilterBuilder() {
        }

        @JsonProperty("device_ids")
        public DeviceTopicFilterBuilder deviceIds(List<String> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        @JsonProperty("device_providers")
        public DeviceTopicFilterBuilder deviceProviders(List<String> deviceProviders) {
            this.deviceProviders = deviceProviders;
            return this;
        }

        @JsonProperty("device_platforms")
        public DeviceTopicFilterBuilder devicePlatforms(List<String> devicePlatforms) {
            this.devicePlatforms = devicePlatforms;
            return this;
        }

        @JsonProperty("device_users")
        public DeviceTopicFilterBuilder deviceUsers(List<String> deviceUsers) {
            this.deviceUsers = deviceUsers;
            return this;
        }

        @JsonProperty("topics")
        public DeviceTopicFilterBuilder topics(List<String> topics) {
            this.topics = topics;
            return this;
        }

        @JsonProperty("topic_prefix")
        public DeviceTopicFilterBuilder topicPrefix(String topicPrefix) {
            this.topicPrefix = topicPrefix;
            return this;
        }

        public DeviceTopicFilter build() {
            return new DeviceTopicFilter(
                    this.deviceIds,
                    this.deviceProviders,
                    this.devicePlatforms,
                    this.deviceUsers,
                    this.topics,
                    this.topicPrefix
            );
        }

        public String toString() {
            return "DeviceTopicFilter.DeviceTopicFilterBuilder(deviceIds=" +
                   this.deviceIds +
                   ", deviceProviders=" +
                   this.deviceProviders +
                   ", devicePlatforms=" +
                   this.devicePlatforms +
                   ", deviceUsers=" +
                   this.deviceUsers +
                   ", topics=" +
                   this.topics +
                   ", topicPrefix=" +
                   this.topicPrefix +
                   ")";
        }
    }
}
