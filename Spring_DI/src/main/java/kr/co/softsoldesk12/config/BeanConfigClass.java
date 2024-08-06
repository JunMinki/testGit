package kr.co.softsoldesk12.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk12.beans.DataBean1;
import kr.co.softsoldesk12.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	@Bean
	public DataBean1 data_bean2() {
		return new DataBean1();
	}
}
