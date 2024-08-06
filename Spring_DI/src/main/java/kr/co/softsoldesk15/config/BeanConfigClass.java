package kr.co.softsoldesk15.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk15.beans.DataBean3;

@Configuration
@ComponentScan(basePackages = "kr.co.softsoldesk15.beans")
public class BeanConfigClass {
	
	@Bean
	public DataBean3 obj4() {
		return new DataBean3();
	}
	@Bean
	public DataBean3 obj5() {
		return new DataBean3();
	}
}
