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

    private void addToy(Toy toy, int amount) {
        validateToysArraySize();

        toys[size] = new Toy(toy, amount);
        size++;
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
                ", size=" + size +
                '}';
    }
}
