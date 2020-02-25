
import java.util.Calendar;
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
public class Transection {
    private char type;
    private Calendar date = Calendar.getInstance();
    private double amount;
    private String discription;

    public Transection(char type, double amount) {
        this.type = type;
        date = Calendar.getInstance(); 
        this.amount = amount;
        this.discription = "none";
    }

    @Override
    public String toString() {
        return "Transection{" + "type=" + type + ", date=" + date.get(Calendar.DATE) + ", amount=" + amount + ", discription=" + discription + '}';
    }
    
    
}

