package shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }



    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Circle{" +
                ", radius=" + radius +
                ", area=" + area() +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof  Circle)) {
            return false;
        }

        Circle otherCircle = (Circle) other;
        return super.equals(other)  &&  radius == otherCircle.radius;
    }
}
