package org.centrifugo.models.responses.results.presence;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.responses.results.history.ClientInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PresenceResult
 */
public class PresenceResult {

  
  @JsonProperty("presence")
  private Map<String, ClientInfo> presence = null;
  
  public PresenceResult presence(Map<String, ClientInfo> presence) {
    this.presence = presence;
    return this;
  }

  public PresenceResult putPresenceItem(String key, ClientInfo presenceItem) {
    
    if (this.presence == null) {
      this.presence = new HashMap<String, ClientInfo>();
    }
    
    this.presence.put(key, presenceItem);
    return this;
  }
  /**
  * Get presence
  * @return presence
  **/
  public Map<String, ClientInfo> getPresence() {
    return presence;
  }
  public void setPresence(Map<String, ClientInfo> presence) {
    this.presence = presence;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresenceResult presenceResult = (PresenceResult) o;
    return Objects.equals(this.presence, presenceResult.presence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presence);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceResult {\n");
    
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
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



