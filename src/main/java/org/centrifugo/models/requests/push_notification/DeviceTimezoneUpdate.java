package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeviceTimezoneUpdate
 */
public class DeviceTimezoneUpdate {

  
  @JsonProperty("timezone")
  private String timezone = null;
  
  public DeviceTimezoneUpdate timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  
  /**
  * Get timezone
  * @return timezone
  **/
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTimezoneUpdate deviceTimezoneUpdate = (DeviceTimezoneUpdate) o;
    return Objects.equals(this.timezone, deviceTimezoneUpdate.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTimezoneUpdate {\n");
    
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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



