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
        /*Account n1 = new Account(000000,"THANA",1000);
        Account n2 = new Account(111111,"EIEI",2000);
        n1.deposit(500);
        n1.withdraw(1000);
        n2.deposit(1000);
        n2.withdraw(500);
        System.out.println(n1.toString());
        System.out.println(n2.toString());*/
        
        Saving S = new Saving(123,"THANA",1000);
        Checking C = new Checking(222,"EIEI",1000);
        Privileged P = new Privileged(300, "KIKI", 1000);
       // S.deposit(500);
        //C.deposit(500);
        P.deposit(500);
        //S.withdraw(100);
      //  C.withdraw(100);
        P.withdraw(100);
       // S.withdraw(5000);
       // C.withdraw(5000);
        P.withdraw(5000);
       // System.out.println(S.toString());
      //  System.out.println(C.toString());
        System.out.println(P.toString());
    }
}
