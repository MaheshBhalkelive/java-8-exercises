package sampletests;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	CustomException(String message){
		super(message);
	}
}
