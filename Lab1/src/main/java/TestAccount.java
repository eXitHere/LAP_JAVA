/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(1122,20000);
        a1.setAnnualInterestRate(4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println(a1.getBalance());
        System.out.println(a1.getMounthlyInterest());
        System.out.println(a1.getDateCreated());
    }
    
}
