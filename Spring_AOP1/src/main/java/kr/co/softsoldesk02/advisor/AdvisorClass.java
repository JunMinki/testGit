package kr.co.softsoldesk02.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdvisorClass {
	
	@Before("execution (* method1())")
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	@After("execution (* method1())")
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	@Around("execution (* method2())")
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 전 호출");
		Object result = pjp.proceed();
		System.out.println("aroundMethod 후 호출");
		
		return result;
	}
	
	@AfterReturning("execution (* method3())")
	//정상적인 호출이 될 때만 출력해줌
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	
	@AfterThrowing("execution (* method4())")
	//정상적인 호출이 될 때만 출력해줌
	public void afterThorwingMethod() {
		System.out.println("afterThorwingMethod 호출");
	}
	
}
