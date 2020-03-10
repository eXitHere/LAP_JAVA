
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */

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
    
    
}
