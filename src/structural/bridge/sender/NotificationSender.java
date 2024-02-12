package structural.bridge.sender;

public interface NotificationSender { // Implementation
    void sendNotification(String message);
    void sendUrgentNotification(String urgentMessage);
}
