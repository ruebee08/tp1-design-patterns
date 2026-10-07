package src.model;


public class Book implements Product {
    private final String name;
    private final double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override public String getName() { return name; }

    @Override
    public void display() {
        System.out.println("Livre : " + name + " (" + price + " DT)");
    }
}
