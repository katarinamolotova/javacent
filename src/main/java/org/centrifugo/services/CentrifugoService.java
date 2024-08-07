package org.centrifugo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.centrifugo.configarations.ConfigurationService;
import org.centrifugo.constants.CentrifugoApiUrl;
import org.centrifugo.exceptions.CentrifugoException;
import org.centrifugo.models.requests.EmptyRequest;
import org.centrifugo.models.requests.RequestModel;
import org.centrifugo.models.requests.batch.BatchRequest;
import org.centrifugo.models.requests.connection_management.DisconnectRequest;
import org.centrifugo.models.requests.connection_management.RefreshRequest;
import org.centrifugo.models.requests.connection_management.SubscribeRequest;
import org.centrifugo.models.requests.connection_management.UnsubscribeRequest;
import org.centrifugo.models.requests.history.HistoryRemoveRequest;
import org.centrifugo.models.requests.history.HistoryRequest;
import org.centrifugo.models.requests.presence.PresenceRequest;
import org.centrifugo.models.requests.presence.PresenceStatsRequest;
import org.centrifugo.models.requests.publication.BroadcastRequest;
import org.centrifugo.models.requests.publication.PublishRequest;
import org.centrifugo.models.requests.push_notification.CancelPushRequest;
import org.centrifugo.models.requests.push_notification.DeviceListRequest;
import org.centrifugo.models.requests.push_notification.DeviceRegisterRequest;
import org.centrifugo.models.requests.push_notification.DeviceRemoveRequest;
import org.centrifugo.models.requests.push_notification.DeviceTopicListRequest;
import org.centrifugo.models.requests.push_notification.DeviceTopicUpdateRequest;
import org.centrifugo.models.requests.push_notification.DeviceUpdateRequest;
import org.centrifugo.models.requests.push_notification.SendPushNotificationRequest;
import org.centrifugo.models.requests.push_notification.UpdatePushStatusRequest;
import org.centrifugo.models.requests.push_notification.UserTopicListRequest;
import org.centrifugo.models.requests.push_notification.UserTopicUpdateRequest;
import org.centrifugo.models.requests.stats.ChannelsRequest;
import org.centrifugo.models.requests.stats.ConnectionsRequest;
import org.centrifugo.models.requests.token.InvalidateUserTokensRequest;
import org.centrifugo.models.requests.token.RevokeTokenRequest;
import org.centrifugo.models.requests.user_block.BlockUserRequest;
import org.centrifugo.models.requests.user_block.UnblockUserRequest;
import org.centrifugo.models.requests.user_status.DeleteUserStatusRequest;
import org.centrifugo.models.requests.user_status.GetUserStatusRequest;
import org.centrifugo.models.requests.user_status.UpdateUserStatusRequest;
import org.centrifugo.models.responses.BatchResponse;
import org.centrifugo.models.responses.BroadcastResponse;
import org.centrifugo.models.responses.ChannelsResponse;
import org.centrifugo.models.responses.ConnectionsResponse;
import org.centrifugo.models.responses.DeviceListResponse;
import org.centrifugo.models.responses.DeviceRegisterResponse;
import org.centrifugo.models.responses.DeviceTopicListResponse;
import org.centrifugo.models.responses.EmptyResponse;
import org.centrifugo.models.responses.GetUserStatusResponse;
import org.centrifugo.models.responses.HistoryResponse;
import org.centrifugo.models.responses.InfoResponse;
import org.centrifugo.models.responses.PresenceResponse;
import org.centrifugo.models.responses.PresenceStatsResponse;
import org.centrifugo.models.responses.PublishResponse;
import org.centrifugo.models.responses.ResponseModel;
import org.centrifugo.models.responses.SendPushNotificationResponse;
import org.centrifugo.models.responses.StandardResponse;
import org.centrifugo.models.responses.UserTopicListResponse;
import org.centrifugo.services.interfaces.BatchNotificationCommand;
import org.centrifugo.services.interfaces.ConnectionManagementCommand;
import org.centrifugo.services.interfaces.HistoryCommand;
import org.centrifugo.services.interfaces.PresenceCommand;
import org.centrifugo.services.interfaces.PublicationCommand;
import org.centrifugo.services.interfaces.PushNotificationCommand;
import org.centrifugo.services.interfaces.StatisticsCommand;
import org.centrifugo.services.interfaces.TokenCommand;
import org.centrifugo.services.interfaces.UserBlockCommand;
import org.centrifugo.services.interfaces.UserStatusCommand;

import java.io.IOException;
import java.util.List;

public class CentrifugoService
        implements BatchNotificationCommand, ConnectionManagementCommand, HistoryCommand, PushNotificationCommand,
        PresenceCommand, PublicationCommand, TokenCommand, StatisticsCommand, UserBlockCommand, UserStatusCommand
{
    private final ConfigurationService configurations;
    private final ObjectMapper mapper;

    public CentrifugoService() {
        this.configurations = new ConfigurationService();
        this.mapper = new ObjectMapper();
    }

    @Override
    public PublishResponse publish(final PublishRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PUBLISH);
        return (PublishResponse) sendToCentrifugo(httpPost, PublishResponse.class);
    }

    @Override
    public PublishResponse publish(final String data, final String channel) {
        final PublishRequest<String> request = PublishRequest
                .<String>builder()
                .channel(channel)
                .data(data)
                .build();
        return publish(request);
    }

    @Override
    public BroadcastResponse broadcast(final BroadcastRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BROADCAST);
        return (BroadcastResponse) sendToCentrifugo(httpPost, BroadcastResponse.class);
    }

    @Override
    public BroadcastResponse broadcast(final String data, final List<String> channels) {
        final BroadcastRequest<String> response = BroadcastRequest
                .<String>builder()
                .data(data)
                .channels(channels)
                .build();
        return broadcast(response);
    }

    @Override
    public EmptyResponse disconnect(final DisconnectRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DISCONNECT);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    @Override
    public EmptyResponse disconnect(final String user) {
        final DisconnectRequest request = DisconnectRequest
                .builder()
                .user(user)
                .build();
        return disconnect(request);
    }

    @Override
    public EmptyResponse refresh(final RefreshRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REFRESH);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    @Override
    public EmptyResponse refresh(final String user) {
        final RefreshRequest request = RefreshRequest
                .builder()
                .user(user)
                .build();
        return refresh(request);
    }

    @Override
    public EmptyResponse subscribe(final SubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SUBSCRIBE);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public EmptyResponse subscribe(final String user, final String channel) {
        final SubscribeRequest request = SubscribeRequest
                .builder()
                .user(user)
                .channel(channel)
                .build();
        return subscribe(request);
    }

    @Override
    public EmptyResponse unsubscribe(final UnsubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNSUBSCRIBE);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public EmptyResponse unsubscribe(final String user, final String channel) {
        final UnsubscribeRequest request = UnsubscribeRequest
                .builder()
                .user(user)
                .channel(channel)
                .build();
        return unsubscribe(request);
    }

    @Override
    public HistoryResponse history(final HistoryRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY);
        return (HistoryResponse) sendToCentrifugo(httpPost, HistoryResponse.class);
    }

    @Override
    public HistoryResponse history(final String channel) {
        final HistoryRequest request = HistoryRequest
                .builder()
                .channel(channel)
                .build();
        return history(request);
    }

    @Override
    public EmptyResponse historyRemove(final HistoryRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY_REMOVE);
        return (EmptyResponse) sendToCentrifugo(httpPost, EmptyResponse.class);
    }

    @Override
    public EmptyResponse historyRemove(final String channel) {
        return historyRemove(new HistoryRemoveRequest(channel));
    }

    @Override
    public PresenceResponse presence(final PresenceRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE);
        return (PresenceResponse) sendToCentrifugo(httpPost, PresenceResponse.class);
    }

    @Override
    public PresenceResponse presence(final String channel) {
        return presence(new PresenceRequest(channel));
    }

    @Override
    public PresenceStatsResponse presenceStats(final PresenceStatsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE_STATS);
        return (PresenceStatsResponse) sendToCentrifugo(httpPost, PresenceStatsResponse.class);
    }

    @Override
    public PresenceStatsResponse presenceStats(final String channel) {
        return presenceStats(new PresenceStatsRequest(channel));
    }

    @Override
    public ChannelsResponse channels(final ChannelsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CHANNELS);
        return (ChannelsResponse) sendToCentrifugo(httpPost, ChannelsResponse.class);
    }

    @Override
    public ChannelsResponse channels(final String pattern) {
        return channels(new ChannelsRequest(pattern));
    }

    @Override
    public ConnectionsResponse connections(final ConnectionsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CONNECTIONS);
        return (ConnectionsResponse) sendToCentrifugo(httpPost, ConnectionsResponse.class);
    }

    @Override
    public ConnectionsResponse connections(final String user, final String expression) {
        final ConnectionsRequest request = ConnectionsRequest
                .builder()
                .user(user)
                .expression(expression)
                .build();
        return connections(request);
    }

    @Override
    public InfoResponse info() {
        final HttpPost httpPost = getHttpPost(new EmptyRequest(), CentrifugoApiUrl.INFO);
        return (InfoResponse) sendToCentrifugo(httpPost, InfoResponse.class);
    }

    @Override
    public EmptyResponse deleteUserStatus(final DeleteUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DELETE_USER_STATUS);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public EmptyResponse deleteUserStatus(final List<String> user) {
        return deleteUserStatus(new DeleteUserStatusRequest(user));
    }

    @Override
    public GetUserStatusResponse getUserStatus(final GetUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.GET_USER_STATUS);
        return (GetUserStatusResponse) sendToCentrifugo(httpPost, GetUserStatusResponse.class);
    }

    @Override
    public GetUserStatusResponse getUserStatus(final List<String> user) {
        return getUserStatus(new GetUserStatusRequest(user));
    }

    @Override
    public EmptyResponse updateUserStatus(final UpdateUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_USER_STATUS);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public EmptyResponse updateUserStatus(final List<String> user, final String state) {
        final UpdateUserStatusRequest request = UpdateUserStatusRequest
                .builder()
                .users(user)
                .state(state)
                .build();
        return updateUserStatus(request);
    }

    @Override
    public EmptyResponse blockUser(final BlockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BLOCK_USER);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public EmptyResponse unblockUser(final UnblockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNBLOCK_USER);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public EmptyResponse invalidateUserTokens(final InvalidateUserTokensRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.INVALIDATE_USER_TOKENS);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public EmptyResponse revokeToken(final RevokeTokenRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REVOKE_TOKEN);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public EmptyResponse cancelPush(final CancelPushRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CANCEL_PUSH);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public DeviceListResponse deviceList(final DeviceListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_LIST);
        return (DeviceListResponse) sendToCentrifugo(httpPost, DeviceListResponse.class);
    }

    @Override
    public DeviceRegisterResponse deviceRegister(final DeviceRegisterRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REGISTER);
        return (DeviceRegisterResponse) sendToCentrifugo(httpPost, DeviceRegisterResponse.class);
    }

    @Override
    public EmptyResponse deviceRemove(final DeviceRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REMOVE);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public DeviceTopicListResponse deviceTopicList(final DeviceTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_LIST);
        return (DeviceTopicListResponse) sendToCentrifugo(httpPost, DeviceTopicListResponse.class);
    }

    @Override
    public EmptyResponse deviceTopicUpdate(final DeviceTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_UPDATE);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public EmptyResponse deviceUpdate(final DeviceUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_UPDATE);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public SendPushNotificationResponse sendPushNotification(final SendPushNotificationRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SEND_PUSH_NOTIFICATION);
        return (SendPushNotificationResponse) sendToCentrifugo(httpPost, SendPushNotificationResponse.class);
    }

    @Override
    public EmptyResponse updatePushStatus(final UpdatePushStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_PUSH_STATUS);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public UserTopicListResponse userTopicList(final UserTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_LIST);
        return (UserTopicListResponse) sendToCentrifugo(httpPost, UserTopicListResponse.class);
    }

    @Override
    public EmptyResponse userTopicUpdate(final UserTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_UPDATE);
        return (EmptyResponse) sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public BatchResponse batch(final BatchRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BATCH);
        return (BatchResponse) sendToCentrifugo(httpPost, BatchResponse.class);
    }

    private HttpPost getHttpPost(final RequestModel request, final String url) {
        final HttpPost httpPost = new HttpPost(configurations.getCentrifugoApiUrl() + url);

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
        try (
                final CloseableHttpClient client = HttpClients.createDefault();
                final CloseableHttpResponse response = client.execute(httpPost)
        ) {
            final HttpEntity entity = response.getEntity();
            if (entity == null) {
                return new EmptyResponse();
            }

            final String json = IOUtils.toString(entity.getContent(), "UTF-8");
            return mapper.readValue(json, responseClass);
        } catch (final IOException e) {
            throw new CentrifugoException("Error sending the request");
        }
    }
}
