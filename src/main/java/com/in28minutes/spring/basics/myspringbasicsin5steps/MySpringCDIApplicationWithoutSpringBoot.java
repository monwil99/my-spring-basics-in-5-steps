package com.in28minutes.spring.basics.myspringbasicsin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.myspringbasicsin5steps.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class MySpringCDIApplicationWithoutSpringBoot {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(MySpringCDIApplicationWithoutSpringBoot.class);
	
	
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new 
				AnnotationConfigApplicationContext(MySpringCDIApplicationWithoutSpringBoot.class)){
		
				SomeCDIBusiness someCDIBusiness = 
				applicationContext.getBean(SomeCDIBusiness.class);
		
		
				LOGGER.info("My Log {} dao - {}", someCDIBusiness, someCDIBusiness.getSomeCDIDao());
		}
	}
}
