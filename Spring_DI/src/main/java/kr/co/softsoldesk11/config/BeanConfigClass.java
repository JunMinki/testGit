package kr.co.softsoldesk11.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk11.beans.DataBean1;
import kr.co.softsoldesk11.beans.DataBean2;
import kr.co.softsoldesk11.beans.DataBean3;
import kr.co.softsoldesk11.beans.TestBean1;
import kr.co.softsoldesk11.beans.TestBean2;
import kr.co.softsoldesk11.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	// 생성자를 통한 주입
	@Bean
	public TestBean1 java1() {
		return new TestBean1(100, "문자열1", new DataBean1());
	}
	
	// setter로 주입
	@Bean
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		t1.setData1(200);
		t1.setData2("문자열2");
		t1.setData3(new DataBean1());
		return t1;
	}
	
	// autowire = "byName"
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	@Bean(name = "data1")
	public DataBean2 data1() {
		return new DataBean2();
	}

	@Bean(name = "data2")
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	//#4 autowire = "byType"
	@Bean(autowire = Autowire.BY_TYPE)
	public TestBean3 java4() {
		return new TestBean3();
	}
	
	@Bean
	public DataBean3 data() {
		return new DataBean3();
	}
}
