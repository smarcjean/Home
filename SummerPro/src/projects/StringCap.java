package projects;
import java.util.*;
public class StringCap {
	 static int month;
	static int days;

	public static void main(String[] args) {
		printRange(19, 11);
		System.out.println();
		printRange(2, 7);
		System.out.println();
		printRange(5, 5);
		
	}
	
	public static void printRange(int a, int b) {
	    while(a != b) {
	        System.out.print(a + " ");
	        if(a < b)
	            a++;
	        else
	            a--;
	    }
	    System.out.print(a);
	}

}