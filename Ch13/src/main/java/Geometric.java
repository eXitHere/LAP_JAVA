
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

public abstract class Geometric {
    String color;
    Date dateCreated;

    protected Geometric(String color, Date dateCreated) {
        this.color = color;
        this.dateCreated = dateCreated;
    }

    protected Geometric() {
    }
    
//    public double getArea(){   
//        return 0;
//    }
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", dateCreated=" + dateCreated + '}';
    }
    
    
    
}
