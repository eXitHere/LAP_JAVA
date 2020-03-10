package First;

import java.util.Date;

public class Circle extends Geometric{
    private double radius;

    public Circle(double radius, String color, Date dateCreated) {
        super(color, dateCreated);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public String howToColor() {
        return this.color;
    }
    
}
