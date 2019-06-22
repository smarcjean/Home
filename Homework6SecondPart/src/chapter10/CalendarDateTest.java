package chapter10;
import java.util.*;

public class CalendarDateTest {
	public static void main(String[] args) {
		ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
		dates.add(new CalendarDate(2000, 2, 22));
		dates.add(new CalendarDate(2008, 10, 30));
		dates.add(new CalendarDate(2018, 4, 13));
		dates.add(new CalendarDate(2007, 3, 16));
		dates.add(new CalendarDate(2019, 4, 28));
		
		System.out.println("birthdays = " + dates);
		Collections.sort(dates);
		System.out.println("birthdays = " + dates);
		
	
	}

}
