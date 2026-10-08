package src.observer;

public class StockService implements Observer {
    @Override
    public void update(String status) {
        System.out.println("[Stock] Mise à jour du stock : commande " + status);
    }
}
