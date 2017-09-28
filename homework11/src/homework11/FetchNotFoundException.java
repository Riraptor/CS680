package homework11;

public class FetchNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public FetchNotFoundException() {
		super("FILE DOES NOT EXIST");
		
	}

}
