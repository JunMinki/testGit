package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;

@Configuration
@ComponentScan("kr.co.softsoldesk.beans")
public class RootAppContext {
//프로젝트 작업 시 사용할 bean을 관리하는 클래스
	
	@Bean
	public DataBean dataBean1() {
		return new DataBean();
	}
	
	@Bean
	@RequestScope//새로운 요청이 발생되면 호출
	public DataBean2 dataBean2() {
		return new DataBean2();
	}
	
	@Bean("bean3")
	@RequestScope
	public DataBean3 dataBean3() {
		return new DataBean3();
	}
	
}
