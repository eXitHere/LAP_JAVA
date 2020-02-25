/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

/**
 *
 * @author Thana
 */
public class Door {
    private String meterial;
    private String color;

    @Override
    public String toString() {
        return "Door{" + "meterial=" + meterial + ", color=" + color + '}';
    }

    public void setMeterial(String meterial) {
        this.meterial = meterial;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMeterial() {
        return meterial;
    }

    public String getColor() {
        return color;
    }
}
