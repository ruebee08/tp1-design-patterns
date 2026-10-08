package src.notification;

public class NotificationService {
    private NotificationStrategy strategy;

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void send(String type, String message) {
        setStrategy(NotificationFactory.createNotification(type));
        strategy.send(message);
    }
}
