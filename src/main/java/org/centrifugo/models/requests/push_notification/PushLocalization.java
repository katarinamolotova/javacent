package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PushLocalization
 */
public class PushLocalization {

  
  @JsonProperty("translations")
  private Map<String, String> translations = null;
  
  public PushLocalization translations(Map<String, String> translations) {
    this.translations = translations;
    return this;
  }

  public PushLocalization putTranslationsItem(String key, String translationsItem) {
    
    if (this.translations == null) {
      this.translations = new HashMap<String, String>();
    }
    
    this.translations.put(key, translationsItem);
    return this;
  }
  /**
  * variable name to value for the specific language/locale.
  * @return translations
  **/
  public Map<String, String> getTranslations() {
    return translations;
  }
  public void setTranslations(Map<String, String> translations) {
    this.translations = translations;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushLocalization pushLocalization = (PushLocalization) o;
    return Objects.equals(this.translations, pushLocalization.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translations);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushLocalization {\n");
    
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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



