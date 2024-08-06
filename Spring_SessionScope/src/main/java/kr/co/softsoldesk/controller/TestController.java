package kr.co.softsoldesk.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softsoldesk.beans.DataBean;

@Controller
//@SessionAttributes({"sessionBean"})
public class TestController {
	
//	session은 보통 로그인이나 장바구니처럼 정보를 다른 페이지로 갈 때 마다
//	다른 페이지로도 정보를 끌고 나가야 할 때 사용합니다.
//	새로운 요청이 들어와도 정보를 보존해야 할 때 사용합니다.
	@GetMapping("/test1")
	public String test1(HttpSession session) {
		session.setAttribute("data1", "문자열1");
		return "redirect:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpSession session) {
		String data1 = (String) session.getAttribute("data1");
		System.out.println("data1 : " + data1);
		return "result1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpSession session) {
		session.setAttribute("data2", "문자열2");
		return "forward:/result2";
	}
	
	@GetMapping("/result2")
	public String result2(HttpSession session) {
		String data2 = (String) session.getAttribute("data2");
		System.out.println("data2 : " + data2);
		return "result2";
	}
	
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mv, HttpSession session) {
		
		session.setAttribute("data3", "문자열3");
		mv.setViewName("forward:/result3");
		
		return mv;
	}
	
	@GetMapping("/result3")
	public String result3(HttpSession session) {
		String data3 = (String) session.getAttribute("data3");
		System.out.println("data3 : " + data3);
		return "result3";
	}
	
	@GetMapping("/test4")
	public String test4(HttpSession session) {
		
		DataBean bean = new DataBean();
		bean.setData1("문자열4");
		bean.setData2("문자열5");
		
		session.setAttribute("bean", bean);
		
		return "redirect:/result4";
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		
		return "result4";
		
	}
//	
//	@GetMapping("/test5")
//	public String test5(@ModelAttribute("SessionBean") DataBean bean) {
//		
//		bean.setData1("문자열6");
//		bean.setData2("문자열7");
//		
//		return "redirect:/result5";
//	}
//	
//	@GetMapping("/result5")
//	public String result5(HttpServletRequest request) {
//		
//		return "result5";
//		
//	}
//	
}
