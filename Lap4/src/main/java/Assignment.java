/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class Assignment {
    private String name;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private double score;
    private double totalPoint;
    private double totalWeigth;

    public Assignment() {
    }
    
    
    public Assignment(String name, int month, int day, int hour, int minute) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public double getScore() {
        return score;
    }

    public double getTotalPoint() {
        return totalPoint;
    }

    public double getTotalWeigth() {
        return totalWeigth;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setTotalPoint(double totalPoint) {
        this.totalPoint = totalPoint;
    }

    public void setTotalWeigth(double totalWeigth) {
        this.totalWeigth = totalWeigth;
    }
    
    
    public String toString(){
        return String.format("%s (date: %d-%d at %d:%d): score = %.2f; totalPorint = %.2f; totalWeigth = %.2f",
                this.name,this.day,this.month,this.hour,this.minute,this.score,this.totalPoint,this.totalWeigth);
    }
}
