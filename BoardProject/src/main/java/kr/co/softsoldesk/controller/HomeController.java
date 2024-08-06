package kr.co.softsoldesk.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.softsoldesk.beans.UserBean;

@Controller
public class HomeController {
	
	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)//최초의 요청이 있을때 수행되는 메서드
	public String home() {
		
		System.out.println(loginUserBean);
		
		return "redirect:/main";
	}
}
//인덱스로 보내는 최초의 컨트롤러