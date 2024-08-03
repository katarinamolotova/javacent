package org.centrifugo.models.responses.results.stats.connections;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChannelContext
 */
public class ChannelContext {

  
  @JsonProperty("source")
  private Long source = null;
  
  public ChannelContext source(Long source) {
    this.source = source;
    return this;
  }

  
  /**
  * Get source
  * @return source
  **/
  public Long getSource() {
    return source;
  }
  public void setSource(Long source) {
    this.source = source;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelContext channelContext = (ChannelContext) o;
    return Objects.equals(this.source, channelContext.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelContext {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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



