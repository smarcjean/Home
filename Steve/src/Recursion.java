
public class Recursion {
	
	public static void main(String[] args) {
		
		System.out.println(logo(4));
	}
public static int logo(int a) {
	if ( a <= 1) {
		return 1;
} else {
	return a * logo(a - 1);
}
}
}
