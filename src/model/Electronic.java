package src.model;

    
public class Electronic implements Product {
    private final String name;
    private final double price;

    public Electronic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override public String getName() { return name; }

    @Override
    public void display() {
        System.out.println("Électronique : " + name + " (" + price + " DT)");
    }
}

