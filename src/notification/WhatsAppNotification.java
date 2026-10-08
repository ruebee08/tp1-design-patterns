package src.notification;

public class WhatsAppNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp : " + message);
    }
}
