package org.centrifugo.configurations;

public class PropertiesValidator {

    private final static int MIN_PORT = 1024;
    private final static int MAX_PORT = 49151;

    private final static String LOCALHOST_REGEX = "^(https?://)?localhost$";
    private final static String URL_REGEX = "^(https?://)?" +
                                            "((([a-z\\d]([a-z\\d-]*" +
                                            "[a-z\\d])*)\\.)+[a-z]{2,}" +
                                            "|((\\d{1,3}\\.){3}\\d{1,3}))?" +
                                            "(/[-a-z\\d%_.~+]*)*" +
                                            "(\\?[;&a-z\\d%_.~+=-]*)?" +
                                            "(#[-a-z\\d_]*)?$";

    public static void portValidate(final String port) {
        final int portNumber = Integer.parseInt(port);
        if (!(portNumber >= MIN_PORT && portNumber <= MAX_PORT)) {
            throw new IllegalStateException(
                    String.format(
                            "Unsupported port number value, use value from %d to %d",
                            MIN_PORT,
                            MAX_PORT
                    ));
        }
    }

    public static void urlValidate(final String url) {
        if (!url.matches(LOCALHOST_REGEX) && !url.matches(URL_REGEX)) {
            throw new IllegalStateException(
                    String.format(
                            "Illegal url value, value must match \n%s or \n%s",
                            LOCALHOST_REGEX,
                            URL_REGEX
                    ));
        }
    }

    public static void booleanValueValidate(final String value, final String property) {
        if (!value.equalsIgnoreCase(Boolean.FALSE.toString()) &&
            !value.equalsIgnoreCase(Boolean.TRUE.toString())
        ) {
            throw new IllegalStateException(
                    String.format(
                            "Illegal argument for %s property, value has to be Boolean type",
                            property
                    ));
        }
    }
}
