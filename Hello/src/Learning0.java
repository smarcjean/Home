
public class Learning0 {

	public static void main(String args[]){
    {
        // Illustrating break statement (execution stops when value of i becomes to 4.)
        System.out.println("Break Statement\n....................");

        for(int i=1;i<=5;i++)
        {
            if(i==4) break;
            System.out.println(i);
        }

        // Illustrating continue statement (execution skipped when value of i becomes to 1.)
        System.out.println("Continue Statement\n....................");

        for(int i=1;i<=5;i++)
        {
            if(i==1) continue;
            System.out.println(i);
        }
    }
    // using concat to connect two strings
    
    String str1 = "Hello ", str2 = "World!";
    System.out.println(str1.concat(str2));
    // using methods with string
    String str5 = "Hello";
    System.out.println(str1.toUpperCase());
    System.out.println(str1.toLowerCase());

    // length method
    String str0 = "Cloud";
    System.out.println(str0.length());
    
    // using trim method
    String str = " Hello ";
    System.out.println(str.trim());
    
	// String initialization
  //  String name = "Allex"
    // this is a char type
	 char[] nameArray = {'A', 'l', 'e', 'x'};
     String name = new String(nameArray);
     System.out.println(name);
}
	
}
