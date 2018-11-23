package com.in28minutes.spring.basics.myspringbasicsin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.myspringbasicsin5steps.basic.BinarySearchImpl;

@Configuration
//@ComponentScan("")
//@ComponentScan("package com.in28minutes.spring.basics.myspringbasicsin5steps")
@ComponentScan
public class MySpringBasicsIn5StepsApplicationv3WithoutSpringBoot {

	/*
	 * The annotation spring boot application do the initialization of the application contexrt
	 * But now since we remove spring boot from pom, we need to initialize the app context
	 * Use annotation config application context 
	 */
			
			
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MySpringBasicsIn5StepsApplicationv3WithoutSpringBoot.class);
				
		//First, no qualifying bean found for BinarySearch since we dont have spring boot for component scan
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		
		
		System.out.println(result);
		System.out.println("yeye");

	}
}
