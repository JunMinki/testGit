package kr.co.softsoldesk14.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk14.beans.TestBean1;
import kr.co.softsoldesk14.beans.TestBean2;
import kr.co.softsoldesk14.beans2.TestBean3;
import kr.co.softsoldesk14.beans2.TestBean4;
import kr.co.softsoldesk14.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
	      
		  ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk14/config/beans.xml");
	      
	      System.out.println("-------------------------------");
	      //type으로 가져오기
	      TestBean1 xml1 = ctx1.getBean(TestBean1.class);
	      System.out.printf("xml1 : %s\n", xml1);
	      //xml2라는  id사용로 가져오기
	      TestBean2 xml2 = ctx1.getBean("xml2", TestBean2.class);
	      System.out.printf("xml2 : %s\n", xml2);
	      //xml3라는  id사용로 가져오기
	      TestBean2 xml3 = ctx1.getBean("xml3", TestBean2.class);
	      System.out.printf("xml3 : %s\n", xml3);
	      
	      System.out.println("-------------------------------");
	      //component 로 분석하여 가져오기
	      TestBean3 xml4 = ctx1.getBean(TestBean3.class);
	      System.out.printf("xml4 : %s\n", xml4);
	      //bean4라는 이름으로 가져오기
	      TestBean4 xml5 = ctx1.getBean("java4", TestBean4.class);
	      System.out.printf("xml5 : %s\n", xml5);
	      
	      //여러개를 지정할 경우 id사용
	      TestBean4 xml100 = ctx1.getBean("xml100", TestBean4.class);
	      System.out.printf("xml100 : %s\n", xml100);
	      //여러개를 지정할 경우 id사용
	      TestBean4 xml200 = ctx1.getBean("xml200", TestBean4.class);
	      System.out.printf("xml200 : %s\n", xml200);
	      
	      ctx1.close();
	      
	      System.out.println("============================================");
		
	}

}
