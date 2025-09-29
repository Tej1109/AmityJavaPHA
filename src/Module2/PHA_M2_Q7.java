package Module2;

import java.util.Scanner;

public class PHA_M2_Q7 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Team[] teams = new Team[2];
        Team team;
        int i = 0;
        System.out.println("Enter details: ");
        while (i<2){ //limiting to 2, can be asked from user
        String[] details = scanner.nextLine().split(",");
        if (details[0].equalsIgnoreCase("Cricket")){
            team = new CricketTeam(details[1],Integer.parseInt(details[2]),Integer.parseInt(details[3]), Integer.parseInt(details[4]));
            teams[i] = team;
        } else if (details[0].equalsIgnoreCase("Football")) {
            team = new FootballTeam(details[1],Integer.parseInt(details[2]),Integer.parseInt(details[3]), Integer.parseInt(details[4]));
        teams[i] = team;}
            i++;}
        for (Team t : teams){
            System.out.println("Team: " + t.name + " (" + t.getClass().getSimpleName() + ") " + "Points : " + t.calculatePoints());}
        }
    }
