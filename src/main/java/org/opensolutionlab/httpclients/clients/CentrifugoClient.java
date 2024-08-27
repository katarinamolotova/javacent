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

package org.opensolutionlab.httpclients.clients;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.BasicHttpClientResponseHandler;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.opensolutionlab.httpclients.clients.interfaces.*;
import org.opensolutionlab.httpclients.configurations.ConfigurationService;
import org.opensolutionlab.httpclients.constants.CentrifugoApiUrl;
import org.opensolutionlab.httpclients.exceptions.CentrifugoException;
import org.opensolutionlab.httpclients.models.requests.EmptyRequest;
import org.opensolutionlab.httpclients.models.requests.RequestModel;
import org.opensolutionlab.httpclients.models.requests.batch.BatchRequest;
import org.opensolutionlab.httpclients.models.requests.connection_management.DisconnectRequest;
import org.opensolutionlab.httpclients.models.requests.connection_management.RefreshRequest;
import org.opensolutionlab.httpclients.models.requests.connection_management.SubscribeRequest;
import org.opensolutionlab.httpclients.models.requests.connection_management.UnsubscribeRequest;
import org.opensolutionlab.httpclients.models.requests.history.HistoryRemoveRequest;
import org.opensolutionlab.httpclients.models.requests.history.HistoryRequest;
import org.opensolutionlab.httpclients.models.requests.presence.PresenceRequest;
import org.opensolutionlab.httpclients.models.requests.presence.PresenceStatsRequest;
import org.opensolutionlab.httpclients.models.requests.publication.BroadcastRequest;
import org.opensolutionlab.httpclients.models.requests.publication.PublishRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.*;
import org.opensolutionlab.httpclients.models.requests.stats.ChannelsRequest;
import org.opensolutionlab.httpclients.models.requests.stats.ConnectionsRequest;
import org.opensolutionlab.httpclients.models.requests.token.InvalidateUserTokensRequest;
import org.opensolutionlab.httpclients.models.requests.token.RevokeTokenRequest;
import org.opensolutionlab.httpclients.models.requests.user_block.BlockUserRequest;
import org.opensolutionlab.httpclients.models.requests.user_block.UnblockUserRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.DeleteUserStatusRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.GetUserStatusRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.UpdateUserStatusRequest;
import org.opensolutionlab.httpclients.models.responses.*;

import java.io.IOException;
import java.util.List;

public class CentrifugoClient
        implements BatchNotificationCommand, ConnectionManagementCommand, HistoryCommand, PushNotificationCommand,
        PresenceCommand, PublicationCommand, TokenCommand, StatisticsCommand, UserBlockCommand, UserStatusCommand
{
    private final ConfigurationService configurations;
    private final ObjectMapper mapper;

    public CentrifugoClient() {
        this.configurations = new ConfigurationService();
        this.mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PublishResponse publish(final PublishRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PUBLISH);
        return (PublishResponse) sendToCentrifugo(httpPost, PublishResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PublishResponse publish(final String data, final String channel) {
        final PublishRequest<String> request = PublishRequest
                .<String>builder()
                .channel(channel)
                .data(data)
                .build();
        return publish(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BroadcastResponse broadcast(final BroadcastRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BROADCAST);
        return (BroadcastResponse) sendToCentrifugo(httpPost, BroadcastResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BroadcastResponse broadcast(final String data, final List<String> channels) {
        final BroadcastRequest<String> response = BroadcastRequest
                .<String>builder()
                .data(data)
                .channels(channels)
                .build();
        return broadcast(response);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse disconnect(final DisconnectRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DISCONNECT);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse disconnect(final String user) {
        final DisconnectRequest request = DisconnectRequest
                .builder()
                .user(user)
                .build();
        return disconnect(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse refresh(final RefreshRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REFRESH);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse refresh(final String user) {
        final RefreshRequest request = RefreshRequest
                .builder()
                .user(user)
                .build();
        return refresh(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse subscribe(final SubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SUBSCRIBE);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse subscribe(final String user, final String channel) {
        final SubscribeRequest request = SubscribeRequest
                .builder()
                .user(user)
                .channel(channel)
                .build();
        return subscribe(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse unsubscribe(final UnsubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNSUBSCRIBE);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse unsubscribe(final String user, final String channel) {
        final UnsubscribeRequest request = UnsubscribeRequest
                .builder()
                .user(user)
                .channel(channel)
                .build();
        return unsubscribe(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryResponse history(final HistoryRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY);
        return (HistoryResponse) sendToCentrifugo(httpPost, HistoryResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryResponse history(final String channel) {
        final HistoryRequest request = HistoryRequest
                .builder()
                .channel(channel)
                .build();
        return history(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse historyRemove(final HistoryRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY_REMOVE);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse historyRemove(final String channel) {
        return historyRemove(new HistoryRemoveRequest(channel));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PresenceResponse presence(final PresenceRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE);
        return (PresenceResponse) sendToCentrifugo(httpPost, PresenceResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PresenceResponse presence(final String channel) {
        return presence(new PresenceRequest(channel));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PresenceStatsResponse presenceStats(final PresenceStatsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE_STATS);
        return (PresenceStatsResponse) sendToCentrifugo(httpPost, PresenceStatsResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PresenceStatsResponse presenceStats(final String channel) {
        return presenceStats(new PresenceStatsRequest(channel));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelsResponse channels(final ChannelsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CHANNELS);
        return (ChannelsResponse) sendToCentrifugo(httpPost, ChannelsResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelsResponse channels(final String pattern) {
        return channels(new ChannelsRequest(pattern));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsResponse connections(final ConnectionsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CONNECTIONS);
        return (ConnectionsResponse) sendToCentrifugo(httpPost, ConnectionsResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsResponse connections(final String user, final String expression) {
        final ConnectionsRequest request = ConnectionsRequest
                .builder()
                .user(user)
                .expression(expression)
                .build();
        return connections(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfoResponse info() {
        final HttpPost httpPost = getHttpPost(new EmptyRequest(), CentrifugoApiUrl.INFO);
        return (InfoResponse) sendToCentrifugo(httpPost, InfoResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse deleteUserStatus(final DeleteUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DELETE_USER_STATUS);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse deleteUserStatus(final List<String> user) {
        return deleteUserStatus(new DeleteUserStatusRequest(user));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUserStatusResponse getUserStatus(final GetUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.GET_USER_STATUS);
        return (GetUserStatusResponse) sendToCentrifugo(httpPost, GetUserStatusResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUserStatusResponse getUserStatus(final List<String> user) {
        return getUserStatus(new GetUserStatusRequest(user));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse updateUserStatus(final UpdateUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_USER_STATUS);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse updateUserStatus(final List<String> user, final String state) {
        final UpdateUserStatusRequest request = UpdateUserStatusRequest
                .builder()
                .users(user)
                .state(state)
                .build();
        return updateUserStatus(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse blockUser(final BlockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BLOCK_USER);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse unblockUser(final UnblockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNBLOCK_USER);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse invalidateUserTokens(final InvalidateUserTokensRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.INVALIDATE_USER_TOKENS);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse revokeToken(final RevokeTokenRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REVOKE_TOKEN);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse cancelPush(final CancelPushRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CANCEL_PUSH);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeviceListResponse deviceList(final DeviceListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_LIST);
        return (DeviceListResponse) sendToCentrifugo(httpPost, DeviceListResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeviceRegisterResponse deviceRegister(final DeviceRegisterRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REGISTER);
        return (DeviceRegisterResponse) sendToCentrifugo(httpPost, DeviceRegisterResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse deviceRemove(final DeviceRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REMOVE);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeviceTopicListResponse deviceTopicList(final DeviceTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_LIST);
        return (DeviceTopicListResponse) sendToCentrifugo(httpPost, DeviceTopicListResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse deviceTopicUpdate(final DeviceTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_UPDATE);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse deviceUpdate(final DeviceUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_UPDATE);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SendPushNotificationResponse sendPushNotification(final SendPushNotificationRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SEND_PUSH_NOTIFICATION);
        return (SendPushNotificationResponse) sendToCentrifugo(httpPost, SendPushNotificationResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse updatePushStatus(final UpdatePushStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_PUSH_STATUS);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTopicListResponse userTopicList(final UserTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_LIST);
        return (UserTopicListResponse) sendToCentrifugo(httpPost, UserTopicListResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmptyResponse userTopicUpdate(final UserTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_UPDATE);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchResponse batch(final BatchRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BATCH);
        return (BatchResponse) sendToCentrifugo(httpPost, BatchResponse.class);
    }

    private HttpPost getHttpPost(final RequestModel request, final String url) {
        final HttpPost httpPost = new HttpPost(
                configurations.getCentrifugoApiUrl() +
                configurations.getApiCommandUrl(url)
        );

        try {
            final String json = mapper.writeValueAsString(request);
            final StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("X-API-Key", configurations.getCentrifugoApiKey());
            return httpPost;
        } catch (final IOException e) {
            throw new CentrifugoException(e.getMessage());
        }
    }

    private ResponseModel sendToCentrifugo(
            final HttpPost httpPost,
            final Class<? extends ResponseModel> responseClass
    ) {
        try (final CloseableHttpClient client = HttpClients.createDefault()) {
            final BasicHttpClientResponseHandler responseHandler = new BasicHttpClientResponseHandler();
            final String response = client.execute(httpPost, responseHandler);
            return mapper.readValue(response, responseClass);
        } catch (final IOException e) {
            throw new CentrifugoException(e.getMessage());
        }
    }
}