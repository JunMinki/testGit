package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub2")
public class sub2Controller {
	
	@RequestMapping(value= "/test5", method = RequestMethod.GET)
	public String sub2test5() {
		return "sub2/test5";
		
	}
	@RequestMapping(value= "/test6", method = RequestMethod.GET)
	public String sub2test6() {
		return "sub2/test6";
	}
	
}
