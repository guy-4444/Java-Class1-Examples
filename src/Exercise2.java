import java.util.Scanner;

public class Exercise2 {


    public static void start() {

        Car c1 = new Car();
        c1.model = "Toyota";
        c1.km = 20000;
        c1.price = 12000;
        c1.isAutomatic = false;
        c1.isRegistered = true;
        c1.phone = "+972521234567";
        c1.createdAt = new Date(1999, 1, 1);

        Car c2 = new Car();
        c2.model = "Mercedes";
        c2.km = 200030;
        c2.price = 123000;
        c2.isAutomatic = true;
        c2.isRegistered = true;
        c2.phone = "+97252111167";
        c2.createdAt = new Date(2020, 1, 1);


        Car[] cars = new Car[] {c1, c2};

        validateCars(cars);




        Date dt = new Date(2300, 05, 20);
        System.out.println("A: " + dt.toString());
        dt.setY(2025);
        System.out.println("B: " + dt.toString());
        dt.setY(2020);
        System.out.println("C: " + dt.toString());
        System.out.println("The year: " + dt.getY());

    }

    private static void validateCars(Car[] cars) {

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].isRegistered == false) {
                callOwner(cars[i].phone);
            }
        }

    }


    private static void callOwner(String phoneNumber) {
        // calling blaaaaaaa
    }


}














