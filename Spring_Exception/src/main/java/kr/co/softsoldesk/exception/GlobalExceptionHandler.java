package kr.co.softsoldesk.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	//오류 발생시 404나 500이 뜨는게 아닌 error1 페이지로 띄움
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String exception1() {
		
		return "error1";
	}
	
}
