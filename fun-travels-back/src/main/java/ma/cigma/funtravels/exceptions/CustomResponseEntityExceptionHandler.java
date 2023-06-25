package ma.cigma.funtravels.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler
	public final ResponseEntity<Object> handleUtilisateurUsernameException(UtilisateurUsernameException ex,WebRequest request){
		
		UtilisateurUsernameExceptionResponse exceptionResponse = new UtilisateurUsernameExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleOffreException(OffreException ex, WebRequest request){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleReservationException(ReservationException ex, WebRequest request){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleEquipementException(EquipementException ex, WebRequest request){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleUniteException(UniteException ex, WebRequest request){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleImageException(ImageException ex, WebRequest request){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleEmplacementException(EmplacementException ex, WebRequest request){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleConditionException(ConditionException ex, WebRequest request){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleVilleException(VilleException ex, WebRequest request){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
