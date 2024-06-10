package toys;

import objects.Date;

import java.util.Arrays;

public class ToysManager {

    public static double PHI = 1.618;

    public static void printPhi() {

    }

    private Toy[] ALL_TOYS;
    private Client[] ALL_CLIENTS;
    private Order[] ALL_ORDERS;

    private int toysSize = 0;
    private int clientsSize = 0;
    private int ordersSize = 0;

    public ToysManager() {
        ALL_TOYS = new Toy[0];
        ALL_CLIENTS = new Client[0];
        ALL_ORDERS = new Order[0];
    }

    public void addNewToy(String toyName, double toyPrice, int stock) {
        validateToysArraySize();

        Toy newToy = new Toy(toyName, toyPrice, stock);
        ALL_TOYS[toysSize] = newToy;
        toysSize++;
    }

    public void addNewClient(String clientName, String clientAddress) {
        validateClientsArraySize();

        Client newClient = new Client(clientName, clientAddress);
        ALL_CLIENTS[clientsSize] = newClient;
        clientsSize++;
    }

    public int addNewOrder(String name) {
        validateOrdersArraySize();

        //
        Client client = getClientByName(name);
        Date date = new Date(2024, 06, 03);
        Order order =  new Order(date, client);
        ALL_ORDERS[ordersSize] = order;
        ordersSize++;

        return ordersSize - 1;
    }

    @Override
    public String toString() {
        String toysStr = "";
        for (int i = 0; i < toysSize; i++) {
            toysStr += "\n   " + (i+1) + ". " + ALL_TOYS[i].toString();
        }

        return "" +
                "toysSize=" + toysSize +
                "\nclientsSize=" + clientsSize +
                "\nordersSize=" + ordersSize +
                "\nALL_TOYS=" + toysStr +
                "\nALL_CLIENTS=" + Arrays.toString(ALL_CLIENTS) +
                "\nALL_ORDERS=" + Arrays.toString(ALL_ORDERS)
                ;
    }

    private void validateToysArraySize() {
        if (toysSize < ALL_TOYS.length) {
            return;
        }

        // double the size
        int newSize = ALL_TOYS.length * 2;
        newSize = Math.max(2, newSize);
        Toy[] temp = new Toy[newSize];
        for (int i = 0; i < ALL_TOYS.length; i++) {
            temp[i] = ALL_TOYS[i];
        }
        ALL_TOYS = temp;
    }

    private void validateClientsArraySize() {
        if (clientsSize < ALL_CLIENTS.length) {
            return;
        }

        // double the size
        int newSize = ALL_CLIENTS.length * 2;
        newSize = Math.max(2, newSize);
        Client[] temp = new Client[newSize];
        for (int i = 0; i < ALL_CLIENTS.length; i++) {
            temp[i] = ALL_CLIENTS[i];
        }
        ALL_CLIENTS = temp;
    }

    private void validateOrdersArraySize() {
        if (ordersSize < ALL_ORDERS.length) {
            return;
        }

        // double the size
        int newSize = ALL_ORDERS.length * 2;
        newSize = Math.max(2, newSize);
        Order[] temp = new Order[newSize];
        for (int i = 0; i < ALL_ORDERS.length; i++) {
            temp[i] = ALL_ORDERS[i];
        }
        ALL_ORDERS = temp;
    }

    private Client getClientByName(String name) {
        for (int i = 0; i < clientsSize; i++) {
            if (ALL_CLIENTS[i].getName().equals(name)) {
                return ALL_CLIENTS[i];
            }
        }

        return null;
    }

    public void addToyToOrder(int orderIndex, String toyName) {
        // get toy by his name
        Toy toyOnTheShelf = null;
        for (int i = 0; i < ALL_TOYS.length; i++) {
            if (ALL_TOYS[i].getName().equals(toyName)) {
                toyOnTheShelf = ALL_TOYS[i];
                break;
            }
        }

        if (toyOnTheShelf == null) {
            return;
        }


        Toy toyInMyOrder = new Toy(toyOnTheShelf);
        if (toyOnTheShelf.getStock() >= 1) {
            ALL_ORDERS[orderIndex].addToy(toyInMyOrder);
            toyOnTheShelf.setStock(toyOnTheShelf.getStock() - 1);
        }

        // copy the toy and add it to the order

    }

    public double calculateOrder(int orderIndex) {
        Order currentOrder = ALL_ORDERS[orderIndex];
        return currentOrder.getTotalPrice();
    }
}
