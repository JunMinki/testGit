package kr.co.softsoldesk.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import kr.co.softsoldesk.beans.UserBean;

public class CheckLoginInterceptor implements HandlerInterceptor{
	
	//로그인 여부를 판단하는 UserBean
	private UserBean loginUserBean;
	
	public CheckLoginInterceptor(UserBean loginUserBean) {
		
		this.loginUserBean = loginUserBean;
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(loginUserBean.isUserLogin()==false) {
			String contextPath = request.getContextPath();//루트 경로
			response.sendRedirect(contextPath +"/user/not_login");
			return false;
		}
		
		return true;//로그인 상태
	}
	
	
	
}
