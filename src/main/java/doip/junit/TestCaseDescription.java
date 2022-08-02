package doip.junit;

import doip.logging.LogManager;
import doip.logging.Logger;

public class TestCaseDescription {

	private String id;
	private String description;
	private String action;
	private String expectedResult;
	
	private boolean emphasize = false;

	private static Logger logger = LogManager.getLogger(TestCaseDescription.class);
	
	public TestCaseDescription(String id, String description, String action, String expectedResult) {
		this.id = id;
		this.description = description;
		this.action = action;
		this.expectedResult = expectedResult;
	}
	
	/**
	 * Returns the test case description in a multi-line string. The string itself does not
	 * begin with a new line character and also doesn't stop with a new line character.
	 */
	public String toString() {
		if (emphasize) {
			return   "##############################################################################" +
				   "\nTest case ID:    " + id +
				   "\n##############################################################################" +
				   "\nDescription:\n    " + wrap(description, 80, "    ") +
				   "\nAction:\n    " + wrap(action, 80, "    ") +
				   "\nExpected result:\n    " + wrap(expectedResult, 80, "    ") +
				   "\n##############################################################################";
			
		} else {
			return   "==============================================================================" +
				   "\nTest case ID:    " + id +
				   "\n==============================================================================" +
				   "\nDescription:\n    " + wrap(description, 80, "    ") +
				   "\nAction:\n    " + wrap(action, 80, "    ") +
				   "\nExpected result:\n    " + wrap(expectedResult, 80, "    ") +
				   "\n==============================================================================";
		}
	}
	
	/**
	 * Logs the test case as level "info" 
	 */
	public void log() {
		logger.info("\n" + this.toString());
	}
	
	
	public TestCaseDescription emphasize() {
		this.emphasize = true;
		return this;
	}
	
	/**
	 * This function will take a string and wraps the text where
	 * the line would exceed a given length.
	 * @param text The text which shall get wrapped
	 * @param limit The maximum number of characters in one line
	 * @param indent Gives an indent which will be added at the beginning
	 * 		of the next line
	 * @return The wrapped text
	 */
	public static String wrap(String text, int limit, String indent) {
		String result = "";
		String line = "";
	
		String[] words = text.split("\\s+");
		
		for (int i = 0; i < words.length; i++) {
			if (line.length() + words[i].length() > limit) {
				result += line + "\n" + indent;
				line = words[i];
			} else {
				// There is enough space to add our word
				if (line.length() > 0) line +=  " ";
				line += words[i];
			}
		}
		result += line;
		
		return result;
	}
}
