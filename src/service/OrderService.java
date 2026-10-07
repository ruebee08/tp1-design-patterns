package src.service;

import src.factory.*;
import src.model.*;

public class OrderService {
    public void createOrder(String type, String name, double price) {
        Product product = ProductFactory.createProduct(type, name, price);   
        System.out.println("Commande créée pour " + product.getName());
    }
}
