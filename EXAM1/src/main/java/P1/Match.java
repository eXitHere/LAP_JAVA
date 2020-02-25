/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import java.util.Random;

/**
 *
 * @author Thana
 */
public class Match {
    private Team team1 = new Team();
    private Team team2 = new Team();
    private int scoreTeam1 = 0;
    private int scoreTeam2 = 0;
    
    public Match(Team t1,Team t2) {
        this.team1 = t1;
        this.team2 = t2;
        //System.out.println("Create Match!");
    }
    
    public Match() {
        
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public void setScoreTeam1(int scoreTeam1) {
        this.scoreTeam1 = scoreTeam1;
    }

    public void setScoreTeam2(int scoreTeam2) {
        this.scoreTeam2 = scoreTeam2;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public int getScoreTeam1() {
        return scoreTeam1;
    }

    public int getScoreTeam2() {
        return scoreTeam2;
    }
    
    public void setTeam(Team t1,Team t2){
        this.team1 = t1;
        this.team2 = t2;
        //System.out.println("SetTeam!!");
        startMatch();
    }
    
    public void startMatch(){
        Random r = new Random();
        scoreTeam1 = r.nextInt(10);
        scoreTeam2 = r.nextInt(10);
        if(scoreTeam1 > scoreTeam2){
            scoreTeam1 += 3;
            this.team1.upScore(3);
        }else if(scoreTeam2 > scoreTeam1){
            this.team2.upScore(3);
            scoreTeam2 += 3;
        }else{
            scoreTeam1+=1;
            scoreTeam2+=1;
            this.team1.upScore(1);
            this.team2.upScore(1);
        }
    }
    
    public String getResult(){
       // System.out.println(Integer.toString(this.scoreTeam1) +"-" +Integer.toString(this.scoreTeam1));
        return Integer.toString(this.scoreTeam1) +"-" +Integer.toString(this.scoreTeam2);
    }

    @Override
    public String toString() {
        return "Match{" + "team1=" + team1.getName() + ", team2=" + team2.getName() + ", scoreTeam1=" + scoreTeam1 + ", scoreTeam2=" + scoreTeam2 + '}';
    }
    
    
}
