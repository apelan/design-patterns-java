package structural.bridge.sender;

public class EmailSender implements NotificationSender { // Concrete Implementation
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email with message: " + message);
    }

    @Override
    public void sendUrgentNotification(String urgentMessage) {
        System.out.println("Sending email with urgent message: " + urgentMessage);
    }
}
