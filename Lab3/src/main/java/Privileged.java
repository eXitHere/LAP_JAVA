/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class Privileged extends Account{
    int N = 1000;
    Privileged(int newId,String newName,double newBalance){
        super(newId,newName,newBalance);
    }
    
    public String toString() {
        return "Privileged{" + super.toString() +'}';
    }
    
    public void withdraw(double n){
        if(super.getBalance()+N<n){
            System.out.println("Can't Withdraw!");
        }
        else{
            super.withdraw(n);
        }
    }
}
