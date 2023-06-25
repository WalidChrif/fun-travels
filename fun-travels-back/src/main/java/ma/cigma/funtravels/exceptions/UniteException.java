package ma.cigma.funtravels.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UniteException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public UniteException(String message) {
		super(message);
	}

}
