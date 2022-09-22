package lab3;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char user_choice;
		do {
		System.out.println("We have two available Banks 'BOB' and 'SBI'");
		System.out.println("Please select which bank do you want to go with.");
		System.out.println("Type 1 - BOB");
		System.out.println("Type 2 - SBI");
		
		int user_bank = scan.nextInt();
		
		switch(user_bank) {
		case 1:
			BOB bob_user = new BOB("BANK OF BORODA");
			bob_user.operation();
			break;
		case 2:
			SBI sbi_user = new SBI("STATE BANK OF INDIA");
			sbi_user.operation();
			break;
		default:
			System.out.println("Bank Not FOUND");
		}
		
		System.out.println("Do you want to continue type 'y' to continue or 'enter' any key to exit.");
		user_choice = scan.next().charAt(0);
		}while(user_choice == 'y');
		scan.close();
		
	}

}
