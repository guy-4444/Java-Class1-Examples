package shapes;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        return (base * height) / 2.0;
    }

    @Override
    public double perimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Triangle{" +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
