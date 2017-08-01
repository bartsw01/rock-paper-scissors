package rockpaperscissors;

/**
 * Created by Guest on 8/1/17.
 */
public class RockPaperScissors {
    public String rock;
    public String paper;
    public String scissors;
    public int player1, player2;



    public String runGame(String inputString1, String  inputString2){
        String winningPlayer="";
        if (inputString1.equals("paper") && inputString2.equals("rock")){
            winningPlayer = "Player 1 is the winner!";
        }





        return winningPlayer;
    }

}
