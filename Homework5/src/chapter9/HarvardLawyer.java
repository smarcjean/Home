package chapter9;

public class HarvardLawyer extends Lawyer {
	
	public double getSalary() {
		return super.getSalary() * 20 / 100;
	}
	public int getVacationDays() {
		return super.getVacationDays() + 3;
	}
	public String getVacationForm() {
		return super.getVacationForm()+ super.getVacationForm()+ super.getVacationForm();
	}
	

}
