package chapter9;

import java.util.Scanner;

public class DemoTicket {
	public static void main(String[] args) {
		
		WalkupTicket wal = new WalkupTicket(7);
		wal.getPrice();
		wal.toString();
		System.out.println( wal.toString());
		
		AdvanceTicket ad = new AdvanceTicket(8, 9);
		System.out.println( ad.toString());
		
		StudentAdvanceTicket student = new StudentAdvanceTicket(4, 8);
		System.out.println(student.toString());
	}

}
