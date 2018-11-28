
public class Learning {

	
	// this an example of else-if Statements
	 public static void main(String args[]) {
	        int a = 30, b = 30;

	        if (b > a) {
	            System.out.println("b is greater");
	        }
	        else if(a > b){
	            System.out.println("a is greater");
	        }       
	        else {
	            System.out.println("Both are equal");
	        }
	  
	 
	 // this is an example of switch statement control
	 
	 int t = 5;

	  switch (a) {
	   case 1:
	    System.out.println("You chose One");
	    break;

	   case 2:
	    System.out.println("You chose Two");
	    break;

	   case 3:
	    System.out.println("You chose Three");
	    break;

	   case 4:
	    System.out.println("You chose Four");
	    break;

	   case 5:
	    System.out.println("You chose Five");
	    break;

	   default:
	    System.out.println("Invalid Choice. Enter a no between 1 and 5");
	    break;
	  }
	 
	 
	  // This a while loop example
	//  while (condition) {
		  
		//  statement(s);
		//  incrementation;
	  
	  
	  
	  
	 /* local variable Initialization */        int n = 1, times = 5;

     /* while loops execution */        while (n <= times) {
         System.out.println("Java while loops:" + n);
         n++;
     }
	 }
	 
	}

