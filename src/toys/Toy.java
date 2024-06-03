package toys;

import objects.Date;

public class Toy {

    private String name;
    private double price;
    private int amount;

    public Toy(Toy other) {
        this.name = other.name;
        this.price = other.price;
        this.amount = other.amount;
    }

    public Toy(Toy other, int amount) {
        this.name = other.name;
        this.price = other.price;
        this.amount = amount;
    }

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
