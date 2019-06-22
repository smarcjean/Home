package programs;

public class Three {
	
	public static void main(String[] args) {
		int[] data = { 4,5,6,7,8,9};
		int answer = linearsearch(data, 8);
		System.out.println(answer);
		
	}
	public static int linearsearch(int[] num, int x) {
		int i = 1;
		int location = 0;
		while (i < num.length && x != num[i]) {
			i = i + 1;
			if (i <= num.length) {
				location = i;
			} else {
				location = 0;
			}
		}
		return location;
	}
}
