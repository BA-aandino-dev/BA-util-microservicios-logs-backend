package hn.bancatlan.microservicioLogs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.databind.JsonMappingException;

@ControllerAdvice
public class ExceptionConfiguration extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = JsonMappingException.class)
	public ResponseEntity<?> handleConverterErrors(JsonMappingException ex) {
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<?> handleNullPointerExceptionErrors(NullPointerException ex) {
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }
}
