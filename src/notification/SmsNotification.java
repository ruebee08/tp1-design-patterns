package src.notification;

public class SmsNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS : " + message);
    }
}
