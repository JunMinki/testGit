package kr.co.softsoldesk.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
//	cookie란?
//			
//	브라우저(사용자)에게 데이터를 저장시키는 것을 의미합니다.
//	ex)	로그인 아이디비번저장, 사이트방문목록 등등

	@GetMapping("/save_cookie")
	public String save_cookie(HttpServletResponse response) {
		
		try {
			
			String data1 = URLEncoder.encode("문자열1", "utf-8");
			String data2 = URLEncoder.encode("문자열2", "utf-8");
			
			Cookie cookie1 = new Cookie("cookie1", data1);
			Cookie cookie2 = new Cookie("cookie2", data2);
			
			//쿠키의        수명  일 시간 분  초 
			cookie1.setMaxAge(365*24*60*60);
			cookie2.setMaxAge(365*24*60*60);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "save_cookie";
	}
	@GetMapping("/load_cookie")
	public String load_cookie(HttpServletRequest request) {
		
		try {
			
			Cookie [] cookies = request.getCookies();
			
			for(Cookie cookie : cookies) {
				String str = URLDecoder.decode(cookie.getValue(), "utf-8");
				
				System.out.println("cookie : " + str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "load_cookie";
	}

}
