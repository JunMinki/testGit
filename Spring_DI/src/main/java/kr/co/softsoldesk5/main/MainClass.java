package kr.co.softsoldesk5.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk5.beans.DataBean;
import kr.co.softsoldesk5.beans.TV;
import kr.co.softsoldesk5.beans.TestBean;
import kr.co.softsoldesk5.beans.TestBean2;

public class MainClass {
	
	public static void main(String[] args) {
		
		//#1
		TestBean t1 = new TestBean();
		t1.printData();
		
		TestBean t2 = new TestBean(100);
		t2.printData();

		TestBean t3 = new TestBean(11.11);
		t3.printData();

		TestBean t4 = new TestBean("해위");
		t4.printData();
		
		TestBean t5 = new TestBean(200, 22.22, "2해위");
		t5.printData();
		/*
		TestBean t6 = new TestBean(33.33, 300, "3해위");
		t6.printData();
		*/
		System.out.println("----------------------------------------------------------------------------------------");
		//#2
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk5/config/beans.xml");
		
		//ctx로 선언된 bean.xm으로부터 obj~로 id값이 정해진 값들을 불러온다.
		
		TestBean obj1 = ctx.getBean("obj1", TestBean.class);
		obj1.printData();

		TestBean obj2 = ctx.getBean("obj2", TestBean.class);
		obj2.printData();
		
		TestBean obj3 = ctx.getBean("obj3", TestBean.class);
		obj3.printData();
		
		TestBean obj4 = ctx.getBean("obj4", TestBean.class);
		obj4.printData();
		
		TestBean obj5 = ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		
		TestBean obj6 = ctx.getBean("obj6", TestBean.class);
		obj6.printData();
		
		TestBean obj7 = ctx.getBean("obj7", TestBean.class);
		obj7.printData();
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		//#3
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		TestBean2 t100 = new TestBean2(d1, d2);
		t100.printData();
		/*
		하나의DataBean을 두개로 선언하여 각기 다른 값을 가지게 하고
		TestBean2에 그 두 값을 집어넣어 출력한다.
		*/
		System.out.println("----------------------------------------------------------------------------------------");
		
		TestBean2 obj8 = ctx.getBean("obj8", TestBean2.class);
		obj8.printData();
		
		TestBean2 obj9 = ctx.getBean("obj9", TestBean2.class);
		obj9.printData();

		System.out.println("----------------------------------------------------------------------------------------");
		
		TV tv = (TV) ctx.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		ctx.close();
	}
	
}
