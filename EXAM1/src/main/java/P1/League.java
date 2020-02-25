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
public class League {
    private Match[] match = new Match[6];
    private Team[] teamList = new Team[3];
    
    public League(Team t1,Team t2,Team t3) {
        for(int i=0;i<3;i++){
            this.teamList[i] = new Team();
        }
        this.teamList[0] = t1;
        this.teamList[1] = t2;
        this.teamList[2] = t3;
        //System.out.println(teamList[0].getName());
        for(int i=0;i<6;i++){
            this.match[i] = new Match();
        }
    }
    
    public void StartLeague(){
        match[0].setTeam(teamList[0],teamList[1]);
        match[1].setTeam(teamList[0],teamList[2]);
        match[2].setTeam(teamList[1],teamList[0]);
        match[3].setTeam(teamList[1],teamList[2]);
        match[4].setTeam(teamList[2],teamList[0]);
        match[5].setTeam(teamList[2],teamList[1]);
    }

    public Match[] getMatch() {
        return match;
    }

    public Team[] getTeamList() {
        return teamList;
    }

    public void setMatch(Match[] match) {
        this.match = match;
    }

    public void setTeamList(Team[] teamList) {
        this.teamList = teamList;
    }

    @Override
    public String toString() {
        return "League{" + "match=" + match + ", teamList=" + teamList + '}';
    }
    
    public void getReport(){
        System.out.println("Team                  " + teamList[0].getName() +"    " + teamList[1].getName() +"          " + teamList[2].getName() + "        Score");
        System.out.println(teamList[0].getName() +"            - "+"                " + match[0].getResult() + "               "+ match[1].getResult()+ "               "+teamList[0].getScore());
        System.out.println(teamList[1].getName() +"                   "+match[2].getResult() +"               - "+"            "+"   "+ match[3].getResult()+ "                "+teamList[1].getScore());
        System.out.println(teamList[2].getName() +"                  "+ match[4].getResult() + "              "+ match[5].getResult() +"                - "+"            " + "      "+teamList[2].getScore());
    }
    
}
