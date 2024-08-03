package org.centrifugo.models.requests.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.requests.RequestModel;

import java.util.Objects;

/**
 * ConnectionsRequest
 */
public class ConnectionsRequest implements RequestModel {

  
  @JsonProperty("user")
  private String user = null;
  
  
  @JsonProperty("expression")
  private String expression = null;
  
  public ConnectionsRequest user(String user) {
    this.user = user;
    return this;
  }

  
  /**
  * Get user
  * @return user
  **/
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  
  public ConnectionsRequest expression(String expression) {
    this.expression = expression;
    return this;
  }

  
  /**
  * Get expression
  * @return expression
  **/
  public String getExpression() {
    return expression;
  }
  public void setExpression(String expression) {
    this.expression = expression;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionsRequest connectionsRequest = (ConnectionsRequest) o;
    return Objects.equals(this.user, connectionsRequest.user) &&
        Objects.equals(this.expression, connectionsRequest.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, expression);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionsRequest {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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



