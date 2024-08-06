package kr.co.softsoldesk02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"kr.co.softsoldesk02.advisor", "kr.co.softsoldesk02.beans"})
@EnableAspectJAutoProxy
public class BeansConfigClass {

}
