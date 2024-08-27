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

public class AvailableProperties {

// Available properties 
  public static final String API_KEY_PROPERTIES = "centrifugo.api.key";
  public static final String API_PORT_PROPERTIES = "centrifugo.api.port";
  public static final String API_URL_PROPERTIES = "centrifugo.api.url";
  public static final String API_INSECURE_PROPERTIES = "centrifugo.api.insecure";
  public static final String API_HANDLER_PREFIX = "centrifugo.api.handler.prefix";

// Default Values
  public static final String DEFAULT_API_URL_VALUE = "http://localhost";
  public static final String DEFAULT_API_PORT_VALUE = "8000";
  public static final String DEFAULT_API_KEY_VALUE = "";
  public static final String DEFAULT_API_INSECURE_VALUE = "false";
  public static final String DEFAULT_API_HANDLER_PREFIX = "/api";
}
