package rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class RockPaperScissorsTest {

//    @Test
//    public void computerChooses_shouldBeAString_true() throws Exception {
//        RockPaperScissors testGame = new RockPaperScissors();
//        String playerChoice = "scissors";
//        assertEquals(playerChoice, testGame.runGame("scissors"));
//    }

    @Test
    public void computerChooses_shouldBeAString2_true() throws Exception {
        RockPaperScissors testGame = new RockPaperScissors();
        String playerChoice = "Player 1 is the winner!";
        assertEquals(playerChoice, testGame.runGame("paper", "rock"));
    }
}