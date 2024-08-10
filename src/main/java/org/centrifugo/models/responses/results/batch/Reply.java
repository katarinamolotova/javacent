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
import org.centrifugo.models.responses.results.stats.info.InfoResult;
import org.centrifugo.models.responses.results.user_status.GetUserStatusResult;

/**
 * The reply all possible requests
 */
public class Reply {

  /**
   * Reply ID
   */
  @JsonProperty("id")
  private Long id;

  /**
   * Error object
   */
  @JsonProperty("error")
  private Error error;

  /**
   * Common result object
   */
  @JsonProperty("result")
  private Object result;

  /**
   * Publish result
   */
  @JsonProperty("publish")
  private PublishResult publish;

  /**
   * Broadcast result
   */
  @JsonProperty("broadcast")
  private BroadcastResult broadcast;

  /**
   * Subscribe result
   */
  @JsonProperty("subscribe")
  private EmptyResult subscribe;

  /**
   * Unsubscribe result
   */
  @JsonProperty("unsubscribe")
  private EmptyResult unsubscribe;

  /**
   * Disconnect result
   */
  @JsonProperty("disconnect")
  private EmptyResult disconnect;

  /**
   * Presence result
   */
  @JsonProperty("presence")
  private PresenceResult presence;

  /**
   * Presence stats result
   */
  @JsonProperty("presence_stats")
  private PresenceStatsResult presenceStats;

  /**
   * History result
   */
  @JsonProperty("history")
  private HistoryResult history;

  /**
   * History remove result
   */
  @JsonProperty("history_remove")
  private EmptyResult historyRemove;

  /**
   * Info result
   */
  @JsonProperty("info")
  private InfoResult info;

  /**
   * RPC result
   */
  @JsonProperty("rpc")
  private RPCResult rpc;

  /**
   * Refresh result
   */
  @JsonProperty("refresh")
  private EmptyResult refresh;

  /**
   * Channels result
   */
  @JsonProperty("channels")
  private ChannelsResult channels;

  /**
   * Connections result
   */
  @JsonProperty("connections")
  private ConnectionsResult connections;

  /**
   * Update user status result
   */
  @JsonProperty("update_user_status")
  private EmptyResult updateUserStatus;

  /**
   * Get user status result
   */
  @JsonProperty("get_user_status")
  private GetUserStatusResult getUserStatus;

  /**
   * Delete user status result
   */
  @JsonProperty("delete_user_status")
  private EmptyResult deleteUserStatus;

  /**
   * Block user result
   */
  @JsonProperty("block_user")
  private EmptyResult blockUser;

  /**
   * Unblock user result
   */
  @JsonProperty("unblock_user")
  private EmptyResult unblockUser;

  /**
   * Revoke token result
   */
  @JsonProperty("revoke_token")
  private EmptyResult revokeToken;

  /**
   * Invalidate user token result
   */
  @JsonProperty("invalidate_user_tokens")
  private EmptyResult invalidateUserTokens;

  /**
   * Device register result
   */
  @JsonProperty("device_register")
  private DeviceRegisterResult deviceRegister;

  /**
   * Device update result
   */
  @JsonProperty("device_update")
  private EmptyResult deviceUpdate;

  /**
   * Device remove result
   */
  @JsonProperty("device_remove")
  private EmptyResult deviceRemove;

  /**
   * Device list result
   */
  @JsonProperty("device_list")
  private DeviceListResult deviceList;

  /**
   * Device topic list result
   */
  @JsonProperty("device_topic_list")
  private DeviceTopicListResult deviceTopicList;

  /**
   * Device topic update result
   */
  @JsonProperty("device_topic_update")
  private EmptyResult deviceTopicUpdate;

  /**
   * User topic list result
   */
  @JsonProperty("user_topic_list")
  private UserTopicListResult userTopicList;

  /**
   * User topic update result
   */
  @JsonProperty("user_topic_update")
  private EmptyResult userTopicUpdate;

  /**
   * Send push notification result
   */
  @JsonProperty("send_push_notification")
  private SendPushNotificationResult sendPushNotification;

  /**
   * Update push status result
   */
  @JsonProperty("update_push_status")
  private EmptyResult updatePushStatus;

  /**
   * Cancel push result
   */
  @JsonProperty("cancel_push")
  private EmptyResult cancelPush;

  public Reply(
          Long id,
          Error error,
          Object result,
          PublishResult publish,
          BroadcastResult broadcast,
          EmptyResult subscribe,
          EmptyResult unsubscribe,
          EmptyResult disconnect,
          PresenceResult presence,
          PresenceStatsResult presenceStats,
          HistoryResult history,
          EmptyResult historyRemove,
          InfoResult info,
          RPCResult rpc,
          EmptyResult refresh,
          ChannelsResult channels,
          ConnectionsResult connections,
          EmptyResult updateUserStatus,
          GetUserStatusResult getUserStatus,
          EmptyResult deleteUserStatus,
          EmptyResult blockUser,
          EmptyResult unblockUser,
          EmptyResult revokeToken,
          EmptyResult invalidateUserTokens,
          DeviceRegisterResult deviceRegister,
          EmptyResult deviceUpdate,
          EmptyResult deviceRemove,
          DeviceListResult deviceList,
          DeviceTopicListResult deviceTopicList,
          EmptyResult deviceTopicUpdate,
          UserTopicListResult userTopicList,
          EmptyResult userTopicUpdate,
          SendPushNotificationResult sendPushNotification,
          EmptyResult updatePushStatus,
          EmptyResult cancelPush
  ) {
    this.id = id;
    this.error = error;
    this.result = result;
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

  public Reply() {
  }

  public Long getId() {
    return this.id;
  }

  public Error getError() {
    return this.error;
  }

  public Object getResult() {
    return this.result;
  }

  public PublishResult getPublish() {
    return this.publish;
  }

  public BroadcastResult getBroadcast() {
    return this.broadcast;
  }

  public EmptyResult getSubscribe() {
    return this.subscribe;
  }

  public EmptyResult getUnsubscribe() {
    return this.unsubscribe;
  }

  public EmptyResult getDisconnect() {
    return this.disconnect;
  }

  public PresenceResult getPresence() {
    return this.presence;
  }

  public PresenceStatsResult getPresenceStats() {
    return this.presenceStats;
  }

  public HistoryResult getHistory() {
    return this.history;
  }

  public EmptyResult getHistoryRemove() {
    return this.historyRemove;
  }

  public InfoResult getInfo() {
    return this.info;
  }

  public RPCResult getRpc() {
    return this.rpc;
  }

  public EmptyResult getRefresh() {
    return this.refresh;
  }

  public ChannelsResult getChannels() {
    return this.channels;
  }

  public ConnectionsResult getConnections() {
    return this.connections;
  }

  public EmptyResult getUpdateUserStatus() {
    return this.updateUserStatus;
  }

  public GetUserStatusResult getGetUserStatus() {
    return this.getUserStatus;
  }

  public EmptyResult getDeleteUserStatus() {
    return this.deleteUserStatus;
  }

  public EmptyResult getBlockUser() {
    return this.blockUser;
  }

  public EmptyResult getUnblockUser() {
    return this.unblockUser;
  }

  public EmptyResult getRevokeToken() {
    return this.revokeToken;
  }

  public EmptyResult getInvalidateUserTokens() {
    return this.invalidateUserTokens;
  }

  public DeviceRegisterResult getDeviceRegister() {
    return this.deviceRegister;
  }

  public EmptyResult getDeviceUpdate() {
    return this.deviceUpdate;
  }

  public EmptyResult getDeviceRemove() {
    return this.deviceRemove;
  }

  public DeviceListResult getDeviceList() {
    return this.deviceList;
  }

  public DeviceTopicListResult getDeviceTopicList() {
    return this.deviceTopicList;
  }

  public EmptyResult getDeviceTopicUpdate() {
    return this.deviceTopicUpdate;
  }

  public UserTopicListResult getUserTopicList() {
    return this.userTopicList;
  }

  public EmptyResult getUserTopicUpdate() {
    return this.userTopicUpdate;
  }

  public SendPushNotificationResult getSendPushNotification() {
    return this.sendPushNotification;
  }

  public EmptyResult getUpdatePushStatus() {
    return this.updatePushStatus;
  }

  public EmptyResult getCancelPush() {
    return this.cancelPush;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  @JsonProperty("error")
  public void setError(Error error) {
    this.error = error;
  }

  @JsonProperty("result")
  public void setResult(Object result) {
    this.result = result;
  }

  @JsonProperty("publish")
  public void setPublish(PublishResult publish) {
    this.publish = publish;
  }

  @JsonProperty("broadcast")
  public void setBroadcast(BroadcastResult broadcast) {
    this.broadcast = broadcast;
  }

  @JsonProperty("subscribe")
  public void setSubscribe(EmptyResult subscribe) {
    this.subscribe = subscribe;
  }

  @JsonProperty("unsubscribe")
  public void setUnsubscribe(EmptyResult unsubscribe) {
    this.unsubscribe = unsubscribe;
  }

  @JsonProperty("disconnect")
  public void setDisconnect(EmptyResult disconnect) {
    this.disconnect = disconnect;
  }

  @JsonProperty("presence")
  public void setPresence(PresenceResult presence) {
    this.presence = presence;
  }

  @JsonProperty("presence_stats")
  public void setPresenceStats(PresenceStatsResult presenceStats) {
    this.presenceStats = presenceStats;
  }

  @JsonProperty("history")
  public void setHistory(HistoryResult history) {
    this.history = history;
  }

  @JsonProperty("history_remove")
  public void setHistoryRemove(EmptyResult historyRemove) {
    this.historyRemove = historyRemove;
  }

  @JsonProperty("info")
  public void setInfo(InfoResult info) {
    this.info = info;
  }

  @JsonProperty("rpc")
  public void setRpc(RPCResult rpc) {
    this.rpc = rpc;
  }

  @JsonProperty("refresh")
  public void setRefresh(EmptyResult refresh) {
    this.refresh = refresh;
  }

  @JsonProperty("channels")
  public void setChannels(ChannelsResult channels) {
    this.channels = channels;
  }

  @JsonProperty("connections")
  public void setConnections(ConnectionsResult connections) {
    this.connections = connections;
  }

  @JsonProperty("update_user_status")
  public void setUpdateUserStatus(EmptyResult updateUserStatus) {
    this.updateUserStatus = updateUserStatus;
  }

  @JsonProperty("get_user_status")
  public void setGetUserStatus(GetUserStatusResult getUserStatus) {
    this.getUserStatus = getUserStatus;
  }

  @JsonProperty("delete_user_status")
  public void setDeleteUserStatus(EmptyResult deleteUserStatus) {
    this.deleteUserStatus = deleteUserStatus;
  }

  @JsonProperty("block_user")
  public void setBlockUser(EmptyResult blockUser) {
    this.blockUser = blockUser;
  }

  @JsonProperty("unblock_user")
  public void setUnblockUser(EmptyResult unblockUser) {
    this.unblockUser = unblockUser;
  }

  @JsonProperty("revoke_token")
  public void setRevokeToken(EmptyResult revokeToken) {
    this.revokeToken = revokeToken;
  }

  @JsonProperty("invalidate_user_tokens")
  public void setInvalidateUserTokens(EmptyResult invalidateUserTokens) {
    this.invalidateUserTokens = invalidateUserTokens;
  }

  @JsonProperty("device_register")
  public void setDeviceRegister(DeviceRegisterResult deviceRegister) {
    this.deviceRegister = deviceRegister;
  }

  @JsonProperty("device_update")
  public void setDeviceUpdate(EmptyResult deviceUpdate) {
    this.deviceUpdate = deviceUpdate;
  }

  @JsonProperty("device_remove")
  public void setDeviceRemove(EmptyResult deviceRemove) {
    this.deviceRemove = deviceRemove;
  }

  @JsonProperty("device_list")
  public void setDeviceList(DeviceListResult deviceList) {
    this.deviceList = deviceList;
  }

  @JsonProperty("device_topic_list")
  public void setDeviceTopicList(DeviceTopicListResult deviceTopicList) {
    this.deviceTopicList = deviceTopicList;
  }

  @JsonProperty("device_topic_update")
  public void setDeviceTopicUpdate(EmptyResult deviceTopicUpdate) {
    this.deviceTopicUpdate = deviceTopicUpdate;
  }

  @JsonProperty("user_topic_list")
  public void setUserTopicList(UserTopicListResult userTopicList) {
    this.userTopicList = userTopicList;
  }

  @JsonProperty("user_topic_update")
  public void setUserTopicUpdate(EmptyResult userTopicUpdate) {
    this.userTopicUpdate = userTopicUpdate;
  }

  @JsonProperty("send_push_notification")
  public void setSendPushNotification(SendPushNotificationResult sendPushNotification) {
    this.sendPushNotification = sendPushNotification;
  }

  @JsonProperty("update_push_status")
  public void setUpdatePushStatus(EmptyResult updatePushStatus) {
    this.updatePushStatus = updatePushStatus;
  }

  @JsonProperty("cancel_push")
  public void setCancelPush(EmptyResult cancelPush) {
    this.cancelPush = cancelPush;
  }
}