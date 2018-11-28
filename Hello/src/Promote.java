
import java.io.*;
import java.util.*;
import java.lang.*;
public class Promote {
	
	private Formatter x;
	
	public void openFile() {
	try {
		
	x = new Formatter("chinese.txt");
	
	} catch(Exception e){
		
		System.out.println("You have an error");
		System.out.println("line1");
		System.out.println("line2");
		System.out.println("line3");
	}		
				
	}
	public void addRecords() {
		x.format("%s%s%s", "20 ", " john ", "robert ");

	}
	public void closeFile() {
		x.close();
	}
}
