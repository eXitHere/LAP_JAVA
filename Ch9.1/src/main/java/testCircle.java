
import Circle.Circle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class testCircle {
    public static void main(String[] args) {
        Circle[] c1 = new Circle[10];
        String[] color = {"Red","Blue","Green","Yellow"};
        for(int i=0;i<10;i++){
            c1[i] = new Circle();
            c1[i].setColor(color[(int)(Math.random()*4)]);
            c1[i].setRadius(Math.random()*10);
        }
        double Total =0;
        for (int i = 0; i < 10; i++) {
            Total += c1[i].getArea();
            System.out.println(c1[i].toString());
        }
        System.out.println(Total);
    }
}
