package doip.junit;

public class TearDownFailed extends Exception {

	private static final long serialVersionUID = 3942045871846811453L;

	public TearDownFailed(String string) {
		super(string);
	}
	
	public TearDownFailed(String message, Throwable cause) {
		super(message, cause);
	}

}
