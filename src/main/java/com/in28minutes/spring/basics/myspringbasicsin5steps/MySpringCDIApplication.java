package com.in28minutes.spring.basics.myspringbasicsin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.myspringbasicsin5steps.cdi.SomeCDIBusiness;

@SpringBootApplication
public class MySpringCDIApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(MySpringCDIApplication.class);
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(MySpringCDIApplication.class, args);
		
		SomeCDIBusiness someCDIBusiness = 
				applicationContext.getBean(SomeCDIBusiness.class);
		
		
		LOGGER.info("My Log {} dao - {}", someCDIBusiness, someCDIBusiness.getSomeCDIDao());

	}
}
