package ch6;

public class SoccerTeam {
private int wins;
private int losses;
private int ties;
private static int gamesp;
private static int points;

public soccerTeam(int win, int los, int tie){
    wins = win;
    losses = los;
    ties = tie;

}

public void played(soccerTeam other, int myScore, int otherScore){
    if (myScore > otherScore){
        this.wins ++;
        other.losses++;
    }
    if (myScore == otherScore){
        this.ties++;
        other.ties++;
    }
    if (myScore < otherScore){
        this.losses++;
        other.wins++;
    }
    this(int gamesp++;)
    other.gamesp++;
}

public int points(soccerTeam other){
    return win*3 + ties;

}
public void reset(soccerTeam other){
    wins = 0;
    ties = 0;
    losses = 0;
}
}
