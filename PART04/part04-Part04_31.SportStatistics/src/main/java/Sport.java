/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class Sport {
    private String homeTeamName;
    private String visitingTeamName;
    private int homeTeamScore;
    private int visitingTeamScore;
    
    public Sport(String homeTeamName, String visitingTeamName, int homeTeamScore, int visitingTeamScore){
        this.homeTeamName = homeTeamName;
        this.visitingTeamName = visitingTeamName;
        this.homeTeamScore = homeTeamScore;
        this.visitingTeamScore = visitingTeamScore; 
    }
    
    public String getHomeTeamName(){
        return this.homeTeamName;
    }
    
    public String getVisitingTeamName(){
        return this.visitingTeamName;
    }
    
    public int getHomeTeamScore(){
        return this.homeTeamScore;
    }
    
    public int getVisitingTeamScore(){
        return this.visitingTeamScore;
    }
    
}
