package kr.co.softsoldesk.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;

@Controller
public class TestController {
	
	@Autowired
	DataBean bean1;
	
	@Autowired
	DataBean2 bean2;
	
	@Resource(name = "bean3")//이름을 통한 주입
	DataBean3 bean3;
	
	@Autowired
	DataBean4 bean4;
	
	@GetMapping("/test1")
	public String test1() {
		
		bean1.setData1("문자열1");
		bean1.setData2("문자열2");
		
		bean2.setData3("문자열3");
		bean2.setData4("문자열4");
		
		bean3.setData5("문자열5");
		bean3.setData6("문자열5");
		
		bean4.setData7("문자열7");
		bean4.setData8("문자열8");
		
		return "redirect:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		
		model.addAttribute("bean1", bean1);
		model.addAttribute("bean2", bean2);
		model.addAttribute("bean3", bean3);
		model.addAttribute("bean4", bean4);
		
		return "result1";
	}
	
}
