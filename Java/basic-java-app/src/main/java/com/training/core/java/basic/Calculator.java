package com.training.core.java.basic;

/*
 * Calculator class will be an API class
 * methods - add(), substract(), multiply()
 */
public class Calculator {

	// to add two integer values and return result

	public int addTwoNumbers(int num1, int num2) {

		int result = num1 + num2;

		return result;
	}

	public int subTwoNumbers(int num1, int num2) {

		int result = num1 - num2;

		return result;
	}

	public void sumOfNumbers(int... numbers) {
		int sum = 0; // local primitive variable
		// print sum of numbers
		// traditional for loop
		
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		
		System.out.println("Sum of passed numbers - " + sum);
	}
}
