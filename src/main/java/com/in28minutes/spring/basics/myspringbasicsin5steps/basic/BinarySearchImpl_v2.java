package com.in28minutes.spring.basics.myspringbasicsin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl_v2 {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
			
		return 3;
	}
	
	/*
	 * As soon as the bean is created and initialized with dependencies post construct method would be called
	 * you can intialize the beans before they are populated
	 */
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
		
	}
	/*
	 * Called before the bean is removed out of the context/container
	 */
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
	
}
