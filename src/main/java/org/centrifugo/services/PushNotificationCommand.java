package org.centrifugo.services;

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
}
