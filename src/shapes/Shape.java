package shapes;

import java.awt.*;

public abstract class Shape {

    protected String color = "#FFFFFF";

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
}
