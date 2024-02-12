package structural.bridge.notification;

import structural.bridge.sender.NotificationSender;

public class UrgentNotification extends Notification { // Concrete Abstraction
    public UrgentNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        sender.sendUrgentNotification(message);
    }
}
