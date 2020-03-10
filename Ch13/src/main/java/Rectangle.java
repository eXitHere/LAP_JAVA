
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
public class Rectangle extends Geometric{
    private double width;
    private double height;

    public Rectangle(double width, double height, String color, Date dateCreated) {
        super(color, dateCreated);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }
    
    @Override
    double getArea() {
        return this.width * this.height;
    }

    @Override
    double getPerimeter() {
        return this.width*2 + this.height*2;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    
    
}
