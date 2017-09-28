package homework18;

public class FileNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public FileNotFoundException() {
		super("FILE DOES NOT EXIST");
		
	}

}
