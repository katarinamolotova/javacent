package org.centrifugo.configarations;

public class PropertiesValidator {
    private final static String URL_REGEX = "^(https?://)?" +
                                            "((([a-z\\d]([a-z\\d-]*[a-z\\d])*)\\.)+[a-z]{2,}|((\\d{1,3}\\.){3}\\d{1,3}))?" +
                                            "(/[-a-z\\d%_.~+]*)*" +
                                            "(\\?[;&a-z\\d%_.~+=-]*)?" +
                                            "(#[-a-z\\d_]*)?$";

    private final static int MIN_PORT = 1024;
    private final static int MAX_PORT = 49151;


    public static void portValidate(final String port) {
        final int portNumber = Integer.parseInt(port);
        if (!(portNumber >= MIN_PORT && portNumber <= MAX_PORT)) {
            throw new IllegalStateException("asd-as");
        }
    }

    public static void urlValidate(final String url) {
        if (!url.equalsIgnoreCase("http://localhost") &&
            !url.equalsIgnoreCase("https://localhost") &&
            !url.matches(URL_REGEX)
        ) {
            throw new IllegalStateException("asd-asd");
        }
    }

    public static void booleanValueValidate(final String value) {
        if (!value.equalsIgnoreCase(Boolean.FALSE.toString()) &&
            !value.equalsIgnoreCase(Boolean.TRUE.toString())
        ) {
            throw new IllegalStateException("sadsad");
        }
    }
}
