package com.in28minutes.spring.basics.myspringbasicsin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.myspringbasicsin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.myspringbasicsin5steps.basic.BinarySearchImpl_v2;

@SpringBootApplication
public class MySpringBasicsIn5StepsApplicationv2 {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(MySpringBasicsIn5StepsApplicationv2.class, args);
		BinarySearchImpl_v2 binarySearch = applicationContext.getBean(BinarySearchImpl_v2.class);
		
		BinarySearchImpl_v2 binarySearch1 = applicationContext.getBean(BinarySearchImpl_v2.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		
		
		System.out.println(result);

	}
}
