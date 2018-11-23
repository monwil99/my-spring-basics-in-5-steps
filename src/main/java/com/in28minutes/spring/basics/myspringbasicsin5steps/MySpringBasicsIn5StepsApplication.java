package com.in28minutes.spring.basics.myspringbasicsin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.myspringbasicsin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class MySpringBasicsIn5StepsApplication {

	public static void main(String[] args) {
		
/*		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);*/
		
		
		//we have one bean and one dependency
/*		What we are calling as a bean is an instance of this object so this is a bean to I'm creating a new quicksort
		algorithm that’s a bean.
		So we would want to be able to create beans and we would want to be able to wire in the dependencies*/
		//BinarySearchImpl binarySearch = new BinarySearchImpl( new QuickSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		
		//Spring boot returns the application context and no need to specify the package where beans can be found or scan since
		//spring boot automatically scan in the same package and sub package
		ApplicationContext applicationContext = SpringApplication.run(MySpringBasicsIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		
		
		System.out.println(result);
		
		//SpringApplication.run(MySpringBasicsIn5StepsApplication.class, args);
	}
}

//The Spring Framework helps us to manage beans via wiring in the dependencies

//What are the beans
//What are the dependencies of a bean?
//Where to search for beans?

/*This is using an at SpringBootApplication annotation. What the at SpringBootApplication annotation does,
is it automatically scans the package and the sub packages of the package where this is in*/

/*These would all be managed by something called application context. Spring application context is the
one which would maintain all the beans.*/