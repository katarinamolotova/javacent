package org.centrifugo.models.requests.batch;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RPCRequest
 */
public class RPCRequest {

    @JsonProperty("method")
    private String method = null;

    @JsonProperty("params")
    private Object params = null;

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
