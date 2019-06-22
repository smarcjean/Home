package project;

public class WriteBinary {

	public static void main(String[] args) {
		int n = 44;
		writeBinary(n);
		
	}
	
	public static void writeBinary(int n) {
		if (n > 0) {
			writeBinary(n / 2);
			//System.out.println(n / 2);
			System.out.print(n % 2);
		}
	}

}
