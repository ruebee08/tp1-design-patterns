package src.model;

import java.util.ArrayList;
import java.util.List;

public class Category implements CatalogueItem {
    private final String name;
    private final List<CatalogueItem> items = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void add(CatalogueItem item) {
        items.add(item);
    }

    @Override
    public void display() {
        System.out.println("+ " + name);
        for (CatalogueItem item : items) {
            item.display();
        }
    }
}
