package structural.bridge.notification;

import structural.bridge.sender.NotificationSender;

public abstract class Notification { // Abstraction

    protected final NotificationSender sender;

    protected Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void send(String message);

}
