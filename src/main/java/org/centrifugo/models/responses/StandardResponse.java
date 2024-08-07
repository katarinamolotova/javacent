package org.centrifugo.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StandardResponse<T> implements ResponseModel {

    @JsonProperty("error")
    private Error error;

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
