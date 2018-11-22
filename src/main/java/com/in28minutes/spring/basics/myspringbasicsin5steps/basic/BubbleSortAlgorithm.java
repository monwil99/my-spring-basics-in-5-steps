package com.in28minutes.spring.basics.myspringbasicsin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		//Logic for bubble sort
		return numbers;
	}
	
	//Autowiring by Type
	//Autowiring by Name
	//combine the two
	
}
