import java.util.Scanner;

public class Learning1 {
	
	 public static void main(String args[] ) {
	 
		// comparing two strings 
		 
		String longs = "    longve    " ;
		System.out.println(longs.trim());
		 
		  String b = " I love to ";
		  String a = " sing loud.";
		  String c = b.concat(a);
		  System.out.println(c);
		  
		  // finding duplicate letters
		  String str = "w3schools";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		     break;
		     
		     
		    }
		   }
		  }
		String boo ;
		Scanner loo = new Scanner(System.in);
		
		boo = loo.nextLine();
		System.out.println("type a letter");
		boo = loo.nextLine();
		
				  
		  
		  
	 }
	 
}