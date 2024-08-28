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

public class CentrifugoConfigurations {

    private final String apiUrl;
    private final String apiPort;
    private final String apiKey;
    private final String apiInsecure;
    private final String apiHandlerPrefix;

    CentrifugoConfigurations(
            final String apiUrl,
            final String apiPort,
            final String apiKey,
            final String apiInsecure,
            final String apiHandlerPrefix
    ) {
        this.apiUrl = apiUrl;
        this.apiPort = apiPort;
        this.apiKey = apiKey;
        this.apiInsecure = apiInsecure;
        this.apiHandlerPrefix = apiHandlerPrefix;
    }

    public String getApiUrl() {
        return this.apiUrl;
    }

    public String getFullUrl(final String url) {
        return String.format("%s:%s%s%s", apiUrl, apiPort, apiHandlerPrefix, url);
    }

    public static ConfigurationsBuilder builder() {
        return new ConfigurationsBuilder();
    }

    public String getApiPort() {
        return this.apiPort;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApiInsecure() {
        return this.apiInsecure;
    }

    public String getApiHandlerPrefix() {
        return this.apiHandlerPrefix;
    }

    public static class ConfigurationsBuilder {
        private String apiUrl = DefaultValues.DEFAULT_API_URL;
        private String apiPort = DefaultValues.DEFAULT_API_PORT;
        private String apiKey = DefaultValues.DEFAULT_API_KEY;
        private String apiInsecure = DefaultValues.DEFAULT_API_INSECURE;
        private String apiHandlerPrefix = DefaultValues.DEFAULT_API_HANDLER_PREFIX;

        ConfigurationsBuilder() {
        }

        public ConfigurationsBuilder apiUrl(String apiUrl) {
            this.apiUrl = apiUrl;
            return this;
        }

        public ConfigurationsBuilder apiPort(String apiPort) {
            this.apiPort = apiPort;
            return this;
        }

        public ConfigurationsBuilder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public ConfigurationsBuilder apiInsecure(String apiInsecure) {
            this.apiInsecure = apiInsecure;
            return this;
        }

        public ConfigurationsBuilder apiHandlerPrefix(String apiHandlerPrefix) {
            this.apiHandlerPrefix = apiHandlerPrefix;
            return this;
        }

        public CentrifugoConfigurations build() {
            return new CentrifugoConfigurations(
                    this.apiUrl,
                    this.apiPort,
                    this.apiKey,
                    this.apiInsecure,
                    this.apiHandlerPrefix
            );
        }

        public String toString() {
            return "Configurations.ConfigurationsBuilder(apiUrl=" +
                   this.apiUrl +
                   ", apiPort=" +
                   this.apiPort +
                   ", apiKey=" +
                   this.apiKey +
                   ", apiInsecure=" +
                   this.apiInsecure +
                   ", apiHandlerPrefix=" +
                   this.apiHandlerPrefix +
                   ")";
        }
    }
}
