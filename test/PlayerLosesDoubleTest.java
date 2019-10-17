import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

class PlayerLosesDoubleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testPlayerLosesDoubleBug() {
		
		//arrange
		List<Die> dice = new ArrayList<Die>();
		dice.add(new Die());
		dice.add(new Die());
		dice.add(new Die());
		Face selection = Face.FISH;
		String punterName = "John";
		int punterBalance = 100;
		int punterLimit = 10;
		int punterBet = 5;
		Punter punter = new Punter(punterName, punterBalance, punterLimit);
		
		//execute
		punter.placeBet(punterBet);
		
		int matches = 0;
		
		int winnings = matches * punterBet;

		if (matches > 0) {	
		    punter.returnBet();
			punter.receiveWinnings(winnings);
		}
		else {
		    punter.loseBet();
		}
		
		//assert
		assertEquals(punterBalance - punterBet,punter.getBalance());	
	}

}
