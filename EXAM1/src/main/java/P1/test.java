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
public class test {
    public static void main(String[] args) {
        Team team1 = new Team("Chonburi Bluewave");
        Team team2 = new Team("Bangkok FC");
        Team team3 = new Team("CAT Telecom");
        
        //System.out.println("1");
        //team1.setName("Chonburi Bluewave");
        team1.addPlayer("A1","Goalkeeper");
        team1.addPlayer("B1","Defend");
        team1.addPlayer("C1","Midfield");
        team1.addPlayer("D1","Forward");
        team1.addPlayer("E1","Forward");
        
        //teamList[1].setName("Bangkok FC");
        team2.addPlayer("A2","Goalkeeper");
        team2.addPlayer("B2","Defend");
        team2.addPlayer("C2","Midfield");
        team2.addPlayer("D2","Forward");
        team2.addPlayer("E2","Forward");
        
        //teamList[2].setName("CAT Telecom");
        team3.addPlayer("A3","Goalkeeper");
        team3.addPlayer("B3","Defend");
        team3.addPlayer("C3","Midfield");
        team3.addPlayer("D3","Forward");
        team3.addPlayer("E3","Forward");
        
        League league = new League(team1,team2,team3);
        league.StartLeague();
        league.getReport();
    }
}
