
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
public class Geometric {
    private String color;
    private boolean isFilled;
    private Date dateCreated;

    public Geometric() {
        this.dateCreated = new Date();
    }

    public Geometric(String color, boolean isFilled, Date dateCreated) {
        this.color = color;
        this.isFilled = isFilled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", isFilled=" + isFilled + ", dateCreated=" + dateCreated + '}';
    }
    
    
}
