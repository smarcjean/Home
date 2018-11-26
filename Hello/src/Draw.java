
public class Draw {
public static void main(String[] args) {
	
	// ++a means add one then assign
	// a++ means assign and then add one
	// same for --a and a--
String d;
int a, b, c;
a = 7; b = 8; c = 4;
System.out.println(a *c);
System.out.println("b / c = " + b / c);
System.out.println("a = " + ++a);
System.out.println("a = " + a++);
System.out.println("a = " + a);
System.out.println("a = " + --a);

d = a == c ? "yes" : "no";
System.out.println(d);

System.out.println(Character.isLetter('g')); // true
System.out.println(Character.isLetter('6')); // false
System.out.println(Character.isDigit('8')); // true
System.out.println(Character.isWhitespace('\t')); // true
System.out.println(Character.isUpperCase('k')); // false
System.out.println(Character.isLowerCase('G')); // false
System.out.println(Character.toUpperCase('d')); // C
System.out.println(Character.toLowerCase('K')); // c
System.out.println(Character.toString('S')); // C



		// This is an array
		//datatype[] identifier; this the format
		int[] age = new int[5];
		//By using new operator array can be initialized.

		//int[] age = new int[5];    //5 is the size of array.

		//Arrays can be initialized at declaration time also.

		//int age[5]={22,25,30,32,35};
		
		//Initializing each element separately in the loop.

		        int[] newArray = new int[5];

		        // Initializing elements of array seperately
		        for (int n = 0; n < newArray.length; n++) {
		            newArray[n] = n;
		        }
            
		// this is an if statement
    //  int a=20, b=30;

   if(b>a) 
   System.out.println("b is greater");
   
   // If-else statements
  // int a = 80, b = 30;

  // if (b & gt; a) {
    System.out.println("b is greater");
  // } else {
    System.out.println("a is greater");
   
	
}
}
