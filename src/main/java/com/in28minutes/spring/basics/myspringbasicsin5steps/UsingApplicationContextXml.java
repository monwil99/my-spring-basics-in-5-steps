package com.in28minutes.spring.basics.myspringbasicsin5steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.myspringbasicsin5steps.xml.XmlPersonDao;

@Configuration
@ComponentScan
public class UsingApplicationContextXml {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml")){
					
				XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);
				System.out.println(personDao);
				System.out.println(personDao.getXmlJdbcConnection());
		}
	}
}
