/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circle;

/**
 *
 * @author Thana
 */
public class Circle {
    
    static int numberOfObjects;
    private double r;
    private String color;
    
    public Circle(){
        this(0.1,"Red");
    }
    
    public Circle(double newR,String newColor){
        this.r = newR;
        this.color = newColor;
        numberOfObjects++;
    }
    
    public void setRadius(double newR){
        this.r = newR;
    }
    
    public void setColor(String newC){
        this.color = newC;
    }
    
    public double getArea(){
        return Math.PI * this.r * this.r;
    }
    
    @Override
    public String toString() {
        return "Circle{" + "r=" + r + ", color=" + color + '}';
    }
    
    
}
