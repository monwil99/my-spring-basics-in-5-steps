package com.in28minutes.spring.basics.myspringbasicsin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//tell that I am a bean
@Component
//@Scope("prototype") - not a good pratice
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	//Binary  search impl depends on sort algorithm
	//Sort algorithm is a dependency for binary search
	@Autowired
	//@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	/*
	Combination of autowire by type and by name
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;*/
	
	
/*	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	*/
	
	
/*	So we’d want Spring to search in this package.
	So we call that something called component scan.
	So we would want Spring do a component scan in this particular package. We are using Spring Boot
	Spring Boot would automatically scan the package where the main application class is present.*/
	
/*	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
*/
	
	


	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//Implementing Sorting Logic
		//Search the array
		//Bubble Sort Alogorithm
		//If I change the algorithm, this implementation is tightly coupled with bubble algo and we need to change the code
		
		//Quick Sort Algorithm...
		//Sometimes we can do bubble sort or sometimes we can do quick sort
		
		
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		
		return 3;
	}


	
	//Sorting the array
	//Search the array
	//Return result

	//Use constructor - mandatory dependency
	//Use setter - optional dependency
	
	
	
}
