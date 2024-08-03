package org.centrifugo.configarations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CentrConfigurParams {
    private static final String PROPERTIES = "configurations.properties";
    private static final String CENTRIFUGO_API_KEY = "centrifugo.api.key";
    private static final String CENTRIFUGO_API_URL = "centrifugo.api.url";
    private static final String CENTRIFUGO_DEFAULT_API_URL = "localhost:8000";
    private static final String CENTRIFUGO_DEFAULT_API_KEY = "centrifugo";

    private final String centrifugoApiKey;
    private final String centrifugoApiUrl;

    public CentrConfigurParams() {
        this.centrifugoApiKey = getApiKey();
        this.centrifugoApiUrl = getApiUrl();
    }

    public String getCentrifugoApiKey() {
        return centrifugoApiKey;
    }

    public String getCentrifugoApiUrl() {
        return centrifugoApiUrl;
    }

    private static String getApiKey() {
        System.out.println();
        return loadProperties()
                .getProperty(CENTRIFUGO_API_KEY, CENTRIFUGO_DEFAULT_API_KEY)
                .toLowerCase();
    }

    private static String getApiUrl() {
        return loadProperties()
                .getProperty(CENTRIFUGO_API_URL, CENTRIFUGO_DEFAULT_API_URL)
                .toLowerCase();
    }

    private static Properties loadProperties() {
        try {
            final Properties properties = new Properties();
            final String filePath = ClassLoader.getSystemResource(PROPERTIES).getFile();
            properties.load(new FileReader(filePath));
            return properties;
        } catch (IOException e) {
            return new Properties();
        }
    }
}
