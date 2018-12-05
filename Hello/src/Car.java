
public class Car {

	private int topSpeed;
	private double mpg;
	private int tankSize;
	
	public Car(int topSpeed, int mpg, int tankSize) {
		this.topSpeed = topSpeed;
		this.tankSize = tankSize;
		this.mpg = mpg;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public double getmpg() {
		return mpg;
	}
	public void setmpg(double mpg) {
		this.mpg = mpg;
	}
	public int getTankSize() {
		return tankSize;
	}
	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}
	

	public double getMileTillNextPitStop(int distanceTraveled) 
	{
		// Solve for two test cases...
		
		// if miles gone or miles traveled is divided by miles per gallon (mpg) and the result is
		// subtracted from the tankSize equals to current fuel remains
		double milesTillEmpty = 0;
	    double fuel = distanceTraveled/mpg;
		milesTillEmpty =  tankSize - fuel;
		
		
		
		return milesTillEmpty;

	}
	
	public static void main(String[] args) 
	{
		//Test case 1: Test miles left in car
		// if topSpeed = 100; not a variable in this...
		// if mpg is 20;
		// if tanksize is 10 gallons.
		// if car has gone 20 miles at top speed the tank should have 9 gallon.
		int n = 9;
		Car car1 = new Car(100, 20, 10);
		if(car1.getMileTillNextPitStop(20)== n)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		
		//Test case 1: Test miles left in car
				// if topSpeed = 200; not a variable in this...
				// if mpg is 40;
				// if tanksize is 20 gallons.
				// if car has gone 120 miles at top speed the tank should have 9 gallon.
				int n1 = 17;
				Car car2 = new Car(200, 40, 20);
				if(car2.getMileTillNextPitStop(120)== n1)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
	
				//Test case 1: Test miles left in car
				// if topSpeed = 7; not a variable in this...
				// if mpg is 5;
				// if tanksize is 15 gallons.
				// if car has gone 75 miles at top speed the tank should have 9 gallon.
				int n2 = 0;
				Car car3 = new Car(7, 5, 15);
				if(car3.getMileTillNextPitStop(75)== n2)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
	}
}
