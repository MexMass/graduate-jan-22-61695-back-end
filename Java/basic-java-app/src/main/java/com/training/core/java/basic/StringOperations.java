package com.training.core.java.basic;

public class StringOperations {
	
	// method that accepts a string and returns it in UPPERCASE
	
	public String toUppercase(String str) {
		if(str!=null) {
			return str.toUpperCase();
		} else {
			return "No valid data to convert";
		}
		
	}
	
	// method that accepts two strings and compares them for equality
	
	public String compareStrings(String str1, String str2) {
		
		boolean isEqual = str1 == str2;
		
		return ("Is " + str1 + " equal to " + str2 + "? " + isEqual);
		
	}
	
	public static boolean compareStringsBoolean(String str1, String str2) {
		
		return str1.equals(str2);
		
	}
	
	// method for checking if string is palidrome 
	
	public void checkIfPalindrome(String str) {
		
		String nstr = ""; // variable to store reversed string
		
	      for (int i=0; i<str.length(); i++) // iterate through each character
	      {
	        nstr= str.charAt(i)+nstr; //adds each character in front of the new string
	      }
	      
	      if(str.equals(nstr)) {
	    	   System.out.println("The string is a palidrome");
	      }
	      else {
	    	  System.out.println("The string is not a palidrome");
	      }
	}
}
