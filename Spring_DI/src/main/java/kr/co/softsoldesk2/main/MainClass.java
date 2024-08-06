package kr.co.softsoldesk2.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk2.beans.TestBean1;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk2/config/beans.xml");
		
		//#1
		TestBean1 t1 = ctx.getBean("test1", TestBean1.class);
		System.out.println("t1 : " + t1);
		TestBean1 t2 = ctx.getBean("test1", TestBean1.class);
		System.out.println("t2 : " + t2);
		
		System.out.println("===============================================");
		
		//#2
		TestBean1 t3 = ctx.getBean("test2", TestBean1.class);
		System.out.println("t3 : " + t3);
		TestBean1 t4 = ctx.getBean("test2", TestBean1.class);
		System.out.println("t4 : " + t4);
		
		System.out.println("===============================================");
		
		//#3
		TestBean1 t5 = ctx.getBean("test3", TestBean1.class);
		System.out.println("t5 : " + t5);
		TestBean1 t6 = ctx.getBean("test3", TestBean1.class);
		System.out.println("t6 : " + t6);
		
		System.out.println("===============================================");
		
	}

}

