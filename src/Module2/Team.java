package Module2;

public class Team {
    String name;
    int matchesPlayed,wins,draws;

    Team(String name,int matchesPlayed,int wins,int draws){
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    int calculatePoints(){return 0;};
}
