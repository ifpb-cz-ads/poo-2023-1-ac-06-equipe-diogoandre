public class Team {
    int amountOfPlayers;
    String stadium;
    String coach;
    String mascot;
    String[] players;
    String shirtColor;

    public Team(int amountOfPlayers, String stadium, String coach, String mascot,String[] players,String shirtColor){
        this.stadium = stadium;
        this.amountOfPlayers = amountOfPlayers;
        this.mascot = mascot;
        this.shirtColor = shirtColor;
        this.coach = coach;
        this.players = players;
    }
}
