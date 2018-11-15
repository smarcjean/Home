package hangman2;

public class Mod1 {
	public static void main(String[] args) {
		 
		
	// that is how to declare a variable
		
		int x;
		double y;
		
		
		x = 9;
		y = 8;
		
		// another way
		int r = 7;
		double w = 8;
		
		// or variable of the same type on the same line
		int u = 4, l = 6, m = 2;
		
		
		// Objects and String objects
		String s = "hello";
		// String expressions
		String s1 = "hello";
		String s2 = "there";
		String combined = ( s1 + " " + s2);
		
		// to know how many characters in a String use < s.length> method
		String s3 = "hello";
		String s4 = "How are you?";
		
	    System.out.println("Length of s3 = " + s3.length());
	    System.out.println("Length of s4 = " + s4.length());
		
	    
	// How to get individual charaters in a String
	   // S3.charAt(2)
	   // S4.charAt(4)
	    
	    // it is useful to use a for loop when dealing with String objects 
	    // remember when we start loops at 0 we use less than (<) not (<=)
	    String s5 = "hello";
	    for (int i = 0; i < s3.charAt(i); i++) {
	    	System.out.println(i + ": " + s5.charAt(i));
	    	
		     
	    }
	    
	    // we have substring which uses two integer arguments
	    //to representing a starting and ending index.
	     String s6 = "What are you doing?";
	     
	     // a substring would be s6.substring(0, 5)
	     // and the second value should be one more than the 
	     // number you want
	     String s7 = "What are you doing?";
	     
	     // to find if two string objects are equals you use s.equals
	     
	     System.out.print("yes or no?");
	     String s = console.next();
	     if (s.equals("yes")) {
	    	 processYes(); 
	     } else if (s.equals("no")) {
	    	 processNo();
	     } else {
	    	 System.out.println("You didn't type yes or no");
	     }
	     // 
	   
	     // to cast a type you put in a parentheses (int) or (double)
	     
	     
	     // New concept
	     // cumulative algorithm
	     // to find the sum of a series of numbers
	     
	     
	   //  sum = sum + next;
	     // shorthand
	    // sum += next;
	     
	     // pseudocode
	     
	    // sum = 0;
	     //for (all numbers to sum);
	    	//	 obtain "next"
	    	//	 sum += next;
	    		 
	     // returning staments
	     public static int max(int x, int y) {
	    	 if (x > y) {
	    		 return x;
	    	 } else {
	    		 return y;
	    	 }
	    	 
	    // or it can be written like this
	    	 if (x > y) {
	    		 return x;
	    	 }
	    	 return y;
	     }
	    		 
	    // to declare and array
	     int[] temperature = new int[3];
	    
	    
	}

}
