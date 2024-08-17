package org.opensolutionlab.httpclients.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Disconnect
 */
public class Disconnect {

    /**
     * <b>Required.</b> Disconnect code
     */
    @JsonProperty("code")
    private Long code;

    /**
     * <b>Required.</b> Disconnect reason
     */
    @JsonProperty("reason")
    private String reason;

    public Disconnect(Long code, String reason) {
        this.code = code;
        this.reason = reason;
    }

    public Disconnect() {
    }

    public static DisconnectBuilder builder() {
        return new DisconnectBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Disconnect disconnect = (Disconnect) o;
        return Objects.equals(this.code, disconnect.code) &&
               Objects.equals(this.reason, disconnect.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Disconnect {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public Long getCode() {
        return this.code;
    }

    public String getReason() {
        return this.reason;
    }

    @JsonProperty("code")
    public void setCode(Long code) {
        this.code = code;
    }

    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    public static class DisconnectBuilder {
        private Long code;
        private String reason;

        DisconnectBuilder() {
        }

        @JsonProperty("code")
        public DisconnectBuilder code(Long code) {
            this.code = code;
            return this;
        }

        @JsonProperty("reason")
        public DisconnectBuilder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public Disconnect build() {
            return new Disconnect(this.code, this.reason);
        }

        public String toString() {
            return "Disconnect.DisconnectBuilder(code=" + this.code + ", reason=" + this.reason + ")";
        }
    }
}
