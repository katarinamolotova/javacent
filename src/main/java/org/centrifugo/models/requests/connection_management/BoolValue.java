package org.centrifugo.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BoolValue
 */
public class BoolValue {

    @JsonProperty("value")
    private Boolean value = null;

    public BoolValue(Boolean value) {
        this.value = value;
    }

    public BoolValue() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BoolValue boolValue = (BoolValue) o;
        return Objects.equals(this.value, boolValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoolValue {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public Boolean getValue() {
        return this.value;
    }

    @JsonProperty("value")
    public void setValue(Boolean value) {
        this.value = value;
    }
}
