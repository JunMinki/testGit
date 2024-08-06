package kr.co.softsoldesk02.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBeans1 {
	
	public void method1() {
		System.out.println("TestBean1의 method1()");
	}
	public void method2() {
		System.out.println("TestBean1의 method2()");
	}
	public int method3() {
		System.out.println("TestBean1의 method3()");
		int result = 10;
		
		return result;
	}
	public int method4() throws Exception {
		System.out.println("TestBean1의 method4()");
		int result = 10/0;
		
		return result;
	}

	
}
