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

import java.util.Objects;

/**
 * RPC Request
 */
public class RPCRequest {

    /**
     * An RPC method string
     */
    @JsonProperty("method")
    private String method;

    /**
     * An RPC params string
     */
    @JsonProperty("params")
    private Object params;

    public RPCRequest(String method, Object params) {
        this.method = method;
        this.params = params;
    }

    public RPCRequest() {}

    public static RPCRequestBuilder builder() {
        return new RPCRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RPCRequest rpCRequest = (RPCRequest) o;
        return Objects.equals(this.method, rpCRequest.method) &&
               Objects.equals(this.params, rpCRequest.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RPCRequest {\n");

        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


    public String getMethod() {
        return this.method;
    }

    public Object getParams() {
        return this.params;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("params")
    public void setParams(Object params) {
        this.params = params;
    }

    public static class RPCRequestBuilder {
        private String method;
        private Object params;

        RPCRequestBuilder() {
        }

        @JsonProperty("method")
        public RPCRequestBuilder method(String method) {
            this.method = method;
            return this;
        }

        @JsonProperty("params")
        public RPCRequestBuilder params(Object params) {
            this.params = params;
            return this;
        }

        public RPCRequest build() {
            return new RPCRequest(this.method, this.params);
        }

        public String toString() {
            return "RPCRequest.RPCRequestBuilder(method=" + this.method + ", params=" + this.params + ")";
        }
    }
}
