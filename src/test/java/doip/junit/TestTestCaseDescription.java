package doip.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Testing the class TestCaseDescription. It doesn't really test the class,
 * it is more a demonstration how this class can be used to create some
 * nice logging with a description of the test case.
 */
public class TestTestCaseDescription {
	
	private static Logger logger = LogManager.getLogger(TestTestCaseDescription.class);
	
	@Test
	public void test() {
		TestCaseDescription desc = new TestCaseDescription(
				"TC-0001-01",
				"Just show the usage of class TestCaseDescription."
						+ " This here is just a sentence to show that"
						+ " there is an automatic line break when the message"
						+ " just gets too long.\n1. First step\n2. Second step"
				,
				"Create instance of class TestCaseDescription and log a few messages",
				"The output from Log4j shows the log messages",
				"Here we can add some additional information about the test case."
						+ " The implementation will write 6 log messages with log level"
						+ " from TRACE to FATAL. You might not see all message due to"
						+ " configuration of Log4j."
						+ " Now also several paragraphs can be created.\n"
						+ "1. logger.trace(...)\n"
						+ "2. logger.debug(...)\n"
						+ "3. logger.info(...)\n"
						+ "...\n"
						+ "6. logger.fatal(...)\n\n"
						+ "Some more information"
						);
		desc.logHeader();
		logger.trace("This is a log message with log level TRACE");
		logger.debug("This is a log message with log level DEBUG");
		logger.info ("This is a log message with log level INFO");
		logger.warn ("This is a log message with log level WARN");
		logger.error("This is a log message with log level ERROR");
		logger.fatal("This is a log message with log level FATAL");
		desc.logFooter(TestResult.PASSED);
	}
	
	@Test
	public void testFormat1() {
		TestCaseDescription desc = new TestCaseDescription("","","","");
		String text = desc.formatSection("1234 1234 1234", 10, "");
		assertEquals("1234 1234\n1234", text);
	}
	
	@Test
	public void testFormat2() {
		try {
			TestCaseDescription desc = new TestCaseDescription("","","","");
			String text = desc.formatSection("1234\n1234\n1234", 10, "");
			assertEquals("1234\n1234\n1234", text);
		} finally {
		}
		
	}
}
