/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;

import static First.Geometric.max;
import java.util.Date;

/**
 *
 * @author Thana
 */
public class test {
    public static void main(String[] args) {
        Circle c1 = new Circle(4,"WHITE",new Date());
        Rectangle r1 = new Rectangle(4,5,"RED",new Date());
        
        System.out.println(c1.compareTo(r1));
        System.out.println(max(r1,c1));
        
        System.out.println(c1.howToColor());
        System.out.println(r1.howToColor());
        
    }
    
    
}
