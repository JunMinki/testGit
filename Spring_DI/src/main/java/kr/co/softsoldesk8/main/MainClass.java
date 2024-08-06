package kr.co.softsoldesk8.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk8.beans.TestBean1;
import kr.co.softsoldesk8.beans.TestBean2;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk8/config/beans.xml");
		
		//#1 setter 주입을 통한 일반 객체 주입
		TestBean1 obj1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("obj1.data1 : " + obj1.getData1());
		System.out.println("obj1.data1 : " + obj1.getData1());
		System.out.println("obj1.data2 : " + obj1.getData2());
		
		System.out.println("-----------------------------------------------------------------");
		
		//#2 byName 주입을 통한 일반 객체 주입
		TestBean1 obj2 = ctx.getBean("obj2", TestBean1.class);
		System.out.println("obj2.data1 : " + obj2.getData1());
		System.out.println("obj2.data2 : " + obj2.getData2());
		
		System.out.println("-----------------------------------------------------------------");
		
		//#3 byType 주입을 통한 일반 객체 주입
		TestBean1 obj3 = ctx.getBean("obj3", TestBean1.class);
		System.out.println("obj3.data1 : " + obj3.getData1());
		System.out.println("obj3.data2 : " + obj3.getData2());
		
		System.out.println("-----------------------------------------------------------------");
		
		//#4 생성자를 통한 주입
		TestBean2 obj4 = ctx.getBean("obj4", TestBean2.class);
		System.out.println("obj4.data1 : " + obj4.getData1());
		System.out.println("obj4.data2 : " + obj4.getData2());
		System.out.println("obj4.data3 : " + obj4.getData3());
		System.out.println("obj4.data4 : " + obj4.getData4());
		
		System.out.println("-----------------------------------------------------------------");
		
		//#5 생성자를 통한 주입
		TestBean2 obj5 = ctx.getBean("obj5", TestBean2.class);
		System.out.println("obj5.data1 : " + obj5.getData1());
		System.out.println("obj5.data2 : " + obj5.getData2());
		System.out.println("obj5.data3 : " + obj5.getData3());
		System.out.println("obj5.data4 : " + obj5.getData4());		
		
		System.out.println("-----------------------------------------------------------------");
		
		//#6 생성자를 통한 주입
		TestBean2 obj6 = ctx.getBean("obj6", TestBean2.class);
		System.out.println("obj5.data6 : " + obj6.getData1());
		System.out.println("obj5.data6 : " + obj6.getData2());
		System.out.println("obj5.data6 : " + obj6.getData3());
		System.out.println("obj5.data6 : " + obj6.getData4());
		
		ctx.close();
	}
	
}
