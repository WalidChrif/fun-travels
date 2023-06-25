package ma.cigma.funtravels.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ConditionException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ConditionException(String message) {
		super(message);
	}
}
