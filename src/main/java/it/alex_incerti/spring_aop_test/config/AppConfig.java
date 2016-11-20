package it.alex_incerti.spring_aop_test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

import it.alex_incerti.spring_aop_test.aop.AnnotationAspect;
import it.alex_incerti.spring_aop_test.aop.LoggingAspect;

@Configuration
@Import(PropertySourcePlaceHolderConfig.class)
@ComponentScan(basePackages = "it.alex_incerti.spring_aop_test")
@EnableScheduling
@EnableAspectJAutoProxy
public class AppConfig {
	// @Autowired
	// private ApplicationContext appContext;

	// @Bean
	// public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
	// BeanNameAutoProxyCreator beanNameAutoProxyCreator = new
	// BeanNameAutoProxyCreator();
	// String[] botManagerBeans =
	// appContext.getBeanNamesForAnnotation(BotManager.class);
	// beanNameAutoProxyCreator.setBeanNames(botManagerBeans);
	// beanNameAutoProxyCreator.setProxyTargetClass(true);
	// beanNameAutoProxyCreator.setInterceptorNames("access-policy-interceptor",
	// "valid-user-interceptor");
	// return beanNameAutoProxyCreator;
	// }

	// @Bean(name = "access-policy-interceptor")
	// public AccessPolicyInterceptor getAccessPolicyInterceptor() {
	// return new AccessPolicyInterceptor();
	// }
	//
	// @Bean(name = "valid-user-interceptor")
	// public ValidUserInterceptor getValidUserInterceptor() {
	// return new ValidUserInterceptor();
	// }

	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}

	@Bean
	public AnnotationAspect annotationAspect() {
		return new AnnotationAspect();
	}
}
