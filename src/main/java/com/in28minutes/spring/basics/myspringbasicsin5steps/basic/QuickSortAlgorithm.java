package com.in28minutes.spring.basics.myspringbasicsin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		//Logic for bubble sort
		return numbers;
	}
	
	
}
