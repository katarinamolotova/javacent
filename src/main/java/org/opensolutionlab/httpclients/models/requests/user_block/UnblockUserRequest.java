package org.opensolutionlab.httpclients.models.requests.user_block;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.Objects;

/**
 * Unblock User Request
 */
public class UnblockUserRequest implements RequestModel {

    /**
     * <b>Required.</b> User ID to unblock
     */
    @JsonProperty("user")
    private String user;

    public UnblockUserRequest(String user) {
        this.user = user;
    }

    public UnblockUserRequest() {
    }

    public UnblockUserRequest user(String user) {
        this.user = user;
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
        UnblockUserRequest unblockUserRequest = (UnblockUserRequest) o;
        return Objects.equals(this.user, unblockUserRequest.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnblockUserRequest {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }
}
