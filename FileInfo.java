package hangman2;
import java.io.*; // for file

public class FileInfo {
	public static void main(String[] args) {
		File f = new File("hangman.java");
		
		System.out.println("exists returns " + f.exists());
		System.out.println("canRead returns " + f.canRead());
		System.out.println("length returns " + f.length());
		System.out.println("getAbosulePath returns " + f.getAbsolutePath());
		
	}
	

}
