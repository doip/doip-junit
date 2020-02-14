package doip.junit;

import doip.logging.LogManager;
import doip.logging.Logger;

public class Assert {

	private static Logger logger = LogManager.getLogger(Assert.class);
	
	public static void assertTrue(boolean condition) {
		try {
			org.junit.Assert.assertTrue(condition);
		}  catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertTrue(String message, boolean condition) {
		try {
			org.junit.Assert.assertTrue(message, condition);
		}  catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertFalse(boolean condition) {
		try {
			org.junit.Assert.assertFalse(condition);
		}  catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertFalse(String message, boolean condition) {
		try {
			org.junit.Assert.assertFalse(message, condition);
		}  catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertEquals(String expected, String actual) {
		try {
			org.junit.Assert.assertEquals(expected, actual);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertEquals(String message, String expected, String actual) {
		try {
			org.junit.Assert.assertEquals(message, expected, actual);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertArrayEquals(byte[] expecteds, byte[] actuals) {
		try {
			org.junit.Assert.assertArrayEquals(expecteds, actuals);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertArrayEquals(String message, byte[] expecteds, byte[] actuals) {
		try {
			org.junit.Assert.assertArrayEquals(message, expecteds, actuals);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertEquals(String message, int expected, int actual) {
		try {
			org.junit.Assert.assertEquals(message, expected, actual);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertEquals(int expected, int actual) {
		try {
			org.junit.Assert.assertEquals(expected, actual);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertNotNull(Object obj) {
		try {
			org.junit.Assert.assertNotNull(obj);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertNotNull(String message, Object obj) {
		try {
			org.junit.Assert.assertNotNull(message, obj);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertNull(Object obj) {
		try {
			org.junit.Assert.assertNull(obj);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertNull(String message, Object obj) {
		try {
			org.junit.Assert.assertNull(message, obj);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertEquals(boolean expected, boolean actual) {
		try {
			org.junit.Assert.assertEquals(expected, actual);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void assertEquals(String message, boolean expected, boolean actual) {
		try {
			org.junit.Assert.assertEquals(message, expected, actual);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void fail() {
		try {
			org.junit.Assert.fail();
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	public static void fail(String message) {
		try {
			org.junit.Assert.fail(message);
		} catch (AssertionError e) {
			logger.error(getExceptionAsString(e));
			throw e;
		}
	}
	
	/**
	 * Returns an exception including its stack trace as string.
	 * @param e The exception
	 * @return The exception as string
	 */
	private static String getExceptionAsString(Throwable e) {
		StringBuilder s = new StringBuilder(4096);
		String message = e.getMessage();
		if (message != null) {
			s.append(message);
		}
		s.append("\n");
		s.append(e.getClass().getName());
		s.append("\n");
		StackTraceElement[] elements = e.getStackTrace();
		for (StackTraceElement element : elements) {
			s.append("    ");
			s.append(element);
			s.append("\n");
		}
		return s.toString();
		
	}
}
