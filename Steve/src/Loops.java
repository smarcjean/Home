
public class Loops {

	public static void main(String[] args) {
		
		double[] one = {16.1, 12.3, 22.2, 14.4}  ;
		double[] two = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
	boolean a , b;
	a = isSorted(two);
	
	b = isSorted(one);
	System.out.print("one\ttwo");
	System.out.println();
	System.out.print( b+"\t"+a);
		
	}
	public static boolean isSorted(double[] array) {
	    double first = array[0];
	    
	    for (int i = 1; i < array.length; i++) {
	        double second = array[i];
	        if (first >= second) {
	            return false;
	        }
	        first = second;
	    }
	    
	    return true;
	}
}
