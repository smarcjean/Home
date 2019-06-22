	package work;
	
	import java.util.Random;
	import java.util.Scanner;
	
	public class MethodCalling {
		public static void zoop(String name) {
		    baffle();
		    System.out.print("You wugga " + name);
		    baffle();
		}

		public static void main(String[] args) {
		    System.out.print("No, I ");
		    zoop("John");
		    System.out.print("I " );
		    baffle();
		    
		}

		public static void baffle() {
		    System.out.print(" wug ");
		    ping();
		    
		}

		public static void ping() {
		    System.out.println(".");
		}
	}