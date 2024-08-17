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

package org.opensolutionlab.httpclients.models.responses.results.stats.channels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Channels result
 */
public class ChannelsResult {

  /**
   * Map where key is channel and value is ChannelInfo
   */
  @JsonProperty("channels")
  private Map<String, ChannelInfo> channels;

  public ChannelsResult(Map<String, ChannelInfo> channels) {
    this.channels = channels;
  }

  public ChannelsResult() {
  }

  public Map<String, ChannelInfo> getChannels() {
    return this.channels;
  }

  @JsonProperty("channels")
  public void setChannels(Map<String, ChannelInfo> channels) {
    this.channels = channels;
  }
}