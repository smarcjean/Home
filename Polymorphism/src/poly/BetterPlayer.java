package poly;



public class BetterPlayer  extends Player{
	public int move() {
		for (int i = 0; i < 9; i++) {
			System.out.println("\nThe better player says:");
			System.out.println("I am looking for a good move...");
			return findBestMove();
			
		}
		return -1;
	}
		private int findBestMove() {
			int square = 0;
			// code to find the first open square goes here
			
		return square;
	}

}
