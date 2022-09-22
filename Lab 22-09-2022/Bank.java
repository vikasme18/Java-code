package lab3;

import java.util.Scanner;


public class Bank {
	public Scanner scan;
	
	public void operation() {
		System.out.println("Invalid Request");
		System.out.println("Fetch data failed");
		System.out.println("Please Try Again");
	}
	
	public void deposit() {
		System.out.println("Deposit Failed");
	}
	
	public void withdraw() {
		System.out.println("Winthdraw Failed");
	}
	
	public void display() {
		System.out.println("No data to show you");
		System.out.println("Something wrong try again...");
	}
	
	public void currentBalance() {
		System.out.print("No data");
	}
	
	public void makeContact() {
		System.out.print("No data");
	}
}
