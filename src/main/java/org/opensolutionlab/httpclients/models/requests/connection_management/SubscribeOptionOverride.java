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

package org.opensolutionlab.httpclients.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Subscribe Option Override
 */
public class SubscribeOptionOverride {

    /**
     * <b>Required.</b> Override presence
     */
    @JsonProperty("presence")
    private BoolValue presence;

    /**
     * <b>Required.</b> Override join_leave
     */
    @JsonProperty("join_leave")
    private BoolValue joinLeave;

    /**
     * <b>Required.</b> Override force_recovery
     */
    @JsonProperty("force_recovery")
    private BoolValue forceRecovery;

    /**
     * <b>Required.</b> Override force_positioning
     */
    @JsonProperty("force_positioning")
    private BoolValue forcePositioning;

    /**
     * <b>Required.</b> Override force_push_join_leave
     */
    @JsonProperty("force_push_join_leave")
    private BoolValue forcePushJoinLeave;

    public SubscribeOptionOverride(
            BoolValue presence,
            BoolValue joinLeave,
            BoolValue forceRecovery,
            BoolValue forcePositioning,
            BoolValue forcePushJoinLeave
    ) {
        this.presence = presence;
        this.joinLeave = joinLeave;
        this.forceRecovery = forceRecovery;
        this.forcePositioning = forcePositioning;
        this.forcePushJoinLeave = forcePushJoinLeave;
    }

    public SubscribeOptionOverride() {
    }

    public static SubscribeOptionOverrideBuilder builder() {
        return new SubscribeOptionOverrideBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscribeOptionOverride subscribeOptionOverride = (SubscribeOptionOverride) o;
        return Objects.equals(this.presence, subscribeOptionOverride.presence) &&
               Objects.equals(this.joinLeave, subscribeOptionOverride.joinLeave) &&
               Objects.equals(this.forceRecovery, subscribeOptionOverride.forceRecovery) &&
               Objects.equals(this.forcePositioning, subscribeOptionOverride.forcePositioning) &&
               Objects.equals(this.forcePushJoinLeave, subscribeOptionOverride.forcePushJoinLeave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(presence, joinLeave, forceRecovery, forcePositioning, forcePushJoinLeave);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeOptionOverride {\n");

        sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
        sb.append("    joinLeave: ").append(toIndentedString(joinLeave)).append("\n");
        sb.append("    forceRecovery: ").append(toIndentedString(forceRecovery)).append("\n");
        sb.append("    forcePositioning: ").append(toIndentedString(forcePositioning)).append("\n");
        sb.append("    forcePushJoinLeave: ").append(toIndentedString(forcePushJoinLeave)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public BoolValue getPresence() {
        return this.presence;
    }

    public BoolValue getJoinLeave() {
        return this.joinLeave;
    }

    public BoolValue getForceRecovery() {
        return this.forceRecovery;
    }

    public BoolValue getForcePositioning() {
        return this.forcePositioning;
    }

    public BoolValue getForcePushJoinLeave() {
        return this.forcePushJoinLeave;
    }

    @JsonProperty("presence")
    public void setPresence(BoolValue presence) {
        this.presence = presence;
    }

    @JsonProperty("join_leave")
    public void setJoinLeave(BoolValue joinLeave) {
        this.joinLeave = joinLeave;
    }

    @JsonProperty("force_recovery")
    public void setForceRecovery(BoolValue forceRecovery) {
        this.forceRecovery = forceRecovery;
    }

    @JsonProperty("force_positioning")
    public void setForcePositioning(BoolValue forcePositioning) {
        this.forcePositioning = forcePositioning;
    }

    @JsonProperty("force_push_join_leave")
    public void setForcePushJoinLeave(BoolValue forcePushJoinLeave) {
        this.forcePushJoinLeave = forcePushJoinLeave;
    }

    public static class SubscribeOptionOverrideBuilder {
        private BoolValue presence;
        private BoolValue joinLeave;
        private BoolValue forceRecovery;
        private BoolValue forcePositioning;
        private BoolValue forcePushJoinLeave;

        SubscribeOptionOverrideBuilder() {
        }

        @JsonProperty("presence")
        public SubscribeOptionOverrideBuilder presence(BoolValue presence) {
            this.presence = presence;
            return this;
        }

        @JsonProperty("join_leave")
        public SubscribeOptionOverrideBuilder joinLeave(BoolValue joinLeave) {
            this.joinLeave = joinLeave;
            return this;
        }

        @JsonProperty("force_recovery")
        public SubscribeOptionOverrideBuilder forceRecovery(BoolValue forceRecovery) {
            this.forceRecovery = forceRecovery;
            return this;
        }

        @JsonProperty("force_positioning")
        public SubscribeOptionOverrideBuilder forcePositioning(BoolValue forcePositioning) {
            this.forcePositioning = forcePositioning;
            return this;
        }

        @JsonProperty("force_push_join_leave")
        public SubscribeOptionOverrideBuilder forcePushJoinLeave(BoolValue forcePushJoinLeave) {
            this.forcePushJoinLeave = forcePushJoinLeave;
            return this;
        }

        public SubscribeOptionOverride build() {
            return new SubscribeOptionOverride(
                    this.presence,
                    this.joinLeave,
                    this.forceRecovery,
                    this.forcePositioning,
                    this.forcePushJoinLeave
            );
        }

        public String toString() {
            return "SubscribeOptionOverride.SubscribeOptionOverrideBuilder(presence=" +
                   this.presence +
                   ", joinLeave=" +
                   this.joinLeave +
                   ", forceRecovery=" +
                   this.forceRecovery +
                   ", forcePositioning=" +
                   this.forcePositioning +
                   ", forcePushJoinLeave=" +
                   this.forcePushJoinLeave +
                   ")";
        }
    }
}
