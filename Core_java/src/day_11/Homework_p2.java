package day_11;

import java.util.Scanner;

public class Homework_p2 {
	
	private long accountNumber;
	private int balance;
	
	public void setaccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public long getaccountNumber() {
		return accountNumber;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public int getbalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter Accountnumber : ");
		long Accountnumber = Sc.nextLong();
		
		System.out.println("Enter Balance : ");
		int Balance = Sc.nextInt();
		
		Homework_p2 obj = new Homework_p2 ();
		obj.setaccountNumber(Accountnumber);
		obj.setBalance(Balance);
		
		System.out.println("Accountnumber : " +Accountnumber );
		System.out.println("Balance : " +Balance );

	}

}
