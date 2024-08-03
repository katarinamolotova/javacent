package org.centrifugo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.centrifugo.configarations.CentrConfigurParams;
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
import org.centrifugo.models.requests.push_notification.*;
import org.centrifugo.models.requests.stats.ChannelsRequest;
import org.centrifugo.models.requests.stats.ConnectionsRequest;
import org.centrifugo.models.requests.token.InvalidateUserTokensRequest;
import org.centrifugo.models.requests.token.RevokeTokenRequest;
import org.centrifugo.models.requests.user_block.BlockUserRequest;
import org.centrifugo.models.requests.user_block.UnblockUserRequest;
import org.centrifugo.models.requests.user_status.DeleteUserStatusRequest;
import org.centrifugo.models.requests.user_status.GetUserStatusRequest;
import org.centrifugo.models.requests.user_status.UpdateUserStatusRequest;
import org.centrifugo.models.responses.ResponseModel;
import org.centrifugo.models.responses.StandardResponse;
import org.centrifugo.models.responses.results.batch.BatchResponse;
import org.centrifugo.models.responses.results.history.HistoryResult;
import org.centrifugo.models.responses.results.presence.PresenceResult;
import org.centrifugo.models.responses.results.presence.PresenceStatsResult;
import org.centrifugo.models.responses.results.publication.BroadcastResult;
import org.centrifugo.models.responses.results.publication.PublishResult;
import org.centrifugo.models.responses.results.push_notification.device_list.DeviceListResult;
import org.centrifugo.models.responses.results.push_notification.device_register.DeviceRegisterResult;
import org.centrifugo.models.responses.results.push_notification.device_topic_list.DeviceTopicListResult;
import org.centrifugo.models.responses.results.push_notification.send_publish_notification.SendPushNotificationResult;
import org.centrifugo.models.responses.results.push_notification.user_topic_list.UserTopicListResult;
import org.centrifugo.models.responses.results.stats.channels.ChannelsResult;
import org.centrifugo.models.responses.results.stats.connections.ConnectionsResult;
import org.centrifugo.models.responses.results.stats.info.InfoResult;
import org.centrifugo.models.responses.results.user_status.GetUserStatusResult;

import java.io.IOException;
import java.util.List;

public class CentrifugoService implements CentrifugoCommand {
    private final CentrConfigurParams configurations;
    private final ObjectMapper mapper;

    public CentrifugoService() {
        this.configurations = new CentrConfigurParams();
        this.mapper = new ObjectMapper();
    }

    @Override
    public ResponseModel publish(final PublishRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PUBLISH);
        final StandardResponse<PublishResult> response = new StandardResponse<>();
        return sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public ResponseModel publish(final String data, final String channel) {
        final PublishRequest<String> request = new PublishRequest<>();
        return publish(request.channel(channel).data(data));
    }

    @Override
    public ResponseModel broadcast(final BroadcastRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BROADCAST);
        final StandardResponse<BroadcastResult> response = new StandardResponse<>();
        return sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public ResponseModel broadcast(final String data, final List<String> channels) {
        final BroadcastRequest<String> request = new BroadcastRequest<>();
        return broadcast(request.data(data).channels(channels));
    }

    @Override
    public ResponseModel disconnect(final DisconnectRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DISCONNECT);
        return sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public ResponseModel disconnect(final String user) {
        final DisconnectRequest request = new DisconnectRequest();
        return disconnect(request.user(user));
    }

    @Override
    public void refresh(final RefreshRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REFRESH);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void refresh(final String user) {
        final RefreshRequest request = new RefreshRequest();
        refresh(request.user(user));
    }

    @Override
    public ResponseModel subscribe(final SubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SUBSCRIBE);
        return sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public ResponseModel subscribe(final String user, final String channel) {
        final SubscribeRequest request = new SubscribeRequest();
        return subscribe(request.user(user).channel(channel));
    }

    @Override
    public ResponseModel unsubscribe(final UnsubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNSUBSCRIBE);
        return sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public ResponseModel unsubscribe(final String user, final String channel) {
        final UnsubscribeRequest request = new UnsubscribeRequest();
        return unsubscribe(request.user(user).channel(channel));
    }

    @Override
    public void history(final HistoryRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY);
        final StandardResponse<HistoryResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void history(final String channel) {
        final HistoryRequest request = new HistoryRequest();
        history(request.setChannel(channel));
    }

    @Override
    public void historyRemove(final HistoryRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY_REMOVE);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void historyRemove(final String channel) {
        final HistoryRemoveRequest request = new HistoryRemoveRequest();
        historyRemove(request.setChannel(channel));
    }

    @Override
    public void presence(final PresenceRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE);
        final StandardResponse<PresenceResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }
    @Override
    public void presence(final String channel) {
       final PresenceRequest request = new PresenceRequest();
       presence(request.setChannel(channel));
    }

    @Override
    public void presenceStats(final PresenceStatsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE_STATS);
        final StandardResponse<PresenceStatsResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void presenceStats(final String channel) {
        final PresenceStatsRequest request = new PresenceStatsRequest();
        presenceStats(request.setChannel(channel));
    }

    @Override
    public void channels(final ChannelsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CHANNELS);
        final StandardResponse<ChannelsResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void channels(final String patter) {
        final ChannelsRequest request = new ChannelsRequest();
        channels(request.setPattern(patter));
    }

    @Override
    public void connections(final ConnectionsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CONNECTIONS);
        final StandardResponse<ConnectionsResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void connections(final String user, final String expression) {
        final ConnectionsRequest request = new ConnectionsRequest();
        connections(request.setUser(user).setExpression(expression));
    }

    @Override
    public void info() {
        final HttpPost httpPost = getHttpPost(new EmptyRequest(), CentrifugoApiUrl.INFO);
        final StandardResponse<InfoResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void deleteUserStatus(final DeleteUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DELETE_USER_STATUS);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void deleteUserStatus(final List<String> user) {
        final DeleteUserStatusRequest request = new DeleteUserStatusRequest();
        deleteUserStatus(request.setUsers(user));
    }

    @Override
    public void getUserStatus(final GetUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.GET_USER_STATUS);
        final StandardResponse<GetUserStatusResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void getUserStatus(final List<String> user) {
        final GetUserStatusRequest request = new GetUserStatusRequest();
        getUserStatus(request.setUsers(user));
    }

    @Override
    public void updateUserStatus(final UpdateUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_USER_STATUS);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void updateUserStatus(final List<String> user,final String state) {
        final UpdateUserStatusRequest request = new UpdateUserStatusRequest();
        updateUserStatus(request.setUsers(user).setState(state));

    }

    @Override
    public void blockUser(final BlockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BLOCK_USER);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void unblockUser(final UnblockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNBLOCK_USER);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void invalidateUserTokens(final InvalidateUserTokensRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.INVALIDATE_USER_TOKENS);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void revokeToken(final RevokeTokenRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REVOKE_TOKEN);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void cancelPush(final CancelPushRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CANCEL_PUSH);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void deviceList(final DeviceListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_LIST);
        final StandardResponse<DeviceListResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void deviceRegister(final DeviceRegisterRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REGISTER);
        final StandardResponse<DeviceRegisterResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void deviceRemove(final DeviceRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REMOVE);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void deviceTopicList(final DeviceTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_LIST);
        final StandardResponse<DeviceTopicListResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void deviceTopicUpdate(final DeviceTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_UPDATE);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void deviceUpdate(final DeviceUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_UPDATE);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void sendPushNotification(final SendPushNotificationRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SEND_PUSH_NOTIFICATION);
        final StandardResponse<SendPushNotificationResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void updatePushStatus(final UpdatePushStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_PUSH_STATUS);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void userTopicList(final UserTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_LIST);
        final StandardResponse<UserTopicListResult> response = new StandardResponse<>();
        sendToCentrifugo(httpPost, response.getClass());
    }

    @Override
    public void userTopicUpdate(final UserTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_UPDATE);
        sendToCentrifugo(httpPost, StandardResponse.class);
    }

    @Override
    public void batch(final BatchRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BATCH);
        sendToCentrifugo(httpPost, BatchResponse.class);
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

    private ResponseModel sendToCentrifugo(final HttpPost httpPost, final Class<? extends ResponseModel> responseClass) {
        try (
                final CloseableHttpClient client = HttpClients.createDefault();
                final CloseableHttpResponse response = client.execute(httpPost)
        ) {
            final HttpEntity entity = response.getEntity();
            if (entity == null) {
                return new StandardResponse<>();
            }

            final String json = IOUtils.toString(entity.getContent(), "UTF-8");
            return mapper.readValue(json, responseClass);
        } catch (final IOException e) {
            throw new CentrifugoException("Error sending the request");
        }
    }
}
