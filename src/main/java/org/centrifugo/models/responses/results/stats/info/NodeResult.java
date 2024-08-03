package org.centrifugo.models.responses.results.stats.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeResult
 */
public class NodeResult {

  
  @JsonProperty("uid")
  private String uid = null;
  
  
  @JsonProperty("name")
  private String name = null;
  
  
  @JsonProperty("version")
  private String version = null;
  
  
  @JsonProperty("num_clients")
  private Long numClients = null;
  
  
  @JsonProperty("num_users")
  private Long numUsers = null;
  
  
  @JsonProperty("num_channels")
  private Long numChannels = null;
  
  
  @JsonProperty("uptime")
  private Long uptime = null;
  
  
  @JsonProperty("metrics")
  private Metrics metrics = null;
  
  
  @JsonProperty("process")
  private Process process = null;
  
  
  @JsonProperty("num_subs")
  private Long numSubs = null;
  
  public NodeResult uid(String uid) {
    this.uid = uid;
    return this;
  }

  
  /**
  * Get uid
  * @return uid
  **/
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }
  
  public NodeResult name(String name) {
    this.name = name;
    return this;
  }

  
  /**
  * Get name
  * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public NodeResult version(String version) {
    this.version = version;
    return this;
  }

  
  /**
  * Get version
  * @return version
  **/
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }
  
  public NodeResult numClients(Long numClients) {
    this.numClients = numClients;
    return this;
  }

  
  /**
  * Get numClients
  * @return numClients
  **/
  public Long getNumClients() {
    return numClients;
  }
  public void setNumClients(Long numClients) {
    this.numClients = numClients;
  }
  
  public NodeResult numUsers(Long numUsers) {
    this.numUsers = numUsers;
    return this;
  }

  
  /**
  * Get numUsers
  * @return numUsers
  **/
  public Long getNumUsers() {
    return numUsers;
  }
  public void setNumUsers(Long numUsers) {
    this.numUsers = numUsers;
  }
  
  public NodeResult numChannels(Long numChannels) {
    this.numChannels = numChannels;
    return this;
  }

  
  /**
  * Get numChannels
  * @return numChannels
  **/
  public Long getNumChannels() {
    return numChannels;
  }
  public void setNumChannels(Long numChannels) {
    this.numChannels = numChannels;
  }
  
  public NodeResult uptime(Long uptime) {
    this.uptime = uptime;
    return this;
  }

  
  /**
  * Get uptime
  * @return uptime
  **/
  public Long getUptime() {
    return uptime;
  }
  public void setUptime(Long uptime) {
    this.uptime = uptime;
  }
  
  public NodeResult metrics(Metrics metrics) {
    this.metrics = metrics;
    return this;
  }

  
  /**
  * Get metrics
  * @return metrics
  **/
  public Metrics getMetrics() {
    return metrics;
  }
  public void setMetrics(Metrics metrics) {
    this.metrics = metrics;
  }
  
  public NodeResult process(Process process) {
    this.process = process;
    return this;
  }

  
  /**
  * Get process
  * @return process
  **/
  public Process getProcess() {
    return process;
  }
  public void setProcess(Process process) {
    this.process = process;
  }
  
  public NodeResult numSubs(Long numSubs) {
    this.numSubs = numSubs;
    return this;
  }

  
  /**
  * Get numSubs
  * @return numSubs
  **/
  public Long getNumSubs() {
    return numSubs;
  }
  public void setNumSubs(Long numSubs) {
    this.numSubs = numSubs;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeResult nodeResult = (NodeResult) o;
    return Objects.equals(this.uid, nodeResult.uid) &&
        Objects.equals(this.name, nodeResult.name) &&
        Objects.equals(this.version, nodeResult.version) &&
        Objects.equals(this.numClients, nodeResult.numClients) &&
        Objects.equals(this.numUsers, nodeResult.numUsers) &&
        Objects.equals(this.numChannels, nodeResult.numChannels) &&
        Objects.equals(this.uptime, nodeResult.uptime) &&
        Objects.equals(this.metrics, nodeResult.metrics) &&
        Objects.equals(this.process, nodeResult.process) &&
        Objects.equals(this.numSubs, nodeResult.numSubs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, name, version, numClients, numUsers, numChannels, uptime, metrics, process, numSubs);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeResult {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    numClients: ").append(toIndentedString(numClients)).append("\n");
    sb.append("    numUsers: ").append(toIndentedString(numUsers)).append("\n");
    sb.append("    numChannels: ").append(toIndentedString(numChannels)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    numSubs: ").append(toIndentedString(numSubs)).append("\n");
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



