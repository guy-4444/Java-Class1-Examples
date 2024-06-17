package shapes;

import java.awt.*;

public class ShapesMain {

    public static void start() {

        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle("#343467", 5);
        shapes[1] = new Circle(5);
        shapes[2] = new Square(4);
        shapes[3] = new Rectangle(4, 5);;
        shapes[4] = new Triangle(3, 4);;
        shapes[5] = new Hexagon(3);;


        Circle c = new Circle("#343467", 5);
        System.out.println(c.area());

        for (Shape s : shapes) {
            System.out.println(s);
        }

        for (Shape shape : shapes) {
            System.out.println(shape.perimeter());
        }

        for (Shape s : shapes) {
            if (s instanceof Circle) {
                System.out.println(((Circle) s).area());
            } else if (s instanceof Square) {
                System.out.println(((Square) s).area());
            } else if (s instanceof Rectangle) {
                System.out.println(((Rectangle) s).area());
            } else if (s instanceof Triangle) {
                System.out.println(((Triangle) s).area());
            } else if (s instanceof Hexagon) {

            }
        }

    }


}
