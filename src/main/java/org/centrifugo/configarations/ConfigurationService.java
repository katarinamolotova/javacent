package org.centrifugo.configarations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationService {
    private static final String PROPERTIES_FILE_NAME = "centrifugo.properties";

    private final String centrifugoApiKey;
    private final String centrifugoApiUrl;
    private final boolean centrifugoIsInsecure;
    private final Properties properties;

    public ConfigurationService() {
        this.properties = loadProperties();
        this.centrifugoApiUrl = getApiUrl();
        this.centrifugoIsInsecure = getInSecureOption();
        this.centrifugoApiKey = getApiKey();
    }

    public boolean isCentrifugoInsecure() {
        return centrifugoIsInSecure;
    }

    public String getCentrifugoApiKey() {
        return centrifugoApiKey;
    }

    public String getCentrifugoApiUrl() {
        return centrifugoApiUrl;
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
        if (centrifugoIsInsecure) {
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
        PropertiesValidator.urlValidate(url);

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
        } catch (IOException e) {
            return new Properties();
        }
    }
}
