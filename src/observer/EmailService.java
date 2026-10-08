package src.observer;

public class EmailService implements Observer {
    @Override
    public void update(String status) {
        System.out.println("[Email] Notification envoyée : commande " + status);
    }
}
