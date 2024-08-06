package sofsoldesk3.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sofsoldesk3.beans.HelloWorld;
import sofsoldesk3.beans.TV;

public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("sofsoldesk3/config/beans.xml");

		HelloWorld hello1 = (HelloWorld) ctx.getBean("hello");
		hello1.sayHello();
		
		TV tv1 = (TV) ctx.getBean("tv1");
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeDown();
		
		ctx.close();//컨테이너 종료
		
	}

}
