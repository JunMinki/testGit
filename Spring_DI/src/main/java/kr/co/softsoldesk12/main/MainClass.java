package kr.co.softsoldesk12.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk12.beans.TestBean1;
import kr.co.softsoldesk12.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("===============JAVA===============");
		
		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx1.getBean("java1", TestBean1.class);
		//#1 autowired
		System.out.println(java1.getData1());
		
		//#2 autowired, qulifier
		System.out.println(java1.getData2());

		System.out.println("===============XML===============");
		
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("kr/co/softsoldesk12/config/beans.xml");
		
		TestBean1 xml1 = ctx2.getBean("xml1", TestBean1.class);
		//#1 autowired
		System.out.println(xml1.getData1());
		
		//#2 autowired, qulifier
		System.out.println(xml1.getData2());
	}
	
}
