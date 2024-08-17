package org.opensolutionlab.httpclients.models.requests.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Connections Request
 */
public class ConnectionsRequest implements RequestModel {

    /**
     * Fast filter by User ID
     */
    @JsonProperty("user")
    private String user;

    /**
     * CEL expression to filter users
     */
    @JsonProperty("expression")
    private String expression;

    public ConnectionsRequest(String user, String expression) {
        this.user = user;
        this.expression = expression;
    }

    public ConnectionsRequest() {
    }

    public static ConnectionsRequestBuilder builder() {
        return new ConnectionsRequestBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionsRequest connectionsRequest = (ConnectionsRequest) o;
        return Objects.equals(this.user, connectionsRequest.user) &&
               Objects.equals(this.expression, connectionsRequest.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, expression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionsRequest {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getUser() {
        return this.user;
    }

    public String getExpression() {
        return this.expression;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("expression")
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public static class ConnectionsRequestBuilder {
        private String user;
        private String expression;

        ConnectionsRequestBuilder() {
        }

        @JsonProperty("user")
        public ConnectionsRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        @JsonProperty("expression")
        public ConnectionsRequestBuilder expression(String expression) {
            this.expression = expression;
            return this;
        }

        public ConnectionsRequest build() {
            return new ConnectionsRequest(this.user, this.expression);
        }

        public String toString() {
            return "ConnectionsRequest.ConnectionsRequestBuilder(user=" +
                   this.user +
                   ", expression=" +
                   this.expression +
                   ")";
        }
    }
}
