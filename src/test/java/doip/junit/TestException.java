package doip.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import doip.logging.LogManager;
import doip.logging.Logger;

class TestException {
	
	private static Logger logger = LogManager.getLogger(Assertions.class);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * This method was just implemented so see which type of Exception
	 * will be thrown. Therefore it is disabled.
	 * @throws Exception
	 */
	@Test
	@Disabled
	void testOnlyDivide() {
		String function = "void testOnlyDivide()";
		try  {
			logger.info(">>> " + function);
			divide(1, 0);
		} catch (Exception e) {
			logger.info("Exception of type <" + e.getClass().getName() + "> catched");
			Assertions.fail("Throwing an exception of type <" +  e.getClass().getName() + ">");
		} finally {
			logger.info("<<< " + function);
		}
	}

	int divide(int numerator, int denominator) throws Exception {
		return numerator / denominator;
	}
}
