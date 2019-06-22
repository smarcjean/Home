package chapter1;

// This program write a fight song
public class FightSong {
	
	public static void main(String[] agrs) {
		System.out.println();
	
		partOne();
		partTwo();
	} 
	  // the first part
	public static void coach() {
		System.out.println("Go, team, go!");
		System.out.println("You can do it.");
	}
	   // second part
	public static void fan() {
		System.out.println("You're the best,\nIn the West.");
	}
	   // writing the song one time
	public static void partOne() {
		coach();
		System.out.println();
		coach();
		fan();
		coach();
		System.out.println();
	}
	  // writing the song a second time
	public static void partTwo() {
		coach();
		fan();
		coach();
		System.out.println();
		coach();
		
		
	}
}
