package kr.co.softsoldesk13.beans;

public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TsetBean1의 생성자");
		
	}
	
	public void init() {
		System.out.println("TestBean1의 init");
	}
	
	public void destroy() {
		System.out.println("TestBean1의 destroy");
	}

}
