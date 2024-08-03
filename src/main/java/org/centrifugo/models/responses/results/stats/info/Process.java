package org.centrifugo.models.responses.results.stats.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Process
 */
public class Process {

  
  @JsonProperty("cpu")
  private Double cpu = null;
  
  
  @JsonProperty("rss")
  private Integer rss = null;
  
  public Process cpu(Double cpu) {
    this.cpu = cpu;
    return this;
  }

  
  /**
  * Get cpu
  * @return cpu
  **/
  public Double getCpu() {
    return cpu;
  }
  public void setCpu(Double cpu) {
    this.cpu = cpu;
  }
  
  public Process rss(Integer rss) {
    this.rss = rss;
    return this;
  }

  
  /**
  * Get rss
  * @return rss
  **/
  public Integer getRss() {
    return rss;
  }
  public void setRss(Integer rss) {
    this.rss = rss;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Process process = (Process) o;
    return Objects.equals(this.cpu, process.cpu) &&
        Objects.equals(this.rss, process.rss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, rss);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Process {\n");
    
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    rss: ").append(toIndentedString(rss)).append("\n");
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



