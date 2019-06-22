	package chapter5;
	

	public class Working {
	
		public static void main(String[] args) {
			
		System.out.println(countQuarters(67));
		
	}
		public static int countQuarters(int s) {
			
			
			return s % 100 / 25;
		}
}
	
