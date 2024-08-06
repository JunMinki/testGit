package kr.co.softsoldesk13.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk13.beans.TestBean3;
import kr.co.softsoldesk13.beans.TestBean4;
import kr.co.softsoldesk13.beans.TestBean5;
import kr.co.softsoldesk13.beans.TestBean1;
import kr.co.softsoldesk13.beans.TestBean2;
import kr.co.softsoldesk13.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//일반적인 init, destroy 메서드 호출
		TestBean1 obj1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("--------------------------------");
		
		//@PostConstruct, PreDestroy를 이용한 init, destroy 메서드 호출
		TestBean2 obj2 = ctx.getBean("obj2", TestBean2.class);
		System.out.println("--------------------------------");
		
		//AutoWire.BY_NAME을 이용한 자동 주입
		TestBean3 obj3 = ctx.getBean("obj3", TestBean3.class);
		System.out.println(obj3.getData1());
		System.out.println(obj3.getData2());
		System.out.println("--------------------------------");
		
		//AutoWire Qulifier를 이용한 자동 주입
		TestBean4 obj4 = ctx.getBean("obj4", TestBean4.class);
		System.out.println(obj4.getData1());
		System.out.println(obj4.getData2());
		System.out.println("--------------------------------");
		
		//AutoWire Qulifier를 이용한 자동 주입
		TestBean5 obj5 = ctx.getBean("obj5", TestBean5.class);
		System.out.println(obj5.getData1());
		System.out.println(obj5.getData2());
		System.out.println("--------------------------------");
		
		ctx.close();
		
	}
	
}
