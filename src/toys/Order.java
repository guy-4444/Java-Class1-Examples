package toys;

import objects.Car;
import objects.Date;

import java.util.Arrays;

public class Order {

    private Date date;
    private Client client;
    private Toy[] toys;
    private int size = 0;

    public Order(Date date, Client client) {
        this.date = date;
        this.client = client;
        toys = new Toy[0];
    }

    public void addToy(Toy toy) {
        validateToysArraySize();

        toys[size] = toy;
        size++;
    }

    public Toy[] getToys() {
        return toys;
    }

    private void validateToysArraySize() {
        // validate arr for more room - if no increase the size

        if (size < toys.length) {
            return;
        }

        // double the size
        int newSize = toys.length * 2;
        newSize = Math.max(2, newSize);
        Toy[] temp = new Toy[newSize];
        for (int i = 0; i < toys.length; i++) {
            temp[i] = toys[i];
        }
        toys = temp;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            Toy toy = toys[i];
            sum += toy.getPrice();
        }

        return sum;
    }

    @Override
    public String toString() {
        String toysStr = "";
        for (int i = 0; i < size; i++) {
            toysStr += "\n   " + (i+1) + ". " + toys[i].toString();
        }


        return "{" +
                "date=" + date +
                ", client=" + client +
                ", toys=" + toysStr +
                "\n, size=" + size +
                ", total price=" + getTotalPrice() +
                '}';
    }
}
