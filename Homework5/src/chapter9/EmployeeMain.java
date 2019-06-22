package chapter9;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee edna = new Employee();
		Secretary stan = new Secretary();
		LegalSecretary leo = new LegalSecretary();
		Lawyer lucy = new Lawyer();
		Marketer den = new Marketer();
		Janitor ken =  new Janitor();
		HarvardLawyer tom = new HarvardLawyer();
		
		
		emp(edna);
		emp(stan);
		emp(leo);
		emp(lucy);
		emp(den);
		emp(ken);
		emp(tom);
		
		
	}
	public static void emp(Employee s) {
		System.out.print(s.getHours()+ ", ");
		System.out.printf("$%.2f, ", s.getSalary());
		System.out.print(s.getVacationDays()+ ", ");
		System.out.println(s.getVacationForm());
		System.out.println();
	}

}
