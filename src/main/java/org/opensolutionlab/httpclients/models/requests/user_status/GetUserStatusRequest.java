package org.opensolutionlab.httpclients.models.requests.user_status;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Get User Status Request
 */
public class GetUserStatusRequest implements RequestModel {

    /**
     * <b>Required.</b> List of users to get status for
     */
    @JsonProperty("users")
    private List<String> users;

    public GetUserStatusRequest(List<String> users) {
        this.users = users;
    }

    public GetUserStatusRequest() {
    }

    public GetUserStatusRequest addUsersItem(String usersItem) {

        if (this.users == null) {
            this.users = new ArrayList<String>();
        }

        this.users.add(usersItem);
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
        GetUserStatusRequest getUserStatusRequest = (GetUserStatusRequest) o;
        return Objects.equals(this.users, getUserStatusRequest.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUserStatusRequest {\n");

        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public List<String> getUsers() {
        return this.users;
    }

    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }
}