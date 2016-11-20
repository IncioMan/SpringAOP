package it.alex_incerti.spring_aop_test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnnotationAspect {

	@Pointcut("execution(public * getAdvanced*(..))")
	private void getAdvancedExecution() {
	}

	@Before("getAdvancedExecution() && @target(it.alex_incerti.spring_aop_test.annotation.ValidUserRequested)")
	public void checkUser() {
		System.out.println("checking user");
	}
}
