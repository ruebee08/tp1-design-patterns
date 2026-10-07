package src.factory;
import java.util.*;
import java.util.function.BiFunction;

import src.model.*;

public class ProductFactory {
    private static final Map<String, BiFunction<String, Double, Product>> creators = new HashMap<>();

    static {
        creators.put("BOOK", Book::new);
        creators.put("ELECTRONIC", Electronic::new);
        creators.put("CLOTHING", Clothing::new);
        creators.put("FOOD", Food::new);
         
    }

    public static Product createProduct(String type, String name, double price) {
        BiFunction<String, Double, Product> creator = creators.get(type.toUpperCase());
        if (creator == null) {
            throw new IllegalArgumentException("Produit inconnu : " + type);
        }
        return creator.apply(name, price);
    }
}
