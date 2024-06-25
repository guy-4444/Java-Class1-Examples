package shapes;

public class ShapesMain2 {

    public static void start() {



        Circle c1 = new Circle("#343467", 5);
        Circle c2 = new Circle("#343467", 5);
        Circle c3 = c1;

        String s1 = "Guy";
        String s2 = "Guy";

        Integer i1 = 1;
        Integer i2 = 1;

        System.out.println(i1.equals(i2));
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(s1.equals(s2));
        System.out.println(c1.getClass().getName());


    }


}
