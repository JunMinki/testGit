package kr.co.softsoldesk.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor2 implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	//컨트롤러의 메서드가 호출되기 전 호출
	//false를 반환하면 요청 처리에 대한 진행 중단
		System.out.println("TestInterceptor2 - prehandle");

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	//컨트롤러의 메서드가 호출된 후 호출
		System.out.println("TestInterceptor2 - posthandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	//view 처리까지 완료 후 호출
		System.out.println("TestInterceptor2 - afterCompletion");
	}

}
