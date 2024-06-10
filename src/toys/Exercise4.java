package toys;

public class Exercise4 {

    public static void start() {

        ToysManager.printPhi();

        ToysManager toysManager = new ToysManager();

        String t1Name = "Rubik";
        double t1Price = 10.5;
        toysManager.addNewToy(t1Name, t1Price, 500);
        String t2Name = "Puzzle for kids 4+";
        double t2Price = 30.0;
        toysManager.addNewToy(t2Name, t2Price, 400);
        toysManager.addNewToy("Barbie Doll", 50, 200);


        toysManager.addNewClient("Raz Avraham", "Tel Aviv");
        toysManager.addNewClient("Guy Isakov", "Tel Aviv");


        int orderIndex = toysManager.addNewOrder("Guy Isakov");

        toysManager.addToyToOrder(orderIndex, "Barbie Doll");
        toysManager.addToyToOrder(orderIndex, "Barbie Doll");
        toysManager.addToyToOrder(orderIndex, "Barbie Doll");
        toysManager.addToyToOrder(orderIndex, "Barbie Doll");
        toysManager.addToyToOrder(orderIndex, "Rubik");
        toysManager.addToyToOrder(orderIndex, "Rubik");
        toysManager.addToyToOrder(orderIndex, "Rubik");
        toysManager.addToyToOrder(orderIndex, "Puzzle for kids 4+");

        double totalPrice = toysManager.calculateOrder(orderIndex);
        System.out.println(toysManager);


    }
}
