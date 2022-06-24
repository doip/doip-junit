package doip.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import doip.logging.LogManager;
import doip.logging.Logger;

class TestTestCaseDescription {
	

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

	@Test
	void test() {
		String text = "Here are  some    words \t\t for test";
		String[] words = text.split("\\s+");
		Assertions.assertEquals("Here", words[0]);
		Assertions.assertEquals("are", words[1]);
		Assertions.assertEquals("some", words[2]);
		Assertions.assertEquals("words", words[3]);
		Assertions.assertEquals("for", words[4]);
		Assertions.assertEquals("test", words[5]);
	}
	
	@Test
	public void testTestCaseDescription() {
		TestCaseDescription tc = new TestCaseDescription(
				"TC0001", 
				"Just testing how good this automatic text wrapping works", null, null);
	}
	
	@Test
	public void wrap1() {
		String text = "This is a long sentence with a lot of words which must be wrapped, otherwise we can't read the whole sentence because it is too long. 1234567890123456789012345678901234567890";
		System.out.println("-------------------------------");
		System.out.println(TestCaseDescription.wrap(text, 36, "  "));
		System.out.println("-------------------------------");
	}
	
	
}