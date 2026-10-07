package src.model;

public class Clothing implements Product {
    private final String name;
    private final double price;

    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override public String getName() { return name; }

    @Override
    public void display() {
        System.out.println("Vêtement : " + name + " (" + price + " DT)");
    }
}
