package org.centrifugo.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class StandardResponse<T> implements ResponseModel {
    @JsonProperty("error")
    private Error error = null;


    @JsonProperty("result")
    private T result = null;

    public StandardResponse<T> error(Error error) {
        this.error = error;
        return this;
    }


    /**
     * Get error
     * @return error
     **/
    public Error getError() {
        return error;
    }
    public void setError(Error error) {
        this.error = error;
    }

    public StandardResponse<T> result(T result) {
        this.result = result;
        return this;
    }


    /**
     * Get result
     * @return result
     **/
    public T getResult() {
        return result;
    }
    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardResponse<T> channelsResponse = (StandardResponse<T>) o;
        return Objects.equals(this.error, channelsResponse.error) &&
                Objects.equals(this.result, channelsResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseAbstract {\n");

        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


}
