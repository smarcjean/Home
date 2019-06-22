package projects;

public class Season {

	public static void main(String[] args) {
		
		String s = season(4, 23);
		System.out.println(s);
	}
	
	public static String season(int m, int d) {
		if (m < 3 || (m == 3 && d <= 15) || (m == 12 && d >= 16)) {
			return "winter";
		} else if (3 < m && m < 6 || (m == 3 && d >= 16) || (m == 6 && d <= 15)) {
			return "Spring";
		} else if (6 < m && m > 9 || (m == 6 && d >= 16) || (m == 9 && d <= 15)) {
			return "summer";
		} else {
			return "fall";
		}
	}

}
