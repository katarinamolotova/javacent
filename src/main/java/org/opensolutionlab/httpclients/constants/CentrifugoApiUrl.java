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

package org.opensolutionlab.httpclients.constants;

public class CentrifugoApiUrl {
    public final static String PUBLISH = "/publish";
    public final static String BROADCAST = "/broadcast";
    public final static String DISCONNECT = "/disconnect";
    public final static String REFRESH = "/refresh";
    public final static String SUBSCRIBE = "/subscribe";
    public final static String UNSUBSCRIBE = "/unsubscribe";
    public final static String HISTORY = "/history";
    public final static String HISTORY_REMOVE = "/history_remove";
    public final static String PRESENCE = "/presence";
    public final static String PRESENCE_STATS = "/presence_stats";
    public final static String CHANNELS = "/channels";
    public final static String CONNECTIONS = "/connections";
    public final static String INFO = "/info";
    public final static String DELETE_USER_STATUS = "/delete_user_status";
    public final static String GET_USER_STATUS = "/get_user_status";
    public final static String UPDATE_USER_STATUS = "/update_user_status";
    public final static String BLOCK_USER = "/block_user";
    public final static String UNBLOCK_USER = "/unblock_user";
    public final static String INVALIDATE_USER_TOKENS = "/invalidate_user_tokens";
    public final static String REVOKE_TOKEN = "/revoke_token";
    public final static String CANCEL_PUSH = "/cancel_push";
    public final static String DEVICE_LIST = "/device_list";
    public final static String DEVICE_REGISTER = "/device_register";
    public final static String DEVICE_REMOVE = "/device_remove";
    public final static String DEVICE_TOPIC_LIST = "/device_topic_list";
    public final static String DEVICE_TOPIC_UPDATE = "/device_topic_update";
    public final static String DEVICE_UPDATE = "/device_update";
    public final static String SEND_PUSH_NOTIFICATION = "/send_push_notification";
    public final static String UPDATE_PUSH_STATUS = "/update_push_status";
    public final static String USER_TOPIC_LIST = "/user_topic_list";
    public final static String USER_TOPIC_UPDATE = "/user_topic_update";
    public final static String BATCH = "/batch";
}
