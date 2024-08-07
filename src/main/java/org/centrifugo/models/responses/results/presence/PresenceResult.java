package org.centrifugo.models.responses.results.presence;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.responses.results.history.ClientInfo;

import java.util.Map;

public class PresenceResult {

  @JsonProperty("presence")
  private Map<String, ClientInfo> presence;

  public PresenceResult(Map<String, ClientInfo> presence) {
    this.presence = presence;
  }

  public PresenceResult() {
  }

  public Map<String, ClientInfo> getPresence() {
    return this.presence;
  }

  @JsonProperty("presence")
  public void setPresence(Map<String, ClientInfo> presence) {
    this.presence = presence;
  }
}