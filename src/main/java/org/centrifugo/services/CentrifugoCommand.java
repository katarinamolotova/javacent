package org.centrifugo.services;

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

import java.util.List;

public interface CentrifugoCommand {

    // Publication commands

    void publish(final PublishRequest<?> request);

    void publish(final String data, final String channel);

    void broadcast(final BroadcastRequest<?> request);

    void broadcast(final String data, final List<String> channels);

    // Connection management commands

    void disconnect(final DisconnectRequest request);

    void disconnect(final String user);

    void refresh(final RefreshRequest request);

    void refresh(final String user);

    void subscribe(final SubscribeRequest request);

    void subscribe(final String user, final String channel);

    void unsubscribe(final UnsubscribeRequest request);

    void unsubscribe(final String user, final String channel);


    // History commands

    void history(final HistoryRequest request);

    void history(final Integer offset, final String epoch, final Integer limit, final Boolean reverse, final String channel);

    void historyRemove(final HistoryRemoveRequest request);

    void historyRemove(final String channel);

    // Presence commands

    void presence(final PresenceRequest request) ;
    void presenceStats(final PresenceStatsRequest request);
    void presence(final String channel) ;
    void presenceStats(final String channel);

    // Stats status commands

    void channels(final ChannelsRequest request) ;
    void channels(final String patter) ;

    void connections(final ConnectionsRequest request);
    void connections(final String user, final String expression);

    void info();

    // User status commands

    void deleteUserStatus(final DeleteUserStatusRequest request);
    void deleteUserStatus(final List<String> user);
    void getUserStatus(final GetUserStatusRequest request);
    void getUserStatus(final List<String> user);
    void updateUserStatus(final UpdateUserStatusRequest request);
    void updateUserStatus(final List<String> user, final String state);

    // User block commands

    void blockUser(final BlockUserRequest request);
    void unblockUser(final UnblockUserRequest request);

    // Token commands

    void invalidateUserTokens(final InvalidateUserTokensRequest request);
    void revokeToken(final RevokeTokenRequest request);

    // Push notification commands
    void cancelPush(final CancelPushRequest request);
    void deviceList(final DeviceListRequest request);
    void deviceRegister(final DeviceRegisterRequest request);
    void deviceRemove(final DeviceRemoveRequest request);
    void deviceTopicList(final DeviceTopicListRequest request);
    void deviceTopicUpdate(final DeviceTopicUpdateRequest request);
    void deviceUpdate(final DeviceUpdateRequest request);
    void sendPushNotification(final SendPushNotificationRequest request);
    void updatePushStatus(final UpdatePushStatusRequest request);
    void userTopicList(final UserTopicListRequest request);
    void userTopicUpdate(final UserTopicUpdateRequest request);

    // Batch notification commands
    void batch(final BatchRequest request);



}
