/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class Lab extends Assignment{
    private String specification;
    
    
    public Lab(String name, int month, int day, int hour, int minute) {
        super(name, month, day, hour, minute);
    }

    @Override
    public String toString() {
        return String.format("%s (date: %d-%d at %d:%d):score = %.2f"
               + "; totalPoints = %.2f; totalWeight = %.2f;"
               + "specification = %s",
               super.getName(),super.getDay(),super.getMonth(),
               super.getHour(),super.getMinute(),super.getScore(),
               super.getTotalPoint(),super.getTotalWeigth(),this.specification);
    }
    
    
}
