package src.notification;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending Email : " + message);
    }
}
