package basic;

public class day1 {
	
	// #1
	
	public static String divideWithRemainder(int num1, int num2) {
		
		return num1 + " / " + num2 + " = " + num1 / num2 + " with remainder " + num1 % num2;
	}
	
	// #2 
	
	 static String convertIntoMiles(int km) {
		
		return km + " km = " + km / 1.609 + " miles";
		
	}
	
	// #3 
	
	public static String calculatePlot(int a, int b) {
		return "Cube = " + a*a + "; Rectangle = " + a*b;
	}
	
	public static void main( String[] args ) {
		System.out.println(divideWithRemainder(18,4)); // #1
		System.out.println(convertIntoMiles(90)); // #2
		System.out.println(calculatePlot(3,5)); // #3
		// #4.1 B)
		// #4.2 A)
		// #4.3 B)
		// #4.4 D)
		// #4.5 B)
	}

}
