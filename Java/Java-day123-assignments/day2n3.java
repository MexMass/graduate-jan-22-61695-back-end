package basic;

public class day2n3 {
	
	// #1 
	static String findLowestNumber(int num1, int num2, int num3) {
		int lowest = num1;
		if(num2 < lowest) lowest = num2;
		if(num3 < lowest) lowest = num3;
		return "Out of numbers " + num1 + ", " + num2 + " & " + num3 + " the lowest number is " + lowest + ".";
	}
	
	// #2
	
	static String calculateGrade(int studentId, String name, int age, int mark1, int mark2, int mark3) {
		
		int total = mark1 + mark2 + mark3;
		int average = total / 3;
		String outcome;
		
		if(average > 50) outcome = "PASS";
		else outcome = "FAIL";
		
		return "Student " + name + " aged " + age + " with ID " + studentId + " achieved " + total + " marks in total. The average is " + average + "% which is a " + outcome + ".";
	}
	
	// #3 
	
	static String calculateGradeContinued(int mark1, int mark2, int mark3) {
		
		int average = (mark1 + mark2 + mark3) /3;
		String outcome = null;
		
		if(average>90) outcome = "A+";
		if(average<90 && average>=80) outcome = "A";
		if(average<80 && average>=70) outcome = "A-";
		if(average<70 && average>=60) outcome = "B+";
		if(average<60 && average>=50) outcome = "B";
		if(average<50) outcome = "FAIL";
		
		return "The average of the marks is " + average + " which is a " + outcome + ".";
	} 
	
	// #4
	
	static String getLuckyNumber(int number) {
		
		String snumber = String.valueOf(number); // turn number to string
		
		char[] narray = snumber.toCharArray(); // turn string into a char array
		
		int total = 0;
		
		for(int i = 0; i < narray.length; i++) { // for every digit in the number add the value of the digit to the total
			total =  total + Character.getNumericValue(narray[i]);
		}
		
		if(total>9) return getLuckyNumber(total); // if total greater than 9 then run the command again
		
		return "The lucky number is " + total;
	}
	
	// #5 
	
	static String getMultiplicationTable(int number) {
		
		
		
		return "Multiplication table of " + number + ": " + number * 1 + " " + number * 2 + " " + number * 3 + " " + number * 4 + " "
				 + number * 5 + " " + number * 6 + " " + number * 7 + " " + number * 8 + " " + number * 9;
	}
	
	public static void main( String[] args ) {
		System.out.println(findLowestNumber(5, 2, 3)); //#1
		System.out.println(calculateGrade(420, "Thomas", 23, 90, 30, 35)); //#2
		System.out.println(calculateGradeContinued(87, 36, 29)); // #3
		System.out.println(getLuckyNumber(12345)); // #4
		System.out.println(getMultiplicationTable(2)); // #5
		// #7.1 E)
		// #7.2 C)
		// #7.3 A)
		// #7.4 C)
		// #7.5 A)
		// #7.6 D)
		// #7.7 E)
		// #7.8 D)
		// #7.9 B)
		// #7.10 B)
		// #7.11 A)
		// #7.12 E)
		
	}
}
