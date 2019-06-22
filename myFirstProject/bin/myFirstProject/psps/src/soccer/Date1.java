package soccer;

public class Date1 {
	
	int year;
	int month;
	int days;
	
	// add a constructor
	public Date1(int y, int m, int d) {
		this.year = y;
		this.month = m;
		this.days = d;
	}
	
	public Date1(Date1 other) {
		// calling a constructor
		this(other.year, other.month, other.days);
		// is the same as the code down there
		
		this.year = other.year;
		this.month = other.month;
		this.days = other.days;
	}
	
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
