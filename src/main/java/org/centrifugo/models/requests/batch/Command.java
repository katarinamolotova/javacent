package org.centrifugo.models.requests.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
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

import java.util.Objects;

/**
 * Command
 */
public class Command {

  
  @JsonProperty("publish")
  private PublishRequest publish = null;
  
  
  @JsonProperty("broadcast")
  private BroadcastRequest broadcast = null;
  
  
  @JsonProperty("subscribe")
  private SubscribeRequest subscribe = null;
  
  
  @JsonProperty("unsubscribe")
  private UnsubscribeRequest unsubscribe = null;
  
  
  @JsonProperty("disconnect")
  private DisconnectRequest disconnect = null;
  
  
  @JsonProperty("presence")
  private PresenceRequest presence = null;
  
  
  @JsonProperty("presence_stats")
  private PresenceStatsRequest presenceStats = null;
  
  
  @JsonProperty("history")
  private HistoryRequest history = null;
  
  
  @JsonProperty("history_remove")
  private HistoryRemoveRequest historyRemove = null;
  
  
  @JsonProperty("info")
  private Object info = null;
  
  
  @JsonProperty("rpc")
  private RPCRequest rpc = null;
  
  
  @JsonProperty("refresh")
  private RefreshRequest refresh = null;
  
  
  @JsonProperty("channels")
  private ChannelsRequest channels = null;
  
  
  @JsonProperty("connections")
  private ConnectionsRequest connections = null;
  
  
  @JsonProperty("update_user_status")
  private UpdateUserStatusRequest updateUserStatus = null;
  
  
  @JsonProperty("get_user_status")
  private GetUserStatusRequest getUserStatus = null;
  
  
  @JsonProperty("delete_user_status")
  private DeleteUserStatusRequest deleteUserStatus = null;
  
  
  @JsonProperty("block_user")
  private BlockUserRequest blockUser = null;
  
  
  @JsonProperty("unblock_user")
  private UnblockUserRequest unblockUser = null;
  
  
  @JsonProperty("revoke_token")
  private RevokeTokenRequest revokeToken = null;
  
  
  @JsonProperty("invalidate_user_tokens")
  private InvalidateUserTokensRequest invalidateUserTokens = null;
  
  
  @JsonProperty("device_register")
  private DeviceRegisterRequest deviceRegister = null;
  
  
  @JsonProperty("device_update")
  private DeviceUpdateRequest deviceUpdate = null;
  
  
  @JsonProperty("device_remove")
  private DeviceRemoveRequest deviceRemove = null;
  
  
  @JsonProperty("device_list")
  private DeviceListRequest deviceList = null;
  
  
  @JsonProperty("device_topic_list")
  private DeviceTopicListRequest deviceTopicList = null;
  
  
  @JsonProperty("device_topic_update")
  private DeviceTopicUpdateRequest deviceTopicUpdate = null;
  
  
  @JsonProperty("user_topic_list")
  private UserTopicListRequest userTopicList = null;
  
  
  @JsonProperty("user_topic_update")
  private UserTopicUpdateRequest userTopicUpdate = null;
  
  
  @JsonProperty("send_push_notification")
  private SendPushNotificationRequest sendPushNotification = null;
  
  
  @JsonProperty("update_push_status")
  private UpdatePushStatusRequest updatePushStatus = null;
  
  
  @JsonProperty("cancel_push")
  private CancelPushRequest cancelPush = null;
  
  public Command publish(PublishRequest publish) {
    this.publish = publish;
    return this;
  }

  
  /**
  * Get publish
  * @return publish
  **/
  public PublishRequest getPublish() {
    return publish;
  }
  public void setPublish(PublishRequest publish) {
    this.publish = publish;
  }
  
  public Command broadcast(BroadcastRequest broadcast) {
    this.broadcast = broadcast;
    return this;
  }

  
  /**
  * Get broadcast
  * @return broadcast
  **/
  public BroadcastRequest getBroadcast() {
    return broadcast;
  }
  public void setBroadcast(BroadcastRequest broadcast) {
    this.broadcast = broadcast;
  }
  
  public Command subscribe(SubscribeRequest subscribe) {
    this.subscribe = subscribe;
    return this;
  }

  
  /**
  * Get subscribe
  * @return subscribe
  **/
  public SubscribeRequest getSubscribe() {
    return subscribe;
  }
  public void setSubscribe(SubscribeRequest subscribe) {
    this.subscribe = subscribe;
  }
  
  public Command unsubscribe(UnsubscribeRequest unsubscribe) {
    this.unsubscribe = unsubscribe;
    return this;
  }

  
  /**
  * Get unsubscribe
  * @return unsubscribe
  **/
  public UnsubscribeRequest getUnsubscribe() {
    return unsubscribe;
  }
  public void setUnsubscribe(UnsubscribeRequest unsubscribe) {
    this.unsubscribe = unsubscribe;
  }
  
  public Command disconnect(DisconnectRequest disconnect) {
    this.disconnect = disconnect;
    return this;
  }

  
  /**
  * Get disconnect
  * @return disconnect
  **/
  public DisconnectRequest getDisconnect() {
    return disconnect;
  }
  public void setDisconnect(DisconnectRequest disconnect) {
    this.disconnect = disconnect;
  }
  
  public Command presence(PresenceRequest presence) {
    this.presence = presence;
    return this;
  }

  
  /**
  * Get presence
  * @return presence
  **/
  public PresenceRequest getPresence() {
    return presence;
  }
  public void setPresence(PresenceRequest presence) {
    this.presence = presence;
  }
  
  public Command presenceStats(PresenceStatsRequest presenceStats) {
    this.presenceStats = presenceStats;
    return this;
  }

  
  /**
  * Get presenceStats
  * @return presenceStats
  **/
  public PresenceStatsRequest getPresenceStats() {
    return presenceStats;
  }
  public void setPresenceStats(PresenceStatsRequest presenceStats) {
    this.presenceStats = presenceStats;
  }
  
  public Command history(HistoryRequest history) {
    this.history = history;
    return this;
  }

  
  /**
  * Get history
  * @return history
  **/
  public HistoryRequest getHistory() {
    return history;
  }
  public void setHistory(HistoryRequest history) {
    this.history = history;
  }
  
  public Command historyRemove(HistoryRemoveRequest historyRemove) {
    this.historyRemove = historyRemove;
    return this;
  }

  
  /**
  * Get historyRemove
  * @return historyRemove
  **/
  public HistoryRemoveRequest getHistoryRemove() {
    return historyRemove;
  }
  public void setHistoryRemove(HistoryRemoveRequest historyRemove) {
    this.historyRemove = historyRemove;
  }
  
  public Command info(Object info) {
    this.info = info;
    return this;
  }

  
  /**
  * Get info
  * @return info
  **/
  public Object getInfo() {
    return info;
  }
  public void setInfo(Object info) {
    this.info = info;
  }
  
  public Command rpc(RPCRequest rpc) {
    this.rpc = rpc;
    return this;
  }

  
  /**
  * Get rpc
  * @return rpc
  **/
  public RPCRequest getRpc() {
    return rpc;
  }
  public void setRpc(RPCRequest rpc) {
    this.rpc = rpc;
  }
  
  public Command refresh(RefreshRequest refresh) {
    this.refresh = refresh;
    return this;
  }

  
  /**
  * Get refresh
  * @return refresh
  **/
  public RefreshRequest getRefresh() {
    return refresh;
  }
  public void setRefresh(RefreshRequest refresh) {
    this.refresh = refresh;
  }
  
  public Command channels(ChannelsRequest channels) {
    this.channels = channels;
    return this;
  }

  
  /**
  * Get channels
  * @return channels
  **/
  public ChannelsRequest getChannels() {
    return channels;
  }
  public void setChannels(ChannelsRequest channels) {
    this.channels = channels;
  }
  
  public Command connections(ConnectionsRequest connections) {
    this.connections = connections;
    return this;
  }

  
  /**
  * Get connections
  * @return connections
  **/
  public ConnectionsRequest getConnections() {
    return connections;
  }
  public void setConnections(ConnectionsRequest connections) {
    this.connections = connections;
  }
  
  public Command updateUserStatus(UpdateUserStatusRequest updateUserStatus) {
    this.updateUserStatus = updateUserStatus;
    return this;
  }

  
  /**
  * Get updateUserStatus
  * @return updateUserStatus
  **/
  public UpdateUserStatusRequest getUpdateUserStatus() {
    return updateUserStatus;
  }
  public void setUpdateUserStatus(UpdateUserStatusRequest updateUserStatus) {
    this.updateUserStatus = updateUserStatus;
  }
  
  public Command getUserStatus(GetUserStatusRequest getUserStatus) {
    this.getUserStatus = getUserStatus;
    return this;
  }

  
  /**
  * Get getUserStatus
  * @return getUserStatus
  **/
  public GetUserStatusRequest getGetUserStatus() {
    return getUserStatus;
  }
  public void setGetUserStatus(GetUserStatusRequest getUserStatus) {
    this.getUserStatus = getUserStatus;
  }
  
  public Command deleteUserStatus(DeleteUserStatusRequest deleteUserStatus) {
    this.deleteUserStatus = deleteUserStatus;
    return this;
  }

  
  /**
  * Get deleteUserStatus
  * @return deleteUserStatus
  **/
  public DeleteUserStatusRequest getDeleteUserStatus() {
    return deleteUserStatus;
  }
  public void setDeleteUserStatus(DeleteUserStatusRequest deleteUserStatus) {
    this.deleteUserStatus = deleteUserStatus;
  }
  
  public Command blockUser(BlockUserRequest blockUser) {
    this.blockUser = blockUser;
    return this;
  }

  
  /**
  * Get blockUser
  * @return blockUser
  **/
  public BlockUserRequest getBlockUser() {
    return blockUser;
  }
  public void setBlockUser(BlockUserRequest blockUser) {
    this.blockUser = blockUser;
  }
  
  public Command unblockUser(UnblockUserRequest unblockUser) {
    this.unblockUser = unblockUser;
    return this;
  }

  
  /**
  * Get unblockUser
  * @return unblockUser
  **/
  public UnblockUserRequest getUnblockUser() {
    return unblockUser;
  }
  public void setUnblockUser(UnblockUserRequest unblockUser) {
    this.unblockUser = unblockUser;
  }
  
  public Command revokeToken(RevokeTokenRequest revokeToken) {
    this.revokeToken = revokeToken;
    return this;
  }

  
  /**
  * Get revokeToken
  * @return revokeToken
  **/
  public RevokeTokenRequest getRevokeToken() {
    return revokeToken;
  }
  public void setRevokeToken(RevokeTokenRequest revokeToken) {
    this.revokeToken = revokeToken;
  }
  
  public Command invalidateUserTokens(InvalidateUserTokensRequest invalidateUserTokens) {
    this.invalidateUserTokens = invalidateUserTokens;
    return this;
  }

  
  /**
  * Get invalidateUserTokens
  * @return invalidateUserTokens
  **/
  public InvalidateUserTokensRequest getInvalidateUserTokens() {
    return invalidateUserTokens;
  }
  public void setInvalidateUserTokens(InvalidateUserTokensRequest invalidateUserTokens) {
    this.invalidateUserTokens = invalidateUserTokens;
  }
  
  public Command deviceRegister(DeviceRegisterRequest deviceRegister) {
    this.deviceRegister = deviceRegister;
    return this;
  }

  
  /**
  * Get deviceRegister
  * @return deviceRegister
  **/
  public DeviceRegisterRequest getDeviceRegister() {
    return deviceRegister;
  }
  public void setDeviceRegister(DeviceRegisterRequest deviceRegister) {
    this.deviceRegister = deviceRegister;
  }
  
  public Command deviceUpdate(DeviceUpdateRequest deviceUpdate) {
    this.deviceUpdate = deviceUpdate;
    return this;
  }

  
  /**
  * Get deviceUpdate
  * @return deviceUpdate
  **/
  public DeviceUpdateRequest getDeviceUpdate() {
    return deviceUpdate;
  }
  public void setDeviceUpdate(DeviceUpdateRequest deviceUpdate) {
    this.deviceUpdate = deviceUpdate;
  }
  
  public Command deviceRemove(DeviceRemoveRequest deviceRemove) {
    this.deviceRemove = deviceRemove;
    return this;
  }

  
  /**
  * Get deviceRemove
  * @return deviceRemove
  **/
  public DeviceRemoveRequest getDeviceRemove() {
    return deviceRemove;
  }
  public void setDeviceRemove(DeviceRemoveRequest deviceRemove) {
    this.deviceRemove = deviceRemove;
  }
  
  public Command deviceList(DeviceListRequest deviceList) {
    this.deviceList = deviceList;
    return this;
  }

  
  /**
  * Get deviceList
  * @return deviceList
  **/
  public DeviceListRequest getDeviceList() {
    return deviceList;
  }
  public void setDeviceList(DeviceListRequest deviceList) {
    this.deviceList = deviceList;
  }
  
  public Command deviceTopicList(DeviceTopicListRequest deviceTopicList) {
    this.deviceTopicList = deviceTopicList;
    return this;
  }

  
  /**
  * Get deviceTopicList
  * @return deviceTopicList
  **/
  public DeviceTopicListRequest getDeviceTopicList() {
    return deviceTopicList;
  }
  public void setDeviceTopicList(DeviceTopicListRequest deviceTopicList) {
    this.deviceTopicList = deviceTopicList;
  }
  
  public Command deviceTopicUpdate(DeviceTopicUpdateRequest deviceTopicUpdate) {
    this.deviceTopicUpdate = deviceTopicUpdate;
    return this;
  }

  
  /**
  * Get deviceTopicUpdate
  * @return deviceTopicUpdate
  **/
  public DeviceTopicUpdateRequest getDeviceTopicUpdate() {
    return deviceTopicUpdate;
  }
  public void setDeviceTopicUpdate(DeviceTopicUpdateRequest deviceTopicUpdate) {
    this.deviceTopicUpdate = deviceTopicUpdate;
  }
  
  public Command userTopicList(UserTopicListRequest userTopicList) {
    this.userTopicList = userTopicList;
    return this;
  }

  
  /**
  * Get userTopicList
  * @return userTopicList
  **/
  public UserTopicListRequest getUserTopicList() {
    return userTopicList;
  }
  public void setUserTopicList(UserTopicListRequest userTopicList) {
    this.userTopicList = userTopicList;
  }
  
  public Command userTopicUpdate(UserTopicUpdateRequest userTopicUpdate) {
    this.userTopicUpdate = userTopicUpdate;
    return this;
  }

  
  /**
  * Get userTopicUpdate
  * @return userTopicUpdate
  **/
  public UserTopicUpdateRequest getUserTopicUpdate() {
    return userTopicUpdate;
  }
  public void setUserTopicUpdate(UserTopicUpdateRequest userTopicUpdate) {
    this.userTopicUpdate = userTopicUpdate;
  }
  
  public Command sendPushNotification(SendPushNotificationRequest sendPushNotification) {
    this.sendPushNotification = sendPushNotification;
    return this;
  }

  
  /**
  * Get sendPushNotification
  * @return sendPushNotification
  **/
  public SendPushNotificationRequest getSendPushNotification() {
    return sendPushNotification;
  }
  public void setSendPushNotification(SendPushNotificationRequest sendPushNotification) {
    this.sendPushNotification = sendPushNotification;
  }
  
  public Command updatePushStatus(UpdatePushStatusRequest updatePushStatus) {
    this.updatePushStatus = updatePushStatus;
    return this;
  }

  
  /**
  * Get updatePushStatus
  * @return updatePushStatus
  **/
  public UpdatePushStatusRequest getUpdatePushStatus() {
    return updatePushStatus;
  }
  public void setUpdatePushStatus(UpdatePushStatusRequest updatePushStatus) {
    this.updatePushStatus = updatePushStatus;
  }
  
  public Command cancelPush(CancelPushRequest cancelPush) {
    this.cancelPush = cancelPush;
    return this;
  }

  
  /**
  * Get cancelPush
  * @return cancelPush
  **/
  public CancelPushRequest getCancelPush() {
    return cancelPush;
  }
  public void setCancelPush(CancelPushRequest cancelPush) {
    this.cancelPush = cancelPush;
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
    return Objects.hash(publish, broadcast, subscribe, unsubscribe, disconnect, presence, presenceStats, history, historyRemove, info, rpc, refresh, channels, connections, updateUserStatus, getUserStatus, deleteUserStatus, blockUser, unblockUser, revokeToken, invalidateUserTokens, deviceRegister, deviceUpdate, deviceRemove, deviceList, deviceTopicList, deviceTopicUpdate, userTopicList, userTopicUpdate, sendPushNotification, updatePushStatus, cancelPush);
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

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}



