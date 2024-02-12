package structural.bridge.sender;

public class SmsSender implements NotificationSender { // Concrete Implementation
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS with message: " + message);
    }

    @Override
    public void sendUrgentNotification(String urgentMessage) {
        System.out.println("Sending SMS with urgent message: " + urgentMessage);
    }
}
