import java.awt.Point;

public class Goal {
	
	public static void main(String[] args) {
	System.out.println(quadrant(4, -4));
	System.out.println(quadrant(0, 0));
	System.out.println(quadrant(-6, -4));
	System.out.println(quadrant(-4, 4));
	System.out.println(quadrant(4, 4));
	
		
	}
	public static int quadrant(double x, double y) {
		if (x > 0 && y > 0) {
			return 1;
			
		} else if (x < 0 && y > 0) {
			return 2;
		} else if ( x < 0 && y <0) {
			return 3;
		} else if (x > 0 && y < 0){
			return 4;
		} else {
			return 0;
		}
		
	}
}
