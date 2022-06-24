package doip.junit;

public class SetUpFailed extends Exception {

	private static final long serialVersionUID = 4295982449450467060L;

	public SetUpFailed(String string) {
		super(string);
	}
	
	public SetUpFailed(String message, Throwable cause) {
		super(message, cause);
	}

}
