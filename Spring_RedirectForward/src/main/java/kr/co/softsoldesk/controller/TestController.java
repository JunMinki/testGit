package kr.co.softsoldesk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	//리다이렉트(브라우저에서 이동)
	@GetMapping("/test1")
	public String test1() {
		
		return "redirect:/sub1";
	}
	
	@GetMapping("/sub1")
	public String sub1() {
		
		return "sub1";
	}
	
	//포워드(서버에서 이동)
	@GetMapping("/test2")
	public String test2() {
		return "forward:/sub2";
	}
	
	@GetMapping("/sub2")
	public String sub2() {
		return "sub2";
	}
}
