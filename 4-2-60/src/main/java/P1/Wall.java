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
public class Wall {
    private String material;
    private Boolean withWindow;
    private Boolean withDoor;

    public Wall(String material, Boolean withWindow, Boolean withDoor) {
        this.material = material;
        this.withWindow = withWindow;
        this.withDoor = withDoor;
    }

    public Wall() {
    }

    @Override
    public String toString() {
        
        return "Wall{" + "material=" + material + ", withWindow=" + withWindow + ", withDoor=" + withDoor + '}';
    }

    public String getMaterial() {
        return material;
    }

    public Boolean getWithWindow() {
        return withWindow;
    }

    public Boolean getWithDoor() {
        return withDoor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWithWindow(Boolean withWindow) {
        this.withWindow = withWindow;
    }

    public void setWithDoor(Boolean withDoor) {
        this.withDoor = withDoor;
    }
    
}