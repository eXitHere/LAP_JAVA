
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
    private double wideth;
    private double hight;

    public Rectangle() {
    }

    public Rectangle(double wideth, double hight) {
        this.wideth = wideth;
        this.hight = hight;
    }

    public Rectangle(double wideth, double hight, String color, boolean isFilled, Date dateCreated) {
        super(color, isFilled, dateCreated);
        this.wideth = wideth;
        this.hight = hight;
    }

    public double getWideth() {
        return wideth;
    }

    public double getHight() {
        return hight;
    }

    public void setWideth(double wideth) {
        this.wideth = wideth;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    
    public String printRactangle(){
        String s ="";
        s+= getClass() + " Width = " + getWideth() + " Hight = " + getHight() + " " + super.toString();
        return s;
    }
}
