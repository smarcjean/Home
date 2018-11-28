import java.io.*;


public class WritingFiles {
	public static void main(String[] args) {
		

	{
		File file = new File("User.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("hello");
			pw.println("hi");
			pw.println("Line3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	
	
	}
}
