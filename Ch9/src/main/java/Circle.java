
import java.util.Date;
import java.util.Arrays; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class Circle {
    double radius = 10;
    String color;
    boolean isFilled;
    static int numberOfObjects = 0;
    Date dateCreated;
    int[] arr = new arr[10];
    Circle(){
        dateCreated = new Date();
        numberOfObjects++;
         Arrays.sort(arr); 
    }
    
    Circle(double newRadius,String newColor)
    {
        radius = newRadius;
        color = newColor;
        dateCreated = new Date();
        numberOfObjects++;
    }
    
    double getArea()
    {
        return Math.PI * radius * radius;
    }
}
