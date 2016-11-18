package it.alex_incerti.spring_aop_test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

import it.alex_incerti.spring_aop_test.aop.beans.BeanDummy;

@Aspect
public class LoggingAspect {

	@Autowired
	private BeanDummy bean;

	@Pointcut("execution(* getMapping(..))")
	private void getMappingExecution() {
	}

	@Pointcut("execution(* send*(..))")
	private void sendMethodExecution() {
	}

	@Before("getMappingExecution()")
	public void logGetMapping() {
		System.out.println("Get call received");
		bean.printHello();
	}

	@Before("execution(* send*(..)) && args(name, ..)")
	public void mathodWithUpdate(String name) {
		System.out.println("Update: " + name);
	}
}
