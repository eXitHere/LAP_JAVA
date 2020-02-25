
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        LinearEquation t = new LinearEquation();
        t.setA(In.nextDouble());
        t.setB(In.nextDouble());
        t.setC(In.nextDouble());
        t.setD(In.nextDouble());
        t.setE(In.nextDouble());
        t.setF(In.nextDouble());
        if(!t.isSolvable()){
            System.out.println("The equation has no solution.");
        }
        else{
            System.out.println(Double.toString(t.getX()) + " " + Double.toString(t.getY()));
        }
            
    }
}
