package toys;

import objects.Date;

public class Toy {

    private String name;
    private double price;
    private int stock = 0;

    public Toy(Toy other) {
        this.name = other.name;
        this.price = other.price;
    }

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Toy(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
