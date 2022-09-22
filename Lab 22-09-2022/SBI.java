package lab3;

import java.util.Scanner;

public class SBI extends Bank {

	SBI() {
		
	}
	
	SBI(String name) {
		System.out.println(name);
	}
	
	@Override
	public void operation() {
		scan = new Scanner(System.in);
		int user_request;
		do {
			System.out.print("Enter '1' to display your information, '2' to view your current balance, '3' to contact your bank: ");
			user_request = scan.nextInt();
			SBI sbi = new SBI();
			switch(user_request) {
			case 1:
				sbi.display();
				break;
			case 2:
				sbi.currentBalance();
				break;
			case 3:
				sbi.makeContact();
				break;
			default:
				super.operation();
			}
		} while(user_request > 3);
	}
	
	@Override
	public void display() {
		System.out.println("Name: Vikas Meena");
		System.out.println("Mobile: 9546332212");
		System.out.println("Address: Kalyan, Thane");
		System.out.println("Bank Account Number: 9485 6432 6453");
	}
	
	@Override
	public void currentBalance() {
		System.out.println("1000");
	}
	
	@Override
	public void makeContact() {
		System.out.println("We are contacting your phone...");
	}
}
