package kr.co.softsoldesk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@PropertySources({
	@PropertySource("/WEB-INF/properties/data1.properties"),
	@PropertySource("/WEB-INF/properties/data2.properties")
})
public class PropertiesController {
	
	@Value("${aaa.a1}")
	private int a1;
	
	@Value("${aaa.a2}")
	private String a2;
	
	@Value("${ccc.c1}")
	private int c1;
	
	@Value("${ccc.c2}")
	private String c2;
	
	@Value("${ddd.d1}")
	private int d1;
	
	@Value("${ddd.d2}")
	private String d2;
	
	@GetMapping("/properties")
	public String properties() {
		
		System.out.println("aaa.a1 : " + a1);
		System.out.println("aaa.a2 : " + a2);
		
		System.out.println("ccc.c1 : " + c1);
		System.out.println("ccc.c2 : " + c2);
		System.out.println("ddd.d1 : " + d1);
		System.out.println("ddd.d2 : " + d2);
		
		
		return "properties/result";// properties안에 있는 result.jsp로 리턴시킨다는 뜻
	}
	
}
