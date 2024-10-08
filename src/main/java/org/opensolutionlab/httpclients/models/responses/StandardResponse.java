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

package org.opensolutionlab.httpclients.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Standard response class
 */
public class StandardResponse<T> implements ResponseModel {

    /**
     * Error object
     */
    @JsonProperty("error")
    private Error error;

    /**
     * Execution result
     */
    @JsonProperty("result")
    private T result;

    public StandardResponse(Error error, T result) {
        this.error = error;
        this.result = result;
    }

    public StandardResponse() {
    }

    public Error getError() {
        return this.error;
    }

    public T getResult() {
        return this.result;
    }

    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
    }

    @JsonProperty("result")
    public void setResult(T result) {
        this.result = result;
    }
}
