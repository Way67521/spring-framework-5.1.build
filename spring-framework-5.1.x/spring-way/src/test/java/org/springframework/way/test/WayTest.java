package org.springframework.way.test;

import junit.textui.TestRunner;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.way.config.WayConfig;
import org.springframework.way.service.PrototypeService;
import org.springframework.way.service.SingletonService;

public class WayTest extends TestRunner {




	@Test
	public void wayTest(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(WayConfig.class);
//		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//		genericBeanDefinition.setBeanClass(SingletonService.class);
//		applicationContext.registerBeanDefinition("singletonService",genericBeanDefinition);

		applicationContext.refresh();
		SingletonService singletonService = (SingletonService) applicationContext.getBean("singletonService");
		singletonService.test();

	}
}
