package projects;
import java.util.*;
public class DiceSum {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Your disired sum : ");
		
		diceSum(console);

	}
	
	public static void diceSum(Scanner console) {
		int sum = console.nextInt();
		Random ran1 = new Random();
		Random ran2 = new Random();
		
		int d1;
		int d2;
		do {
			d1 = ran1.nextInt(6) + 1;
			d2 = ran2.nextInt(6) + 1;
			System.out.println(d1 + " and " + d2 + " = " + (d1 + d2));
			System.out.println();
			
		}while(d1 + d2 != sum);
	}

}
