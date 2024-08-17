package org.opensolutionlab.httpclients.models.responses.results.push_notification.device_register;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Device register result
 */
public class DeviceRegisterResult {

  /**
   * The device ID that was registered/updated
   */
  @JsonProperty("id")
  private String id;

  public DeviceRegisterResult(String id) {
    this.id = id;
  }

  public DeviceRegisterResult() {
  }

  public String getId() {
    return this.id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }
}