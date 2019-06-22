package exam;

import java.time.LocalDateTime;

public class TestFusedLoopTime {
	static final int REPEAT = 5_000_000;
	static final int FACTOR = 1_000_000;
	
	public static void main(String[] args) {
		int startTime, endTime;
		int x;
	
		LocalDateTime now;
		now = LocalDateTime.now();
		startTime = now.getNano();
		
		
		for (x = 0; x < REPEAT; ++x) {
				method1();
		}
			for (x = 0; x < REPEAT; ++x) 
				method2();
			
		
			now = LocalDateTime.now();
			endTime = now.getNano();
			System.out.println("Time for loops execute separately: " +
			((endTime - startTime)/ FACTOR) + " milliseconds");
			
			
			now = LocalDateTime.now();
			startTime = now.getNano();
			for (x = 0; x < REPEAT; ++x) {
				method1();
				method2();
			}
			
			now = LocalDateTime.now();
			endTime = now.getNano();
			System.out.println("time for loops executed in a block: " + 
			((endTime - startTime) / FACTOR) + " milliseconds");
			
			
			
		
		
	}
	public static void method1() {
		
		
	}
	public static void method2() {
		
		
}
	
}
