
// Write a class Date where each Date object represents a given year/month/day.

public class Date {
	int day;
	int month;
	int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(Date other) {
		this(other.day, other.month, other.year);
		// is the same as saying
		
		
		//this.day = other.day;
		//this.month = other.month;
		//this.year = other.year;
	}
	
	public int getDaysInMonth() {
		if (month == 9 || month == 4 || month == 6 || month == 11) {
			return 30;
		} 
		else if (month == 2) {
			if (isLeapYear()) {
				return 29;
			} else {
			return 28;
			}
		} else {
			return 31;
		}
	}
	public int getDaysInYear() {
		if (isLeapYear()) {
			return 366;
		} else {
			return 365;
		}
	}
	public boolean isLeapYear() {
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}
	

}
