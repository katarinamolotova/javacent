package org.centrifugo.models.requests.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BatchRequest
 */
public class BatchRequest implements RequestModel {

  
  @JsonProperty("commands")
  private List<Command> commands = null;
  
  
  @JsonProperty("parallel")
  private Boolean parallel = null;
  
  public BatchRequest commands(List<Command> commands) {
    this.commands = commands;
    return this;
  }

  public BatchRequest addCommandsItem(Command commandsItem) {
    
    if (this.commands == null) {
      this.commands = new ArrayList<Command>();
    }
    
    this.commands.add(commandsItem);
    return this;
  }
  
  /**
  * Get commands
  * @return commands
  **/
  public List<Command> getCommands() {
    return commands;
  }
  public void setCommands(List<Command> commands) {
    this.commands = commands;
  }
  
  public BatchRequest parallel(Boolean parallel) {
    this.parallel = parallel;
    return this;
  }

  
  /**
  * Get parallel
  * @return parallel
  **/
  public Boolean isParallel() {
    return parallel;
  }
  public void setParallel(Boolean parallel) {
    this.parallel = parallel;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequest batchRequest = (BatchRequest) o;
    return Objects.equals(this.commands, batchRequest.commands) &&
        Objects.equals(this.parallel, batchRequest.parallel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commands, parallel);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequest {\n");
    
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
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



