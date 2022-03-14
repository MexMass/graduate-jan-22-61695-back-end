package com.training.core.java;

import com.training.core.java.basic.Calculator;
import com.training.core.java.basic.StringOperations;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String name = "Bob";
    	
        System.out.println("Thread name - " + Thread.currentThread().getName());
        
        Calculator calc = new Calculator();
        
        System.out.println("Calling addTwoNumbers function in Calculator class with values 3 & 5");
        calc.addTwoNumbers(3, 5);
        
        System.out.println("Calling subTwoNumbers function in Calculator class with values 9 & 8");
        calc.subTwoNumbers(3, 5);
        
        StringOperations so = new StringOperations();
        
        System.out.println("Calling to uppercase method");
        System.out.println(so.toUppercase("this string should be in uppercase"));
        
        System.out.println("Calling compareStrings method");
        System.out.println(so.compareStrings("one", "two"));
        
        System.out.println("Calling compareStrings method");
        System.out.println(so.compareStrings("three", "three"));
        
        calc.sumOfNumbers(20, 30, 41, 40, 50, 60, 90);
        
        so.checkIfPalindrome("mom");
        
    }
}
