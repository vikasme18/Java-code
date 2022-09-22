package lab3;

import java.util.Scanner;

public class BOB extends Bank {
	
	BOB() {
		
	}
	
	BOB(String name) {
		System.out.println(name);
	}
	
	@Override
	public void operation() {
		scan = new Scanner(System.in);
		System.out.print("Enter 1 to deposit money, 2 to withdraw and 3 to display your current balance: ");
		int user_request = scan.nextInt();
		BOB bob = new BOB();
		switch(user_request) {
		case 1:
			bob.deposit();
			break;
		case 2:
			bob.withdraw();
			break;
		case 3:
			
			break;
		default:
			super.operation();;
		}
	}
	
	@Override
	public void deposit() {
		System.out.println("Deposit Successful");
	}
	
	@Override
	public void withdraw() {
		System.out.println("Winthdraw Successful");
	}
	
	@Override
	public void display() {
		System.out.println("Current Balance: 1000");
	}
}
