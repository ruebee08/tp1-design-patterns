package src;

import src.config.ApplicationConfig;
import src.factory.ProductFactory;
import src.model.Product;
import src.payment.OldPaymentSystem;
import src.payment.PaymentAdapter;
import src.payment.PaymentService;
import src.service.OrderService;

public class Main {
    public static void main(String[] args) {

        // Partie 2 : tests de la Factory
        Product p = ProductFactory.createProduct("BOOK", "Design Patterns", 45);
        p.display();
        ProductFactory.createProduct("ELECTRONIC", "Laptop", 1500).display();
        ProductFactory.createProduct("CLOTHING", "Shirt", 30).display();
        ProductFactory.createProduct("FOOD", "Pizza", 12).display();

        OrderService service = new OrderService();
        service.createOrder("BOOK", "Clean Code", 50);
        service.createOrder("FOOD", "Burger", 10);

        try {
            service.createOrder("TOY", "Car", 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // Partie 3 : Singleton
        System.out.println("\n--- Partie 3 : Singleton ---");
        ApplicationConfig c1 = ApplicationConfig.getInstance();
        ApplicationConfig c2 = ApplicationConfig.getInstance();
        System.out.println("c1 == c2 : " + (c1 == c2));   

        c1.setApplicationName("MyShop");
        System.out.println("Nom lu via c2 : " + c2.getApplicationName());   

        // Partie 4 : Adapter
        System.out.println("\n--- Partie 4 : Adapter ---");
        PaymentService payment = new PaymentAdapter(new OldPaymentSystem());
        payment.pay(250);
    }
}
