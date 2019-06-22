package chapter5;

// This program accepts integers and print them out in hopscoth pattern
public class Hopscotch {
	
	public static void main(String[] args) {
		hopscotch(3);
		
	}
	// print the hopscotch pattern
	public static void hopscotch(int n) {
	    int place = 1;
	    int total = 3 * n + 1;
	    
	    while(place < total) {
	        if((place - 1) % 3 == 0) {
	            System.out.println("   " + place);
	            place++;
	        } else {
	            System.out.println(place + "     " + (place + 1));
	            place += 2;
	        }
	    }
	    
	    System.out.println("   " + place);
	}
}
