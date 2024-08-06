package kr.co.softsoldesk9.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk9.beans.BeanConfigClass;
import kr.co.softsoldesk9.beans.TestBean1;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("============XML============");
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk9/config/beans.xml");
		
		TestBean1 xml1 = ctx1.getBean("xml1", TestBean1.class);
		System.out.println(xml1);
		
		TestBean1 xml2 = ctx1.getBean("xml2", TestBean1.class);
		System.out.println(xml2);
		
		TestBean1 xml3 = ctx1.getBean("xml3", TestBean1.class);
		System.out.println(xml3);		
		
		TestBean1 xml31 = ctx1.getBean("xml3", TestBean1.class);
		System.out.println(xml31);
		
		ctx1.close();
		
		System.out.println("===========JAVA============");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
		System.out.println("java1 : " + java1);

		TestBean1 java11 = ctx2.getBean("java1", TestBean1.class);
		System.out.println("java1 : " + java11);
		
		TestBean1 java10 = ctx2.getBean("java100", TestBean1.class);
		System.out.println("java10 : " + java10);

		TestBean1 java2 = ctx2.getBean("java2", TestBean1.class);
		System.out.println("java2 : " + java2);
		
		TestBean1 java3 = ctx2.getBean("java3", TestBean1.class);
		System.out.println("java3 : " + java3);
		
		TestBean1 java31 = ctx2.getBean("java3", TestBean1.class);
		System.out.println("java31 : " + java31);
		
		ctx2.close();
		
	}

}
