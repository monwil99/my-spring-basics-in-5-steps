package com.in28minutes.spring.basics.myspringbasicsin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentsscan.ComponentDAO;

@SpringBootApplication
//default - @ComponentScan("com.in28minutes.spring.basics.myspringbasicsin5steps")
@ComponentScan("com.in28minutes.spring.basics.componentsscan")
public class MySpringComponentScanApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(MySpringComponentScanApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(MySpringComponentScanApplication.class, args);
		ComponentDAO componentDAO = 
				applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		//LOGGER.info("{}", componentDAO.getComponentJdbcConnection());


	}
	
	//make sure components are in the same package and included in the component scan
	//@Spring Boot Application automatically defines a component scan in this package 'com.in28minutes.spring.basics.myspringbasicsin5steps" and sub packages
}

