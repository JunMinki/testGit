package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.UserDataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(@ModelAttribute("bean") UserDataBean bean) {
		
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("12345");
		bean.setUser_postcode("55555");
		bean.setUser_address1("주소 1번");
		bean.setUser_address2("주소 2번");
		
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(@ModelAttribute("bean") UserDataBean bean) {
		
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("12345");
		bean.setUser_postcode("55555");
		bean.setUser_address1("주소 1번");
		bean.setUser_address2("주소 2번");
		
		return "test2";
	}
	
	@PostMapping("/result")
	public String result(@ModelAttribute("bean") UserDataBean bean) {
		
		System.out.println(bean.getUser_name());
		System.out.println(bean.getUser_id());
		System.out.println(bean.getUser_pw());
		System.out.println(bean.getUser_postcode());
		System.out.println(bean.getUser_address1());
		System.out.println(bean.getUser_address2());
		
		return "result";
	}
	
}
