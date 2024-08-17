package org.opensolutionlab.httpclients.models.requests.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensolutionlab.httpclients.models.requests.EmptyRequest;
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

import java.util.Objects;

/**
 * Command
 */
public class Command {

    /**
     * Publish request
     */
    @JsonProperty("publish")
    private PublishRequest publish;

    /**
     * Broadcast request
     */
    @JsonProperty("broadcast")
    private BroadcastRequest broadcast;

    /**
     * Subscribe request
     */
    @JsonProperty("subscribe")
    private SubscribeRequest subscribe;

    /**
     * Unsubscribe request
     */
    @JsonProperty("unsubscribe")
    private UnsubscribeRequest unsubscribe;

    /**
     * Disconnect request
     */
    @JsonProperty("disconnect")
    private DisconnectRequest disconnect;

    /**
     * Presence request
     */
    @JsonProperty("presence")
    private PresenceRequest presence;

    /**
     * Presence statistics request
     */
    @JsonProperty("presence_stats")
    private PresenceStatsRequest presenceStats;

    /**
     * History request
     */
    @JsonProperty("history")
    private HistoryRequest history;

    /**
     * History remove request
     */
    @JsonProperty("history_remove")
    private HistoryRemoveRequest historyRemove;

    /**
     * Info request
     */
    @JsonProperty("info")
    private EmptyRequest info;

    /**
     * RPC request
     */
    @JsonProperty("rpc")
    private RPCRequest rpc;

    /**
     * Refresh request
     */
    @JsonProperty("refresh")
    private RefreshRequest refresh;

    /**
     * Channels request
     */
    @JsonProperty("channels")
    private ChannelsRequest channels;

    /**
     * Connections request
     */
    @JsonProperty("connections")
    private ConnectionsRequest connections;

    /**
     * Update user status request
     */
    @JsonProperty("update_user_status")
    private UpdateUserStatusRequest updateUserStatus;

    /**
     * Get user status request
     */
    @JsonProperty("get_user_status")
    private GetUserStatusRequest getUserStatus;

    /**
     * Delete user status request
     */
    @JsonProperty("delete_user_status")
    private DeleteUserStatusRequest deleteUserStatus;

    /**
     * Block user request
     */
    @JsonProperty("block_user")
    private BlockUserRequest blockUser;

    /**
     * Unblock user request
     */
    @JsonProperty("unblock_user")
    private UnblockUserRequest unblockUser;

    /**
     * Revoke token request
     */
    @JsonProperty("revoke_token")
    private RevokeTokenRequest revokeToken;

    /**
     * Invalidate user token request
     */
    @JsonProperty("invalidate_user_tokens")
    private InvalidateUserTokensRequest invalidateUserTokens;

    /**
     * Device register request
     */
    @JsonProperty("device_register")
    private DeviceRegisterRequest deviceRegister;

    /**
     * Device update request
     */
    @JsonProperty("device_update")
    private DeviceUpdateRequest deviceUpdate;

    /**
     * Device remove request
     */
    @JsonProperty("device_remove")
    private DeviceRemoveRequest deviceRemove;

    /**
     * Device list request
     */
    @JsonProperty("device_list")
    private DeviceListRequest deviceList;

    /**
     * Device topic list request
     */
    @JsonProperty("device_topic_list")
    private DeviceTopicListRequest deviceTopicList;

    /**
     * Device topic update request
     */
    @JsonProperty("device_topic_update")
    private DeviceTopicUpdateRequest deviceTopicUpdate;

    /**
     * User topic list request
     */
    @JsonProperty("user_topic_list")
    private UserTopicListRequest userTopicList;

    /**
     * User topic update request
     */
    @JsonProperty("user_topic_update")
    private UserTopicUpdateRequest userTopicUpdate;

    /**
     * Sen push notification request
     */
    @JsonProperty("send_push_notification")
    private SendPushNotificationRequest sendPushNotification;

    /**
     * Update push status request
     */
    @JsonProperty("update_push_status")
    private UpdatePushStatusRequest updatePushStatus;

    /**
     * Cancel push request
     */
    @JsonProperty("cancel_push")
    private CancelPushRequest cancelPush;

    public Command(
            PublishRequest publish,
            BroadcastRequest broadcast,
            SubscribeRequest subscribe,
            UnsubscribeRequest unsubscribe,
            DisconnectRequest disconnect,
            PresenceRequest presence,
            PresenceStatsRequest presenceStats,
            HistoryRequest history,
            HistoryRemoveRequest historyRemove,
            EmptyRequest info,
            RPCRequest rpc,
            RefreshRequest refresh,
            ChannelsRequest channels,
            ConnectionsRequest connections,
            UpdateUserStatusRequest updateUserStatus,
            GetUserStatusRequest getUserStatus,
            DeleteUserStatusRequest deleteUserStatus,
            BlockUserRequest blockUser,
            UnblockUserRequest unblockUser,
            RevokeTokenRequest revokeToken,
            InvalidateUserTokensRequest invalidateUserTokens,
            DeviceRegisterRequest deviceRegister,
            DeviceUpdateRequest deviceUpdate,
            DeviceRemoveRequest deviceRemove,
            DeviceListRequest deviceList,
            DeviceTopicListRequest deviceTopicList,
            DeviceTopicUpdateRequest deviceTopicUpdate,
            UserTopicListRequest userTopicList,
            UserTopicUpdateRequest userTopicUpdate,
            SendPushNotificationRequest sendPushNotification,
            UpdatePushStatusRequest updatePushStatus,
            CancelPushRequest cancelPush
    ) {
        this.publish = publish;
        this.broadcast = broadcast;
        this.subscribe = subscribe;
        this.unsubscribe = unsubscribe;
        this.disconnect = disconnect;
        this.presence = presence;
        this.presenceStats = presenceStats;
        this.history = history;
        this.historyRemove = historyRemove;
        this.info = info;
        this.rpc = rpc;
        this.refresh = refresh;
        this.channels = channels;
        this.connections = connections;
        this.updateUserStatus = updateUserStatus;
        this.getUserStatus = getUserStatus;
        this.deleteUserStatus = deleteUserStatus;
        this.blockUser = blockUser;
        this.unblockUser = unblockUser;
        this.revokeToken = revokeToken;
        this.invalidateUserTokens = invalidateUserTokens;
        this.deviceRegister = deviceRegister;
        this.deviceUpdate = deviceUpdate;
        this.deviceRemove = deviceRemove;
        this.deviceList = deviceList;
        this.deviceTopicList = deviceTopicList;
        this.deviceTopicUpdate = deviceTopicUpdate;
        this.userTopicList = userTopicList;
        this.userTopicUpdate = userTopicUpdate;
        this.sendPushNotification = sendPushNotification;
        this.updatePushStatus = updatePushStatus;
        this.cancelPush = cancelPush;
    }

    public Command() {
    }

    public static CommandBuilder builder() {
        return new CommandBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Command command = (Command) o;
        return Objects.equals(this.publish, command.publish) &&
               Objects.equals(this.broadcast, command.broadcast) &&
               Objects.equals(this.subscribe, command.subscribe) &&
               Objects.equals(this.unsubscribe, command.unsubscribe) &&
               Objects.equals(this.disconnect, command.disconnect) &&
               Objects.equals(this.presence, command.presence) &&
               Objects.equals(this.presenceStats, command.presenceStats) &&
               Objects.equals(this.history, command.history) &&
               Objects.equals(this.historyRemove, command.historyRemove) &&
               Objects.equals(this.info, command.info) &&
               Objects.equals(this.rpc, command.rpc) &&
               Objects.equals(this.refresh, command.refresh) &&
               Objects.equals(this.channels, command.channels) &&
               Objects.equals(this.connections, command.connections) &&
               Objects.equals(this.updateUserStatus, command.updateUserStatus) &&
               Objects.equals(this.getUserStatus, command.getUserStatus) &&
               Objects.equals(this.deleteUserStatus, command.deleteUserStatus) &&
               Objects.equals(this.blockUser, command.blockUser) &&
               Objects.equals(this.unblockUser, command.unblockUser) &&
               Objects.equals(this.revokeToken, command.revokeToken) &&
               Objects.equals(this.invalidateUserTokens, command.invalidateUserTokens) &&
               Objects.equals(this.deviceRegister, command.deviceRegister) &&
               Objects.equals(this.deviceUpdate, command.deviceUpdate) &&
               Objects.equals(this.deviceRemove, command.deviceRemove) &&
               Objects.equals(this.deviceList, command.deviceList) &&
               Objects.equals(this.deviceTopicList, command.deviceTopicList) &&
               Objects.equals(this.deviceTopicUpdate, command.deviceTopicUpdate) &&
               Objects.equals(this.userTopicList, command.userTopicList) &&
               Objects.equals(this.userTopicUpdate, command.userTopicUpdate) &&
               Objects.equals(this.sendPushNotification, command.sendPushNotification) &&
               Objects.equals(this.updatePushStatus, command.updatePushStatus) &&
               Objects.equals(this.cancelPush, command.cancelPush);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                publish,
                broadcast,
                subscribe,
                unsubscribe,
                disconnect,
                presence,
                presenceStats,
                history,
                historyRemove,
                info,
                rpc,
                refresh,
                channels,
                connections,
                updateUserStatus,
                getUserStatus,
                deleteUserStatus,
                blockUser,
                unblockUser,
                revokeToken,
                invalidateUserTokens,
                deviceRegister,
                deviceUpdate,
                deviceRemove,
                deviceList,
                deviceTopicList,
                deviceTopicUpdate,
                userTopicList,
                userTopicUpdate,
                sendPushNotification,
                updatePushStatus,
                cancelPush
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Command {\n");

        sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
        sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
        sb.append("    subscribe: ").append(toIndentedString(subscribe)).append("\n");
        sb.append("    unsubscribe: ").append(toIndentedString(unsubscribe)).append("\n");
        sb.append("    disconnect: ").append(toIndentedString(disconnect)).append("\n");
        sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
        sb.append("    presenceStats: ").append(toIndentedString(presenceStats)).append("\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
        sb.append("    historyRemove: ").append(toIndentedString(historyRemove)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    rpc: ").append(toIndentedString(rpc)).append("\n");
        sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    updateUserStatus: ").append(toIndentedString(updateUserStatus)).append("\n");
        sb.append("    getUserStatus: ").append(toIndentedString(getUserStatus)).append("\n");
        sb.append("    deleteUserStatus: ").append(toIndentedString(deleteUserStatus)).append("\n");
        sb.append("    blockUser: ").append(toIndentedString(blockUser)).append("\n");
        sb.append("    unblockUser: ").append(toIndentedString(unblockUser)).append("\n");
        sb.append("    revokeToken: ").append(toIndentedString(revokeToken)).append("\n");
        sb.append("    invalidateUserTokens: ").append(toIndentedString(invalidateUserTokens)).append("\n");
        sb.append("    deviceRegister: ").append(toIndentedString(deviceRegister)).append("\n");
        sb.append("    deviceUpdate: ").append(toIndentedString(deviceUpdate)).append("\n");
        sb.append("    deviceRemove: ").append(toIndentedString(deviceRemove)).append("\n");
        sb.append("    deviceList: ").append(toIndentedString(deviceList)).append("\n");
        sb.append("    deviceTopicList: ").append(toIndentedString(deviceTopicList)).append("\n");
        sb.append("    deviceTopicUpdate: ").append(toIndentedString(deviceTopicUpdate)).append("\n");
        sb.append("    userTopicList: ").append(toIndentedString(userTopicList)).append("\n");
        sb.append("    userTopicUpdate: ").append(toIndentedString(userTopicUpdate)).append("\n");
        sb.append("    sendPushNotification: ").append(toIndentedString(sendPushNotification)).append("\n");
        sb.append("    updatePushStatus: ").append(toIndentedString(updatePushStatus)).append("\n");
        sb.append("    cancelPush: ").append(toIndentedString(cancelPush)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public PublishRequest getPublish() {
        return this.publish;
    }

    public BroadcastRequest getBroadcast() {
        return this.broadcast;
    }

    public SubscribeRequest getSubscribe() {
        return this.subscribe;
    }

    public UnsubscribeRequest getUnsubscribe() {
        return this.unsubscribe;
    }

    public DisconnectRequest getDisconnect() {
        return this.disconnect;
    }

    public PresenceRequest getPresence() {
        return this.presence;
    }

    public PresenceStatsRequest getPresenceStats() {
        return this.presenceStats;
    }

    public HistoryRequest getHistory() {
        return this.history;
    }

    public HistoryRemoveRequest getHistoryRemove() {
        return this.historyRemove;
    }

    public EmptyRequest getInfo() {
        return this.info;
    }

    public RPCRequest getRpc() {
        return this.rpc;
    }

    public RefreshRequest getRefresh() {
        return this.refresh;
    }

    public ChannelsRequest getChannels() {
        return this.channels;
    }

    public ConnectionsRequest getConnections() {
        return this.connections;
    }

    public UpdateUserStatusRequest getUpdateUserStatus() {
        return this.updateUserStatus;
    }

    public GetUserStatusRequest getGetUserStatus() {
        return this.getUserStatus;
    }

    public DeleteUserStatusRequest getDeleteUserStatus() {
        return this.deleteUserStatus;
    }

    public BlockUserRequest getBlockUser() {
        return this.blockUser;
    }

    public UnblockUserRequest getUnblockUser() {
        return this.unblockUser;
    }

    public RevokeTokenRequest getRevokeToken() {
        return this.revokeToken;
    }

    public InvalidateUserTokensRequest getInvalidateUserTokens() {
        return this.invalidateUserTokens;
    }

    public DeviceRegisterRequest getDeviceRegister() {
        return this.deviceRegister;
    }

    public DeviceUpdateRequest getDeviceUpdate() {
        return this.deviceUpdate;
    }

    public DeviceRemoveRequest getDeviceRemove() {
        return this.deviceRemove;
    }

    public DeviceListRequest getDeviceList() {
        return this.deviceList;
    }

    public DeviceTopicListRequest getDeviceTopicList() {
        return this.deviceTopicList;
    }

    public DeviceTopicUpdateRequest getDeviceTopicUpdate() {
        return this.deviceTopicUpdate;
    }

    public UserTopicListRequest getUserTopicList() {
        return this.userTopicList;
    }

    public UserTopicUpdateRequest getUserTopicUpdate() {
        return this.userTopicUpdate;
    }

    public SendPushNotificationRequest getSendPushNotification() {
        return this.sendPushNotification;
    }

    public UpdatePushStatusRequest getUpdatePushStatus() {
        return this.updatePushStatus;
    }

    public CancelPushRequest getCancelPush() {
        return this.cancelPush;
    }

    @JsonProperty("publish")
    public void setPublish(PublishRequest publish) {
        this.publish = publish;
    }

    @JsonProperty("broadcast")
    public void setBroadcast(BroadcastRequest broadcast) {
        this.broadcast = broadcast;
    }

    @JsonProperty("subscribe")
    public void setSubscribe(SubscribeRequest subscribe) {
        this.subscribe = subscribe;
    }

    @JsonProperty("unsubscribe")
    public void setUnsubscribe(UnsubscribeRequest unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    @JsonProperty("disconnect")
    public void setDisconnect(DisconnectRequest disconnect) {
        this.disconnect = disconnect;
    }

    @JsonProperty("presence")
    public void setPresence(PresenceRequest presence) {
        this.presence = presence;
    }

    @JsonProperty("presence_stats")
    public void setPresenceStats(PresenceStatsRequest presenceStats) {
        this.presenceStats = presenceStats;
    }

    @JsonProperty("history")
    public void setHistory(HistoryRequest history) {
        this.history = history;
    }

    @JsonProperty("history_remove")
    public void setHistoryRemove(HistoryRemoveRequest historyRemove) {
        this.historyRemove = historyRemove;
    }

    @JsonProperty("info")
    public void setInfo(EmptyRequest info) {
        this.info = info;
    }

    @JsonProperty("rpc")
    public void setRpc(RPCRequest rpc) {
        this.rpc = rpc;
    }

    @JsonProperty("refresh")
    public void setRefresh(RefreshRequest refresh) {
        this.refresh = refresh;
    }

    @JsonProperty("channels")
    public void setChannels(ChannelsRequest channels) {
        this.channels = channels;
    }

    @JsonProperty("connections")
    public void setConnections(ConnectionsRequest connections) {
        this.connections = connections;
    }

    @JsonProperty("update_user_status")
    public void setUpdateUserStatus(UpdateUserStatusRequest updateUserStatus) {
        this.updateUserStatus = updateUserStatus;
    }

    @JsonProperty("get_user_status")
    public void setGetUserStatus(GetUserStatusRequest getUserStatus) {
        this.getUserStatus = getUserStatus;
    }

    @JsonProperty("delete_user_status")
    public void setDeleteUserStatus(DeleteUserStatusRequest deleteUserStatus) {
        this.deleteUserStatus = deleteUserStatus;
    }

    @JsonProperty("block_user")
    public void setBlockUser(BlockUserRequest blockUser) {
        this.blockUser = blockUser;
    }

    @JsonProperty("unblock_user")
    public void setUnblockUser(UnblockUserRequest unblockUser) {
        this.unblockUser = unblockUser;
    }

    @JsonProperty("revoke_token")
    public void setRevokeToken(RevokeTokenRequest revokeToken) {
        this.revokeToken = revokeToken;
    }

    @JsonProperty("invalidate_user_tokens")
    public void setInvalidateUserTokens(InvalidateUserTokensRequest invalidateUserTokens) {
        this.invalidateUserTokens = invalidateUserTokens;
    }

    @JsonProperty("device_register")
    public void setDeviceRegister(DeviceRegisterRequest deviceRegister) {
        this.deviceRegister = deviceRegister;
    }

    @JsonProperty("device_update")
    public void setDeviceUpdate(DeviceUpdateRequest deviceUpdate) {
        this.deviceUpdate = deviceUpdate;
    }

    @JsonProperty("device_remove")
    public void setDeviceRemove(DeviceRemoveRequest deviceRemove) {
        this.deviceRemove = deviceRemove;
    }

    @JsonProperty("device_list")
    public void setDeviceList(DeviceListRequest deviceList) {
        this.deviceList = deviceList;
    }

    @JsonProperty("device_topic_list")
    public void setDeviceTopicList(DeviceTopicListRequest deviceTopicList) {
        this.deviceTopicList = deviceTopicList;
    }

    @JsonProperty("device_topic_update")
    public void setDeviceTopicUpdate(DeviceTopicUpdateRequest deviceTopicUpdate) {
        this.deviceTopicUpdate = deviceTopicUpdate;
    }

    @JsonProperty("user_topic_list")
    public void setUserTopicList(UserTopicListRequest userTopicList) {
        this.userTopicList = userTopicList;
    }

    @JsonProperty("user_topic_update")
    public void setUserTopicUpdate(UserTopicUpdateRequest userTopicUpdate) {
        this.userTopicUpdate = userTopicUpdate;
    }

    @JsonProperty("send_push_notification")
    public void setSendPushNotification(SendPushNotificationRequest sendPushNotification) {
        this.sendPushNotification = sendPushNotification;
    }

    @JsonProperty("update_push_status")
    public void setUpdatePushStatus(UpdatePushStatusRequest updatePushStatus) {
        this.updatePushStatus = updatePushStatus;
    }

    @JsonProperty("cancel_push")
    public void setCancelPush(CancelPushRequest cancelPush) {
        this.cancelPush = cancelPush;
    }

    public static class CommandBuilder {
        private PublishRequest publish;
        private BroadcastRequest broadcast;
        private SubscribeRequest subscribe;
        private UnsubscribeRequest unsubscribe;
        private DisconnectRequest disconnect;
        private PresenceRequest presence;
        private PresenceStatsRequest presenceStats;
        private HistoryRequest history;
        private HistoryRemoveRequest historyRemove;
        private EmptyRequest info;
        private RPCRequest rpc;
        private RefreshRequest refresh;
        private ChannelsRequest channels;
        private ConnectionsRequest connections;
        private UpdateUserStatusRequest updateUserStatus;
        private GetUserStatusRequest getUserStatus;
        private DeleteUserStatusRequest deleteUserStatus;
        private BlockUserRequest blockUser;
        private UnblockUserRequest unblockUser;
        private RevokeTokenRequest revokeToken;
        private InvalidateUserTokensRequest invalidateUserTokens;
        private DeviceRegisterRequest deviceRegister;
        private DeviceUpdateRequest deviceUpdate;
        private DeviceRemoveRequest deviceRemove;
        private DeviceListRequest deviceList;
        private DeviceTopicListRequest deviceTopicList;
        private DeviceTopicUpdateRequest deviceTopicUpdate;
        private UserTopicListRequest userTopicList;
        private UserTopicUpdateRequest userTopicUpdate;
        private SendPushNotificationRequest sendPushNotification;
        private UpdatePushStatusRequest updatePushStatus;
        private CancelPushRequest cancelPush;

        CommandBuilder() {
        }

        @JsonProperty("publish")
        public CommandBuilder publish(PublishRequest publish) {
            this.publish = publish;
            return this;
        }

        @JsonProperty("broadcast")
        public CommandBuilder broadcast(BroadcastRequest broadcast) {
            this.broadcast = broadcast;
            return this;
        }

        @JsonProperty("subscribe")
        public CommandBuilder subscribe(SubscribeRequest subscribe) {
            this.subscribe = subscribe;
            return this;
        }

        @JsonProperty("unsubscribe")
        public CommandBuilder unsubscribe(UnsubscribeRequest unsubscribe) {
            this.unsubscribe = unsubscribe;
            return this;
        }

        @JsonProperty("disconnect")
        public CommandBuilder disconnect(DisconnectRequest disconnect) {
            this.disconnect = disconnect;
            return this;
        }

        @JsonProperty("presence")
        public CommandBuilder presence(PresenceRequest presence) {
            this.presence = presence;
            return this;
        }

        @JsonProperty("presence_stats")
        public CommandBuilder presenceStats(PresenceStatsRequest presenceStats) {
            this.presenceStats = presenceStats;
            return this;
        }

        @JsonProperty("history")
        public CommandBuilder history(HistoryRequest history) {
            this.history = history;
            return this;
        }

        @JsonProperty("history_remove")
        public CommandBuilder historyRemove(HistoryRemoveRequest historyRemove) {
            this.historyRemove = historyRemove;
            return this;
        }

        @JsonProperty("info")
        public CommandBuilder info(EmptyRequest info) {
            this.info = info;
            return this;
        }

        @JsonProperty("rpc")
        public CommandBuilder rpc(RPCRequest rpc) {
            this.rpc = rpc;
            return this;
        }

        @JsonProperty("refresh")
        public CommandBuilder refresh(RefreshRequest refresh) {
            this.refresh = refresh;
            return this;
        }

        @JsonProperty("channels")
        public CommandBuilder channels(ChannelsRequest channels) {
            this.channels = channels;
            return this;
        }

        @JsonProperty("connections")
        public CommandBuilder connections(ConnectionsRequest connections) {
            this.connections = connections;
            return this;
        }

        @JsonProperty("update_user_status")
        public CommandBuilder updateUserStatus(UpdateUserStatusRequest updateUserStatus) {
            this.updateUserStatus = updateUserStatus;
            return this;
        }

        @JsonProperty("get_user_status")
        public CommandBuilder getUserStatus(GetUserStatusRequest getUserStatus) {
            this.getUserStatus = getUserStatus;
            return this;
        }

        @JsonProperty("delete_user_status")
        public CommandBuilder deleteUserStatus(DeleteUserStatusRequest deleteUserStatus) {
            this.deleteUserStatus = deleteUserStatus;
            return this;
        }

        @JsonProperty("block_user")
        public CommandBuilder blockUser(BlockUserRequest blockUser) {
            this.blockUser = blockUser;
            return this;
        }

        @JsonProperty("unblock_user")
        public CommandBuilder unblockUser(UnblockUserRequest unblockUser) {
            this.unblockUser = unblockUser;
            return this;
        }

        @JsonProperty("revoke_token")
        public CommandBuilder revokeToken(RevokeTokenRequest revokeToken) {
            this.revokeToken = revokeToken;
            return this;
        }

        @JsonProperty("invalidate_user_tokens")
        public CommandBuilder invalidateUserTokens(InvalidateUserTokensRequest invalidateUserTokens) {
            this.invalidateUserTokens = invalidateUserTokens;
            return this;
        }

        @JsonProperty("device_register")
        public CommandBuilder deviceRegister(DeviceRegisterRequest deviceRegister) {
            this.deviceRegister = deviceRegister;
            return this;
        }

        @JsonProperty("device_update")
        public CommandBuilder deviceUpdate(DeviceUpdateRequest deviceUpdate) {
            this.deviceUpdate = deviceUpdate;
            return this;
        }

        @JsonProperty("device_remove")
        public CommandBuilder deviceRemove(DeviceRemoveRequest deviceRemove) {
            this.deviceRemove = deviceRemove;
            return this;
        }

        @JsonProperty("device_list")
        public CommandBuilder deviceList(DeviceListRequest deviceList) {
            this.deviceList = deviceList;
            return this;
        }

        @JsonProperty("device_topic_list")
        public CommandBuilder deviceTopicList(DeviceTopicListRequest deviceTopicList) {
            this.deviceTopicList = deviceTopicList;
            return this;
        }

        @JsonProperty("device_topic_update")
        public CommandBuilder deviceTopicUpdate(DeviceTopicUpdateRequest deviceTopicUpdate) {
            this.deviceTopicUpdate = deviceTopicUpdate;
            return this;
        }

        @JsonProperty("user_topic_list")
        public CommandBuilder userTopicList(UserTopicListRequest userTopicList) {
            this.userTopicList = userTopicList;
            return this;
        }

        @JsonProperty("user_topic_update")
        public CommandBuilder userTopicUpdate(UserTopicUpdateRequest userTopicUpdate) {
            this.userTopicUpdate = userTopicUpdate;
            return this;
        }

        @JsonProperty("send_push_notification")
        public CommandBuilder sendPushNotification(SendPushNotificationRequest sendPushNotification) {
            this.sendPushNotification = sendPushNotification;
            return this;
        }

        @JsonProperty("update_push_status")
        public CommandBuilder updatePushStatus(UpdatePushStatusRequest updatePushStatus) {
            this.updatePushStatus = updatePushStatus;
            return this;
        }

        @JsonProperty("cancel_push")
        public CommandBuilder cancelPush(CancelPushRequest cancelPush) {
            this.cancelPush = cancelPush;
            return this;
        }

        public Command build() {
            return new Command(
                    this.publish,
                    this.broadcast,
                    this.subscribe,
                    this.unsubscribe,
                    this.disconnect,
                    this.presence,
                    this.presenceStats,
                    this.history,
                    this.historyRemove,
                    this.info,
                    this.rpc,
                    this.refresh,
                    this.channels,
                    this.connections,
                    this.updateUserStatus,
                    this.getUserStatus,
                    this.deleteUserStatus,
                    this.blockUser,
                    this.unblockUser,
                    this.revokeToken,
                    this.invalidateUserTokens,
                    this.deviceRegister,
                    this.deviceUpdate,
                    this.deviceRemove,
                    this.deviceList,
                    this.deviceTopicList,
                    this.deviceTopicUpdate,
                    this.userTopicList,
                    this.userTopicUpdate,
                    this.sendPushNotification,
                    this.updatePushStatus,
                    this.cancelPush
            );
        }

        public String toString() {
            return "Command.CommandBuilder(publish=" +
                   this.publish +
                   ", broadcast=" +
                   this.broadcast +
                   ", subscribe=" +
                   this.subscribe +
                   ", unsubscribe=" +
                   this.unsubscribe +
                   ", disconnect=" +
                   this.disconnect +
                   ", presence=" +
                   this.presence +
                   ", presenceStats=" +
                   this.presenceStats +
                   ", history=" +
                   this.history +
                   ", historyRemove=" +
                   this.historyRemove +
                   ", info=" +
                   this.info +
                   ", rpc=" +
                   this.rpc +
                   ", refresh=" +
                   this.refresh +
                   ", channels=" +
                   this.channels +
                   ", connections=" +
                   this.connections +
                   ", updateUserStatus=" +
                   this.updateUserStatus +
                   ", getUserStatus=" +
                   this.getUserStatus +
                   ", deleteUserStatus=" +
                   this.deleteUserStatus +
                   ", blockUser=" +
                   this.blockUser +
                   ", unblockUser=" +
                   this.unblockUser +
                   ", revokeToken=" +
                   this.revokeToken +
                   ", invalidateUserTokens=" +
                   this.invalidateUserTokens +
                   ", deviceRegister=" +
                   this.deviceRegister +
                   ", deviceUpdate=" +
                   this.deviceUpdate +
                   ", deviceRemove=" +
                   this.deviceRemove +
                   ", deviceList=" +
                   this.deviceList +
                   ", deviceTopicList=" +
                   this.deviceTopicList +
                   ", deviceTopicUpdate=" +
                   this.deviceTopicUpdate +
                   ", userTopicList=" +
                   this.userTopicList +
                   ", userTopicUpdate=" +
                   this.userTopicUpdate +
                   ", sendPushNotification=" +
                   this.sendPushNotification +
                   ", updatePushStatus=" +
                   this.updatePushStatus +
                   ", cancelPush=" +
                   this.cancelPush +
                   ")";
        }
    }
}
