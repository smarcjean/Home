package exam;

public class Perfect1 {
	
		 public static void main(String[] args) {
		        final int LIMIT = 1000;
		        boolean isPerfect = false;
		        int i;
		        for(i = 2; i < LIMIT; i++) { 
		            isPerfect = isNumPerfect(i);
		            if(isPerfect) {
		                System.out.println(i + " is a perfect number");
		            }
		        }
		    }
		    public static boolean isNumPerfect(int i) {
		        boolean isPerfect = false;
		        int sum = 1;
		        int x;
		        for(x = 2; x <= i / 2; x++) {
		            if(i % x == 0) {
		                sum += x;
		            }
		        }
		        if(sum == i) {
		            isPerfect = true;
		        }
		        return isPerfect;
		    }
		       
		        
		    
			
	}
	
