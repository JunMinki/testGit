package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(DataBean bean) {
		
		bean.setA1("text");
		bean.setA2("내 이름");
		bean.setA3("password");
		bean.setA4("아무 말이나 쓰세요");
		
		return "test1";
		
	}
	
}
