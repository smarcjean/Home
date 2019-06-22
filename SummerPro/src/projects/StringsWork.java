package projects;

import java.util.*;
public class StringsWork {

	public static void main(String[] args) {
	
		String word = "WorldWide";
		
		// count all the letters in the String
				stringCount(word);
		
		// reverse the string word
				reverse(word);
				
				// find if a letter exists in a String
				finding(word, 'W');
		
		
	}
	
	// count all the letters in the String
	public static void stringCount(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isLetter(ch))
				count++;
		}
		
		System.out.println(count);
	}
	
	// reverse the string word
	public static void reverse(String word) {
		
		String n = "";
		for (int i = 0; i < word.length(); i++) {
			n = word.charAt(i) + n;
		}
		System.out.println(n);
	}
	
	// find if a letter exists in a String
	public static void finding(String word, char w) {
		int found = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)== w) {
				found++;
			}
		}
		System.out.println(found);
		
	}

}
