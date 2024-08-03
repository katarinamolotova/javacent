package org.centrifugo.models.responses.results.push_notification.device_register;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeviceRegisterResult
 */
public class DeviceRegisterResult {

  
  @JsonProperty("id")
  private String id = null;
  
  public DeviceRegisterResult id(String id) {
    this.id = id;
    return this;
  }

  
  /**
  * Get id
  * @return id
  **/
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRegisterResult deviceRegisterResult = (DeviceRegisterResult) o;
    return Objects.equals(this.id, deviceRegisterResult.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRegisterResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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



