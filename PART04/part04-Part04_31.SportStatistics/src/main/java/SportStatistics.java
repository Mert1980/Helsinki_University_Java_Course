
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Sport> records = readResultsFromFile(file);
        
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int counter = 0, wins = 0, losses = 0;
        for(Sport record: records){
            if(teamName.contains(record.getHomeTeamName())){
                counter++;
                if(record.getHomeTeamScore() > record.getVisitingTeamScore()){
                wins++;
                } else {
                    losses++;
                }
                
            } 
            if(teamName.contains(record.getVisitingTeamName())){
                counter++;
                if(record.getHomeTeamScore() < record.getVisitingTeamScore()){
                wins++;
                } else {
                    losses++;
                }
            }       
        }
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
         

    }
    
    public static ArrayList<Sport> readResultsFromFile(String file){
        ArrayList<Sport> matchResults = new ArrayList<>();
        
        try(Scanner readFile = new Scanner(Paths.get(file))){
            while(readFile.hasNextLine()){
                String line = readFile.nextLine();
                String[] parts = line.split(",");
                
                String hostTeamName = parts[0];
                String visitingTeamName = parts[1];
                int hostTeamScore = Integer.valueOf(parts[2]);
                int visitingTeamScore = Integer.valueOf(parts[3]);
                
                matchResults.add(new Sport(hostTeamName, visitingTeamName, hostTeamScore, visitingTeamScore));
            }
        } catch(Exception e){
            System.out.println("Error in reading file.");
        }
        return matchResults;
    }

}
