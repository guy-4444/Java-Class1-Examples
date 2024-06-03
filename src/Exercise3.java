import objects.Car;
import objects.Date;
import objects.Garage;

public class Exercise3 {

    // guyi3@mail.afeka.ac.il


    public static void start() {

        Garage garage = new Garage("Levi's garage");


        Car c1 = new Car();
        c1.setModel("Toyota");
        c1.setKm(20000);
        c1.setCreatedAt(new Date(1999, 1, 1));

        Car c2 = new Car();
        c2.setModel("Mitsubishi");
        c2.setKm(20000);
        c2.setCreatedAt(new Date(2020, 1, 1));

        Car c3 = new Car();
        c3.setModel("Ferrari");
        c3.setKm(200040);
        c3.setCreatedAt(new Date(2010, 1, 1));

        Car c4 = new Car();
        c4.setModel("Kia");
        c4.setKm(20640);
        c4.setCreatedAt(new Date(2010, 1, 1));

        Car c5 = new Car();
        c5.setModel("Tesla");
        c5.setKm(100000);
        c5.setCreatedAt(new Date(2010, 1, 1));


        garage.addCar(c1);
        garage.addCar(c2);
        garage.addCar(c3);
        garage.addCar(c4);
        garage.addCar(c5);

        System.out.println(garage);

        // Homework..
        garage.addCar(new Car(c5));

        System.out.println(garage);

        c5.setKm(200000);
        c5.getCreatedAt().setY(2024);
        c5.getCreatedAt().setM(06);
        c5.getCreatedAt().setD(03);

        System.out.println(garage);

        // add car

        // get car by index

        // get number of cars
    }
}
