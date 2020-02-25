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
public class Player {
    private String name;
    private String role;
    
    public Player(String nName,String nRole) {
        //System.out.println("CreatePlayer");
        this.name = nName;
        this.role = nRole;
    }
    
    public Player() {
        this("N","N");
    }
    
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", role=" + role + '}';
    }
    
}
