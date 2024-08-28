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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.opensolutionlab.httpclients.clients.interfaces.BatchNotificationCommand;
import org.opensolutionlab.httpclients.clients.interfaces.ConnectionManagementCommand;
import org.opensolutionlab.httpclients.clients.interfaces.HistoryCommand;
import org.opensolutionlab.httpclients.clients.interfaces.PresenceCommand;
import org.opensolutionlab.httpclients.clients.interfaces.PublicationCommand;
import org.opensolutionlab.httpclients.clients.interfaces.PushNotificationCommand;
import org.opensolutionlab.httpclients.clients.interfaces.StatisticsCommand;
import org.opensolutionlab.httpclients.clients.interfaces.TokenCommand;
import org.opensolutionlab.httpclients.clients.interfaces.UserBlockCommand;
import org.opensolutionlab.httpclients.clients.interfaces.UserStatusCommand;
import org.opensolutionlab.httpclients.configurations.ConfigurationService;
import org.opensolutionlab.httpclients.constants.CentrifugoApiUrl;
import org.opensolutionlab.httpclients.exceptions.CentrifugoApiResponseException;
import org.opensolutionlab.httpclients.exceptions.CentrifugoDecodeException;
import org.opensolutionlab.httpclients.exceptions.CentrifugoNetworkException;
import org.opensolutionlab.httpclients.handlers.CentrifugoHttpClientResponseHandler;
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
import org.opensolutionlab.httpclients.models.requests.push_notification.CancelPushRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.DeviceListRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.DeviceRegisterRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.DeviceRemoveRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.DeviceTopicListRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.DeviceTopicUpdateRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.DeviceUpdateRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.SendPushNotificationRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.UpdatePushStatusRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.UserTopicListRequest;
import org.opensolutionlab.httpclients.models.requests.push_notification.UserTopicUpdateRequest;
import org.opensolutionlab.httpclients.models.requests.stats.ChannelsRequest;
import org.opensolutionlab.httpclients.models.requests.stats.ConnectionsRequest;
import org.opensolutionlab.httpclients.models.requests.token.InvalidateUserTokensRequest;
import org.opensolutionlab.httpclients.models.requests.token.RevokeTokenRequest;
import org.opensolutionlab.httpclients.models.requests.user_block.BlockUserRequest;
import org.opensolutionlab.httpclients.models.requests.user_block.UnblockUserRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.DeleteUserStatusRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.GetUserStatusRequest;
import org.opensolutionlab.httpclients.models.requests.user_status.UpdateUserStatusRequest;
import org.opensolutionlab.httpclients.models.responses.BatchResponse;
import org.opensolutionlab.httpclients.models.responses.Error;
import org.opensolutionlab.httpclients.models.responses.StandardResponse;
import org.opensolutionlab.httpclients.models.responses.BroadcastResponse;
import org.opensolutionlab.httpclients.models.responses.ChannelsResponse;
import org.opensolutionlab.httpclients.models.responses.ConnectionsResponse;
import org.opensolutionlab.httpclients.models.responses.DeviceListResponse;
import org.opensolutionlab.httpclients.models.responses.DeviceRegisterResponse;
import org.opensolutionlab.httpclients.models.responses.DeviceTopicListResponse;
import org.opensolutionlab.httpclients.models.responses.EmptyResponse;
import org.opensolutionlab.httpclients.models.responses.GetUserStatusResponse;
import org.opensolutionlab.httpclients.models.responses.HistoryResponse;
import org.opensolutionlab.httpclients.models.responses.InfoResponse;
import org.opensolutionlab.httpclients.models.responses.PresenceResponse;
import org.opensolutionlab.httpclients.models.responses.PresenceStatsResponse;
import org.opensolutionlab.httpclients.models.responses.PublishResponse;
import org.opensolutionlab.httpclients.models.responses.ResponseModel;
import org.opensolutionlab.httpclients.models.responses.SendPushNotificationResponse;
import org.opensolutionlab.httpclients.models.responses.UserTopicListResponse;
import org.opensolutionlab.httpclients.models.responses.results.history.HistoryResult;
import org.opensolutionlab.httpclients.models.responses.results.presence.PresenceResult;
import org.opensolutionlab.httpclients.models.responses.results.presence.PresenceStatsResult;
import org.opensolutionlab.httpclients.models.responses.results.publication.BroadcastResult;
import org.opensolutionlab.httpclients.models.responses.results.publication.PublishResult;
import org.opensolutionlab.httpclients.models.responses.results.push_notification.device_list.DeviceListResult;
import org.opensolutionlab.httpclients.models.responses.results.push_notification.device_register.DeviceRegisterResult;
import org.opensolutionlab.httpclients.models.responses.results.push_notification.device_topic_list.DeviceTopicListResult;
import org.opensolutionlab.httpclients.models.responses.results.push_notification.send_push_notification.SendPushNotificationResult;
import org.opensolutionlab.httpclients.models.responses.results.push_notification.user_topic_list.UserTopicListResult;
import org.opensolutionlab.httpclients.models.responses.results.stats.channels.ChannelsResult;
import org.opensolutionlab.httpclients.models.responses.results.stats.connections.ConnectionsResult;
import org.opensolutionlab.httpclients.models.responses.results.stats.info.InfoResult;
import org.opensolutionlab.httpclients.models.responses.results.user_status.GetUserStatusResult;

import java.io.IOException;
import java.net.ConnectException;
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
    public PublishResult publish(final PublishRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PUBLISH);
        final PublishResponse response = (PublishResponse) sendToCentrifugo(httpPost, PublishResponse.class);
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PublishResult publish(final String channel, final Object data) {
        final PublishRequest<Object> request = PublishRequest
                .builder()
                .channel(channel)
                .data(data)
                .build();
        return publish(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BroadcastResult broadcast(final BroadcastRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BROADCAST);
        final BroadcastResponse response = (BroadcastResponse) sendToCentrifugo(httpPost, BroadcastResponse.class);
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BroadcastResult broadcast(final List<String> channels, final Object data) {
        final BroadcastRequest<Object> response = BroadcastRequest
                .builder()
                .data(data)
                .channels(channels)
                .build();
        return broadcast(response);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void disconnect(final DisconnectRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DISCONNECT);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void disconnect(final String user) {
        final DisconnectRequest request = DisconnectRequest
                .builder()
                .user(user)
                .build();
        disconnect(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh(final RefreshRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REFRESH);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh(final String user) {
        final RefreshRequest request = RefreshRequest
                .builder()
                .user(user)
                .build();
        refresh(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void subscribe(final SubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SUBSCRIBE);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void subscribe(final String user, final String channel) {
        final SubscribeRequest request = SubscribeRequest
                .builder()
                .user(user)
                .channel(channel)
                .build();
        subscribe(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unsubscribe(final UnsubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNSUBSCRIBE);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unsubscribe(final String user, final String channel) {
        final UnsubscribeRequest request = UnsubscribeRequest
                .builder()
                .user(user)
                .channel(channel)
                .build();
        unsubscribe(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryResult history(final HistoryRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY);
        final HistoryResponse response = (HistoryResponse) sendToCentrifugo(httpPost, HistoryResponse.class);
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryResult history(final String channel) {
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
    public void historyRemove(final HistoryRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY_REMOVE);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void historyRemove(final String channel) {
        historyRemove(new HistoryRemoveRequest(channel));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PresenceResult presence(final PresenceRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE);
        final PresenceResponse response = (PresenceResponse) sendToCentrifugo(httpPost, PresenceResponse.class);
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PresenceResult presence(final String channel) {
        return presence(new PresenceRequest(channel));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PresenceStatsResult presenceStats(final PresenceStatsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE_STATS);
        final PresenceStatsResponse response = (PresenceStatsResponse) sendToCentrifugo(
                httpPost,
                PresenceStatsResponse.class
        );
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PresenceStatsResult presenceStats(final String channel) {
        return presenceStats(new PresenceStatsRequest(channel));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelsResult channels(final ChannelsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CHANNELS);
        final ChannelsResponse response = (ChannelsResponse) sendToCentrifugo(httpPost, ChannelsResponse.class);
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelsResult channels(final String pattern) {
        return channels(new ChannelsRequest(pattern));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsResult connections(final ConnectionsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CONNECTIONS);
        final ConnectionsResponse response = (ConnectionsResponse) sendToCentrifugo(
                httpPost,
                ConnectionsResponse.class
        );
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsResult connections(final String user, final String expression) {
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
    public InfoResult info() {
        final HttpPost httpPost = getHttpPost(new EmptyRequest(), CentrifugoApiUrl.INFO);
        final InfoResponse response = (InfoResponse) sendToCentrifugo(httpPost, InfoResponse.class);
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteUserStatus(final DeleteUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DELETE_USER_STATUS);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteUserStatus(final List<String> user) {
        deleteUserStatus(new DeleteUserStatusRequest(user));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUserStatusResult getUserStatus(final GetUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.GET_USER_STATUS);
        final GetUserStatusResponse response = (GetUserStatusResponse) sendToCentrifugo(
                httpPost,
                GetUserStatusResponse.class
        );
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUserStatusResult getUserStatus(final List<String> user) {
        return getUserStatus(new GetUserStatusRequest(user));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateUserStatus(final UpdateUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_USER_STATUS);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateUserStatus(final List<String> user, final String state) {
        final UpdateUserStatusRequest request = UpdateUserStatusRequest
                .builder()
                .users(user)
                .state(state)
                .build();
        updateUserStatus(request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void blockUser(final BlockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BLOCK_USER);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unblockUser(final UnblockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNBLOCK_USER);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void invalidateUserTokens(final InvalidateUserTokensRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.INVALIDATE_USER_TOKENS);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void revokeToken(final RevokeTokenRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REVOKE_TOKEN);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cancelPush(final CancelPushRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CANCEL_PUSH);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeviceListResult deviceList(final DeviceListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_LIST);
        final DeviceListResponse response = (DeviceListResponse) sendToCentrifugo(httpPost, DeviceListResponse.class);
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeviceRegisterResult deviceRegister(final DeviceRegisterRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REGISTER);
        final DeviceRegisterResponse response = (DeviceRegisterResponse) sendToCentrifugo(
                httpPost,
                DeviceRegisterResponse.class
        );
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deviceRemove(final DeviceRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REMOVE);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeviceTopicListResult deviceTopicList(final DeviceTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_LIST);
        final DeviceTopicListResponse response = (DeviceTopicListResponse) sendToCentrifugo(
                httpPost,
                DeviceTopicListResponse.class
        );
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deviceTopicUpdate(final DeviceTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_UPDATE);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deviceUpdate(final DeviceUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_UPDATE);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SendPushNotificationResult sendPushNotification(final SendPushNotificationRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SEND_PUSH_NOTIFICATION);
        final SendPushNotificationResponse response = (SendPushNotificationResponse) sendToCentrifugo(
                httpPost,
                SendPushNotificationResponse.class
        );
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updatePushStatus(final UpdatePushStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_PUSH_STATUS);
        sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTopicListResult userTopicList(final UserTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_LIST);
        final UserTopicListResponse response = (UserTopicListResponse) sendToCentrifugo(
                httpPost,
                UserTopicListResponse.class
        );
        return response.getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void userTopicUpdate(final UserTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_UPDATE);
        sendToCentrifugo(httpPost, EmptyResponse.class);
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
        } catch (final JsonProcessingException e) {
            throw new CentrifugoDecodeException(e.getMessage());
        }
    }

    private ResponseModel sendToCentrifugo(
            final HttpPost httpPost,
            final Class<? extends ResponseModel> responseClass
    ) {
        try (final CloseableHttpClient client = HttpClients.createDefault()) {
            final CentrifugoHttpClientResponseHandler responseHandler = new CentrifugoHttpClientResponseHandler();
            final String response = client.execute(httpPost, responseHandler);

            final ResponseModel responseModel = mapper.readValue(response, responseClass);
            checkApiError(responseClass, responseModel);
            return responseModel;
        } catch (final ConnectException e) {
            throw new CentrifugoNetworkException(e.getMessage());
        } catch (final IOException e) {
            throw new CentrifugoDecodeException(e.getMessage());
        }
    }

    private static void checkApiError(
            final Class<? extends ResponseModel> responseClass,
            final ResponseModel responseModel
    ) {
        if (responseClass != BatchResponse.class) {
            final Error error = ((StandardResponse<?>) responseModel).getError();
            if (error != null) {
                throw new CentrifugoApiResponseException(error.getCode().intValue(), error.getMessage());
            }
        }
    }
}