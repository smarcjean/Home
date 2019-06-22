package soccer;
// This is how to define a class
// write a class Date where each Date objects represents
// a given year/month/day
public class Date {
	
	int year;
	int month;
	int days;
	
	public int getDaysInMonth() {
		if (month == 9 || month == 4 || month == 6 || month == 11) {
			return 30;
		} else if (month == 2) {
			if (isLeapYear()) {
				return 29;
			} else {
			return 28;
		   }
		} else {
			return 31;
		}
	}
	
	public boolean isLeapYear() {
		return (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0));
	}
	
	public int getDaysInYear() {
		if (isLeapYear()) {
			return 366;
		} else {
			return 365;
		}
	}

}
