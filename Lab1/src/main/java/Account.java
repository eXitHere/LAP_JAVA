
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
public class Account {
    private int id = 0;
    private double balance =0 ;
    private static double annualInterestRate=0;
    private Date dateCreated;

    Account(int newId,double newBalance)
    {
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
        balance -= a;
    }
    
    void deposit(double a)
    {
        balance += a;
    }
}
