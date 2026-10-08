package src;

import src.config.ApplicationConfig;
import src.factory.ProductFactory;
import src.model.Category;
import src.model.Order;
import src.observer.EmailService;
import src.observer.LoggerService;
import src.observer.StockService;
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

        // Partie 5 : Composite
        System.out.println("\n--- Partie 5 : Composite ---");
        Category catalogue = new Category("Catalogue");

        Category books = new Category("Books");
        books.add(ProductFactory.createProduct("BOOK", "Book 1", 20));
        books.add(ProductFactory.createProduct("BOOK", "Book 2", 25));

        Category electronics = new Category("Electronics");
        electronics.add(ProductFactory.createProduct("ELECTRONIC", "Laptop", 1500));
        electronics.add(ProductFactory.createProduct("ELECTRONIC", "Smartphone", 900));

        Category clothing = new Category("Clothing");
        clothing.add(ProductFactory.createProduct("CLOTHING", "Shirt", 30));
        clothing.add(ProductFactory.createProduct("CLOTHING", "Jacket", 80));

        catalogue.add(books);
        catalogue.add(electronics);
        catalogue.add(clothing);

        catalogue.display();
    }
}
