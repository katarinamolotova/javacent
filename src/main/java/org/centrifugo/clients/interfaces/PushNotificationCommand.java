package org.centrifugo.clients.interfaces;

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
     * Centrifugo PRO. Cancel delayed push notification (which was sent with custom send_at value)
     *
     * @param request cansel push request {@link CancelPushRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse cancelPush(final CancelPushRequest request);

    /**
     * Centrifugo PRO. Get a paginated list of registered devices according to request filter conditions
     *
     * @param request device list request {@link DeviceListRequest}
     *
     * @return a paginated list of registered devices according to request filter conditions {@link DeviceListResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    DeviceListResponse deviceList(final DeviceListRequest request);

    /**
     * Centrifugo PRO. Register or update device information
     *
     * @param request device register request {@link DeviceRegisterRequest}
     *
     * @return the device ID that was registered/updated {@link DeviceRegisterResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    DeviceRegisterResponse deviceRegister(final DeviceRegisterRequest request);

    /**
     * Centrifugo PRO. Update device information. <br>
     * For example, when user logs out the app, and you need to detach user ID from the device.
     *
     * @param request device update request {@link DeviceUpdateRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse deviceUpdate(final DeviceUpdateRequest request);

    /**
     * Centrifugo PRO. Removes device from storage. <br>
     * This may be also called when user logs out the app, and you don't need its device token after that.
     *
     * @param request device remove request {@link DeviceRemoveRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse deviceRemove(final DeviceRemoveRequest request);

    /**
     * Centrifugo PRO. List device to topic mapping
     *
     * @param request device topic list request {@link DeviceTopicListRequest}
     *
     * @return list device to topic mapping {@link DeviceTopicListResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    DeviceTopicListResponse deviceTopicList(final DeviceTopicListRequest request);

    /**
     * Centrifugo PRO. Manage mapping of device to topics
     *
     * @param request device topic update request {@link DeviceTopicUpdateRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse deviceTopicUpdate(final DeviceTopicUpdateRequest request);

    /**
     * Centrifugo PRO. Send push notification to specific <b>device_ids</b>, or to topics,
     * or native provider identifiers like <b>fcm_tokens</b>, or to <b>fcm_topic</b>.
     *
     * @param request send push notification request {@link SendPushNotificationRequest}
     *
     * @return unique send id, matches uid in request if it was provided {@link SendPushNotificationResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    SendPushNotificationResponse sendPushNotification(final SendPushNotificationRequest request);

    /**
     * Centrifugo PRO. <b>Experimental API</b>. Update push notification status
     *
     * @param request update push status request {@link UpdatePushStatusRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse updatePushStatus(final UpdatePushStatusRequest request);

    /**
     * Centrifugo PRO. Get list user to topic mapping
     *
     * @param request user topic list request {@link UserTopicListRequest}
     *
     * @return list user to topic mapping {@link UserTopicListResponse}
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    UserTopicListResponse userTopicList(final UserTopicListRequest request);

    /**
     * Centrifugo PRO. Manage mapping of topics with users. <br>
     * These user topics will be automatically attached to user devices upon registering.
     * And removed from device upon deattaching user.
     *
     * @param request user topic list request {@link UserTopicUpdateRequest}
     *
     * @return empty object
     * @throws org.centrifugo.exceptions.CentrifugoException base Centrifugo exception
     */
    EmptyResponse userTopicUpdate(final UserTopicUpdateRequest request);
}
