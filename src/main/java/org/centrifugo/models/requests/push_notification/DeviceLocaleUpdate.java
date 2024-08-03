package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeviceLocaleUpdate
 */
public class DeviceLocaleUpdate {

  
  @JsonProperty("locale")
  private String locale = null;
  
  public DeviceLocaleUpdate locale(String locale) {
    this.locale = locale;
    return this;
  }

  
  /**
  * Get locale
  * @return locale
  **/
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceLocaleUpdate deviceLocaleUpdate = (DeviceLocaleUpdate) o;
    return Objects.equals(this.locale, deviceLocaleUpdate.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceLocaleUpdate {\n");
    
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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



