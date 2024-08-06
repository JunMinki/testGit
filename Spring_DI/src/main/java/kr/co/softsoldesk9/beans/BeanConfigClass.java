package kr.co.softsoldesk9.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration

public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean(name="java100")
	public TestBean1 java10() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	@Lazy
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}//lazy-init: 객체 생성은 컨테이너가 생서오디는 시점이 아닌 getBean으로 bean을 가져올 때

	@Bean
	@Scope("prototype")
	public TestBean1 java3() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}//Scope("prototype"): 객체 생성시 싱글톤이 아닌 다른 객체 생성
	
}
