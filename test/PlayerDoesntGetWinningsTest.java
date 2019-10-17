import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PlayerDoesntGetWinningsTest {
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testPlayerDoesntGetWinningsBug() {
		//arrange
				String punterName = "John";
				int punterStartingBalance = 100;
				int punterLimit = 10;
				int punterBet = 5;
				Punter punter = new Punter(punterName, punterStartingBalance, punterLimit);
				
				//execute
				punter.placeBet(punterBet);
				
				int matches = 1;

				
				int winnings = matches * punterBet;
				
			    punter.returnBet();
				punter.receiveWinnings(winnings);
								
				//assert
				assertEquals(punterStartingBalance + winnings, punter.getBalance());	
	}

}
