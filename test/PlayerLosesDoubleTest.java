import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;


@ExtendWith(MockitoExtension.class)
class PlayerLosesDoubleTest {

	
	
	@InjectMocks private InteractiveGame ig;
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testPlaceBet() {
		
		//arrange
		String punterName = "John";
		int punterBalance = 100;
		int punterLimit = 10;
		int punterBet = 5;
		Punter punter = new Punter(punterName, punterBalance, punterLimit);
		
		//execute
		punter.placeBet(punterBet);
		
		//assert
		assertEquals(punterBalance,punter.getBalance());	
	}

}
