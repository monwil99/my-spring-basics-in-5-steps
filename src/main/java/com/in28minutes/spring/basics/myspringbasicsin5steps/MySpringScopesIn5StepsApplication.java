package com.in28minutes.spring.basics.myspringbasicsin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.myspringbasicsin5steps.scope.PersonDAO;

@SpringBootApplication
public class MySpringScopesIn5StepsApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(MySpringScopesIn5StepsApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(MySpringScopesIn5StepsApplication.class, args);
		PersonDAO personDAO = 
				applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = 
				applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
		

	}
}

