package toys;

public class Exercise4 {

    public static void start() {

        ToysManager toysManager = new ToysManager();

        String t1Name = "Rubik";
        double t1Price = 10.5;
        toysManager.addNewToy(t1Name, t1Price);
        String t2Name = "Puzzle for kids 4+";
        double t2Price = 30.0;
        toysManager.addNewToy(t2Name, t2Price);
        toysManager.addNewToy("Barbie Doll", 50);


        toysManager.addNewClient("Guy Isakov", "Tel Aviv");


        int orderIndex = toysManager.addNewOrder("Guy Isakov");

        toysManager.addToyToOrder(orderIndex, "Rubik", 3);

        System.out.println(toysManager);


    }
}
