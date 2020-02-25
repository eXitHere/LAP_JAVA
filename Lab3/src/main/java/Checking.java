/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class Checking extends Account{
    
    Checking(int newId,String newName,double newBalance){
        super(newId,newName,newBalance);
    }
    
    public String toString() {
        return "Checking{" + super.toString() +'}';
    }
    
    public void withdraw(double n){
        if(super.getBalance()<n){
            System.out.println("Can't Withdraw!");
        }
        else{
            super.withdraw(n+20);
        }
    }
    
}
