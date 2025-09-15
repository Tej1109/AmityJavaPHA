package Module2;

import java.util.Scanner;

public class PHA_M2_Q7 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Team team;
        System.out.println("Enter details: ");
        String[] details = scanner.nextLine().split(",");
        if (details[0].equalsIgnoreCase("Cricket")){
            team = new CricketTeam(details[1],Integer.parseInt(details[2]),Integer.parseInt(details[3]), Integer.parseInt(details[4]));
            System.out.println("Team: " + team.name + " (" + details[0] + ") " + "Points : " + team.calculatePoints());
        } else if (details[0].equalsIgnoreCase("Football")) {
            team = new FootballTeam(details[1],Integer.parseInt(details[2]),Integer.parseInt(details[3]), Integer.parseInt(details[4]));
            System.out.println("Team: " + team.name + " (" + details[0] + ") " + "Points : " + team.calculatePoints());}
    }}
