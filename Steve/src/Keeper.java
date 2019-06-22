
public class Keeper {
	
	public static final int SIZE = 4;
	
	public static void main(String[] args) {
		
		System.out.println();
		for (int line = 1; line <= SIZE; line++) {
			
			// for number of \
			for (int slash = 1; slash <= 2 * line - 2 ; slash++) {
				System.out.print("\\");
				
			}
			 // for number of ! -4 * line +  SIZE * 4 + 2
			for (int point = 1; point <= -4 * line +  SIZE * 4 + 2; point++) {
				System.out.print("!");
			}
			  // for number of /
			for (int slash = 1; slash <= 2 * line - 2; slash++) {
				System.out.print("/");
			}
			System.out.println();
		}
		
	}
	
	

}
