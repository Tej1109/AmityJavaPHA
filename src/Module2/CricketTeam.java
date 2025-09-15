package Module2;

public class CricketTeam extends  Team{
    CricketTeam(String name,int matchesPlayed,int wins,int draws){
        super(name,matchesPlayed,wins,draws);
    }
    @Override
    int calculatePoints(){
        int win = 2;
        int draw = 1;
        return  win*this.wins + draw*this.draws;
    }
}
