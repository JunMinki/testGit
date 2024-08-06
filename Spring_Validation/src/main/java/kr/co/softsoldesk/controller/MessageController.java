package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//#2
@Controller
public class MessageController {
	
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/message")
	public String message(Model model, HttpServletRequest request) {
		
		String a1 = res.getMessage("aaa.a1",null, null);
		String b1 = res.getMessage("bbb.b1",null, null);
		
		System.out.println("aaa.a1 : " + a1);
		System.out.println("bbb.b1 : " + b1);
		
		
		/*
		Object [] args = {30, "홍길동"};
		String a2 = res.getMessage("aaa.a2", args, null);
		System.out.println("aaa.a2 : " + a2);
		
		model.addAttribute("args", args);*/
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		Object [] args = {age, name};
		model.addAttribute("args", args);
		
		return "message/result";
	}

}
