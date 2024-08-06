package kr.co.softsoldesk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.softsoldesk.model.Test2Service;


@WebServlet("*.mvc")
//.mvc가 붙은 값들을 모두 이쪽으로 가져온다.
public class HomeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Test2Service service = new Test2Service();
		
		String url = request.getRequestURI();
		System.out.println(url);
		
		String viewName = null;
		
		if(url.contains("main.mvc")) {
			viewName = "main.jsp";
		} else if(url.contains("test1")) {
			System.out.println("test1 요청");
			String str1 = request.getParameter("data1");
			String str2 = request.getParameter("data2");
			
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			int result = num1 + num2;
			
			request.setAttribute("result", result);
			viewName = "test1.jsp";
		} else if (url.contains("test2")) {
			int result = service.minus(request);
			request.setAttribute("result", result);
			viewName = "test2.jsp";
		}
		
		RequestDispatcher dis = request.getRequestDispatcher(viewName);
		dis.forward(request, response);
		
	//response.sendRedirect(viewName);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
