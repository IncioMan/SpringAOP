package it.alex_incerti.spring_aop_test.aop.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanDummy {
	public void printHello() {
		System.out.println("Hello");
	}
}
