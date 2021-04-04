package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception {


	private static final long serialVersionUID = 1L;
	// java exception larin tekrarsiz olmasini saglamak
	//icin unique bir kod verir 

	InvalidEmailIdCheckedException(String message){
		super(message);
	}
	


}
