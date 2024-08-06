package kr.co.softsoldesk14.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk14.beans.TestBean1;
import kr.co.softsoldesk14.beans.TestBean2;
import kr.co.softsoldesk14.beans2.TestBean4;

@Configuration
@ComponentScan(basePackages = "kr.co.softsoldesk14.beans2")
//지정된 패키지의 클래스들의 component 어노테이션을 분석하여 Bean으로 등록
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	//여러개 지정 시 컨테이너에 적재
	@Bean
	public TestBean4 java100() {
		return new TestBean4();
	}
	@Bean
	public TestBean4 java200() {
		return new TestBean4();
	}
	
	
}
