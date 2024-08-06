package kr.co.softsoldesk02.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk02.beans.TestBeans1;
import kr.co.softsoldesk02.config.BeansConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfigClass.class);
		
		TestBeans1 java1 = ctx.getBean(TestBeans1.class);
		java1.method1();
		System.out.println("------------------------------");
		java1.method2();
		System.out.println("------------------------------");
		System.out.println(java1.method3());
		System.out.println("------------------------------");
		try {
			System.out.println(java1.method4());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ctx.close();
		
	}
	
}
