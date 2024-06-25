package shapes;

import java.awt.*;

public abstract class Shape {

    protected String color = "#FFFFFF";
    protected int strokeWidth = 1;

    public Shape() {
    }

    public Shape(String color) {
        setColor(color);
    }

    public abstract double perimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        int colorInt = Integer.parseInt(color.substring(1), 16);
        if (colorInt >= 0  &&  colorInt < 16777216) {
            this.color = color;
        }
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", perimeter='" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof  Shape)) {
            return false;
        }

        Shape otherShape = (Shape) other;
        return color.equals(otherShape.color)  &&  strokeWidth == otherShape.strokeWidth;
    }
}
