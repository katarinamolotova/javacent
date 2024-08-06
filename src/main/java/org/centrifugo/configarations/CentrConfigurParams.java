package org.centrifugo.configarations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CentrConfigurParams {
    private static final String PROPERTIES = "centrifugo.properties";

    private final String centrifugoApiKey;
    private final String centrifugoApiUrl;
    private final boolean isInSecure;

    public CentrConfigurParams() {
        this.centrifugoApiUrl = getApiUrl();
        this.isInSecure = getInSecureOption();
        this.centrifugoApiKey = getApiKey(this.isInSecure);
    }

    public boolean isInSecure() {
        return isInSecure;
    }

    public String getCentrifugoApiKey() {
        return centrifugoApiKey;
    }

    public String getCentrifugoApiUrl() {
        return centrifugoApiUrl;
    }

    private static boolean getInSecureOption() {
        final String property = loadProperties().getProperty(
                AvailableProperties.API_INSECURE_PROPERTIES,
                AvailableProperties.DEFAULT_API_INSECURE_VALUE
        );
        PropertiesValidator.booleanValueValidate(
                property,
                AvailableProperties.API_INSECURE_PROPERTIES
        );
        return Boolean.getBoolean(property);
    }

    private static String getApiKey(final boolean isInSecure) {
        if (isInSecure) {
            return AvailableProperties.DEFAULT_API_KEY_VALUE;
        }
        return loadProperties()
                .getProperty(
                        AvailableProperties.API_KEY_PROPERTIES,
                        AvailableProperties.DEFAULT_API_KEY_VALUE
                )
                .toLowerCase();
    }

    private static String getApiUrl() {
        final String url = loadProperties()
                .getProperty(
                        AvailableProperties.API_URL_PROPERTIES,
                        AvailableProperties.DEFAULT_API_URL_VALUE
                ).toLowerCase();
        PropertiesValidator.urlValidate(url);

        final String port = loadProperties()
                .getProperty(
                        AvailableProperties.API_PORT_PROPERTIES,
                        AvailableProperties.DEFAULT_API_PORT_VALUE
                ).toLowerCase();
        PropertiesValidator.portValidate(port);
        return String.format("%s:%s", url, port);
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
