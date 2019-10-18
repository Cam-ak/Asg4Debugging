import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class PlayerCantReachBetLimitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		//arrange
		String punterName = "John";
		int punterStartingBalance = 100;
		int punterLimit = 95;
		int punterBet = 5;
		Punter punter = new Punter(punterName, punterStartingBalance, punterLimit);
		
		//execute
		boolean result = punter.balanceExceedsLimitBy(punterBet);
		
		//assert
		assertTrue(result);
	}

}
