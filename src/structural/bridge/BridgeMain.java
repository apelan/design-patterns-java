package structural.bridge;

import structural.bridge.notification.Notification;
import structural.bridge.notification.SimpleNotification;
import structural.bridge.notification.UrgentNotification;
import structural.bridge.sender.EmailSender;
import structural.bridge.sender.NotificationSender;
import structural.bridge.sender.PushNotificationSender;
import structural.bridge.sender.SmsSender;

public class BridgeMain {

    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SmsSender();
        NotificationSender pushNotificationSender = new PushNotificationSender();

        Notification simpleEmail = new SimpleNotification(emailSender);
        Notification simpleSms = new SimpleNotification(smsSender);
        Notification simplePushNotification = new SimpleNotification(pushNotificationSender);

        Notification urgentEmail = new UrgentNotification(emailSender);
        Notification urgentSms = new UrgentNotification(smsSender);
        Notification urgentPushNotification = new UrgentNotification(pushNotificationSender);

        System.out.println("------------");
        simpleEmail.send("This is simple email");
        simpleSms.send("This is simple sms");
        simplePushNotification.send("This is simple push notification");
        System.out.println("------------");
        System.out.println();
        System.out.println("------------");
        urgentEmail.send("This is urgent email");
        urgentSms.send("This is urgent sms");
        urgentPushNotification.send("This is urgent push notification");
        System.out.println("------------");

    }

}
