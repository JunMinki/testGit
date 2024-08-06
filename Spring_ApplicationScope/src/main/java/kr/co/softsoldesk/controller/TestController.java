package kr.co.softsoldesk.controller;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@SessionAttributes({"sessionBean"})
public class TestController {
	
	@Autowired
	ServletContext application;
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		ServletContext application = request.getServletContext();
		application.setAttribute("data1", "문자열1");
		return "redirect:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		ServletContext application = request.getServletContext();
		String data1 = (String) application.getAttribute("data1");

		System.out.println("data1 :" + data1);
		return "result1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		application.setAttribute("data2", "문자열2");
		return "forward:/result2";
	}
	
	@GetMapping("/result2")
	public String result2(HttpSession session) {
		String data = (String) application.getAttribute("data2");
		System.out.println("data");
		return "result2";
	}

}
