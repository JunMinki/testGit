package kr.co.softsoldesk01.main;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk01.beans.Library;
import kr.co.softsoldesk01.beans.Member;
import kr.co.softsoldesk01.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Library lib = ctx.getBean(Library.class);
		Member mem = ctx.getBean(Member.class);
		
		lib.borrowBook();
		mem.borrowBook();
		
		ctx.close();
		
	}
	
}
