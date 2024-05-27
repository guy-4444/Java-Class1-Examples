import java.util.Scanner;

public class Exercise2 {


    public static void start() {

        Car c1 = new Car();
        c1.setModel("Toyota");
        c1.setKm(20000);
        c1.setCreatedAt(new Date(1999, 1, 1));

        Car c2 = new Car();
        c2.setModel("Mitsubishi");
        c2.setKm(20000);
        c2.setCreatedAt(new Date(2020, 1, 1));

        Car[] cars = new Car[] {c1, c2};

        printCars(cars);
        System.out.println("- - - - - - ");
        validateCars(cars);
        System.out.println("- - - - - - ");





    }



    private static void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i].toString());
        }
    }

    private static void validateCars(Car[] cars) {

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].isRegistered() == false) {
                callOwner(cars[i].getPhone());
            }
        }

    }


    private static void callOwner(String phoneNumber) {
        // calling blaaaaaaa
    }


}














