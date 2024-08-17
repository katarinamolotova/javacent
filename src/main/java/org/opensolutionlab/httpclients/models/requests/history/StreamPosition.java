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

package org.opensolutionlab.httpclients.models.requests.history;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Stream Position
 */
public class StreamPosition {

    /**
     * <b>Required.</b> Offset in a stream
     */
    @JsonProperty("offset")
    private Integer offset;

    /**
     * <b>Required.</b> Stream epoch
     */
    @JsonProperty("epoch")
    private String epoch;

    public StreamPosition(Integer offset, String epoch) {
        this.offset = offset;
        this.epoch = epoch;
    }

    public StreamPosition() {
    }

    public static StreamPositionBuilder builder() {
        return new StreamPositionBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StreamPosition streamPosition = (StreamPosition) o;
        return Objects.equals(this.offset, streamPosition.offset) &&
               Objects.equals(this.epoch, streamPosition.epoch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, epoch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamPosition {\n");

        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public Integer getOffset() {
        return this.offset;
    }

    public String getEpoch() {
        return this.epoch;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("epoch")
    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public static class StreamPositionBuilder {
        private Integer offset;
        private String epoch;

        StreamPositionBuilder() {
        }

        @JsonProperty("offset")
        public StreamPositionBuilder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        @JsonProperty("epoch")
        public StreamPositionBuilder epoch(String epoch) {
            this.epoch = epoch;
            return this;
        }

        public StreamPosition build() {
            return new StreamPosition(this.offset, this.epoch);
        }

        public String toString() {
            return "StreamPosition.StreamPositionBuilder(offset=" + this.offset + ", epoch=" + this.epoch + ")";
        }
    }
}
