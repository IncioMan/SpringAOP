package it.alex_incerti.spring_aop_test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationAspect {

	@Before("@target (it.alex_incerti.spring_aop_test.annotation.ValidUserRequested)")
	public void checkUser() {
		System.out.println("checking user");
	}
}
