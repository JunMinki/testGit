package kr.co.softsoldesk6.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk6.bean.TestBean;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk6/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.println("t1.data1" + t1.getData1());
		System.out.println("t1.data2" + t1.getData2());
		System.out.println("t1.data3" + t1.isData3());
		System.out.println("t1.data4" + t1.getData4());
		System.out.println("t1.data5" + t1.getData5());
		System.out.println("t1.data6" + t1.getData6());
		
		ctx.close();
		
	}

}
