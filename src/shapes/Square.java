package shapes;

public class Square extends Rectangle {

    public Square(int length) {
        super(length, length);
    }
    public Square(String color, int length) {
        super(color, length, length);
    }

    @Override
    public String toString() {
        return super.toString() + " Square{}";
    }
}
