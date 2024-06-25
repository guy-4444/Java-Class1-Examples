package shapes;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Rectangle{" +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof  Rectangle)) {
            return false;
        }

        Rectangle otherRectangle = (Rectangle) other;
        return super.equals(other)
                &&  height == otherRectangle.height
                &&  otherRectangle.width == otherRectangle.width;
    }
}
