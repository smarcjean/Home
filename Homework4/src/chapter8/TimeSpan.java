	package chapter8;
	
	// Represents a time span of hours and minutes elaspsed.
	// Class invariant: hours >= 0 && minutes >= 0 && minutes < 60
	
	public class TimeSpan {
	
			private int hours;
			private int minutes;
			
			// constructs a time span with the given interval.
			// pre; hours >= 0 && minutes >= 0
			public TimeSpan(int hours, int minutes) {
				this.hours = hours;
				this.minutes = minutes;
				add(hours, minutes);
				
			}
			
			// Adds the given interval to this time span.
			// pre: hours >= 0 && minutes >= 0
			public void add(int hours, int minutes) {
				if (hours < 0 || minutes < 0) {
					throw new IllegalArgumentException();
					
				}
				
				this.hours += hours;
				this.minutes += minutes;
				
				// convert each 60 minutes into one hour
				this.hours += this.minutes / 60;
				this.minutes = this.minutes % 60;
				
			}
			
		
			// returns a String for this time span, such as "6h 15m"
			public String toString() {
				return hours + "h " + minutes + "m";
			}
			
			// Adds the given amount of time to this time span
			public void add(TimeSpan span) {
				add(span.hours, span.minutes);
			}
			
			// Subtracts the given amount of time to this time span
			public void subtract(TimeSpan span) {
				this.hours -= span.hours;
				this.minutes -= span.minutes;
			}
			
			// Scales this time span by the given factor
			public void scale(int factor) {
				
				// convert each 60 minutes into one hour
				int moreHours= this.minutes * factor / 60;
				int moreMinutes = this.minutes * factor % 60;
				this.hours = hours * factor + moreHours;
				this.minutes = moreMinutes;
			}
			
			
			}
			
			
			
			
			
			
			
				
	
