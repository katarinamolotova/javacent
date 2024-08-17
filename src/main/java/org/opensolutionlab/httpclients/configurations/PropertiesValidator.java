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
