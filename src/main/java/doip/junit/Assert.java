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
	
	private static String getExceptionAsString(Throwable e) {
		String s = "";
		String message = e.getMessage();
		if (message != null) {
			s += message;
		}
		s += "\n";
		s += e.getClass().getName() + "\n";
		StackTraceElement[] elements = e.getStackTrace();
		for (StackTraceElement element : elements) {
			s += "    " + element + "\n";
		}
		return s;
		
	}
}
