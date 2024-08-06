package kr.co.softsoldesk.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.softsoldesk.beans.UserBean;
import kr.co.softsoldesk.interceptor.CheckLoginInterceptor;
import kr.co.softsoldesk.interceptor.CheckWriterInterceptor;
import kr.co.softsoldesk.interceptor.TopMenuInterceptor;
import kr.co.softsoldesk.service.BoardService;
import kr.co.softsoldesk.service.TopMenuService;

@Configuration
@EnableWebMvc
@ComponentScan("kr.co.softsoldesk.controller")
public class ServletAppContext implements WebMvcConfigurer{
//WebMvcConfigurer: Spring MVC 프로젝트 설정 인터페이스
	
	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;
	
	@Autowired
	TopMenuService topMenuService;
	
	@Autowired
	private BoardService boardService;
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	//Controller의 메서드가 반환하는 jsp 이름 앞 뒤에 경로와 확장자를 붙여주도록 설정
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	//정적 파일 경로 매핑
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/resources/");
	}

	//인터셉터 등록
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		WebMvcConfigurer.super.addInterceptors(registry);
		
		TopMenuInterceptor topMenuInterceptor = new TopMenuInterceptor(topMenuService, loginUserBean);
		InterceptorRegistration reg1 = registry.addInterceptor(topMenuInterceptor);
		reg1.addPathPatterns("/**");//모든 요청 주소에 동작
		
		CheckLoginInterceptor checkLoginInterceptor = new CheckLoginInterceptor(loginUserBean);
		InterceptorRegistration reg2 = registry.addInterceptor(checkLoginInterceptor);
		reg2.addPathPatterns("/user/modify", "/user/logout", "/board/*");//회원이 아닌 유저가 사용시엔 인터셉터에서 notlogin.jsp로 보내겠다는 뜻
		reg2.excludePathPatterns("/board/main");//게시판 메인만 사용 할 수 있도록 예외처리
		
		CheckWriterInterceptor checkUserInterceptor = new CheckWriterInterceptor(loginUserBean, boardService);
		InterceptorRegistration reg3 = registry.addInterceptor(checkUserInterceptor);
		reg3.addPathPatterns("/board/modify"); 
		
	}
	
	//에러 등록
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		
		return new PropertySourcesPlaceholderConfigurer();
	}//프로퍼티 파일 로딩
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		
		ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
		res.setBasename("/WEB-INF/properties/error_message");
		
		return res;
	}
	
	//파일 업로드 처리 클래스
	@Bean
	public StandardServletMultipartResolver multipartResolver() {
		
		return new StandardServletMultipartResolver();
	}
}
