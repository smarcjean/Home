package chapter8;

public class TimeSpanMain {
	public static void main(String[] args) {
		TimeSpan pan1 = new TimeSpan(3,6);
		TimeSpan pan2 = new TimeSpan(3,9);
		
		pan1.subtract(pan1);
		pan1.add(4, 100);
		System.out.println(pan1.toString());
		
		System.out.println(pan1.equals(pan2));
		
		pan2.subtract(pan2);
		pan2.add(4, 100);
		System.out.println(pan2.toString());
		
		System.out.println(pan2.equals(pan1));
		
		
		
	}

}
