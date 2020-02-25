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
public class Room {
    private String roomNumber;
    private Wall[] walls = new Wall[4];
    private Door[] doors = new Door[2];
    
    
    
    public Room(String newRoom){
        this.roomNumber = newRoom;
        for (int i = 0; i < walls.length;i++) {
            walls[i] = new Wall();
        }
        walls[0].setMaterial("Concrete");
        walls[0].setWithDoor(true);
        walls[0].setWithWindow(true);
        walls[1] = new Wall("Wood",false,false);
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new Door();
        }
    }
    
    public Room(){
        this("NONE");
    }
    
    @Override
    public String toString() {
        return "Room{" + "roomNumber=" + roomNumber + ", walls=" + getWallDetails() + ", doors=" + doors + '}';
    }
    
    public String getWallDetails(){
        String s="";
        for (int i = 0; i < walls.length; i++) {
            s += walls[i].toString() +",";
        }
        return s;
    }
}
