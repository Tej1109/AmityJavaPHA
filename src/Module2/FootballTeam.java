package Module2;

public class FootballTeam extends Team{
    FootballTeam(String name,int matchesPlayed,int wins,int draws){
        super(name,matchesPlayed,wins,draws);
    }
    @Override
    int calculatePoints(){
        int win = 3;
        int draw = 1;
        return  win*this.wins + draw*this.draws;
    }
}
