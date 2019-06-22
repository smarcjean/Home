package soccer;

public class DateMain1 {
	public static void main(String[] args) {
		Date1 d1 = new Date1(2009, 8, 17);
		Date1 d2 = new Date1(2008, 2, 3);
		Date1 d3 = new Date1(d1);
		
		System.out.println(d1.getDaysInMonth());
		System.out.println(d2.getDaysInMonth());
		System.out.println(d1.isLeapYear());
		System.out.println(d2.isLeapYear());
		System.out.println(d1.getDaysInYear());
		System.out.println(d2.getDaysInYear());
		
		
	}

}
