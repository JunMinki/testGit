package kr.co.softsoldesk10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.softsoldesk10.beans.TestBean;

@Configuration
public class BeanConfigClass {
	
	@Bean(initMethod = "init", destroyMethod = "destory")
	@Lazy
	public TestBean java1() {
		
		return new TestBean();
		
	}
	
}
