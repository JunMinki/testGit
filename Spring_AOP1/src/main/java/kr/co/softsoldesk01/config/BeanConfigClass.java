package kr.co.softsoldesk01.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"kr.co.softsoldesk01.beans", "kr.co.softsoldesk01.advisor"})
@EnableAspectJAutoProxy
public class BeanConfigClass {
	
	

}
