package kr.co.softsoldesk3.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk3.beans.TestBean1;
import kr.co.softsoldesk3.beans.TestBean2;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk3/config/beans.xml");
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("t1 : " + t1);		
		TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("t2 : " + t2);
		
		ctx.close();
		
	}
	
}
