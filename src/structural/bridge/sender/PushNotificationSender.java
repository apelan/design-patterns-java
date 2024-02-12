package structural.bridge.sender;

public class PushNotificationSender implements NotificationSender { // Concrete Implementation
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification with message: " + message);
    }

    @Override
    public void sendUrgentNotification(String urgentMessage) {
        System.out.println("Sending push notification with urgent message: " + urgentMessage);
    }
}
