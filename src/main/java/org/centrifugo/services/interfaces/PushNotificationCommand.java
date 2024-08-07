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
import org.centrifugo.models.responses.DeviceListResponse;
import org.centrifugo.models.responses.DeviceRegisterResponse;
import org.centrifugo.models.responses.DeviceTopicListResponse;
import org.centrifugo.models.responses.EmptyResponse;
import org.centrifugo.models.responses.SendPushNotificationResponse;
import org.centrifugo.models.responses.UserTopicListResponse;

public interface PushNotificationCommand {

    /**
     * Centrifugo PRO. Cancel delayed push notification
     */
    EmptyResponse cancelPush(final CancelPushRequest request);

    /**
     * Centrifugo PRO. Get a paginated list of registered devices according to request filter conditions
     */
    DeviceListResponse deviceList(final DeviceListRequest request);

    /**
     * Centrifugo PRO. Register or update device information
     */
    DeviceRegisterResponse deviceRegister(final DeviceRegisterRequest request);

    /**
     * Centrifugo PRO. Update device information
     */
    EmptyResponse deviceUpdate(final DeviceUpdateRequest request);

    /**
     * Centrifugo PRO. Removes device from storage
     */
    EmptyResponse deviceRemove(final DeviceRemoveRequest request);

    /**
     * Centrifugo PRO. List device to topic mapping
     */
    DeviceTopicListResponse deviceTopicList(final DeviceTopicListRequest request);

    /**
     * Centrifugo PRO. Manage mapping of device to topics
     */
    EmptyResponse deviceTopicUpdate(final DeviceTopicUpdateRequest request);

    /**
     * Centrifugo PRO. Send push notification to specific device_ids, or to topics, or native provider identifiers like fcm_tokens, or to fcm_topic.
     */
    SendPushNotificationResponse sendPushNotification(final SendPushNotificationRequest request);

    /**
     * Centrifugo PRO. Update push notification status
     */
    EmptyResponse updatePushStatus(final UpdatePushStatusRequest request);

    /**
     * Centrifugo PRO. Get list user to topic mapping
     */
    UserTopicListResponse userTopicList(final UserTopicListRequest request);

    /**
     * Centrifugo PRO. Manage mapping of topics with users
     */
    EmptyResponse userTopicUpdate(final UserTopicUpdateRequest request);
}
