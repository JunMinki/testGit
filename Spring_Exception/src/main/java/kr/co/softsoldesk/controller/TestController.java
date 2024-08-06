package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping ("/test1")
	private String test1(Model model) {//모델은 controller와 view를 연결해주는 객체
		
		int [] array1 = {10, 20, 30};
		model.addAttribute("array1", array1[0]);
		
		return "test1";
 	}
	
	@GetMapping ("/test2")
	private String test2(Model model) {
		
		int [] array1 = {10, 20, 30};
		model.addAttribute("array1", array1[10]);
		
		return "test2";
	}

//	//오류 발생시 404나 500이 뜨는게 아닌 error1 페이지로 띄움
//	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
//	public String exception1() {
//		
//		return "error1";
//	}
	
}
