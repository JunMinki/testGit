package kr.co.softsoldesk13.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.softsoldesk13.beans.DataBean1;
import kr.co.softsoldesk13.beans.DataBean2;
import kr.co.softsoldesk13.beans.TestBean1;
import kr.co.softsoldesk13.beans.TestBean2;
import kr.co.softsoldesk13.beans.TestBean3;
import kr.co.softsoldesk13.beans.TestBean4;
import kr.co.softsoldesk13.beans.TestBean5;

@Configuration
public class BeanConfigClass {
	
	@Bean
	@Lazy
	public TestBean1 obj1() {
		return new TestBean1();
	}
	
	@Bean
	@Lazy
	public TestBean2 obj2() {
		return new TestBean2();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	@Lazy
	public TestBean3 obj3() {
		return new TestBean3();
	}
	
	@Bean
	@Lazy
	public TestBean4 obj4() {
		return new TestBean4();
	}
	
	@Bean
	@Lazy
	public TestBean5 obj5() {
		return new TestBean5();
	}
	
	@Bean
	public DataBean1 data1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
}
