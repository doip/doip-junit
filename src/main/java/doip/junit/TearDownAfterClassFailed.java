package doip.junit;

public class TearDownAfterClassFailed extends Exception {

	private static final long serialVersionUID = 3150261165566929533L;

	public TearDownAfterClassFailed(String string) {
		super(string);
	}
	
	public TearDownAfterClassFailed(String message, Throwable cause) {
		super(message, cause);
	}
}
