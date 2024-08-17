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

package org.opensolutionlab.httpclients.models.requests.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Batch Request
 */
public class BatchRequest implements RequestModel {

    /**
     * List of commands
     */
    @JsonProperty("commands")
    private List<Command> commands;

    /**
     * To make batch commands processing parallel on Centrifugo side
     */
    @JsonProperty("parallel")
    private Boolean parallel;

    public BatchRequest(List<Command> commands, Boolean parallel) {
        this.commands = commands;
        this.parallel = parallel;
    }

    public BatchRequest() {}

    public static BatchRequestBuilder builder() {
        return new BatchRequestBuilder();
    }

    public BatchRequest addCommandsItem(Command commandsItem) {
        if (this.commands == null) {
            this.commands = new ArrayList<Command>();
        }

        this.commands.add(commandsItem);
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
        BatchRequest batchRequest = (BatchRequest) o;
        return Objects.equals(this.commands, batchRequest.commands) &&
               Objects.equals(this.parallel, batchRequest.parallel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands, parallel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRequest {\n");

        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


    public List<Command> getCommands() {
        return this.commands;
    }

    public Boolean getParallel() {
        return this.parallel;
    }

    @JsonProperty("commands")
    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    @JsonProperty("parallel")
    public void setParallel(Boolean parallel) {
        this.parallel = parallel;
    }

    public static class BatchRequestBuilder {
        private List<Command> commands;
        private Boolean parallel;

        BatchRequestBuilder() {
        }

        @JsonProperty("commands")
        public BatchRequestBuilder commands(List<Command> commands) {
            this.commands = commands;
            return this;
        }

        @JsonProperty("parallel")
        public BatchRequestBuilder parallel(Boolean parallel) {
            this.parallel = parallel;
            return this;
        }

        public BatchRequest build() {
            return new BatchRequest(this.commands, this.parallel);
        }

        public String toString() {
            return "BatchRequest.BatchRequestBuilder(commands=" + this.commands + ", parallel=" + this.parallel + ")";
        }
    }
}
