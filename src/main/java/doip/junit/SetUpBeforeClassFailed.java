package doip.junit;

public class SetUpBeforeClassFailed extends Exception {

	private static final long serialVersionUID = 8921157536270595271L;
	
	public SetUpBeforeClassFailed(String string) {
		super(string);
	}
	
	public SetUpBeforeClassFailed(String message, Throwable cause) {
		super(message, cause);
	}
}
