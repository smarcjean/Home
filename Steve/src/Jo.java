import java.util.Scanner;

public class Jo {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduce yourself");
		ok();
	}
public static void ok() {
	
	String text = console.nextLine();
	if (text.equals("hello")) {
		System.out.println("What is your name first?");
		String names = console.nextLine();
		
	} else {
		System.out.println("I don't know you");
	}
	

}
}
