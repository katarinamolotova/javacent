package org.centrifugo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.centrifugo.configarations.CentrConfigurParams;
import org.centrifugo.constants.CentrifugoApiUrl;
import org.centrifugo.models.requests.RequestModel;
import org.centrifugo.models.requests.StreamPosition;
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

import java.io.IOException;
import java.util.List;

public class CentrifugoService implements CentrifugoCommand {
    private final CentrConfigurParams configurations;

    public CentrifugoService() {
        this.configurations = new CentrConfigurParams();
    }

    @Override
    public void publish(final PublishRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PUBLISH);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void publish(final String data, final String channel) {
        final PublishRequest<String> request = new PublishRequest<>();
        publish(request.channel(channel).data(data));
    }

    @Override
    public void broadcast(final BroadcastRequest<?> request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BROADCAST);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void broadcast(final String data, final List<String> channels) {
        final BroadcastRequest<String> request = new BroadcastRequest<>();
        broadcast(request.data(data).channels(channels));
    }

    @Override
    public void disconnect(final DisconnectRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DISCONNECT);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void disconnect(final String user) {
        final DisconnectRequest request = new DisconnectRequest();
        disconnect(request.user(user));
    }

    @Override
    public void refresh(final RefreshRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REFRESH);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void refresh(final String user) {
        final RefreshRequest request = new RefreshRequest();
        refresh(request.user(user));
    }

    @Override
    public void subscribe(final SubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SUBSCRIBE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void subscribe(final String user, final String channel) {
        final SubscribeRequest request = new SubscribeRequest();
        subscribe(request.user(user).channel(channel));
    }

    @Override
    public void unsubscribe(final UnsubscribeRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNSUBSCRIBE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void unsubscribe(final String user, final String channel) {
        final UnsubscribeRequest request = new UnsubscribeRequest();
        unsubscribe(request.user(user).channel(channel));
    }

    @Override
    public void history(final HistoryRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void history(
            final Integer offset,
            final String epoch,
            final Integer limit,
            final Boolean reverse,
            final String channel
    ) {
        final HistoryRequest request = new HistoryRequest();
        history(request.setLimit(limit)
                .setChannel(channel)
                .setReverse(reverse)
                .setSince(new StreamPosition(offset, epoch)));
    }

    @Override
    public void historyRemove(final HistoryRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.HISTORY_REMOVE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void historyRemove(final String channel) {
        final HistoryRemoveRequest request = new HistoryRemoveRequest();
        historyRemove(request.setChannel(channel));
    }

    @Override
    public void presence(final PresenceRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE);
        sendToCentrifugo(httpPost);
    }
    @Override
    public void presence(final String channel) {
       final PresenceRequest request = new PresenceRequest();
       presence(request.setChannel(channel));
    }

    @Override
    public void presenceStats(final PresenceStatsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.PRESENCE_STATS);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void presenceStats(final String channel) {
        final PresenceStatsRequest request = new PresenceStatsRequest();
        presenceStats(request.setChannel(channel));
    }

    @Override
    public void channels(final ChannelsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CHANNELS);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void channels(final String patter) {
        final ChannelsRequest request = new ChannelsRequest();
        channels(request.setPattern(patter));
    }

    @Override
    public void connections(final ConnectionsRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CONNECTIONS);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void connections(final String user, final String expression) {
        final ConnectionsRequest request = new ConnectionsRequest();
        connections(request.setUser(user).setExpression(expression));
    }
    //TODO исправить на нужную
    @Override
    public void info() {
        final HttpPost httpPost = getHttpPost(null, CentrifugoApiUrl.INFO);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void deleteUserStatus(final DeleteUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DELETE_USER_STATUS);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void deleteUserStatus(final List<String> user) {
        final DeleteUserStatusRequest request = new DeleteUserStatusRequest();
        deleteUserStatus(request.setUsers(user));
    }

    @Override
    public void getUserStatus(final GetUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.GET_USER_STATUS);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void getUserStatus(final List<String> user) {
        final GetUserStatusRequest request = new GetUserStatusRequest();
        getUserStatus(request.setUsers(user));
    }

    @Override
    public void updateUserStatus(final UpdateUserStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_USER_STATUS);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void updateUserStatus(final List<String> user,final String state) {
        final UpdateUserStatusRequest request = new UpdateUserStatusRequest();
        updateUserStatus(request.setUsers(user).setState(state));

    }

    @Override
    public void blockUser(final BlockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BLOCK_USER);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void unblockUser(final UnblockUserRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UNBLOCK_USER);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void invalidateUserTokens(final InvalidateUserTokensRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.INVALIDATE_USER_TOKENS);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void revokeToken(final RevokeTokenRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.REVOKE_TOKEN);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void cancelPush(final CancelPushRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.CANCEL_PUSH);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void deviceList(final DeviceListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_LIST);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void deviceRegister(final DeviceRegisterRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REGISTER);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void deviceRemove(final DeviceRemoveRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_REMOVE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void deviceTopicList(final DeviceTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_LIST);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void deviceTopicUpdate(final DeviceTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_TOPIC_UPDATE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void deviceUpdate(final DeviceUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.DEVICE_UPDATE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void sendPushNotification(final SendPushNotificationRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.SEND_PUSH_NOTIFICATION);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void updatePushStatus(final UpdatePushStatusRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.UPDATE_PUSH_STATUS);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void userTopicList(final UserTopicListRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_LIST);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void userTopicUpdate(final UserTopicUpdateRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.USER_TOPIC_UPDATE);
        sendToCentrifugo(httpPost);
    }

    @Override
    public void batch(final BatchRequest request) {
        final HttpPost httpPost = getHttpPost(request, CentrifugoApiUrl.BATCH);
        sendToCentrifugo(httpPost);
    }

    private HttpPost getHttpPost(final RequestModel request, final String url) {
        final HttpPost httpPost = new HttpPost(configurations.getCentrifugoApiUrl() + url);

        try {
            final ObjectMapper objectMapper = new ObjectMapper();
            final String json = objectMapper.writeValueAsString(request);
            final StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("X-API-Key", configurations.getCentrifugoApiKey());
        } catch (final IOException e) {
//            log.error("CentrifugoService. Can't serialize model: {}", model);
        }

        return httpPost;
    }

    private void sendToCentrifugo(final HttpPost httpPost) {
        try (
                final CloseableHttpClient client = HttpClients.createDefault();
                final CloseableHttpResponse response = client.execute(httpPost)
        ) {
            // todo what do we have to return?
//            final int status = response.getStatusLine().getStatusCode();
//            final String text = IOUtils.toString(response.getEntity().getContent(), Charsets.UTF_8.toString());
//            log.info("CentrifugoService. Response '{}'. Status: '{}'", text, status);
        } catch (final IOException e) {
//            log.error("CentrifugoService. Can't send publications", e);
        }
    }
}
