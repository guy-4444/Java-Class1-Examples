package exceptions;

import shapes.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExceptionMain {

    public static void start() throws Exception {

        int a1 = 9;
        int a2 = 9;
        int res = a1 / a2;
        //System.out.println(res);

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
//        System.out.println(ints[3]);


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        //System.out.println(arrayList.get(5));


        Circle c1 = new Circle(5);
        c1 = null;
        //System.out.println(c1.perimeter());

        String name = "Guy";
        if (name.equals("Guy")) {
            throw new Exception("My error message");
        }




        playGame();
    }

    private static void playGame() {
        Game game = new Game();
        game.print();
    }


}
