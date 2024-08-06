package kr.co.softsoldesk.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		request.setAttribute("data1", "문자열1");
		return "redirect:/result1";
	}
	
	@GetMapping("/result1")//redirect로 출력했기 때문에 data1에 들어간 값이 모두 초기화됨 -> data:null로 표기됨 (새로운 요청)
	public String result1(HttpServletRequest request) {
		String data1 = (String) request.getAttribute("data1");
		System.out.println("data1 : " + data1);
		return "result1";
	}
	
	@GetMapping("/test2")//forward방식으로 출력했기 때문에 정상적으로 data2 : 문자열2 라고 출력이 됨 (요청 유지)
	public String test2(HttpServletRequest request) {
		request.setAttribute("data2", "문자열2");
		return "forward:/result2";
	}
	
	@GetMapping("/result2")
	public String result2(HttpServletRequest request) {
		String data2 = (String) request.getAttribute("data2");
		System.out.println("data2 : " + data2);
		return "result2";
	}
	
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mv) {
		
		mv.addObject("data3", "문자열3");
		mv.setViewName("forward:/result3");
		
		return mv;
	}
	
	@GetMapping("/result3")
	public String result3(HttpServletRequest request) {
		String data3 = (String) request.getAttribute("data3");
		System.out.println("data3 : " + data3);
		return "result3";
	}
	
	@GetMapping("/test4")
	public String test4(Model model) {
		
		DataBean bean = new DataBean();
		bean.setData1("문자열4");
		bean.setData2("문자열5");
		
		model.addAttribute("bean", bean);
		
		return "forward:/result4";
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		
		DataBean bean = (DataBean) request.getAttribute("bean");
		
		return "result4";
		
	}
	
	@GetMapping("/test5")
	public String test5(@ModelAttribute DataBean bean) {
		
		bean.setData1("문자열6");
		bean.setData2("문자열7");
		
		return "forward:/result5";
	}
	
	@GetMapping("/result5")
	public String result5(HttpServletRequest request) {
		
		return "result5";
		
	}
	
}
