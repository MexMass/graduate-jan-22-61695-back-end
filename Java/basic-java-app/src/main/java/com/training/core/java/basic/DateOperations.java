package com.training.core.java.basic;

import java.time.LocalDate;

public class DateOperations {
	
	public static LocalDate getDate() {
		// create date object
		LocalDate todayDate = LocalDate.now();
		return todayDate;
	}
	
	public static void getDateDetails(LocalDate date) {
		
		System.out.println("Day of the month - " + date.getDayOfMonth());
		System.out.println("Month - " + date.getMonth());
		System.out.println("Year - " + date.getYear());
		System.out.println("Day of the week - " + date.getDayOfWeek());
	}
	
	public static void main(String[] args) {
		
		LocalDate x = getDate();
		System.out.println("Today's date - " + x);
		
		// pass the date object to another method to print day, month and year, day of the week, day
		getDateDetails(x);
	}

}
