package shapes;

public class Hexagon extends Shape {

    private int length;

    public Hexagon(int length) {
        this.length = length;
    }

    public Hexagon(String color, int length) {
        super(color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 6 * length;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "length=" + length +
                '}';
    }
}
