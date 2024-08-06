package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.softsoldesk.Interceptor.TestInterceptor1;
import kr.co.softsoldesk.Interceptor.TestInterceptor2;
import kr.co.softsoldesk.Interceptor.TestInterceptor3;
import kr.co.softsoldesk.Interceptor.TestInterceptor4;
import kr.co.softsoldesk.Interceptor.TestInterceptor5;

@Configuration
@EnableWebMvc
@ComponentScan("kr.co.softsoldesk.controller")
public class ServletAppContext implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		//Controller의 메서드가 반환하는 jsp의 이름 앞 뒤에 경로와 확장자를 붙여주는 메서드
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/resources/");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	//인터셉터 등록
		WebMvcConfigurer.super.addInterceptors(registry);
		//인터셉터 객체 생성
		TestInterceptor1 inter1 = new TestInterceptor1();
		TestInterceptor2 inter2 = new TestInterceptor2();
		TestInterceptor3 inter3 = new TestInterceptor3();
		TestInterceptor4 inter4 = new TestInterceptor4();
		TestInterceptor5 inter5 = new TestInterceptor5();
		
		//인터셉터 등록
		InterceptorRegistration reg1 = registry.addInterceptor(inter1);
		InterceptorRegistration reg2 = registry.addInterceptor(inter2);
		InterceptorRegistration reg3 = registry.addInterceptor(inter3);
		InterceptorRegistration reg4 = registry.addInterceptor(inter4);
		InterceptorRegistration reg5 = registry.addInterceptor(inter5);
		
		//관심사 등록
		reg1.addPathPatterns("/test1");
		reg2.addPathPatterns("/test1");
		reg3.addPathPatterns("/test1", "/test2");
		reg4.addPathPatterns("/*");//최초 요청 / ("/**")모든 요청
		reg5.addPathPatterns("/sub1/*");
	}
	
	
}
