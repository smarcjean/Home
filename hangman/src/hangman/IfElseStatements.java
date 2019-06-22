package hangman;

public class IfElseStatements {
	public static void main(String[] args) {
		int time = 20;
		
		//String result = (time < 18)? "true" : "false";
		//System.out.println(result);
		
		
		//is the same with the this one
		/* if (time < 18) {
			 System.out.println("true");
		 } else {
			 System.out.println("false");
		 }
		*/
		
		if (time <10) {
			System.out.println("Good morning");
		} else if (time < 20) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good day");
		}
	}

}
