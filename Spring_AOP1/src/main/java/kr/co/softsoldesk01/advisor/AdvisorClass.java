package kr.co.softsoldesk01.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdvisorClass {
	
	@Around("execution(* borrowBook())")
	public Object recordMethod(ProceedingJoinPoint pjp) throws Throwable {
		
		Object obj = pjp.proceed();
		System.out.println("기록남김");
		
		return obj;
		
	}
	
}
