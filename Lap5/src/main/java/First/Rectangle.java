package First;


import java.util.Date;


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

    @Override
    public String howToColor() {
        return this.color;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
