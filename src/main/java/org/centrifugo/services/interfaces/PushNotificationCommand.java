package org.centrifugo.services.interfaces;

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

public interface PushNotificationCommand {

    // TODO:
    //  - add documentation
    //  - change response to current type, e.g. StandardResponse<PublishResult>
    //  - clear model class

    /**
     * Centrifugo PRO. Cancel delayed push notification
     */
    void cancelPush(final CancelPushRequest request);

    /**
     * Centrifugo PRO. Get a paginated list of registered devices according to request filter conditions
     */
    void deviceList(final DeviceListRequest request);

    /**
     * Centrifugo PRO. Register or update device information
     */
    void deviceRegister(final DeviceRegisterRequest request);

    /**
     * Centrifugo PRO. Update device information
     */
    void deviceUpdate(final DeviceUpdateRequest request);

    /**
     * Centrifugo PRO. Removes device from storage
     */
    void deviceRemove(final DeviceRemoveRequest request);

    /**
     * Centrifugo PRO. List device to topic mapping
     */
    void deviceTopicList(final DeviceTopicListRequest request);

    /**
     * Centrifugo PRO. Manage mapping of device to topics
     */
    void deviceTopicUpdate(final DeviceTopicUpdateRequest request);

    /**
     * Centrifugo PRO. Send push notification to specific device_ids, or to topics, or native provider identifiers like fcm_tokens, or to fcm_topic.
     */
    void sendPushNotification(final SendPushNotificationRequest request);

    /**
     * Centrifugo PRO. Update push notification status
     */
    void updatePushStatus(final UpdatePushStatusRequest request);

    /**
     * Centrifugo PRO. Get list user to topic mapping
     */
    void userTopicList(final UserTopicListRequest request);

    /**
     * Centrifugo PRO. Manage mapping of topics with users
     */
    void userTopicUpdate(final UserTopicUpdateRequest request);
}
