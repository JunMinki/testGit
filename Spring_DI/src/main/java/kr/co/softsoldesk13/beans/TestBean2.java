package kr.co.softsoldesk13.beans;

import javax.annotation.PostConstruct;

public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TsetBean2의 생성자");
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("TestBean2의 init");
	}
	
	public void destroy() {
		System.out.println("TestBean2의 destroy");
	}

}
