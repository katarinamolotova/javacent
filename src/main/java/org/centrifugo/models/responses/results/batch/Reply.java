package org.centrifugo.models.responses.results.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.centrifugo.models.responses.Error;
import org.centrifugo.models.responses.results.EmptyResult;
import org.centrifugo.models.responses.results.history.HistoryResult;
import org.centrifugo.models.responses.results.presence.PresenceResult;
import org.centrifugo.models.responses.results.presence.PresenceStatsResult;
import org.centrifugo.models.responses.results.publication.BroadcastResult;
import org.centrifugo.models.responses.results.publication.PublishResult;
import org.centrifugo.models.responses.results.push_notification.device_list.DeviceListResult;
import org.centrifugo.models.responses.results.push_notification.device_register.DeviceRegisterResult;
import org.centrifugo.models.responses.results.push_notification.device_topic_list.DeviceTopicListResult;
import org.centrifugo.models.responses.results.push_notification.send_push_notification.SendPushNotificationResult;
import org.centrifugo.models.responses.results.push_notification.user_topic_list.UserTopicListResult;
import org.centrifugo.models.responses.results.stats.channels.ChannelsResult;
import org.centrifugo.models.responses.results.stats.connections.ConnectionsResult;
import org.centrifugo.models.responses.results.user_status.GetUserStatusResult;
import org.centrifugo.models.responses.results.stats.info.InfoResult;

import java.util.Objects;

/**
 * Reply
 */
public class Reply {

  
  @JsonProperty("id")
  private Long id = null;
  
  
  @JsonProperty("error")
  private Error error = null;
  
  
  @JsonProperty("result")
  private Object result = null;
  
  
  @JsonProperty("publish")
  private PublishResult publish = null;
  
  
  @JsonProperty("broadcast")
  private BroadcastResult broadcast = null;
  
  
  @JsonProperty("subscribe")
  private EmptyResult subscribe = null;
  
  
  @JsonProperty("unsubscribe")
  private EmptyResult unsubscribe = null;
  
  
  @JsonProperty("disconnect")
  private EmptyResult disconnect = null;
  
  
  @JsonProperty("presence")
  private PresenceResult presence = null;
  
  
  @JsonProperty("presence_stats")
  private PresenceStatsResult presenceStats = null;
  
  
  @JsonProperty("history")
  private HistoryResult history = null;
  
  
  @JsonProperty("history_remove")
  private EmptyResult historyRemove = null;
  
  
  @JsonProperty("info")
  private InfoResult info = null;
  
  
  @JsonProperty("rpc")
  private RPCResult rpc = null;
  
  
  @JsonProperty("refresh")
  private EmptyResult refresh = null;
  
  
  @JsonProperty("channels")
  private ChannelsResult channels = null;
  
  
  @JsonProperty("connections")
  private ConnectionsResult connections = null;
  
  
  @JsonProperty("update_user_status")
  private EmptyResult updateUserStatus = null;
  
  
  @JsonProperty("get_user_status")
  private GetUserStatusResult getUserStatus = null;
  
  
  @JsonProperty("delete_user_status")
  private EmptyResult deleteUserStatus = null;
  
  
  @JsonProperty("block_user")
  private EmptyResult blockUser = null;
  
  
  @JsonProperty("unblock_user")
  private EmptyResult unblockUser = null;
  
  
  @JsonProperty("revoke_token")
  private EmptyResult revokeToken = null;
  
  
  @JsonProperty("invalidate_user_tokens")
  private EmptyResult invalidateUserTokens = null;
  
  
  @JsonProperty("device_register")
  private DeviceRegisterResult deviceRegister = null;
  
  
  @JsonProperty("device_update")
  private EmptyResult deviceUpdate = null;
  
  
  @JsonProperty("device_remove")
  private EmptyResult deviceRemove = null;
  
  
  @JsonProperty("device_list")
  private DeviceListResult deviceList = null;
  
  
  @JsonProperty("device_topic_list")
  private DeviceTopicListResult deviceTopicList = null;
  
  
  @JsonProperty("device_topic_update")
  private EmptyResult deviceTopicUpdate = null;
  
  
  @JsonProperty("user_topic_list")
  private UserTopicListResult userTopicList = null;
  
  
  @JsonProperty("user_topic_update")
  private EmptyResult userTopicUpdate = null;
  
  
  @JsonProperty("send_push_notification")
  private SendPushNotificationResult sendPushNotification = null;
  
  
  @JsonProperty("update_push_status")
  private EmptyResult updatePushStatus = null;
  
  
  @JsonProperty("cancel_push")
  private EmptyResult cancelPush = null;
  
  public Reply id(Long id) {
    this.id = id;
    return this;
  }

  
  /**
  * Get id
  * @return id
  **/
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  
  public Reply error(Error error) {
    this.error = error;
    return this;
  }

  
  /**
  * Get error
  * @return error
  **/
  public Error getError() {
    return error;
  }
  public void setError(Error error) {
    this.error = error;
  }
  
  public Reply result(Object result) {
    this.result = result;
    return this;
  }

  
  /**
  * Get result
  * @return result
  **/
  public Object getResult() {
    return result;
  }
  public void setResult(Object result) {
    this.result = result;
  }
  
  public Reply publish(PublishResult publish) {
    this.publish = publish;
    return this;
  }

  
  /**
  * Get publish
  * @return publish
  **/
  public PublishResult getPublish() {
    return publish;
  }
  public void setPublish(PublishResult publish) {
    this.publish = publish;
  }
  
  public Reply broadcast(BroadcastResult broadcast) {
    this.broadcast = broadcast;
    return this;
  }

  
  /**
  * Get broadcast
  * @return broadcast
  **/
  public BroadcastResult getBroadcast() {
    return broadcast;
  }
  public void setBroadcast(BroadcastResult broadcast) {
    this.broadcast = broadcast;
  }
  
  public Reply subscribe(EmptyResult subscribe) {
    this.subscribe = subscribe;
    return this;
  }

  
  /**
  * Get subscribe
  * @return subscribe
  **/
  public EmptyResult getSubscribe() {
    return subscribe;
  }
  public void setSubscribe(EmptyResult subscribe) {
    this.subscribe = subscribe;
  }
  
  public Reply unsubscribe(EmptyResult unsubscribe) {
    this.unsubscribe = unsubscribe;
    return this;
  }

  
  /**
  * Get unsubscribe
  * @return unsubscribe
  **/
  public EmptyResult getUnsubscribe() {
    return unsubscribe;
  }
  public void setUnsubscribe(EmptyResult unsubscribe) {
    this.unsubscribe = unsubscribe;
  }
  
  public Reply disconnect(EmptyResult disconnect) {
    this.disconnect = disconnect;
    return this;
  }

  
  /**
  * Get disconnect
  * @return disconnect
  **/
  public EmptyResult getDisconnect() {
    return disconnect;
  }
  public void setDisconnect(EmptyResult disconnect) {
    this.disconnect = disconnect;
  }
  
  public Reply presence(PresenceResult presence) {
    this.presence = presence;
    return this;
  }

  
  /**
  * Get presence
  * @return presence
  **/
  public PresenceResult getPresence() {
    return presence;
  }
  public void setPresence(PresenceResult presence) {
    this.presence = presence;
  }
  
  public Reply presenceStats(PresenceStatsResult presenceStats) {
    this.presenceStats = presenceStats;
    return this;
  }

  
  /**
  * Get presenceStats
  * @return presenceStats
  **/
  public PresenceStatsResult getPresenceStats() {
    return presenceStats;
  }
  public void setPresenceStats(PresenceStatsResult presenceStats) {
    this.presenceStats = presenceStats;
  }
  
  public Reply history(HistoryResult history) {
    this.history = history;
    return this;
  }

  
  /**
  * Get history
  * @return history
  **/
  public HistoryResult getHistory() {
    return history;
  }
  public void setHistory(HistoryResult history) {
    this.history = history;
  }
  
  public Reply historyRemove(EmptyResult historyRemove) {
    this.historyRemove = historyRemove;
    return this;
  }

  
  /**
  * Get historyRemove
  * @return historyRemove
  **/
  public EmptyResult getHistoryRemove() {
    return historyRemove;
  }
  public void setHistoryRemove(EmptyResult historyRemove) {
    this.historyRemove = historyRemove;
  }
  
  public Reply info(InfoResult info) {
    this.info = info;
    return this;
  }

  
  /**
  * Get info
  * @return info
  **/
  public InfoResult getInfo() {
    return info;
  }
  public void setInfo(InfoResult info) {
    this.info = info;
  }
  
  public Reply rpc(RPCResult rpc) {
    this.rpc = rpc;
    return this;
  }

  
  /**
  * Get rpc
  * @return rpc
  **/
  public RPCResult getRpc() {
    return rpc;
  }
  public void setRpc(RPCResult rpc) {
    this.rpc = rpc;
  }
  
  public Reply refresh(EmptyResult refresh) {
    this.refresh = refresh;
    return this;
  }

  
  /**
  * Get refresh
  * @return refresh
  **/
  public EmptyResult getRefresh() {
    return refresh;
  }
  public void setRefresh(EmptyResult refresh) {
    this.refresh = refresh;
  }
  
  public Reply channels(ChannelsResult channels) {
    this.channels = channels;
    return this;
  }

  
  /**
  * Get channels
  * @return channels
  **/
  public ChannelsResult getChannels() {
    return channels;
  }
  public void setChannels(ChannelsResult channels) {
    this.channels = channels;
  }
  
  public Reply connections(ConnectionsResult connections) {
    this.connections = connections;
    return this;
  }

  
  /**
  * Get connections
  * @return connections
  **/
  public ConnectionsResult getConnections() {
    return connections;
  }
  public void setConnections(ConnectionsResult connections) {
    this.connections = connections;
  }
  
  public Reply updateUserStatus(EmptyResult updateUserStatus) {
    this.updateUserStatus = updateUserStatus;
    return this;
  }

  
  /**
  * Get updateUserStatus
  * @return updateUserStatus
  **/
  public EmptyResult getUpdateUserStatus() {
    return updateUserStatus;
  }
  public void setUpdateUserStatus(EmptyResult updateUserStatus) {
    this.updateUserStatus = updateUserStatus;
  }
  
  public Reply getUserStatus(GetUserStatusResult getUserStatus) {
    this.getUserStatus = getUserStatus;
    return this;
  }

  
  /**
  * Get getUserStatus
  * @return getUserStatus
  **/
  public GetUserStatusResult getGetUserStatus() {
    return getUserStatus;
  }
  public void setGetUserStatus(GetUserStatusResult getUserStatus) {
    this.getUserStatus = getUserStatus;
  }
  
  public Reply deleteUserStatus(EmptyResult deleteUserStatus) {
    this.deleteUserStatus = deleteUserStatus;
    return this;
  }

  
  /**
  * Get deleteUserStatus
  * @return deleteUserStatus
  **/
  public EmptyResult getDeleteUserStatus() {
    return deleteUserStatus;
  }
  public void setDeleteUserStatus(EmptyResult deleteUserStatus) {
    this.deleteUserStatus = deleteUserStatus;
  }
  
  public Reply blockUser(EmptyResult blockUser) {
    this.blockUser = blockUser;
    return this;
  }

  
  /**
  * Get blockUser
  * @return blockUser
  **/
  public EmptyResult getBlockUser() {
    return blockUser;
  }
  public void setBlockUser(EmptyResult blockUser) {
    this.blockUser = blockUser;
  }
  
  public Reply unblockUser(EmptyResult unblockUser) {
    this.unblockUser = unblockUser;
    return this;
  }

  
  /**
  * Get unblockUser
  * @return unblockUser
  **/
  public EmptyResult getUnblockUser() {
    return unblockUser;
  }
  public void setUnblockUser(EmptyResult unblockUser) {
    this.unblockUser = unblockUser;
  }
  
  public Reply revokeToken(EmptyResult revokeToken) {
    this.revokeToken = revokeToken;
    return this;
  }

  
  /**
  * Get revokeToken
  * @return revokeToken
  **/
  public EmptyResult getRevokeToken() {
    return revokeToken;
  }
  public void setRevokeToken(EmptyResult revokeToken) {
    this.revokeToken = revokeToken;
  }
  
  public Reply invalidateUserTokens(EmptyResult invalidateUserTokens) {
    this.invalidateUserTokens = invalidateUserTokens;
    return this;
  }

  
  /**
  * Get invalidateUserTokens
  * @return invalidateUserTokens
  **/
  public EmptyResult getInvalidateUserTokens() {
    return invalidateUserTokens;
  }
  public void setInvalidateUserTokens(EmptyResult invalidateUserTokens) {
    this.invalidateUserTokens = invalidateUserTokens;
  }
  
  public Reply deviceRegister(DeviceRegisterResult deviceRegister) {
    this.deviceRegister = deviceRegister;
    return this;
  }

  
  /**
  * Get deviceRegister
  * @return deviceRegister
  **/
  public DeviceRegisterResult getDeviceRegister() {
    return deviceRegister;
  }
  public void setDeviceRegister(DeviceRegisterResult deviceRegister) {
    this.deviceRegister = deviceRegister;
  }
  
  public Reply deviceUpdate(EmptyResult deviceUpdate) {
    this.deviceUpdate = deviceUpdate;
    return this;
  }

  
  /**
  * Get deviceUpdate
  * @return deviceUpdate
  **/
  public EmptyResult getDeviceUpdate() {
    return deviceUpdate;
  }
  public void setDeviceUpdate(EmptyResult deviceUpdate) {
    this.deviceUpdate = deviceUpdate;
  }
  
  public Reply deviceRemove(EmptyResult deviceRemove) {
    this.deviceRemove = deviceRemove;
    return this;
  }

  
  /**
  * Get deviceRemove
  * @return deviceRemove
  **/
  public EmptyResult getDeviceRemove() {
    return deviceRemove;
  }
  public void setDeviceRemove(EmptyResult deviceRemove) {
    this.deviceRemove = deviceRemove;
  }
  
  public Reply deviceList(DeviceListResult deviceList) {
    this.deviceList = deviceList;
    return this;
  }

  
  /**
  * Get deviceList
  * @return deviceList
  **/
  public DeviceListResult getDeviceList() {
    return deviceList;
  }
  public void setDeviceList(DeviceListResult deviceList) {
    this.deviceList = deviceList;
  }
  
  public Reply deviceTopicList(DeviceTopicListResult deviceTopicList) {
    this.deviceTopicList = deviceTopicList;
    return this;
  }

  
  /**
  * Get deviceTopicList
  * @return deviceTopicList
  **/
  public DeviceTopicListResult getDeviceTopicList() {
    return deviceTopicList;
  }
  public void setDeviceTopicList(DeviceTopicListResult deviceTopicList) {
    this.deviceTopicList = deviceTopicList;
  }
  
  public Reply deviceTopicUpdate(EmptyResult deviceTopicUpdate) {
    this.deviceTopicUpdate = deviceTopicUpdate;
    return this;
  }

  
  /**
  * Get deviceTopicUpdate
  * @return deviceTopicUpdate
  **/
  public EmptyResult getDeviceTopicUpdate() {
    return deviceTopicUpdate;
  }
  public void setDeviceTopicUpdate(EmptyResult deviceTopicUpdate) {
    this.deviceTopicUpdate = deviceTopicUpdate;
  }
  
  public Reply userTopicList(UserTopicListResult userTopicList) {
    this.userTopicList = userTopicList;
    return this;
  }

  
  /**
  * Get userTopicList
  * @return userTopicList
  **/
  public UserTopicListResult getUserTopicList() {
    return userTopicList;
  }
  public void setUserTopicList(UserTopicListResult userTopicList) {
    this.userTopicList = userTopicList;
  }
  
  public Reply userTopicUpdate(EmptyResult userTopicUpdate) {
    this.userTopicUpdate = userTopicUpdate;
    return this;
  }

  
  /**
  * Get userTopicUpdate
  * @return userTopicUpdate
  **/
  public EmptyResult getUserTopicUpdate() {
    return userTopicUpdate;
  }
  public void setUserTopicUpdate(EmptyResult userTopicUpdate) {
    this.userTopicUpdate = userTopicUpdate;
  }
  
  public Reply sendPushNotification(SendPushNotificationResult sendPushNotification) {
    this.sendPushNotification = sendPushNotification;
    return this;
  }

  
  /**
  * Get sendPushNotification
  * @return sendPushNotification
  **/
  public SendPushNotificationResult getSendPushNotification() {
    return sendPushNotification;
  }
  public void setSendPushNotification(SendPushNotificationResult sendPushNotification) {
    this.sendPushNotification = sendPushNotification;
  }
  
  public Reply updatePushStatus(EmptyResult updatePushStatus) {
    this.updatePushStatus = updatePushStatus;
    return this;
  }

  
  /**
  * Get updatePushStatus
  * @return updatePushStatus
  **/
  public EmptyResult getUpdatePushStatus() {
    return updatePushStatus;
  }
  public void setUpdatePushStatus(EmptyResult updatePushStatus) {
    this.updatePushStatus = updatePushStatus;
  }
  
  public Reply cancelPush(EmptyResult cancelPush) {
    this.cancelPush = cancelPush;
    return this;
  }

  
  /**
  * Get cancelPush
  * @return cancelPush
  **/
  public EmptyResult getCancelPush() {
    return cancelPush;
  }
  public void setCancelPush(EmptyResult cancelPush) {
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
    Reply reply = (Reply) o;
    return Objects.equals(this.id, reply.id) &&
        Objects.equals(this.error, reply.error) &&
        Objects.equals(this.result, reply.result) &&
        Objects.equals(this.publish, reply.publish) &&
        Objects.equals(this.broadcast, reply.broadcast) &&
        Objects.equals(this.subscribe, reply.subscribe) &&
        Objects.equals(this.unsubscribe, reply.unsubscribe) &&
        Objects.equals(this.disconnect, reply.disconnect) &&
        Objects.equals(this.presence, reply.presence) &&
        Objects.equals(this.presenceStats, reply.presenceStats) &&
        Objects.equals(this.history, reply.history) &&
        Objects.equals(this.historyRemove, reply.historyRemove) &&
        Objects.equals(this.info, reply.info) &&
        Objects.equals(this.rpc, reply.rpc) &&
        Objects.equals(this.refresh, reply.refresh) &&
        Objects.equals(this.channels, reply.channels) &&
        Objects.equals(this.connections, reply.connections) &&
        Objects.equals(this.updateUserStatus, reply.updateUserStatus) &&
        Objects.equals(this.getUserStatus, reply.getUserStatus) &&
        Objects.equals(this.deleteUserStatus, reply.deleteUserStatus) &&
        Objects.equals(this.blockUser, reply.blockUser) &&
        Objects.equals(this.unblockUser, reply.unblockUser) &&
        Objects.equals(this.revokeToken, reply.revokeToken) &&
        Objects.equals(this.invalidateUserTokens, reply.invalidateUserTokens) &&
        Objects.equals(this.deviceRegister, reply.deviceRegister) &&
        Objects.equals(this.deviceUpdate, reply.deviceUpdate) &&
        Objects.equals(this.deviceRemove, reply.deviceRemove) &&
        Objects.equals(this.deviceList, reply.deviceList) &&
        Objects.equals(this.deviceTopicList, reply.deviceTopicList) &&
        Objects.equals(this.deviceTopicUpdate, reply.deviceTopicUpdate) &&
        Objects.equals(this.userTopicList, reply.userTopicList) &&
        Objects.equals(this.userTopicUpdate, reply.userTopicUpdate) &&
        Objects.equals(this.sendPushNotification, reply.sendPushNotification) &&
        Objects.equals(this.updatePushStatus, reply.updatePushStatus) &&
        Objects.equals(this.cancelPush, reply.cancelPush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, error, result, publish, broadcast, subscribe, unsubscribe, disconnect, presence, presenceStats, history, historyRemove, info, rpc, refresh, channels, connections, updateUserStatus, getUserStatus, deleteUserStatus, blockUser, unblockUser, revokeToken, invalidateUserTokens, deviceRegister, deviceUpdate, deviceRemove, deviceList, deviceTopicList, deviceTopicUpdate, userTopicList, userTopicUpdate, sendPushNotification, updatePushStatus, cancelPush);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reply {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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