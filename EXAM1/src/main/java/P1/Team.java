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
public class Team {
    private Player[] playerList = new Player[5];
    private String name;
    private int numPlayer =0;
    private int scoreTeam =0;
    
    public Team(String nName) {
        for(int i=0;i<5;i++){
            this.playerList[i] = new Player();
        }
        this.name = nName;
        //System.out.println("CreateTeam!");
    }
    
    public Team() {
        //this("N");
        //System.out.println("CreateTeam!");
    }
    
    public void upScore(int up){
        this.scoreTeam += up;
    }
    
    public int getScore(){
        return this.scoreTeam;
    }

    public void setPlayerList(Player[] playerList) {
        this.playerList = playerList;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public void setScoreTeam(int scoreTeam) {
        this.scoreTeam = scoreTeam;
    }

    public Player[] getPlayerList() {
        return playerList;
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public int getScoreTeam() {
        return scoreTeam;
    }

    
    public void addPlayer(String nName,String nRole){
        this.playerList[this.numPlayer].setName(nName);
        this.playerList[this.numPlayer].setRole(nRole);
        this.numPlayer++;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String Nname) {
        this.name = Nname;
        //System.out.println("1");
    }
    
    public String getPlayerAll(){
        String temp = "";
        for(int i=0;i<numPlayer;i++){
            if(i!=0) temp+= ";";
            temp += this.playerList[i].getName() + " : " + this.playerList[i].getRole() +",";
        }
        
        return temp;
    }

    @Override
    public String toString() {
        return "Team{" + "playerList=" + getPlayerAll() + ", name=" + name + ", numPlayer=" + numPlayer + '}';
    }
    
}
