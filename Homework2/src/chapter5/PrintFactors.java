package chapter5;


// This program prints the factors of a number receives 
//as a parameter with the word and between each number
// while trying to avoid the fence post problem.
public class PrintFactors {
	
	public static void main(String[] args) {
		int[] perfect = new int[1001];
		int a = printFactors(perfect);
		
		
		
	}
	// print the factors
	public static int printFactors(int[] n) {
		int i;
		for (i = 0; i < n.length; i++) {
			i = 1;
	    System.out.print(n[0] +1);
	        if(n.length % i == 0)
	            System.out.print(" and " + i);
	    }
		return n[i];
	    }
	}

