/*
 * Copyright 2024 Molotova Katerina, Kukhtachev Mikhail.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensolutionlab.httpclients.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Push Localization
 */
public class PushLocalization {

    /**
     * Variable name to value for the specific language
     */
    @JsonProperty("translations")
    private Map<String, String> translations;

    public PushLocalization(Map<String, String> translations) {
        this.translations = translations;
    }

    public PushLocalization() {
    }

    public PushLocalization putTranslationsItem(String key, String translationsItem) {

        if (this.translations == null) {
            this.translations = new HashMap<String, String>();
        }

        this.translations.put(key, translationsItem);
        return this;
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

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public Map<String, String> getTranslations() {
        return this.translations;
    }

    @JsonProperty("translations")
    public void setTranslations(Map<String, String> translations) {
        this.translations = translations;
    }
}
