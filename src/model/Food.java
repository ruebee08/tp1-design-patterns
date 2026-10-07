package src.model;

public class Food implements Product {
    private final String name;
    private final double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() { return name; }

    @Override
    public void display() {
        System.out.println("Aliment : " + name + " (" + price + " DT)");
    }
}
