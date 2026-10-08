package src.observer;

public class LoggerService implements Observer {
    @Override
    public void update(String status) {
        System.out.println("[Logger] Changement d'état enregistré : " + status);
    }
}
