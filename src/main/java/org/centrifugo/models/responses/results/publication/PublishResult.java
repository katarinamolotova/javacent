package org.centrifugo.models.responses.results.publication;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PublishResult
 */
public class PublishResult {

  
  @JsonProperty("offset")
  private Integer offset = null;
  
  
  @JsonProperty("epoch")
  private String epoch = null;
  
  public PublishResult offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  
  /**
  * Get offset
  * @return offset
  **/
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }
  
  public PublishResult epoch(String epoch) {
    this.epoch = epoch;
    return this;
  }

  
  /**
  * Get epoch
  * @return epoch
  **/
  public String getEpoch() {
    return epoch;
  }
  public void setEpoch(String epoch) {
    this.epoch = epoch;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishResult publishResult = (PublishResult) o;
    return Objects.equals(this.offset, publishResult.offset) &&
        Objects.equals(this.epoch, publishResult.epoch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, epoch);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishResult {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
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


