
import java.io.*;

public class FileWriting {
	
	public static void main(String[] args) throws FileNotFoundException{
		
        File file = new File("tests.txt");
        
        PrintStream output = new PrintStream(file);
        output.println("dance together.");
        output.println("nice" );
        output.close();
          
        
        // It is important to understand
        
        String s1 = "This is String CharAt Method";
        //returns the char value at the 0 index
        System.out.println("Character at 0 position is: " + s1.charAt(0));
        //returns the char value at the 5th index
        System.out.println("Character at 5th position is: " + s1.charAt(5));
        //returns the char value at the 22nd index
        System.out.println("Character at 22nd position is: " + s1.charAt(22));
        //returns the char value at the 23th index
        char result = s1.charAt(-1);
        System.out.println("Character at 23th position is: " + result);
        
        // Great Info about Strings and Concatenation
        
      //String Concatenation
        String str1 = "Rock";
        String str2 = "Star";
        //Method 1 : Using concat
        String str3 = str1.concat(str2);
        System.out.println(str3);
        //Method 2 : Using "+" operator
        String str4 = str1 + str2;
        System.out.println(str4);
        
        // Using the length method with String
        
        String str_Sample = "RockStar";
        //Length of a String
        System.out.println("Length of String: " + str_Sample.length());
        
        // Using indexOf method with String.
        
        String str_Samples = "RockStar";
        System.out.println("Character at position 5: " + str_Sample.charAt(5));
        //Index of a given character
        System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
        
        // Using charAt method with String
        String str_Samply = "RockStar";
        System.out.println("Character at position 5: " + str_Sample.charAt(5));
        
        // Using compareTo method with Stritng
        
        String str_Samplee = "RockStar";
        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
        //Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
        
        // Using contain method with String
        
        String str_Samplea = "RockStar";
        System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
        
        // Using endsWith method with String
        
        String str_Sampley = "RockStar";
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
        
        // String "replaceAll" & "replaceFirst" Method
        
        String str_Sampled = "RockStar";
        System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));
        
        // String Java "tolowercase" & Java "touppercase" Method
        
        String str_Sampleo = "RockStar";
        System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
        //Convert to UpperCase
        System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
        
        // convert a String to an int with Integer.parseInt
        
        String strTest = "100";
        int iTest = Integer.parseInt(strTest);
        System.out.println("Actual String:"+ strTest);
        System.out.println("Converted to Int:" + iTest);
        //This will now show some arithmetic operation
        System.out.println("Arithmetic Operation on Int: " + (iTest/4));
        
        // convert a String to an int with valueOf method
        
        String strTest1 = "100";
        //Convert the String to Integer using Integer.valueOf
        int iTest1 = Integer.valueOf(strTest);
        System.out.println("Actual String:"+ strTest);
        System.out.println("Converted to Int:" + iTest);
        //This will now show some arithmetic operation
        System.out.println("Arithmetic Operation on Int:" + (iTest/4));
        
      /*  class Account
        int a;
        int b;

         public void setData(int a ,int b)
          a = a;
          b = b;
         
         public void showData(){
           System.out.println("Value of A ="+a);
           System.out.println("Value of B ="+b);
         
         public static void main(String args[])
           Account obj = new Account();
           obj.setData(2,3);
           obj.showData();
         */
        
        
	}
}

