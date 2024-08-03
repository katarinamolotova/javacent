package org.centrifugo.models.requests.connection_management;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubscribeOptionOverride
 */
public class SubscribeOptionOverride {

  
  @JsonProperty("presence")
  private BoolValue presence = null;
  
  
  @JsonProperty("join_leave")
  private BoolValue joinLeave = null;
  
  
  @JsonProperty("force_recovery")
  private BoolValue forceRecovery = null;
  
  
  @JsonProperty("force_positioning")
  private BoolValue forcePositioning = null;
  
  
  @JsonProperty("force_push_join_leave")
  private BoolValue forcePushJoinLeave = null;
  
  public SubscribeOptionOverride presence(BoolValue presence) {
    this.presence = presence;
    return this;
  }

  
  /**
  * Get presence
  * @return presence
  **/
  public BoolValue getPresence() {
    return presence;
  }
  public void setPresence(BoolValue presence) {
    this.presence = presence;
  }
  
  public SubscribeOptionOverride joinLeave(BoolValue joinLeave) {
    this.joinLeave = joinLeave;
    return this;
  }

  
  /**
  * Get joinLeave
  * @return joinLeave
  **/
  public BoolValue getJoinLeave() {
    return joinLeave;
  }
  public void setJoinLeave(BoolValue joinLeave) {
    this.joinLeave = joinLeave;
  }
  
  public SubscribeOptionOverride forceRecovery(BoolValue forceRecovery) {
    this.forceRecovery = forceRecovery;
    return this;
  }

  
  /**
  * Get forceRecovery
  * @return forceRecovery
  **/
  public BoolValue getForceRecovery() {
    return forceRecovery;
  }
  public void setForceRecovery(BoolValue forceRecovery) {
    this.forceRecovery = forceRecovery;
  }
  
  public SubscribeOptionOverride forcePositioning(BoolValue forcePositioning) {
    this.forcePositioning = forcePositioning;
    return this;
  }

  
  /**
  * Get forcePositioning
  * @return forcePositioning
  **/
  public BoolValue getForcePositioning() {
    return forcePositioning;
  }
  public void setForcePositioning(BoolValue forcePositioning) {
    this.forcePositioning = forcePositioning;
  }
  
  public SubscribeOptionOverride forcePushJoinLeave(BoolValue forcePushJoinLeave) {
    this.forcePushJoinLeave = forcePushJoinLeave;
    return this;
  }

  
  /**
  * Get forcePushJoinLeave
  * @return forcePushJoinLeave
  **/
  public BoolValue getForcePushJoinLeave() {
    return forcePushJoinLeave;
  }
  public void setForcePushJoinLeave(BoolValue forcePushJoinLeave) {
    this.forcePushJoinLeave = forcePushJoinLeave;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeOptionOverride subscribeOptionOverride = (SubscribeOptionOverride) o;
    return Objects.equals(this.presence, subscribeOptionOverride.presence) &&
        Objects.equals(this.joinLeave, subscribeOptionOverride.joinLeave) &&
        Objects.equals(this.forceRecovery, subscribeOptionOverride.forceRecovery) &&
        Objects.equals(this.forcePositioning, subscribeOptionOverride.forcePositioning) &&
        Objects.equals(this.forcePushJoinLeave, subscribeOptionOverride.forcePushJoinLeave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presence, joinLeave, forceRecovery, forcePositioning, forcePushJoinLeave);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeOptionOverride {\n");
    
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    joinLeave: ").append(toIndentedString(joinLeave)).append("\n");
    sb.append("    forceRecovery: ").append(toIndentedString(forceRecovery)).append("\n");
    sb.append("    forcePositioning: ").append(toIndentedString(forcePositioning)).append("\n");
    sb.append("    forcePushJoinLeave: ").append(toIndentedString(forcePushJoinLeave)).append("\n");
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



