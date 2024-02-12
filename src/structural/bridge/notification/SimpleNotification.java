package structural.bridge.notification;

import structural.bridge.sender.NotificationSender;

public class SimpleNotification extends Notification { // Concrete Abstraction
    public SimpleNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        sender.sendNotification(message);
    }
}
