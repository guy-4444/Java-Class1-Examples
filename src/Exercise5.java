import objects.Car;
import objects.Date;

import java.util.Random;

public class Exercise5 {


    public static void start() {
        final int SZ = 10000000;
        int counter = 0;
        Random random = new Random();
        for (int i = 0; i < SZ; i++) {
            double x = 2 * random.nextDouble() - 1.0;
            double y = 2 * random.nextDouble() - 1.0;
            double distance = Math.sqrt(x * x + y * y);

            if (distance <= 1.0) {
                counter++;
            }
        }

        double result = (counter * 1.0) / SZ;
//        result *= 4.0;

        System.out.println(result);


        int min = 100;
        int max = 150;
        int num = new Random().nextInt(max - min + 1) + min;

    }


}














