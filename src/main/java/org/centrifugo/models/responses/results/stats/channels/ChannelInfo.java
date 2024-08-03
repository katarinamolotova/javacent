package org.centrifugo.models.responses.results.stats.channels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChannelInfo
 */
public class ChannelInfo {

  
  @JsonProperty("num_clients")
  private Long numClients = null;
  
  public ChannelInfo numClients(Long numClients) {
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
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelInfo channelInfo = (ChannelInfo) o;
    return Objects.equals(this.numClients, channelInfo.numClients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numClients);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelInfo {\n");
    
    sb.append("    numClients: ").append(toIndentedString(numClients)).append("\n");
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



