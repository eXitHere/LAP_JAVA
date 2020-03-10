
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
public class test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5,"White", new Date());
        Rectangle r1 = new Rectangle(4, 5, "Red", new Date());
        System.out.println(c1);
        System.out.println(r1);
    }
}
