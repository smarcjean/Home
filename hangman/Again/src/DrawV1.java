
public class DrawV1 {
	public static final int LINES = 5;
	
	public static void main(String[] args) {
		
		for (int line = LINES; line >= 1; line--) {
			for (int i = 1; i <= (line - 1); i++) {
				System.out.print(" ");
				
				
				// without the System.out.print(" ")
				// it draws it triangle
				// And without the parentheses open 
				//it still draws a triangle
				// And with two strokes open it turns the triangle 
				//the other way
			}
			
			int stars = 2 * LINES + 1 - 2 * line;
			for (int i = 1; i <= stars; i++) {
				System.out.print("s");
			}
			System.out.println();
		}
		
	}

}
