package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * Cancel Push Request
 */
public class CancelPushRequest implements RequestModel {

    /**
     * <b>Required.</b> uid of push notification to cancel
     */
    @JsonProperty("uid")
    private String uid;

    public CancelPushRequest(String uid) {
        this.uid = uid;
    }

    public CancelPushRequest() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelPushRequest cancelPushRequest = (CancelPushRequest) o;
        return Objects.equals(this.uid, cancelPushRequest.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelPushRequest {\n");

        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getUid() {
        return this.uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }
}
