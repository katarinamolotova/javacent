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

package org.opensolutionlab.httpclients.configurations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationService {
    private static final String PROPERTIES_FILE_NAME = "centrifugo.properties";

    private final String centrifugoApiKey;
    private final String centrifugoApiUrl;
    private final boolean centrifugoIsInsecure;
    private final String apiHandlerPrefix;
    private final Properties properties;

    public ConfigurationService() {
        this.properties = loadProperties();
        this.centrifugoApiUrl = getApiUrl();
        this.centrifugoIsInsecure = getInSecureOption();
        this.centrifugoApiKey = getApiKey();
        this.apiHandlerPrefix = getHandlerPrefix();
    }

    public boolean isCentrifugoInsecure() {
        return centrifugoIsInsecure;
    }

    public String getCentrifugoApiKey() {
        return centrifugoApiKey;
    }

    public String getCentrifugoApiUrl() {
        return centrifugoApiUrl;
    }

    public String getApiCommandUrl(final String url) {
        return apiHandlerPrefix + url;
    }

    private String getHandlerPrefix() {
        final String property = properties
                .getProperty(
                        AvailableProperties.API_HANDLER_PREFIX,
                        AvailableProperties.DEFAULT_API_HANDLER_PREFIX
                )
                .toLowerCase();
        PropertiesValidator.apiHandlerPrefixValidate(property);
        return property;
    }

    private boolean getInSecureOption() {
        final String property = properties.getProperty(
                AvailableProperties.API_INSECURE_PROPERTIES,
                AvailableProperties.DEFAULT_API_INSECURE_VALUE
        ).toLowerCase();
        PropertiesValidator.booleanValueValidate(
                property,
                AvailableProperties.API_INSECURE_PROPERTIES
        );
        return Boolean.getBoolean(property);
    }

    private String getApiKey() {
        if (isCentrifugoInsecure()) {
            return AvailableProperties.DEFAULT_API_KEY_VALUE;
        }
        return properties
                .getProperty(
                        AvailableProperties.API_KEY_PROPERTIES,
                        AvailableProperties.DEFAULT_API_KEY_VALUE
                )
                .toLowerCase();
    }

    private String getApiUrl() {
        final String url = properties.getProperty(
                AvailableProperties.API_URL_PROPERTIES,
                AvailableProperties.DEFAULT_API_URL_VALUE
        ).toLowerCase();

        final String port = properties.getProperty(
                AvailableProperties.API_PORT_PROPERTIES,
                AvailableProperties.DEFAULT_API_PORT_VALUE
        ).toLowerCase();
        PropertiesValidator.portValidate(port);
        return String.format("%s:%s", url, port);
    }

    private static Properties loadProperties() {
        try {
            final Properties properties = new Properties();
            final String filePath = ClassLoader.getSystemResource(PROPERTIES_FILE_NAME).getFile();
            properties.load(new FileReader(filePath));
            return properties;
        } catch (IOException | NullPointerException e) {
            return new Properties();
        }
    }
}
