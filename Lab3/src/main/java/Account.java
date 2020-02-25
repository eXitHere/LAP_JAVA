
import java.util.Date;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class Account{
    private int id = 0;
    private double balance =0 ;
    private static double annualInterestRate=0;
    private String name;
    private Date dateCreated;
    private ArrayList<Transection> tranList = new ArrayList<Transection>();
    
    Account(int newId,String newName,double newBalance)
    {
        name = newName;
        dateCreated = new Date();
        id = newId;
        balance = newBalance;
        //annualInterestRate = newAnnualInterestRate;
    }
    
    int getId()
    {
        return id;
    }
    
    void setId(int newId)
    {
        id = newId;
    }
    
    double getBalance()
    {
        return balance;
    }
    
    void setBalance(double newBalance)
    {
        balance = newBalance;
    }
    
    double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    void setAnnualInterestRate(double newAnnualInterestRate)
    {
        annualInterestRate = newAnnualInterestRate/100;
    }
    
    Date getDateCreated()
    {
        return dateCreated;
    }
    
    double getMonthlyInterestRate()
    {
        return Account.annualInterestRate / 12;
    }
    
    double getMounthlyInterest()
    {
        return balance * getMonthlyInterestRate();
    }
    
    void withdraw(double a)
    {
        tranList.add(new Transection('w', a));
        balance -= a;
    }
    
    void deposit(double a)
    {
        tranList.add(new Transection('d', a));
        balance += a;
    }
    
    String getTransection(){
        String s = "";
        for(int i=0;i<tranList.size();i++){
            s+= tranList.get(i).toString() +"\n";
        }
        //System.out.println(s);
        return s;
        //return tranList.toString();
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", name=" + name + ", dateCreated=" + dateCreated + ", tranList=" + getTransection() + '}';
    }
    
    
}
