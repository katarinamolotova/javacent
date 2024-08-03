package org.centrifugo.models.responses.results.history;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HistoryResult
 */
public class HistoryResult {

  
  @JsonProperty("publications")
  private List<Publication> publications = null;
  
  
  @JsonProperty("epoch")
  private String epoch = null;
  
  
  @JsonProperty("offset")
  private Integer offset = null;
  
  public HistoryResult publications(List<Publication> publications) {
    this.publications = publications;
    return this;
  }

  public HistoryResult addPublicationsItem(Publication publicationsItem) {
    
    if (this.publications == null) {
      this.publications = new ArrayList<Publication>();
    }
    
    this.publications.add(publicationsItem);
    return this;
  }
  
  /**
  * Get publications
  * @return publications
  **/
  public List<Publication> getPublications() {
    return publications;
  }
  public void setPublications(List<Publication> publications) {
    this.publications = publications;
  }
  
  public HistoryResult epoch(String epoch) {
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
  
  public HistoryResult offset(Integer offset) {
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
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryResult historyResult = (HistoryResult) o;
    return Objects.equals(this.publications, historyResult.publications) &&
        Objects.equals(this.epoch, historyResult.epoch) &&
        Objects.equals(this.offset, historyResult.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publications, epoch, offset);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryResult {\n");
    
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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



