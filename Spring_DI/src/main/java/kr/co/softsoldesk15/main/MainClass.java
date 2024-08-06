package kr.co.softsoldesk15.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk15.beans.TestBean1;
import kr.co.softsoldesk15.beans.TestBean2;
import kr.co.softsoldesk15.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 t1 = ctx.getBean(TestBean1.class);
		System.out.println("t1.data1 : " + t1.getData1());
		System.out.println("t1.data2 : " + t1.getData2());
		System.out.println("t1.data3 : " + t1.getData3());
		System.out.println("t1.data4 : " + t1.getData4());
		System.out.println("t1.data5 : " + t1.getData5());
		
		System.out.println("----------------------------");
		
		TestBean2 t2 = ctx.getBean(TestBean2.class);
		System.out.println("t2.data1 : " + t2.getData1());
		System.out.println("t2.data2 : " + t2.getData2());
		System.out.println("t2.data3 : " + t2.getData3());
		System.out.println("t2.data4 : " + t2.getData4());
		
	}
	
}
