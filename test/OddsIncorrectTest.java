import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class OddsIncorrectTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testIncorrectOdds() {
		//arrange
		String punterName = "John";
		int punterStartingBalance = 10000;
		int punterLimit = 10;
		int punterStdBet = 5;
		int numOfGames = 10000;
		
		Die d1 = new Die();
		Die d2 = new Die();
		Die d3 = new Die();        
		List<Die> dice = new ArrayList<>(Arrays.asList(d1, d2, d3));

		Punter punter = new Punter(punterName, punterStartingBalance, punterLimit);

		//execute
		int gamesPlayed = 0;
		int wins =0;
		while(gamesPlayed < numOfGames) {
			try {
				Face pick = Face.CRAB;
				int winnings = Round.play(punter, dice, pick, punterStdBet);
				if( winnings > 0) {
					wins++;
				}
				gamesPlayed++;
			}
			catch(IllegalArgumentException iae) {
				break;
			}
		}
		//assert
		assertEquals(0.42f,((float)wins/(float)gamesPlayed),0.01f);
	}

}
