package kr.co.softsoldesk1.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softsoldesk1.bean.TestBean;
import kr.co.softsoldesk11.beans.TestBean1;

public class MainClass {
	
	public static void main(String[] args) {
		
		test1();
		//test2();
		
	}
	
	public static void test1() {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk1/config/beans.xml");
		//스프링컨테이너 생성 시점에 객체 생성
		
		TestBean t1 = (TestBean) ctx.getBean("t1");
		TestBean t2 = (TestBean) ctx.getBean("t2");
		
		System.out.println(t1);
		System.out.println(t2);
		//싱글톤
		
	}
	public static void test2() {
		
		//FileSystemResource res = new FileSystemResource("beans.xml");//패키지 외부
		ClassPathResource res = new ClassPathResource("kr/co/softsoldesk1/config/beans.xml");//패키지 내부
		XmlBeanFactory factory = new XmlBeanFactory(res);
		TestBean t1 = factory.getBean("t1", TestBean.class);//getBean에 의해 객체를 가져올 때 객체가 생성
		TestBean t2 = factory.getBean("t2", TestBean.class);
	}
}
