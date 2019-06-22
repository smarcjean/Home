package chapter10;

import java.util.ArrayList;

public class AverageVowels {
	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<String>();
	list.add("John");
	list.add("Keyla");
	list.add("Keylie");
	list.add("pam");
	
	averageVowels(list);
	}

	public static void averageVowels(ArrayList<String> word) {
		double average;
		int count = 0;
		int sum = 0;
		for (String str : word) {
		    for (int j = 0; j < word.size()-1; j++) {
		        if (str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'
		        		||str.charAt(j)=='o'||str.charAt(j)=='u') {
		            count++;
		          
		        }
		       
		    }
		  
			
		}
		
		 average = (double) count / word.size();
		    System.out.println("average " + average);
		   
	}
		
}
		
	
	
	
	


