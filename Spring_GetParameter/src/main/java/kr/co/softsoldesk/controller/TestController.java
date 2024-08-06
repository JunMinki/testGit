package kr.co.softsoldesk.controller;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {

		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3[] = request.getParameterValues("data3");

		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);

		for (String str : data3) {
			System.out.println("data3 : " + str);
		}

		return "result";
	}

	@PostMapping("/test2")
	public String test2(HttpServletRequest request) {

		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3[] = request.getParameterValues("data3");

		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		if (data3 != null) {
			for (String str : data3) {
				System.out.println("data3 : " + str);
			}
		}
		return "result";
	}
	//URL 경로의 일부를 변수로 받아서 처리
	@GetMapping("/test3/{data1}/{data2}/{data3}")
	public String test3(@PathVariable int data1, @PathVariable int data2, @PathVariable int data3) {
	//@PathVariable로 인해서 자동으로 변환되어서 입력됨
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(@RequestParam int data1, @RequestParam int data2, @RequestParam int[] data3) {
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		for(int data :data3) {
			System.out.println("data3 : " + data);
		}
		
		return "result";
	}

	@GetMapping("/test5")
	public String test5(@RequestParam(value="data1") int value1, @RequestParam(value="data2") int value2, @RequestParam(value="data3") int[] value3) {
		
		System.out.println("data1 : " + value1);
		System.out.println("data2 : " + value2);
		
		for(int value : value3) {
			System.out.println("data3 : " + value);
		}
		
		return "result";
	}
	
	@GetMapping("/test6")
	public String test6(@RequestParam int data1, @RequestParam(required = false) String data2, @RequestParam(defaultValue = "0") int[] data3) {
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		for(int value : data3) {
			System.out.println("data3 : " + value);
		}
		
		return "result";
	}
	
	// get방식 => 검색/게시글생성 (url에 정보가 기입되어있음)
	// post방식 => 회원가입 (url에 정보가 담기지 않음)

}
