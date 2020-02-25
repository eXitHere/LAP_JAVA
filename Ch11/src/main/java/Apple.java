/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class Apple extends Fruit {
    public static void main(String[] args) {
        //System.out.println("a");
        new Apple("EIEI");
    }
    
    Apple(){
        super("none");
    }
    
    Apple(String n){
        super(n);
    }
}

class Fruit {
    Fruit(String s){
        System.out.println(s);
    }
}