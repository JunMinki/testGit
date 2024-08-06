package kr.co.softsoldesk10.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk10.beans.TestBean;
import kr.co.softsoldesk10.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk10/config/beans.xml");
		
		TestBean xml1 = ctx1.getBean("xml1", TestBean.class);
		
		ctx1.close();
		
		System.out.println("------------------------------------------");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean java1 = ctx2.getBean("java1", TestBean.class);
		
		ctx2.close();
		
	}

}
