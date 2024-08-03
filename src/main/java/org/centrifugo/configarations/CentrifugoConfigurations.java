package org.centrifugo.configarations;

import lombok.AllArgsConstructor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@AllArgsConstructor
public class CentrifugoConfigurations {

    private static final String PROPERTIES = "configurations.properties";
    private static final String API_KEY = "centrifugo.api.key";
    private static final String API_URL = "centrifugo.api.url";

    public String getCentrifugoApiKey() {
        return centrifugoApiKey;
    }

    public String getCentrifugoApiUrl() {
        return centrifugoApiUrl;
    }

    private final String centrifugoApiKey;
    private final String centrifugoApiUrl;

    public CentrifugoConfigurations(){
        this.centrifugoApiKey = getApiKey();
        this.centrifugoApiUrl = getApiUrl();
    }

    private static String getApiKey() {
        return loadProperties()
                .getProperty(API_KEY, "centrifugo")
                .toLowerCase();
    }

    private static String getApiUrl() {
        return loadProperties()
                .getProperty(API_URL, "localhost")
                .toLowerCase();
    }

    private static Properties loadProperties() {
        try {
            final File file = new File(PROPERTIES);
            final Properties properties = new Properties();
            properties.load(new FileReader(file));
            return properties;
        } catch (IOException e) {
            return new Properties();
        }
    }
}
